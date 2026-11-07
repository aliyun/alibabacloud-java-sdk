// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayFlowRuleResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public UpdateGatewayFlowRuleResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2B74E7F7-DF54-5AB1-B8F2-67391B83****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGatewayFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayFlowRuleResponseBody self = new UpdateGatewayFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayFlowRuleResponseBody setData(UpdateGatewayFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGatewayFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateGatewayFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGatewayFlowRuleResponseBodyData extends TeaModel {
        /**
         * <p>The type of the web fallback behavior.</p>
         * <p>0: The specified content is returned.</p>
         * <p>1: The specified page is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BehaviorType")
        public Integer behaviorType;

        /**
         * <p>The encoding type.</p>
         * <p>0: plain text</p>
         * <p>1: JSON</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BodyEncoding")
        public Integer bodyEncoding;

        /**
         * <p>Specifies whether to enable the rule.</p>
         * <p>0: The rule is not enabled.</p>
         * <p>1: The rule is enabled.</p>
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
         * <p>The ID of the throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>549</p>
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
         * <p>0: standalone.</p>
         * <p>1: cluster.</p>
         * <p>2: cluster-to-standalone.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LimitMode")
        public Integer limitMode;

        /**
         * <p>The custom header. The input is a key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>key=value</p>
         */
        @NameInMap("ResponseAdditionalHeaders")
        public String responseAdditionalHeaders;

        /**
         * <p>The HTTP return text.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("ResponseContentBody")
        public String responseContentBody;

        /**
         * <p>The redirection URL.</p>
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
         * <p>48811</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>routeA</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The duration of the statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StatDurationMs")
        public Integer statDurationMs;

        /**
         * <p>The overall queries per second (QPS) threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        public static UpdateGatewayFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayFlowRuleResponseBodyData self = new UpdateGatewayFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayFlowRuleResponseBodyData setBehaviorType(Integer behaviorType) {
            this.behaviorType = behaviorType;
            return this;
        }
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        public UpdateGatewayFlowRuleResponseBodyData setBodyEncoding(Integer bodyEncoding) {
            this.bodyEncoding = bodyEncoding;
            return this;
        }
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        public UpdateGatewayFlowRuleResponseBodyData setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public UpdateGatewayFlowRuleResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public UpdateGatewayFlowRuleResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public UpdateGatewayFlowRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateGatewayFlowRuleResponseBodyData setIdList(java.util.List<Long> idList) {
            this.idList = idList;
            return this;
        }
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        public UpdateGatewayFlowRuleResponseBodyData setLimitMode(Integer limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public Integer getLimitMode() {
            return this.limitMode;
        }

        public UpdateGatewayFlowRuleResponseBodyData setResponseAdditionalHeaders(String responseAdditionalHeaders) {
            this.responseAdditionalHeaders = responseAdditionalHeaders;
            return this;
        }
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        public UpdateGatewayFlowRuleResponseBodyData setResponseContentBody(String responseContentBody) {
            this.responseContentBody = responseContentBody;
            return this;
        }
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        public UpdateGatewayFlowRuleResponseBodyData setResponseRedirectUrl(String responseRedirectUrl) {
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        public UpdateGatewayFlowRuleResponseBodyData setResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        public UpdateGatewayFlowRuleResponseBodyData setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public UpdateGatewayFlowRuleResponseBodyData setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public UpdateGatewayFlowRuleResponseBodyData setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public UpdateGatewayFlowRuleResponseBodyData setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

    }

}
