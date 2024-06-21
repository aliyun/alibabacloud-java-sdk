// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class QuerySchedruleOnDemandResponseBody extends TeaModel {
    /**
     * <p>The ID of the on-demand instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-z2q1qzxb****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4A8F9980-5ACB-497F-9F15-48E9D6B29028</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of the scheduling rule.</p>
     */
    @NameInMap("RuleConfig")
    public java.util.List<QuerySchedruleOnDemandResponseBodyRuleConfig> ruleConfig;

    /**
     * <p>The status of the scheduling rule.</p>
     */
    @NameInMap("RuleStatus")
    public java.util.List<QuerySchedruleOnDemandResponseBodyRuleStatus> ruleStatus;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>171986973287****</p>
     */
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
        /**
         * <p>The scheduling action. Set the value to <strong>declare</strong>, which indicates that the route is advertised.</p>
         * 
         * <strong>example:</strong>
         * <p>declare</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <p>If the inbound bandwidth or packets consecutively exceed the threshold for the specified number of times, the scheduling rule is triggered and traffic is rerouted to the on-demand instance. The specified number of times is the value of this parameter.</p>
         * <blockquote>
         * <p> The threshold of inbound bandwidth is the value of <strong>RuleConditionMbps</strong>. The threshold of inbound packets is the value of <strong>RuleConditionKpps</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RuleConditionCnt")
        public String ruleConditionCnt;

        /**
         * <p>The threshold of inbound packets. Unit: Kpps. Minimum value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RuleConditionKpps")
        public String ruleConditionKpps;

        /**
         * <p>The threshold of inbound bandwidth. Unit: Mbit/s. Minimum value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RuleConditionMbps")
        public String ruleConditionMbps;

        /**
         * <p>The name of the scheduling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-z2q1qzxb****</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the scheduling rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled</li>
         * <li><strong>off</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleSwitch")
        public String ruleSwitch;

        /**
         * <p>The start time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the <code>hh:mm</code> format.</p>
         * <p>If the system detects that DDoS attacks stop, the system no longer reroutes traffic to the on-demand instance from the time you specified. We recommend that you set this parameter to a value that is defined as off-peak hours.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>RuleUndoMode</strong> parameter is set to <strong>auto</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>03:00</p>
         */
        @NameInMap("RuleUndoBeginTime")
        public String ruleUndoBeginTime;

        /**
         * <p>The end time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the <code>hh:mm</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>03:05</p>
         */
        @NameInMap("RuleUndoEndTime")
        public String ruleUndoEndTime;

        /**
         * <p>The stop method of the scheduling rule. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong>: The scheduling rule automatically stops.</li>
         * <li><strong>manual</strong>: The scheduling rule is manually stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("RuleUndoMode")
        public String ruleUndoMode;

        /**
         * <p>The time zone of the time when the scheduling rule automatically stops. The time zone must be in the <code>GMT-hh:mm</code> format.</p>
         * <p>For example, the value <code>GMT-08:00</code> indicates that the time zone is UTC+8.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>RuleUndoMode</strong> parameter is set to <strong>auto</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GMT-08:00</p>
         */
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
        /**
         * <p>The CIDR block of the on-demand instance.</p>
         * 
         * <strong>example:</strong>
         * <p>47.<em><strong>.</strong></em>.0/24</p>
         */
        @NameInMap("Net")
        public String net;

        /**
         * <p>The scheduling status. Valid values:</p>
         * <ul>
         * <li><strong>scheduled</strong></li>
         * <li><strong>unscheduled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unscheduled</p>
         */
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
