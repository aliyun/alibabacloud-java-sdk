// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeTimerGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeTimerGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTimerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTimerGroupResponseBody self = new DescribeTimerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTimerGroupResponseBody setData(DescribeTimerGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTimerGroupResponseBodyData getData() {
        return this.data;
    }

    public DescribeTimerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTimerGroupResponseBodyDataConfigTimers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <strong>example:</strong>
         * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        /**
         * <strong>example:</strong>
         * <p>RESET_TYPE_SYSTEM</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <strong>example:</strong>
         * <p>TimerBoot</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static DescribeTimerGroupResponseBodyDataConfigTimers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimerGroupResponseBodyDataConfigTimers self = new DescribeTimerGroupResponseBodyDataConfigTimers();
            return TeaModel.build(map, self);
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setProcessWhitelist(java.util.List<String> processWhitelist) {
            this.processWhitelist = processWhitelist;
            return this;
        }
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class DescribeTimerGroupResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("BindCount")
        public Integer bindCount;

        @NameInMap("BindCountMap")
        public java.util.Map<String, Integer> bindCountMap;

        @NameInMap("ConfigTimers")
        public java.util.List<DescribeTimerGroupResponseBodyDataConfigTimers> configTimers;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cg-75aazkg2tnqb2*****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Timer</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeTimerGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimerGroupResponseBodyData self = new DescribeTimerGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTimerGroupResponseBodyData setBindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Integer getBindCount() {
            return this.bindCount;
        }

        public DescribeTimerGroupResponseBodyData setBindCountMap(java.util.Map<String, Integer> bindCountMap) {
            this.bindCountMap = bindCountMap;
            return this;
        }
        public java.util.Map<String, Integer> getBindCountMap() {
            return this.bindCountMap;
        }

        public DescribeTimerGroupResponseBodyData setConfigTimers(java.util.List<DescribeTimerGroupResponseBodyDataConfigTimers> configTimers) {
            this.configTimers = configTimers;
            return this;
        }
        public java.util.List<DescribeTimerGroupResponseBodyDataConfigTimers> getConfigTimers() {
            return this.configTimers;
        }

        public DescribeTimerGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTimerGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeTimerGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTimerGroupResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeTimerGroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTimerGroupResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
