// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class OfflineGatewayRouteRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-77e1153db6e14c0a8b1fae20bcb89ca5</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>645</p>
     */
    @NameInMap("RouteId")
    public String routeId;

    public static OfflineGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineGatewayRouteRequest self = new OfflineGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public OfflineGatewayRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public OfflineGatewayRouteRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public OfflineGatewayRouteRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

}
