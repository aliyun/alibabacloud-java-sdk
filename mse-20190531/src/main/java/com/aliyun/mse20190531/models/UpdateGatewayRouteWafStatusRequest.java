// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteWafStatusRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("RouteId")
    public Long routeId;

    public static UpdateGatewayRouteWafStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteWafStatusRequest self = new UpdateGatewayRouteWafStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteWafStatusRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteWafStatusRequest setEnableWaf(Boolean enableWaf) {
        this.enableWaf = enableWaf;
        return this;
    }
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    public UpdateGatewayRouteWafStatusRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteWafStatusRequest setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

}
