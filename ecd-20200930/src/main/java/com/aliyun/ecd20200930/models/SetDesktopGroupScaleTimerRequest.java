// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupScaleTimerRequest extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScaleTimerInfos")
    public java.util.List<SetDesktopGroupScaleTimerRequestScaleTimerInfos> scaleTimerInfos;

    public static SetDesktopGroupScaleTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupScaleTimerRequest self = new SetDesktopGroupScaleTimerRequest();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupScaleTimerRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public SetDesktopGroupScaleTimerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDesktopGroupScaleTimerRequest setScaleTimerInfos(java.util.List<SetDesktopGroupScaleTimerRequestScaleTimerInfos> scaleTimerInfos) {
        this.scaleTimerInfos = scaleTimerInfos;
        return this;
    }
    public java.util.List<SetDesktopGroupScaleTimerRequestScaleTimerInfos> getScaleTimerInfos() {
        return this.scaleTimerInfos;
    }

    public static class SetDesktopGroupScaleTimerRequestScaleTimerInfos extends TeaModel {
        @NameInMap("Cron")
        public String cron;

        @NameInMap("KeepDuration")
        public Long keepDuration;

        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        @NameInMap("MinResAmount")
        public Integer minResAmount;

        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        @NameInMap("Type")
        public String type;

        public static SetDesktopGroupScaleTimerRequestScaleTimerInfos build(java.util.Map<String, ?> map) throws Exception {
            SetDesktopGroupScaleTimerRequestScaleTimerInfos self = new SetDesktopGroupScaleTimerRequestScaleTimerInfos();
            return TeaModel.build(map, self);
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setKeepDuration(Long keepDuration) {
            this.keepDuration = keepDuration;
            return this;
        }
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setLoadPolicy(Integer loadPolicy) {
            this.loadPolicy = loadPolicy;
            return this;
        }
        public Integer getLoadPolicy() {
            return this.loadPolicy;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setMinResAmount(Integer minResAmount) {
            this.minResAmount = minResAmount;
            return this;
        }
        public Integer getMinResAmount() {
            return this.minResAmount;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setRatioThreshold(Float ratioThreshold) {
            this.ratioThreshold = ratioThreshold;
            return this;
        }
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
