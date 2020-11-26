// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class QuerySchedruleOnDemandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RuleConfig")
    @Validation(required = true)
    public java.util.List<QuerySchedruleOnDemandResponseRuleConfig> ruleConfig;

    @NameInMap("RuleStatus")
    @Validation(required = true)
    public java.util.List<QuerySchedruleOnDemandResponseRuleStatus> ruleStatus;

    public static QuerySchedruleOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySchedruleOnDemandResponse self = new QuerySchedruleOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public QuerySchedruleOnDemandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySchedruleOnDemandResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QuerySchedruleOnDemandResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySchedruleOnDemandResponse setRuleConfig(java.util.List<QuerySchedruleOnDemandResponseRuleConfig> ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public java.util.List<QuerySchedruleOnDemandResponseRuleConfig> getRuleConfig() {
        return this.ruleConfig;
    }

    public QuerySchedruleOnDemandResponse setRuleStatus(java.util.List<QuerySchedruleOnDemandResponseRuleStatus> ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public java.util.List<QuerySchedruleOnDemandResponseRuleStatus> getRuleStatus() {
        return this.ruleStatus;
    }

    public static class QuerySchedruleOnDemandResponseRuleConfig extends TeaModel {
        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("RuleConditionCnt")
        @Validation(required = true)
        public String ruleConditionCnt;

        @NameInMap("RuleUndoBeginTime")
        @Validation(required = true)
        public String ruleUndoBeginTime;

        @NameInMap("RuleUndoMode")
        @Validation(required = true)
        public String ruleUndoMode;

        @NameInMap("RuleUndoEndTime")
        @Validation(required = true)
        public String ruleUndoEndTime;

        @NameInMap("RuleConditionMbps")
        @Validation(required = true)
        public String ruleConditionMbps;

        @NameInMap("RuleConditionKpps")
        @Validation(required = true)
        public String ruleConditionKpps;

        @NameInMap("RuleSwitch")
        @Validation(required = true)
        public String ruleSwitch;

        @NameInMap("RuleAction")
        @Validation(required = true)
        public String ruleAction;

        @NameInMap("TimeZone")
        @Validation(required = true)
        public String timeZone;

        public static QuerySchedruleOnDemandResponseRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            QuerySchedruleOnDemandResponseRuleConfig self = new QuerySchedruleOnDemandResponseRuleConfig();
            return TeaModel.build(map, self);
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleConditionCnt(String ruleConditionCnt) {
            this.ruleConditionCnt = ruleConditionCnt;
            return this;
        }
        public String getRuleConditionCnt() {
            return this.ruleConditionCnt;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleUndoBeginTime(String ruleUndoBeginTime) {
            this.ruleUndoBeginTime = ruleUndoBeginTime;
            return this;
        }
        public String getRuleUndoBeginTime() {
            return this.ruleUndoBeginTime;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleUndoMode(String ruleUndoMode) {
            this.ruleUndoMode = ruleUndoMode;
            return this;
        }
        public String getRuleUndoMode() {
            return this.ruleUndoMode;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleUndoEndTime(String ruleUndoEndTime) {
            this.ruleUndoEndTime = ruleUndoEndTime;
            return this;
        }
        public String getRuleUndoEndTime() {
            return this.ruleUndoEndTime;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleConditionMbps(String ruleConditionMbps) {
            this.ruleConditionMbps = ruleConditionMbps;
            return this;
        }
        public String getRuleConditionMbps() {
            return this.ruleConditionMbps;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleConditionKpps(String ruleConditionKpps) {
            this.ruleConditionKpps = ruleConditionKpps;
            return this;
        }
        public String getRuleConditionKpps() {
            return this.ruleConditionKpps;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleSwitch(String ruleSwitch) {
            this.ruleSwitch = ruleSwitch;
            return this;
        }
        public String getRuleSwitch() {
            return this.ruleSwitch;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public QuerySchedruleOnDemandResponseRuleConfig setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class QuerySchedruleOnDemandResponseRuleStatus extends TeaModel {
        @NameInMap("Net")
        @Validation(required = true)
        public String net;

        @NameInMap("RuleSchedStatus")
        @Validation(required = true)
        public String ruleSchedStatus;

        public static QuerySchedruleOnDemandResponseRuleStatus build(java.util.Map<String, ?> map) throws Exception {
            QuerySchedruleOnDemandResponseRuleStatus self = new QuerySchedruleOnDemandResponseRuleStatus();
            return TeaModel.build(map, self);
        }

        public QuerySchedruleOnDemandResponseRuleStatus setNet(String net) {
            this.net = net;
            return this;
        }
        public String getNet() {
            return this.net;
        }

        public QuerySchedruleOnDemandResponseRuleStatus setRuleSchedStatus(String ruleSchedStatus) {
            this.ruleSchedStatus = ruleSchedStatus;
            return this;
        }
        public String getRuleSchedStatus() {
            return this.ruleSchedStatus;
        }

    }

}
