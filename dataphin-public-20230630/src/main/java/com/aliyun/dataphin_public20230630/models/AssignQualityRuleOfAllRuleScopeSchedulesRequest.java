// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AssignQualityRuleOfAllRuleScopeSchedulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssignCommand")
    public AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand assignCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static AssignQualityRuleOfAllRuleScopeSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignQualityRuleOfAllRuleScopeSchedulesRequest self = new AssignQualityRuleOfAllRuleScopeSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public AssignQualityRuleOfAllRuleScopeSchedulesRequest setAssignCommand(AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand assignCommand) {
        this.assignCommand = assignCommand;
        return this;
    }
    public AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand getAssignCommand() {
        return this.assignCommand;
    }

    public AssignQualityRuleOfAllRuleScopeSchedulesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleIdList")
        public java.util.List<Long> ruleIdList;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScheduleIdList")
        public java.util.List<Long> scheduleIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>平均值</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand build(java.util.Map<String, ?> map) throws Exception {
            AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand self = new AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand();
            return TeaModel.build(map, self);
        }

        public AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand setRuleIdList(java.util.List<Long> ruleIdList) {
            this.ruleIdList = ruleIdList;
            return this;
        }
        public java.util.List<Long> getRuleIdList() {
            return this.ruleIdList;
        }

        public AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand setScheduleIdList(java.util.List<Long> scheduleIdList) {
            this.scheduleIdList = scheduleIdList;
            return this;
        }
        public java.util.List<Long> getScheduleIdList() {
            return this.scheduleIdList;
        }

        public AssignQualityRuleOfAllRuleScopeSchedulesRequestAssignCommand setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
