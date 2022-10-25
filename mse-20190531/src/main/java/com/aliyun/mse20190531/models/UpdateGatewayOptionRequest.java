// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayOptionRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayOption")
    public GatewayOption gatewayOption;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static UpdateGatewayOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayOptionRequest self = new UpdateGatewayOptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayOptionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayOptionRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayOptionRequest setGatewayOption(GatewayOption gatewayOption) {
        this.gatewayOption = gatewayOption;
        return this;
    }
    public GatewayOption getGatewayOption() {
        return this.gatewayOption;
    }

    public UpdateGatewayOptionRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
