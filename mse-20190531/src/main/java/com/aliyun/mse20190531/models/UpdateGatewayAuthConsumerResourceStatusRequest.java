// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerResourceStatusRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the consumer.</p>
     */
    @NameInMap("ConsumerId")
    public Long consumerId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The list of IDs of the authorized resources that a user wants to update.</p>
     */
    @NameInMap("IdList")
    public String idList;

    /**
     * <p>The resource authorization status. Valid values:</p>
     * <br>
     * <p>*   true: enabled</p>
     * <p>*   false: disabled</p>
     */
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
