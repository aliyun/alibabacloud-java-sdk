// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopTimerRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("DesktopTimers")
    public java.util.List<ModifyDesktopTimerRequestDesktopTimers> desktopTimers;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UseDesktopTimers")
    public Boolean useDesktopTimers;

    public static ModifyDesktopTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopTimerRequest self = new ModifyDesktopTimerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopTimerRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public ModifyDesktopTimerRequest setDesktopTimers(java.util.List<ModifyDesktopTimerRequestDesktopTimers> desktopTimers) {
        this.desktopTimers = desktopTimers;
        return this;
    }
    public java.util.List<ModifyDesktopTimerRequestDesktopTimers> getDesktopTimers() {
        return this.desktopTimers;
    }

    public ModifyDesktopTimerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDesktopTimerRequest setUseDesktopTimers(Boolean useDesktopTimers) {
        this.useDesktopTimers = useDesktopTimers;
        return this;
    }
    public Boolean getUseDesktopTimers() {
        return this.useDesktopTimers;
    }

    public static class ModifyDesktopTimerRequestDesktopTimers extends TeaModel {
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("Enforce")
        public Boolean enforce;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("ResetType")
        public String resetType;

        @NameInMap("TimerType")
        public String timerType;

        public static ModifyDesktopTimerRequestDesktopTimers build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopTimerRequestDesktopTimers self = new ModifyDesktopTimerRequestDesktopTimers();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopTimerRequestDesktopTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public ModifyDesktopTimerRequestDesktopTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ModifyDesktopTimerRequestDesktopTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public ModifyDesktopTimerRequestDesktopTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyDesktopTimerRequestDesktopTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ModifyDesktopTimerRequestDesktopTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public ModifyDesktopTimerRequestDesktopTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

}
