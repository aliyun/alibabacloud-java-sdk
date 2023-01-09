// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceShrinkRequest extends TeaModel {
    // The language in which the returned information is displayed. Valid values:
    // 
    // *   zh-CN: Chinese. This is the default value.
    // *   en-US: English.
    // *   ja: Japanese.
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The endpoint.
    @NameInMap("Address")
    public String address;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The list of service groups.
    @NameInMap("GroupList")
    public String groupListShrink;

    // The Ingress configuration.
    @NameInMap("IngressOptionsRequest")
    public String ingressOptionsRequestShrink;

    // The name.
    // 
    // >  The parameter value varies based on the source type.
    // 
    // *   If Type is set to K8S, this parameter specifies the name of the ACK cluster.
    // 
    // *   If Type is set to NACOS, this parameter specifies the ID of the instance.
    @NameInMap("Name")
    public String name;

    // An array of service root paths.
    @NameInMap("PathList")
    public String pathListShrink;

    // The service source.
    // 
    // *   K8S: ACK cluster
    // *   MSE: Nacos instance
    @NameInMap("Source")
    public String source;

    // The type of the service source. Valid values:
    // 
    // *   K8S: ACK cluster
    // *   NACOS: Nacos instance
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

    public AddServiceSourceShrinkRequest setGroupListShrink(String groupListShrink) {
        this.groupListShrink = groupListShrink;
        return this;
    }
    public String getGroupListShrink() {
        return this.groupListShrink;
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

    public AddServiceSourceShrinkRequest setPathListShrink(String pathListShrink) {
        this.pathListShrink = pathListShrink;
        return this;
    }
    public String getPathListShrink() {
        return this.pathListShrink;
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
