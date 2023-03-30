// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteAuthRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AuthJSON")
    public UpdateGatewayRouteAuthRequestAuthJSON authJSON;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteAuthRequest self = new UpdateGatewayRouteAuthRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteAuthRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteAuthRequest setAuthJSON(UpdateGatewayRouteAuthRequestAuthJSON authJSON) {
        this.authJSON = authJSON;
        return this;
    }
    public UpdateGatewayRouteAuthRequestAuthJSON getAuthJSON() {
        return this.authJSON;
    }

    public UpdateGatewayRouteAuthRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteAuthRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteAuthRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public static class UpdateGatewayRouteAuthRequestAuthJSON extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static UpdateGatewayRouteAuthRequestAuthJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteAuthRequestAuthJSON self = new UpdateGatewayRouteAuthRequestAuthJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteAuthRequestAuthJSON setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
