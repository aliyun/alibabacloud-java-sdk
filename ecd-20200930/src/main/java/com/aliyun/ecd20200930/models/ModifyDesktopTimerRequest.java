// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopTimerRequest extends TeaModel {
    /**
     * <p>The cloud computer ID. You can specify 1 to 20 IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The details of the scheduled task for the cloud desktops.</p>
     */
    @NameInMap("DesktopTimers")
    public java.util.List<ModifyDesktopTimerRequestDesktopTimers> desktopTimers;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to use DesktopTimers. If you want to use a timer, **set this parameter to true**.</p>
     */
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
        /**
         * <p>Specifies whether to allow end users to configure scheduled tasks on an Alibaba Cloud Workspace client.</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The cron expression of the scheduled task.</p>
         * <br>
         * <p>>  You must specify the time in UTC format. For example, if you want to specify 00:00 of UTC+8, use the following cron expression: 0 0 16. \* 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to forcefully execute the scheduled task. A value of true indicates that the system forcefully executes the scheduled task regardless of the connection status of the cloud desktop.</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The interval. Unit: minutes.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The type of the scheduled operation. This parameter is valid only when TimerType is set to NoConnect.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Hibernate</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    hibernates the cloud desktops</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   Shutdown</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    stops the cloud desktops</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>Indicates which type of disk that is used by the cloud desktop is reset.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RESET_TYPE_SYSTEM</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    resets the system disks</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   RESET_TYPE_BOTH</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    resets the data disks and system disks.</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The type of the scheduled task.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   NoOperationDisconnect: Disconnects the cloud desktops when no operations are performed on the cloud desktops.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   LogoutShutdown: Stops the cloud desktops when end users log out of Alibaba Cloud Workspace clients.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NoConnect: Disconnets the cloud desktops when end users perform one of the actions that is specified by the OperationType parameter.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   TimerBoot: Starts the cloud desktops at a scheduled point in time.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   TimerReset: Resets the cloud desktops at a scheduled point in time.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   LoginAutoConnect: automatically connects to cloud desktops when end users log on to Alibaba Cloud Workspace clients.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NoOperationShutdown: Stops the cloud desktops when no operations are performed on the cloud desktops.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   TimerShutdown: Stops the cloud desktops at a scheduled point in time.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NoOperationReboot: Restarts the cloud desktops when no operations are performed on the cloud desktops.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   TimerReboot: Restarts the cloud desktops at a scheduled point in time.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
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
