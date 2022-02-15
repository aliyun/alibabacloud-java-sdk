// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class VerifyRouteRuleResponseBody extends TeaModel {
    // 验证结果
    @NameInMap("data")
    public VerifyRouteRuleResponseBodyData data;

    // Id of the request
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
        // 升级计划ID
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        // 升级计划名称
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
        // 订阅ID
        @NameInMap("subscriptionId")
        public Long subscriptionId;

        // 订阅名称
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
        // 升级策略名称
        @NameInMap("escalationPlans")
        public java.util.List<VerifyRouteRuleResponseBodyDataEscalationPlans> escalationPlans;

        // 验证是否成功
        @NameInMap("isValidRule")
        public Boolean isValidRule;

        // 验证失败监控源ID
        @NameInMap("monitorSourceIds")
        public java.util.List<Long> monitorSourceIds;

        // 订阅名称
        @NameInMap("notifySubscriptionNames")
        public java.util.List<VerifyRouteRuleResponseBodyDataNotifySubscriptionNames> notifySubscriptionNames;

        // 流转规则验证失败的原因
        @NameInMap("routeRuleFailReason")
        public java.util.List<String> routeRuleFailReason;

        // 事件或者报警
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
