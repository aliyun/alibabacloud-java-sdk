// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerResourceShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ConsumerId")
    public Long consumerId;

    /**
     * <p>UpdateGatewayAuthConsumerResource</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("ResourceList")
    public String resourceListShrink;

    public static UpdateGatewayAuthConsumerResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerResourceShrinkRequest self = new UpdateGatewayAuthConsumerResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerResourceShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayAuthConsumerResourceShrinkRequest setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public Long getConsumerId() {
        return this.consumerId;
    }

    public UpdateGatewayAuthConsumerResourceShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayAuthConsumerResourceShrinkRequest setResourceListShrink(String resourceListShrink) {
        this.resourceListShrink = resourceListShrink;
        return this;
    }
    public String getResourceListShrink() {
        return this.resourceListShrink;
    }

}
