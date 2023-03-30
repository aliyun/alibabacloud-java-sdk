// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerStatusRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ConsumerStatus")
    public Boolean consumerStatus;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayAuthConsumerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerStatusRequest self = new UpdateGatewayAuthConsumerStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerStatusRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayAuthConsumerStatusRequest setConsumerStatus(Boolean consumerStatus) {
        this.consumerStatus = consumerStatus;
        return this;
    }
    public Boolean getConsumerStatus() {
        return this.consumerStatus;
    }

    public UpdateGatewayAuthConsumerStatusRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayAuthConsumerStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
