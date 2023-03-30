// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteAuthShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AuthJSON")
    public String authJSONShrink;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteAuthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteAuthShrinkRequest self = new UpdateGatewayRouteAuthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteAuthShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteAuthShrinkRequest setAuthJSONShrink(String authJSONShrink) {
        this.authJSONShrink = authJSONShrink;
        return this;
    }
    public String getAuthJSONShrink() {
        return this.authJSONShrink;
    }

    public UpdateGatewayRouteAuthShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteAuthShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteAuthShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
