// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHeaderOpRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the gateway.</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The information about the header configuration policy.</p>
     */
    @NameInMap("HeaderOpJSON")
    public String headerOpJSON;

    /**
     * <p>The ID of the record.</p>
     */
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
