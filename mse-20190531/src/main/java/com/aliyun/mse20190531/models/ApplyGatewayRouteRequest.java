// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyGatewayRouteRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the route.</p>
     */
    @NameInMap("RouteId")
    public String routeId;

    public static ApplyGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyGatewayRouteRequest self = new ApplyGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public ApplyGatewayRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ApplyGatewayRouteRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public ApplyGatewayRouteRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

}
