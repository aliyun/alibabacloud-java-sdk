// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class QuerySchedruleOnDemandResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleConfig")
    public java.util.List<QuerySchedruleOnDemandResponseBodyRuleConfig> ruleConfig;

    @NameInMap("RuleStatus")
    public java.util.List<QuerySchedruleOnDemandResponseBodyRuleStatus> ruleStatus;

    @NameInMap("UserId")
    public String userId;

    public static QuerySchedruleOnDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySchedruleOnDemandResponseBody self = new QuerySchedruleOnDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySchedruleOnDemandResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySchedruleOnDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySchedruleOnDemandResponseBody setRuleConfig(java.util.List<QuerySchedruleOnDemandResponseBodyRuleConfig> ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public java.util.List<QuerySchedruleOnDemandResponseBodyRuleConfig> getRuleConfig() {
        return this.ruleConfig;
    }

    public QuerySchedruleOnDemandResponseBody setRuleStatus(java.util.List<QuerySchedruleOnDemandResponseBodyRuleStatus> ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public java.util.List<QuerySchedruleOnDemandResponseBodyRuleStatus> getRuleStatus() {
        return this.ruleStatus;
    }

    public QuerySchedruleOnDemandResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class QuerySchedruleOnDemandResponseBodyRuleConfig extends TeaModel {
        @NameInMap("RuleAction")
        public String ruleAction;

        @NameInMap("RuleConditionCnt")
        public String ruleConditionCnt;

        @NameInMap("RuleConditionKpps")
        public String ruleConditionKpps;

        @NameInMap("RuleConditionMbps")
        public String ruleConditionMbps;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleSwitch")
        public String ruleSwitch;

        @NameInMap("RuleUndoBeginTime")
        public String ruleUndoBeginTime;

        @NameInMap("RuleUndoEndTime")
        public String ruleUndoEndTime;

        @NameInMap("RuleUndoMode")
        public String ruleUndoMode;

        @NameInMap("TimeZone")
        public String timeZone;

        public static QuerySchedruleOnDemandResponseBodyRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            QuerySchedruleOnDemandResponseBodyRuleConfig self = new QuerySchedruleOnDemandResponseBodyRuleConfig();
            return TeaModel.build(map, self);
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleConditionCnt(String ruleConditionCnt) {
            this.ruleConditionCnt = ruleConditionCnt;
            return this;
        }
        public String getRuleConditionCnt() {
            return this.ruleConditionCnt;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleConditionKpps(String ruleConditionKpps) {
            this.ruleConditionKpps = ruleConditionKpps;
            return this;
        }
        public String getRuleConditionKpps() {
            return this.ruleConditionKpps;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleConditionMbps(String ruleConditionMbps) {
            this.ruleConditionMbps = ruleConditionMbps;
            return this;
        }
        public String getRuleConditionMbps() {
            return this.ruleConditionMbps;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleSwitch(String ruleSwitch) {
            this.ruleSwitch = ruleSwitch;
            return this;
        }
        public String getRuleSwitch() {
            return this.ruleSwitch;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleUndoBeginTime(String ruleUndoBeginTime) {
            this.ruleUndoBeginTime = ruleUndoBeginTime;
            return this;
        }
        public String getRuleUndoBeginTime() {
            return this.ruleUndoBeginTime;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleUndoEndTime(String ruleUndoEndTime) {
            this.ruleUndoEndTime = ruleUndoEndTime;
            return this;
        }
        public String getRuleUndoEndTime() {
            return this.ruleUndoEndTime;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setRuleUndoMode(String ruleUndoMode) {
            this.ruleUndoMode = ruleUndoMode;
            return this;
        }
        public String getRuleUndoMode() {
            return this.ruleUndoMode;
        }

        public QuerySchedruleOnDemandResponseBodyRuleConfig setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class QuerySchedruleOnDemandResponseBodyRuleStatus extends TeaModel {
        @NameInMap("Net")
        public String net;

        @NameInMap("RuleSchedStatus")
        public String ruleSchedStatus;

        public static QuerySchedruleOnDemandResponseBodyRuleStatus build(java.util.Map<String, ?> map) throws Exception {
            QuerySchedruleOnDemandResponseBodyRuleStatus self = new QuerySchedruleOnDemandResponseBodyRuleStatus();
            return TeaModel.build(map, self);
        }

        public QuerySchedruleOnDemandResponseBodyRuleStatus setNet(String net) {
            this.net = net;
            return this;
        }
        public String getNet() {
            return this.net;
        }

        public QuerySchedruleOnDemandResponseBodyRuleStatus setRuleSchedStatus(String ruleSchedStatus) {
            this.ruleSchedStatus = ruleSchedStatus;
            return this;
        }
        public String getRuleSchedStatus() {
            return this.ruleSchedStatus;
        }

    }

}
