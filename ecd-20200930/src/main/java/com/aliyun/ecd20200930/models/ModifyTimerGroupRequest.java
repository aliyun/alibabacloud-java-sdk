// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyTimerGroupRequest extends TeaModel {
    /**
     * <p>The configuration groups.</p>
     */
    @NameInMap("ConfigTimers")
    public java.util.List<ModifyTimerGroupRequestConfigTimers> configTimers;

    /**
     * <p>The description of the configuration group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the configuration group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the configuration group.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region. Set the value to <code>cn-shanghai</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyTimerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTimerGroupRequest self = new ModifyTimerGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTimerGroupRequest setConfigTimers(java.util.List<ModifyTimerGroupRequestConfigTimers> configTimers) {
        this.configTimers = configTimers;
        return this;
    }
    public java.util.List<ModifyTimerGroupRequestConfigTimers> getConfigTimers() {
        return this.configTimers;
    }

    public ModifyTimerGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTimerGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyTimerGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyTimerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyTimerGroupRequestConfigTimers extends TeaModel {
        /**
         * <p>Specifies whether to allow end users to configure scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The CRON expression for the scheduled task.</p>
         * <blockquote>
         * <p> The time must be in UTC. For example, for 24:00 (UTC+8), you must set the value to 0 0 16 ? \* 1,2,3,4,5,6,7.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to forcibly execute the scheduled task. A value of true specifies the scheduled task will run forcefully, ignoring the cloud computer and connection status.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The interval at which the scheduled task is executed. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The type of the scheduled operation. If you set TimerType to NoConnect, you can specify this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Hibernate: scheduled hibernation.</li>
         * <li>Shutdown: scheduled shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The process whitelist. If whitelisted processes are running, the scheduled task upon inactivity does not take effect.</p>
         */
        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        /**
         * <p>The reset operation.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RESET_TYPE_SYSTEM: resets the system disk.</li>
         * <li>RESET_TYPE_USER_DISK: resets the data disk.</li>
         * <li>RESET_TYPE_BOTH: resets the system disk and data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RESET_TYPE_SYSTEM</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The type of the scheduled task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NoOperationDisconnect: scheduled disconnection upon inactivity.</li>
         * <li>NoConnect: scheduled disconnection upon specified operation (OperationType).</li>
         * <li>TimerBoot: scheduled start.</li>
         * <li>TimerReset: scheduled reset.</li>
         * <li>NoOperationShutdown: scheduled shutdown upon inactivity.</li>
         * <li>NoOperationHibernate: scheduled hibernation upon inactivity.</li>
         * <li>TimerShutdown: scheduled shutdown.</li>
         * <li>NoOperationReboot: scheduled restart upon inactivity.</li>
         * <li>TimerReboot: scheduled restart.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TIMER_BOOT</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        /**
         * <p>The method to trigger the scheduled task upon inactivity.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Advanced: intelligent detection.</li>
         * <li>Standard: standard detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static ModifyTimerGroupRequestConfigTimers build(java.util.Map<String, ?> map) throws Exception {
            ModifyTimerGroupRequestConfigTimers self = new ModifyTimerGroupRequestConfigTimers();
            return TeaModel.build(map, self);
        }

        public ModifyTimerGroupRequestConfigTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public ModifyTimerGroupRequestConfigTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ModifyTimerGroupRequestConfigTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public ModifyTimerGroupRequestConfigTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyTimerGroupRequestConfigTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ModifyTimerGroupRequestConfigTimers setProcessWhitelist(java.util.List<String> processWhitelist) {
            this.processWhitelist = processWhitelist;
            return this;
        }
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        public ModifyTimerGroupRequestConfigTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public ModifyTimerGroupRequestConfigTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

        public ModifyTimerGroupRequestConfigTimers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
