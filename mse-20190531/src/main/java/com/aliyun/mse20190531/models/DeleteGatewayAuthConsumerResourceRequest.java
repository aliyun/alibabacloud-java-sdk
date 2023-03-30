// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayAuthConsumerResourceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ConsumerId")
    public Long consumerId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("IdList")
    public String idList;

    public static DeleteGatewayAuthConsumerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayAuthConsumerResourceRequest self = new DeleteGatewayAuthConsumerResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayAuthConsumerResourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteGatewayAuthConsumerResourceRequest setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public Long getConsumerId() {
        return this.consumerId;
    }

    public DeleteGatewayAuthConsumerResourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public DeleteGatewayAuthConsumerResourceRequest setIdList(String idList) {
        this.idList = idList;
        return this;
    }
    public String getIdList() {
        return this.idList;
    }

}
