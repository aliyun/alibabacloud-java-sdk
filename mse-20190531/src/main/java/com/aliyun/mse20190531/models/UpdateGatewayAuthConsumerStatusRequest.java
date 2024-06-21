// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerStatusRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The status of the consumer. Valid values:</p>
     * <ul>
     * <li>true: The consumer is enabled.</li>
     * <li>false: The consumer is disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConsumerStatus")
    public Boolean consumerStatus;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-685f661467b54f48b7b7a76605ce****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The consumer ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
