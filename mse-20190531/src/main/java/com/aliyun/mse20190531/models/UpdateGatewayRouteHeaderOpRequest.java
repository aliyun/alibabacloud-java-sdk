// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHeaderOpRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The information about the header configuration policy.
    @NameInMap("HeaderOpJSON")
    public String headerOpJSON;

    // The ID of the record.
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
