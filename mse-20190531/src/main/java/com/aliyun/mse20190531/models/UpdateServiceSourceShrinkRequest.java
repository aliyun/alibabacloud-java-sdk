// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateServiceSourceShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The address.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the gateway.</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the service source.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The configurations of Ingress resources.</p>
     */
    @NameInMap("IngressOptionsRequest")
    public String ingressOptionsRequestShrink;

    /**
     * <p>The name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>An array of service root paths.</p>
     */
    @NameInMap("PathList")
    public String pathListShrink;

    /**
     * <p>The service source. Valid values:</p>
     * <br>
     * <p>*   K8S: ACK cluster</p>
     * <p>*   MSE: Nacos instance</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the service source. Valid values:</p>
     * <br>
     * <p>*   K8S: ACK cluster</p>
     * <p>*   NACOS: Nacos instance</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateServiceSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSourceShrinkRequest self = new UpdateServiceSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSourceShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateServiceSourceShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateServiceSourceShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateServiceSourceShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateServiceSourceShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateServiceSourceShrinkRequest setIngressOptionsRequestShrink(String ingressOptionsRequestShrink) {
        this.ingressOptionsRequestShrink = ingressOptionsRequestShrink;
        return this;
    }
    public String getIngressOptionsRequestShrink() {
        return this.ingressOptionsRequestShrink;
    }

    public UpdateServiceSourceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateServiceSourceShrinkRequest setPathListShrink(String pathListShrink) {
        this.pathListShrink = pathListShrink;
        return this;
    }
    public String getPathListShrink() {
        return this.pathListShrink;
    }

    public UpdateServiceSourceShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateServiceSourceShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
