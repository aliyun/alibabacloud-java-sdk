// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayCircuitBreakerRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateGatewayCircuitBreakerRuleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGatewayCircuitBreakerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayCircuitBreakerRuleResponseBody self = new UpdateGatewayCircuitBreakerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayCircuitBreakerRuleResponseBody setData(UpdateGatewayCircuitBreakerRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGatewayCircuitBreakerRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateGatewayCircuitBreakerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGatewayCircuitBreakerRuleResponseBodyData extends TeaModel {
        @NameInMap("BehaviorType")
        public Integer behaviorType;

        @NameInMap("BodyEncoding")
        public Integer bodyEncoding;

        @NameInMap("Enable")
        public Integer enable;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IdList")
        public java.util.List<Long> idList;

        @NameInMap("LimitMode")
        public Integer limitMode;

        @NameInMap("MaxAllowedMs")
        public Integer maxAllowedMs;

        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        @NameInMap("RecoveryTimeoutSec")
        public Integer recoveryTimeoutSec;

        @NameInMap("ResponseAdditionalHeaders")
        public String responseAdditionalHeaders;

        @NameInMap("ResponseContentBody")
        public String responseContentBody;

        @NameInMap("ResponseRedirectUrl")
        public String responseRedirectUrl;

        @NameInMap("ResponseStatusCode")
        public Integer responseStatusCode;

        @NameInMap("RouteId")
        public Long routeId;

        @NameInMap("RouteName")
        public String routeName;

        @NameInMap("StatDurationSec")
        public Integer statDurationSec;

        @NameInMap("Strategy")
        public Integer strategy;

        @NameInMap("TriggerRatio")
        public Integer triggerRatio;

        public static UpdateGatewayCircuitBreakerRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayCircuitBreakerRuleResponseBodyData self = new UpdateGatewayCircuitBreakerRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setIdList(java.util.List<Long> idList) {
            this.idList = idList;
            return this;
        }
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setLimitMode(Integer limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public Integer getLimitMode() {
            return this.limitMode;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setMaxAllowedMs(Integer maxAllowedMs) {
            this.maxAllowedMs = maxAllowedMs;
            return this;
        }
        public Integer getMaxAllowedMs() {
            return this.maxAllowedMs;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setRecoveryTimeoutSec(Integer recoveryTimeoutSec) {
            this.recoveryTimeoutSec = recoveryTimeoutSec;
            return this;
        }
        public Integer getRecoveryTimeoutSec() {
            return this.recoveryTimeoutSec;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setResponseAdditionalHeaders(String responseAdditionalHeaders) {
            this.responseAdditionalHeaders = responseAdditionalHeaders;
            return this;
        }
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setStatDurationSec(Integer statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Integer getStatDurationSec() {
            return this.statDurationSec;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBodyData setTriggerRatio(Integer triggerRatio) {
            this.triggerRatio = triggerRatio;
            return this;
        }
        public Integer getTriggerRatio() {
            return this.triggerRatio;
        }

    }

}
