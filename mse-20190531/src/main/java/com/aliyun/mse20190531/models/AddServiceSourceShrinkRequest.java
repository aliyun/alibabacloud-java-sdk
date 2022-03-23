// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Address")
    public String address;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("IngressOptionsRequest")
    public String ingressOptionsRequestShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("Source")
    public String source;

    @NameInMap("Type")
    public String type;

    public static AddServiceSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSourceShrinkRequest self = new AddServiceSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddServiceSourceShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddServiceSourceShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AddServiceSourceShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddServiceSourceShrinkRequest setIngressOptionsRequestShrink(String ingressOptionsRequestShrink) {
        this.ingressOptionsRequestShrink = ingressOptionsRequestShrink;
        return this;
    }
    public String getIngressOptionsRequestShrink() {
        return this.ingressOptionsRequestShrink;
    }

    public AddServiceSourceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddServiceSourceShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddServiceSourceShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
