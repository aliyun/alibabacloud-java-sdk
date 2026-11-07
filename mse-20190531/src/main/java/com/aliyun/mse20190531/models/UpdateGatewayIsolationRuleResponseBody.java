// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayIsolationRuleResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public UpdateGatewayIsolationRuleResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94B12406-E44D-57C9-BF93-A8B35BFF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGatewayIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayIsolationRuleResponseBody self = new UpdateGatewayIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayIsolationRuleResponseBody setData(UpdateGatewayIsolationRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGatewayIsolationRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateGatewayIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGatewayIsolationRuleResponseBodyData extends TeaModel {
        /**
         * <p>The type of the web fallback behavior.</p>
         * <p>0: The specified content is returned.</p>
         * <p>1: Redirect the specified page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BehaviorType")
        public Integer behaviorType;

        /**
         * <p>The encoding type.</p>
         * <p>0: plain text</p>
         * <p>1: JSON text</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BodyEncoding")
        public Integer bodyEncoding;

        /**
         * <p>Specifies whether to enable the rule.</p>
         * <p>0: disable</p>
         * <p>1: enable</p>
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
         * <p>The IDs of the circuit breaking rules that are used to filter data.</p>
         */
        @NameInMap("IdList")
        public java.util.List<Long> idList;

        /**
         * <p>The threshold conversion mode.</p>
         * <p>0: standalone</p>
         * <p>1: cluster</p>
         * <p>2: cluster-to-standalone</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LimitMode")
        public Integer limitMode;

        /**
         * <p>The maximum number of concurrent requests.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <p>The custom header. The input is a key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>key=value</p>
         */
        @NameInMap("ResponseAdditionalHeaders")
        public String responseAdditionalHeaders;

        /**
         * <p>The HTTP text to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ResponseContentBody")
        public String responseContentBody;

        /**
         * <p>The URL that is redirected to.</p>
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
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52853</p>
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

        public static UpdateGatewayIsolationRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayIsolationRuleResponseBodyData self = new UpdateGatewayIsolationRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayIsolationRuleResponseBodyData setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setIdList(java.util.List<Long> idList) {
            this.idList = idList;
            return this;
        }
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setLimitMode(Integer limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public Integer getLimitMode() {
            return this.limitMode;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setResponseAdditionalHeaders(String responseAdditionalHeaders) {
            this.responseAdditionalHeaders = responseAdditionalHeaders;
            return this;
        }
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public UpdateGatewayIsolationRuleResponseBodyData setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

    }

}
