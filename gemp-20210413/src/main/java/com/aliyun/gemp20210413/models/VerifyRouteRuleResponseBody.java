// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class VerifyRouteRuleResponseBody extends TeaModel {
    @NameInMap("data")
    public VerifyRouteRuleResponseBodyData data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static VerifyRouteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyRouteRuleResponseBody self = new VerifyRouteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyRouteRuleResponseBody setData(VerifyRouteRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyRouteRuleResponseBodyData getData() {
        return this.data;
    }

    public VerifyRouteRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyRouteRuleResponseBodyDataEscalationPlans extends TeaModel {
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        public static VerifyRouteRuleResponseBodyDataEscalationPlans build(java.util.Map<String, ?> map) throws Exception {
            VerifyRouteRuleResponseBodyDataEscalationPlans self = new VerifyRouteRuleResponseBodyDataEscalationPlans();
            return TeaModel.build(map, self);
        }

        public VerifyRouteRuleResponseBodyDataEscalationPlans setEscalationPlanId(Long escalationPlanId) {
            this.escalationPlanId = escalationPlanId;
            return this;
        }
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        public VerifyRouteRuleResponseBodyDataEscalationPlans setEscalationPlanName(String escalationPlanName) {
            this.escalationPlanName = escalationPlanName;
            return this;
        }
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

    }

    public static class VerifyRouteRuleResponseBodyDataNotifySubscriptionNames extends TeaModel {
        @NameInMap("subscriptionId")
        public Long subscriptionId;

        @NameInMap("title")
        public String title;

        public static VerifyRouteRuleResponseBodyDataNotifySubscriptionNames build(java.util.Map<String, ?> map) throws Exception {
            VerifyRouteRuleResponseBodyDataNotifySubscriptionNames self = new VerifyRouteRuleResponseBodyDataNotifySubscriptionNames();
            return TeaModel.build(map, self);
        }

        public VerifyRouteRuleResponseBodyDataNotifySubscriptionNames setSubscriptionId(Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Long getSubscriptionId() {
            return this.subscriptionId;
        }

        public VerifyRouteRuleResponseBodyDataNotifySubscriptionNames setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class VerifyRouteRuleResponseBodyData extends TeaModel {
        @NameInMap("escalationPlans")
        public java.util.List<VerifyRouteRuleResponseBodyDataEscalationPlans> escalationPlans;

        @NameInMap("isValidRule")
        public Boolean isValidRule;

        @NameInMap("monitorSourceIds")
        public java.util.List<Long> monitorSourceIds;

        @NameInMap("notifySubscriptionNames")
        public java.util.List<VerifyRouteRuleResponseBodyDataNotifySubscriptionNames> notifySubscriptionNames;

        @NameInMap("routeRuleFailReason")
        public java.util.List<String> routeRuleFailReason;

        @NameInMap("routeType")
        public String routeType;

        public static VerifyRouteRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyRouteRuleResponseBodyData self = new VerifyRouteRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyRouteRuleResponseBodyData setEscalationPlans(java.util.List<VerifyRouteRuleResponseBodyDataEscalationPlans> escalationPlans) {
            this.escalationPlans = escalationPlans;
            return this;
        }
        public java.util.List<VerifyRouteRuleResponseBodyDataEscalationPlans> getEscalationPlans() {
            return this.escalationPlans;
        }

        public VerifyRouteRuleResponseBodyData setIsValidRule(Boolean isValidRule) {
            this.isValidRule = isValidRule;
            return this;
        }
        public Boolean getIsValidRule() {
            return this.isValidRule;
        }

        public VerifyRouteRuleResponseBodyData setMonitorSourceIds(java.util.List<Long> monitorSourceIds) {
            this.monitorSourceIds = monitorSourceIds;
            return this;
        }
        public java.util.List<Long> getMonitorSourceIds() {
            return this.monitorSourceIds;
        }

        public VerifyRouteRuleResponseBodyData setNotifySubscriptionNames(java.util.List<VerifyRouteRuleResponseBodyDataNotifySubscriptionNames> notifySubscriptionNames) {
            this.notifySubscriptionNames = notifySubscriptionNames;
            return this;
        }
        public java.util.List<VerifyRouteRuleResponseBodyDataNotifySubscriptionNames> getNotifySubscriptionNames() {
            return this.notifySubscriptionNames;
        }

        public VerifyRouteRuleResponseBodyData setRouteRuleFailReason(java.util.List<String> routeRuleFailReason) {
            this.routeRuleFailReason = routeRuleFailReason;
            return this;
        }
        public java.util.List<String> getRouteRuleFailReason() {
            return this.routeRuleFailReason;
        }

        public VerifyRouteRuleResponseBodyData setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

    }

}
