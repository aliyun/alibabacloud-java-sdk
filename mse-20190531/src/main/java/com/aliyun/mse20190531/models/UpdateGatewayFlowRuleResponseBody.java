// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayFlowRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateGatewayFlowRuleResponseBodyData data;

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

        @NameInMap("StatDurationMs")
        public Integer statDurationMs;

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
