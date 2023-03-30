// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerResourceStatusRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ConsumerId")
    public Long consumerId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("IdList")
    public String idList;

    @NameInMap("ResourceStatus")
    public Boolean resourceStatus;

    public static UpdateGatewayAuthConsumerResourceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerResourceStatusRequest self = new UpdateGatewayAuthConsumerResourceStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerResourceStatusRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayAuthConsumerResourceStatusRequest setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public Long getConsumerId() {
        return this.consumerId;
    }

    public UpdateGatewayAuthConsumerResourceStatusRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayAuthConsumerResourceStatusRequest setIdList(String idList) {
        this.idList = idList;
        return this;
    }
    public String getIdList() {
        return this.idList;
    }

    public UpdateGatewayAuthConsumerResourceStatusRequest setResourceStatus(Boolean resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }
    public Boolean getResourceStatus() {
        return this.resourceStatus;
    }

}
