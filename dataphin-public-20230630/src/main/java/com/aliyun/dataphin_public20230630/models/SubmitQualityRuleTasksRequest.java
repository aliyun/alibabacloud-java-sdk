// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitQualityRuleTasksRequest extends TeaModel {
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
    @NameInMap("SubmitCommand")
    public SubmitQualityRuleTasksRequestSubmitCommand submitCommand;

    public static SubmitQualityRuleTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityRuleTasksRequest self = new SubmitQualityRuleTasksRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQualityRuleTasksRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitQualityRuleTasksRequest setSubmitCommand(SubmitQualityRuleTasksRequestSubmitCommand submitCommand) {
        this.submitCommand = submitCommand;
        return this;
    }
    public SubmitQualityRuleTasksRequestSubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static class SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList build(java.util.Map<String, ?> map) throws Exception {
            SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList self = new SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList();
            return TeaModel.build(map, self);
        }

        public SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

    public static class SubmitQualityRuleTasksRequestSubmitCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IsTestRun")
        public Boolean isTestRun;

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
        @NameInMap("PartitionExpressionFrom")
        public String partitionExpressionFrom;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScheduleId")
        public Long scheduleId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("WatchRuleIdList")
        public java.util.List<SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList> watchRuleIdList;

        public static SubmitQualityRuleTasksRequestSubmitCommand build(java.util.Map<String, ?> map) throws Exception {
            SubmitQualityRuleTasksRequestSubmitCommand self = new SubmitQualityRuleTasksRequestSubmitCommand();
            return TeaModel.build(map, self);
        }

        public SubmitQualityRuleTasksRequestSubmitCommand setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public SubmitQualityRuleTasksRequestSubmitCommand setIsTestRun(Boolean isTestRun) {
            this.isTestRun = isTestRun;
            return this;
        }
        public Boolean getIsTestRun() {
            return this.isTestRun;
        }

        public SubmitQualityRuleTasksRequestSubmitCommand setPartitionExpression(String partitionExpression) {
            this.partitionExpression = partitionExpression;
            return this;
        }
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        public SubmitQualityRuleTasksRequestSubmitCommand setPartitionExpressionFrom(String partitionExpressionFrom) {
            this.partitionExpressionFrom = partitionExpressionFrom;
            return this;
        }
        public String getPartitionExpressionFrom() {
            return this.partitionExpressionFrom;
        }

        public SubmitQualityRuleTasksRequestSubmitCommand setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public Long getScheduleId() {
            return this.scheduleId;
        }

        public SubmitQualityRuleTasksRequestSubmitCommand setWatchRuleIdList(java.util.List<SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList> watchRuleIdList) {
            this.watchRuleIdList = watchRuleIdList;
            return this;
        }
        public java.util.List<SubmitQualityRuleTasksRequestSubmitCommandWatchRuleIdList> getWatchRuleIdList() {
            return this.watchRuleIdList;
        }

    }

}
