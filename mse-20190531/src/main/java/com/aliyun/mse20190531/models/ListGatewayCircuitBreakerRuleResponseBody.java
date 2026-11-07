// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayCircuitBreakerRuleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListGatewayCircuitBreakerRuleResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGatewayCircuitBreakerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayCircuitBreakerRuleResponseBody self = new ListGatewayCircuitBreakerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayCircuitBreakerRuleResponseBody setData(ListGatewayCircuitBreakerRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayCircuitBreakerRuleResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayCircuitBreakerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayCircuitBreakerRuleResponseBodyDataResult extends TeaModel {
        /**
         * <p>The Web fallback behavior type.</p>
         * <p>0: Return specified content.</p>
         * <p>1: Redirect to a specified page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BehaviorType")
        public Integer behaviorType;

        /**
         * <p>The encoding type.</p>
         * <p>0: Plain text</p>
         * <p>1: JSON</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BodyEncoding")
        public Integer bodyEncoding;

        /**
         * <p>Whether to enable.</p>
         * <p>0: Not enabled.</p>
         * <p>1: Enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11919</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-5017305290e14centbrveca****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The circuit breaker rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>467</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The filter rule id</p>
         */
        @NameInMap("IdList")
        public java.util.List<Long> idList;

        /**
         * <p>The threshold conversion mode.</p>
         * <p>0: Single machine.</p>
         * <p>1: Cluster.</p>
         * <p>2: Cluster to single machine.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LimitMode")
        public Integer limitMode;

        /**
         * <p>The slow call threshold in slow call pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("MaxAllowedMs")
        public Integer maxAllowedMs;

        /**
         * <p>The minimum number of requests to trigger circuit breaking.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        /**
         * <p>The circuit breaking recovery duration.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RecoveryTimeoutSec")
        public Integer recoveryTimeoutSec;

        /**
         * <p>The custom header, input as key-value pairs.</p>
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
         * <p>204</p>
         */
        @NameInMap("ResponseStatusCode")
        public Integer responseStatusCode;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3091</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>routeName</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The circuit breaking statistics duration.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("StatDurationSec")
        public Integer statDurationSec;

        /**
         * <p>The threshold pattern.</p>
         * <p>0: Slow call pattern.</p>
         * <p>1: Exception pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>The percentage to trigger circuit breaking.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TriggerRatio")
        public Integer triggerRatio;

        public static ListGatewayCircuitBreakerRuleResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayCircuitBreakerRuleResponseBodyDataResult self = new ListGatewayCircuitBreakerRuleResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setIdList(java.util.List<Long> idList) {
            this.idList = idList;
            return this;
        }
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setLimitMode(Integer limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public Integer getLimitMode() {
            return this.limitMode;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setMaxAllowedMs(Integer maxAllowedMs) {
            this.maxAllowedMs = maxAllowedMs;
            return this;
        }
        public Integer getMaxAllowedMs() {
            return this.maxAllowedMs;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setRecoveryTimeoutSec(Integer recoveryTimeoutSec) {
            this.recoveryTimeoutSec = recoveryTimeoutSec;
            return this;
        }
        public Integer getRecoveryTimeoutSec() {
            return this.recoveryTimeoutSec;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setResponseAdditionalHeaders(String responseAdditionalHeaders) {
            this.responseAdditionalHeaders = responseAdditionalHeaders;
            return this;
        }
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setStatDurationSec(Integer statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Integer getStatDurationSec() {
            return this.statDurationSec;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResult setTriggerRatio(Integer triggerRatio) {
            this.triggerRatio = triggerRatio;
            return this;
        }
        public Integer getTriggerRatio() {
            return this.triggerRatio;
        }

    }

    public static class ListGatewayCircuitBreakerRuleResponseBodyDataResults extends TeaModel {
        /**
         * <p>The Web fallback behavior type.</p>
         * <p>0: Return specified content</p>
         * <p>1: Redirect to a specified page</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BehaviorType")
        public Integer behaviorType;

        /**
         * <p>The encoding type.</p>
         * <p>0: Plain text</p>
         * <p>1: JSON</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BodyEncoding")
        public Integer bodyEncoding;

        /**
         * <p>Whether to enable.</p>
         * <p>0: Not enabled.</p>
         * <p>1: Enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11919</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1ee34548c68f4778a25c05abd657****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The circuit breaker rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>467</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The filter rule id</p>
         */
        @NameInMap("IdList")
        public java.util.List<Long> idList;

        /**
         * <p>The threshold conversion mode.</p>
         * <p>0: Single machine.</p>
         * <p>1: Cluster.</p>
         * <p>2: Cluster to single machine.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LimitMode")
        public Integer limitMode;

        /**
         * <p>The slow call threshold in slow call pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxAllowedMs")
        public Integer maxAllowedMs;

        /**
         * <p>The minimum number of requests to trigger circuit breaking.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        /**
         * <p>The circuit breaking recovery duration.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RecoveryTimeoutSec")
        public Integer recoveryTimeoutSec;

        /**
         * <p>The custom header, input as key-value pairs.</p>
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
         * <p>204</p>
         */
        @NameInMap("ResponseStatusCode")
        public Integer responseStatusCode;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3450</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>routeName</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The circuit breaking statistics duration.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("StatDurationSec")
        public Integer statDurationSec;

        /**
         * <p>The threshold pattern.</p>
         * <p>0: Slow call pattern.</p>
         * <p>1: Exception pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>The percentage to trigger circuit breaking.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TriggerRatio")
        public Integer triggerRatio;

        public static ListGatewayCircuitBreakerRuleResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayCircuitBreakerRuleResponseBodyDataResults self = new ListGatewayCircuitBreakerRuleResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setIdList(java.util.List<Long> idList) {
            this.idList = idList;
            return this;
        }
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setLimitMode(Integer limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public Integer getLimitMode() {
            return this.limitMode;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setMaxAllowedMs(Integer maxAllowedMs) {
            this.maxAllowedMs = maxAllowedMs;
            return this;
        }
        public Integer getMaxAllowedMs() {
            return this.maxAllowedMs;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setRecoveryTimeoutSec(Integer recoveryTimeoutSec) {
            this.recoveryTimeoutSec = recoveryTimeoutSec;
            return this;
        }
        public Integer getRecoveryTimeoutSec() {
            return this.recoveryTimeoutSec;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setResponseAdditionalHeaders(String responseAdditionalHeaders) {
            this.responseAdditionalHeaders = responseAdditionalHeaders;
            return this;
        }
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setStatDurationSec(Integer statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Integer getStatDurationSec() {
            return this.statDurationSec;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyDataResults setTriggerRatio(Integer triggerRatio) {
            this.triggerRatio = triggerRatio;
            return this;
        }
        public Integer getTriggerRatio() {
            return this.triggerRatio;
        }

    }

    public static class ListGatewayCircuitBreakerRuleResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the instance list</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of rows per page set during input</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayCircuitBreakerRuleResponseBodyDataResult> result;

        /**
         * <p>The returned result collection.</p>
         */
        @NameInMap("Results")
        public java.util.List<ListGatewayCircuitBreakerRuleResponseBodyDataResults> results;

        /**
         * <p>The total number of instances queried</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListGatewayCircuitBreakerRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayCircuitBreakerRuleResponseBodyData self = new ListGatewayCircuitBreakerRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayCircuitBreakerRuleResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyData setResult(java.util.List<ListGatewayCircuitBreakerRuleResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayCircuitBreakerRuleResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyData setResults(java.util.List<ListGatewayCircuitBreakerRuleResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ListGatewayCircuitBreakerRuleResponseBodyDataResults> getResults() {
            return this.results;
        }

        public ListGatewayCircuitBreakerRuleResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
