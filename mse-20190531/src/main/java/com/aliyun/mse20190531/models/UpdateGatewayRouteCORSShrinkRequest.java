// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteCORSShrinkRequest extends TeaModel {
    // The language of the response. In compliance with [RFC 7231](https://tools.ietf.org/html/rfc7231), the backend service must return a response based on the language used by the user.
    // This parameter is empty by default. Valid values:
    // * zh-CN: Chinese
    // * en-US: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The information about the CORS policy.
    @NameInMap("CorsJSON")
    public String corsJSONShrink;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The ID of the route.
    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteCORSShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteCORSShrinkRequest self = new UpdateGatewayRouteCORSShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteCORSShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteCORSShrinkRequest setCorsJSONShrink(String corsJSONShrink) {
        this.corsJSONShrink = corsJSONShrink;
        return this;
    }
    public String getCorsJSONShrink() {
        return this.corsJSONShrink;
    }

    public UpdateGatewayRouteCORSShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteCORSShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteCORSShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
