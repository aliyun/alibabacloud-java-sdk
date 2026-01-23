// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveQualityRuleSchedulesRequest extends TeaModel {
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
    @NameInMap("RemoveCommand")
    public RemoveQualityRuleSchedulesRequestRemoveCommand removeCommand;

    public static RemoveQualityRuleSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveQualityRuleSchedulesRequest self = new RemoveQualityRuleSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveQualityRuleSchedulesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveQualityRuleSchedulesRequest setRemoveCommand(RemoveQualityRuleSchedulesRequestRemoveCommand removeCommand) {
        this.removeCommand = removeCommand;
        return this;
    }
    public RemoveQualityRuleSchedulesRequestRemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static class RemoveQualityRuleSchedulesRequestRemoveCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

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

        public static RemoveQualityRuleSchedulesRequestRemoveCommand build(java.util.Map<String, ?> map) throws Exception {
            RemoveQualityRuleSchedulesRequestRemoveCommand self = new RemoveQualityRuleSchedulesRequestRemoveCommand();
            return TeaModel.build(map, self);
        }

        public RemoveQualityRuleSchedulesRequestRemoveCommand setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public RemoveQualityRuleSchedulesRequestRemoveCommand setScheduleIdList(java.util.List<Long> scheduleIdList) {
            this.scheduleIdList = scheduleIdList;
            return this;
        }
        public java.util.List<Long> getScheduleIdList() {
            return this.scheduleIdList;
        }

        public RemoveQualityRuleSchedulesRequestRemoveCommand setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
