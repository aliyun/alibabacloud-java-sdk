// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayAuthConsumerResourceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The consumer ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsumerId")
    public Long consumerId;

    /**
     * <p>The unique ID of the gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The IDs of the authorized resources that you want to delete.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
