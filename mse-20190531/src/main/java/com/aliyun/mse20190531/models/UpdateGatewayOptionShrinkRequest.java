// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayOptionShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayOption")
    public String gatewayOptionShrink;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static UpdateGatewayOptionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayOptionShrinkRequest self = new UpdateGatewayOptionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayOptionShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayOptionShrink(String gatewayOptionShrink) {
        this.gatewayOptionShrink = gatewayOptionShrink;
        return this;
    }
    public String getGatewayOptionShrink() {
        return this.gatewayOptionShrink;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
