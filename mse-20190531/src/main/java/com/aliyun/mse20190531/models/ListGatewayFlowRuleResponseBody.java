// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayFlowRuleResponseBody extends TeaModel {
    /**
     * <p>The Meta return information.</p>
     */
    @NameInMap("Data")
    public ListGatewayFlowRuleResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0951EBF0-798E-5E0B-8D38-460A14AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGatewayFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayFlowRuleResponseBody self = new ListGatewayFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayFlowRuleResponseBody setData(ListGatewayFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayFlowRuleResponseBodyDataResult extends TeaModel {
        /**
         * <p>The Web fallback behavior type.</p>
         * <p>0: Return specified content</p>
         * <p>1: Redirect to specified page</p>
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
         * <p>Indicates whether the rule is enabled.</p>
         * <p>0: Disabled.</p>
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
         * <p>14407</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique gateway identity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The routing throttle rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>549</p>
         */
        @NameInMap("Id")
        public Long id;

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
         * <p>429</p>
         */
        @NameInMap("ResponseStatusCode")
        public Integer responseStatusCode;

        /**
         * <p>The routing ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48811</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The routing name.</p>
         * 
         * <strong>example:</strong>
         * <p>routeA</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The overall QPS threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        public static ListGatewayFlowRuleResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayFlowRuleResponseBodyDataResult self = new ListGatewayFlowRuleResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayFlowRuleResponseBodyDataResult setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public ListGatewayFlowRuleResponseBodyDataResult setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

    }

    public static class ListGatewayFlowRuleResponseBodyDataResults extends TeaModel {
        /**
         * <p>The Web fallback behavior type.</p>
         * <p>0: Return specified content</p>
         * <p>1: Redirect to specified page</p>
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
         * <p>Indicates whether the rule is enabled.</p>
         * <p>0: Disabled.</p>
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
         * <p>14407</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique gateway identity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The routing throttle rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>549</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The filtered rule IDs.</p>
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
         * <p>The custom headers, entered as key-value pairs.</p>
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
         * <p>429</p>
         */
        @NameInMap("ResponseStatusCode")
        public Integer responseStatusCode;

        /**
         * <p>The routing ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48811</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The routing name.</p>
         * 
         * <strong>example:</strong>
         * <p>routeA</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The statistics duration.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StatDurationMs")
        public Integer statDurationMs;

        /**
         * <p>The overall QPS threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        public static ListGatewayFlowRuleResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayFlowRuleResponseBodyDataResults self = new ListGatewayFlowRuleResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public ListGatewayFlowRuleResponseBodyDataResults setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setIdList(java.util.List<Long> idList) {
            this.idList = idList;
            return this;
        }
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setLimitMode(Integer limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public Integer getLimitMode() {
            return this.limitMode;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setResponseAdditionalHeaders(String responseAdditionalHeaders) {
            this.responseAdditionalHeaders = responseAdditionalHeaders;
            return this;
        }
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public ListGatewayFlowRuleResponseBodyDataResults setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

    }

    public static class ListGatewayFlowRuleResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the instance list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of rows per page set during input.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned data.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayFlowRuleResponseBodyDataResult> result;

        /**
         * <p>The paged data collection.</p>
         */
        @NameInMap("Results")
        public java.util.List<ListGatewayFlowRuleResponseBodyDataResults> results;

        /**
         * <p>The total number of instances queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListGatewayFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayFlowRuleResponseBodyData self = new ListGatewayFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayFlowRuleResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayFlowRuleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayFlowRuleResponseBodyData setResult(java.util.List<ListGatewayFlowRuleResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayFlowRuleResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayFlowRuleResponseBodyData setResults(java.util.List<ListGatewayFlowRuleResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ListGatewayFlowRuleResponseBodyDataResults> getResults() {
            return this.results;
        }

        public ListGatewayFlowRuleResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
