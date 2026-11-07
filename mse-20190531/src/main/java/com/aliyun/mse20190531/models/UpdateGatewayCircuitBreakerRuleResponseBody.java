// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayCircuitBreakerRuleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public UpdateGatewayCircuitBreakerRuleResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
     */
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
        /**
         * <p>The web fallback behavior type. Valid values:</p>
         * <ul>
         * <li>0: Return specified text.</li>
         * <li>1: Redirect to a specified page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BehaviorType")
        public Integer behaviorType;

        /**
         * <p>The encoding type. Valid values:</p>
         * <ul>
         * <li>0: Plain text.</li>
         * <li>1: JSON.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BodyEncoding")
        public Integer bodyEncoding;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>14407</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-c9bc5afd61014165bd58f621b491****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The ID of the circuit breaker rule.</p>
         * 
         * <strong>example:</strong>
         * <p>369</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The IDs of the filter rules.</p>
         */
        @NameInMap("IdList")
        public java.util.List<Long> idList;

        /**
         * <p>The threshold conversion mode. Valid values:</p>
         * <ul>
         * <li>0: Standalone.</li>
         * <li>1: Cluster.</li>
         * <li>2: Cluster to standalone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LimitMode")
        public Integer limitMode;

        /**
         * <p>The slow call threshold in slow call mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxAllowedMs")
        public Integer maxAllowedMs;

        /**
         * <p>The minimum number of requests that triggers circuit breaking.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        /**
         * <p>The recovery duration for circuit breaking.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RecoveryTimeoutSec")
        public Integer recoveryTimeoutSec;

        /**
         * <p>The custom headers, which are entered as key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>key=value</p>
         */
        @NameInMap("ResponseAdditionalHeaders")
        public String responseAdditionalHeaders;

        /**
         * <p>The HTTP response text.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ResponseContentBody")
        public String responseContentBody;

        /**
         * <p>The redirect URL.</p>
         * 
         * <strong>example:</strong>
         * <p>www.******.com</p>
         */
        @NameInMap("ResponseRedirectUrl")
        public String responseRedirectUrl;

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>201</p>
         */
        @NameInMap("ResponseStatusCode")
        public Integer responseStatusCode;

        /**
         * <p>The ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>645</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The name of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>routeName</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The statistical duration for circuit breaking.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("StatDurationSec")
        public Integer statDurationSec;

        /**
         * <p>The threshold type. Valid values:</p>
         * <ul>
         * <li>0: Slow call.</li>
         * <li>1: Exception.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>The percentage that triggers circuit breaking.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
