// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteCORSShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("CorsJSON")
    public String corsJSONShrink;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

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
