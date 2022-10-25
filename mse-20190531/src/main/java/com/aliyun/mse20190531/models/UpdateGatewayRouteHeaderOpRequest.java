// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHeaderOpRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("HeaderOpJSON")
    public String headerOpJSON;

    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteHeaderOpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteHeaderOpRequest self = new UpdateGatewayRouteHeaderOpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteHeaderOpRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteHeaderOpRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteHeaderOpRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteHeaderOpRequest setHeaderOpJSON(String headerOpJSON) {
        this.headerOpJSON = headerOpJSON;
        return this;
    }
    public String getHeaderOpJSON() {
        return this.headerOpJSON;
    }

    public UpdateGatewayRouteHeaderOpRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
