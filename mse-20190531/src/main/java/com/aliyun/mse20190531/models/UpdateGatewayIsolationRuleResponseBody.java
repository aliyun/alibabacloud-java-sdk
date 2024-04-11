// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateGatewayIsolationRuleResponseBodyData data;

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

        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

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
