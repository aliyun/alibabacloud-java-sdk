// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayIsolationRuleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListGatewayIsolationRuleResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6F025D43-8632-5716-AE9B-7EDDF16C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGatewayIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIsolationRuleResponseBody self = new ListGatewayIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayIsolationRuleResponseBody setData(ListGatewayIsolationRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayIsolationRuleResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayIsolationRuleResponseBodyDataResult extends TeaModel {
        /**
         * <p>The web fallback behavior type. Valid values:</p>
         * <ul>
         * <li>0: return specified content.</li>
         * <li>1: redirect to a specified page.</li>
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
         * <li>0: plain text.</li>
         * <li>1: JSON.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BodyEncoding")
        public Integer bodyEncoding;

        /**
         * <p>Specifies whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li>0: disabled.</li>
         * <li>1: enabled.</li>
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
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The ID of the concurrency rule.</p>
         * 
         * <strong>example:</strong>
         * <p>358</p>
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
         * <li>0: standalone.</li>
         * <li>1: cluster.</li>
         * <li>2: cluster to standalone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LimitMode")
        public Integer limitMode;

        /**
         * <p>The overall concurrency threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <p>The custom headers, specified as key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>key:value</p>
         */
        @NameInMap("ResponseAdditionalHeaders")
        public String responseAdditionalHeaders;

        /**
         * <p>The HTTP response body.</p>
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
         * <p>429</p>
         */
        @NameInMap("ResponseStatusCode")
        public Integer responseStatusCode;

        /**
         * <p>The ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>52853</p>
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

        public static ListGatewayIsolationRuleResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayIsolationRuleResponseBodyDataResult self = new ListGatewayIsolationRuleResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setIdList(java.util.List<Long> idList) {
            this.idList = idList;
            return this;
        }
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setLimitMode(Integer limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public Integer getLimitMode() {
            return this.limitMode;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setResponseAdditionalHeaders(String responseAdditionalHeaders) {
            this.responseAdditionalHeaders = responseAdditionalHeaders;
            return this;
        }
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListGatewayIsolationRuleResponseBodyDataResult setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

    }

    public static class ListGatewayIsolationRuleResponseBodyDataResults extends TeaModel {
        /**
         * <p>The web fallback behavior type. Valid values:</p>
         * <ul>
         * <li>0: return specified content.</li>
         * <li>1: redirect to a specified page.</li>
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
         * <li>0: plain text.</li>
         * <li>1: JSON.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BodyEncoding")
        public Integer bodyEncoding;

        /**
         * <p>Specifies whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li>0: disabled.</li>
         * <li>1: enabled.</li>
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
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The ID of the concurrency rule.</p>
         * 
         * <strong>example:</strong>
         * <p>358</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The IDs of the filter rules.</p>
         */
        @NameInMap("IdList")
        public java.util.List<Long> idList;

        /**
         * <p>The threshold conversion type. Valid values:</p>
         * <ul>
         * <li>0: standalone.</li>
         * <li>1: cluster.</li>
         * <li>2: standalone to cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LimitMode")
        public Integer limitMode;

        /**
         * <p>The overall concurrency threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <p>The custom headers, specified as key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>key=value</p>
         */
        @NameInMap("ResponseAdditionalHeaders")
        public String responseAdditionalHeaders;

        /**
         * <p>The HTTP response body.</p>
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
         * <p>429</p>
         */
        @NameInMap("ResponseStatusCode")
        public Integer responseStatusCode;

        /**
         * <p>The ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>52853</p>
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

        public static ListGatewayIsolationRuleResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayIsolationRuleResponseBodyDataResults self = new ListGatewayIsolationRuleResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setIdList(java.util.List<Long> idList) {
            this.idList = idList;
            return this;
        }
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setLimitMode(Integer limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public Integer getLimitMode() {
            return this.limitMode;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setResponseAdditionalHeaders(String responseAdditionalHeaders) {
            this.responseAdditionalHeaders = responseAdditionalHeaders;
            return this;
        }
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListGatewayIsolationRuleResponseBodyDataResults setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

    }

    public static class ListGatewayIsolationRuleResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the instance list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned results.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayIsolationRuleResponseBodyDataResult> result;

        /**
         * <p>The returned result collection.</p>
         */
        @NameInMap("Results")
        public java.util.List<ListGatewayIsolationRuleResponseBodyDataResults> results;

        /**
         * <p>The total number of queried instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListGatewayIsolationRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayIsolationRuleResponseBodyData self = new ListGatewayIsolationRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayIsolationRuleResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayIsolationRuleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayIsolationRuleResponseBodyData setResult(java.util.List<ListGatewayIsolationRuleResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayIsolationRuleResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayIsolationRuleResponseBodyData setResults(java.util.List<ListGatewayIsolationRuleResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ListGatewayIsolationRuleResponseBodyDataResults> getResults() {
            return this.results;
        }

        public ListGatewayIsolationRuleResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
