// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh-CN (default): Chinese</p>
     * <p>*   en-US: English</p>
     * <p>*   ja: Japanese</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to monitor Ingress classes.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Specifies whether to update the Ingress status.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("GroupList")
    public String groupListShrink;

    /**
     * <p>The list of service groups.</p>
     */
    @NameInMap("IngressOptionsRequest")
    public String ingressOptionsRequestShrink;

    /**
     * <p>The namespace whose resources you want to monitor.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("PathList")
    public String pathListShrink;

    /**
     * <p>The service source.</p>
     * <br>
     * <p>*   K8s: ACK cluster</p>
     * <p>*   NACOS: MSE Nacos instance</p>
     */
    @NameInMap("Source")
    public String source;

    @NameInMap("ToAuthorizeSecurityGroups")
    public String toAuthorizeSecurityGroupsShrink;

    /**
     * <p>The type of the service source.</p>
     * <br>
     * <p>*   K8s: Container Service for Kubernetes (ACK) cluster</p>
     * <p>*   NACOS: Nacos instance</p>
     */
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

    public AddServiceSourceShrinkRequest setToAuthorizeSecurityGroupsShrink(String toAuthorizeSecurityGroupsShrink) {
        this.toAuthorizeSecurityGroupsShrink = toAuthorizeSecurityGroupsShrink;
        return this;
    }
    public String getToAuthorizeSecurityGroupsShrink() {
        return this.toAuthorizeSecurityGroupsShrink;
    }

    public AddServiceSourceShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
