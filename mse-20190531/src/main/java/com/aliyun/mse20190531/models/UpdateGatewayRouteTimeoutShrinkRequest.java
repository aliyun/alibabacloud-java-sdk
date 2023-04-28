// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTimeoutShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("TimeoutJSON")
    public String timeoutJSONShrink;

    public static UpdateGatewayRouteTimeoutShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteTimeoutShrinkRequest self = new UpdateGatewayRouteTimeoutShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setTimeoutJSONShrink(String timeoutJSONShrink) {
        this.timeoutJSONShrink = timeoutJSONShrink;
        return this;
    }
    public String getTimeoutJSONShrink() {
        return this.timeoutJSONShrink;
    }

}
