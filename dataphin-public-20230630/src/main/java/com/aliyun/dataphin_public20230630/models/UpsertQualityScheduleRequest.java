// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityScheduleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpsertCommand")
    public UpsertQualityScheduleRequestUpsertCommand upsertCommand;

    public static UpsertQualityScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityScheduleRequest self = new UpsertQualityScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityScheduleRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityScheduleRequest setUpsertCommand(UpsertQualityScheduleRequestUpsertCommand upsertCommand) {
        this.upsertCommand = upsertCommand;
        return this;
    }
    public UpsertQualityScheduleRequestUpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static class UpsertQualityScheduleRequestUpsertCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li><ul>
         * <li>1/* * * *</li>
         * </ul>
         * </li>
         * </ul>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ds=${yyyyMMdd}</p>
         */
        @NameInMap("PartitionExpression")
        public String partitionExpression;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("PartitionType")
        public String partitionType;

        /**
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("PeriodScheduleIntervalType")
        public String periodScheduleIntervalType;

        @NameInMap("PeriodScheduleParamList")
        public java.util.List<String> periodScheduleParamList;

        /**
         * <strong>example:</strong>
         * <p>ONE_TASKS_FINISHED</p>
         */
        @NameInMap("StaticTaskTriggerType")
        public String staticTaskTriggerType;

        @NameInMap("TriggerNodeList")
        public java.util.List<String> triggerNodeList;

        /**
         * <strong>example:</strong>
         * <p>STATIC_TASK_TRIGGER</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PERIOD_SCHEDULE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>TASK_REFERRED_PARTITION</p>
         */
        @NameInMap("ValidatePartitionType")
        public String validatePartitionType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static UpsertQualityScheduleRequestUpsertCommand build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityScheduleRequestUpsertCommand self = new UpsertQualityScheduleRequestUpsertCommand();
            return TeaModel.build(map, self);
        }

        public UpsertQualityScheduleRequestUpsertCommand setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public UpsertQualityScheduleRequestUpsertCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpsertQualityScheduleRequestUpsertCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpsertQualityScheduleRequestUpsertCommand setPartitionExpression(String partitionExpression) {
            this.partitionExpression = partitionExpression;
            return this;
        }
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        public UpsertQualityScheduleRequestUpsertCommand setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public UpsertQualityScheduleRequestUpsertCommand setPeriodScheduleIntervalType(String periodScheduleIntervalType) {
            this.periodScheduleIntervalType = periodScheduleIntervalType;
            return this;
        }
        public String getPeriodScheduleIntervalType() {
            return this.periodScheduleIntervalType;
        }

        public UpsertQualityScheduleRequestUpsertCommand setPeriodScheduleParamList(java.util.List<String> periodScheduleParamList) {
            this.periodScheduleParamList = periodScheduleParamList;
            return this;
        }
        public java.util.List<String> getPeriodScheduleParamList() {
            return this.periodScheduleParamList;
        }

        public UpsertQualityScheduleRequestUpsertCommand setStaticTaskTriggerType(String staticTaskTriggerType) {
            this.staticTaskTriggerType = staticTaskTriggerType;
            return this;
        }
        public String getStaticTaskTriggerType() {
            return this.staticTaskTriggerType;
        }

        public UpsertQualityScheduleRequestUpsertCommand setTriggerNodeList(java.util.List<String> triggerNodeList) {
            this.triggerNodeList = triggerNodeList;
            return this;
        }
        public java.util.List<String> getTriggerNodeList() {
            return this.triggerNodeList;
        }

        public UpsertQualityScheduleRequestUpsertCommand setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public UpsertQualityScheduleRequestUpsertCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpsertQualityScheduleRequestUpsertCommand setValidatePartitionType(String validatePartitionType) {
            this.validatePartitionType = validatePartitionType;
            return this;
        }
        public String getValidatePartitionType() {
            return this.validatePartitionType;
        }

        public UpsertQualityScheduleRequestUpsertCommand setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
