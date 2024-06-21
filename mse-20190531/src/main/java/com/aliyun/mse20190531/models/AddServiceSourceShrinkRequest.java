// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN (default): Chinese</li>
     * <li>en-US: English</li>
     * <li>ja: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to monitor Ingress classes.</p>
     * 
     * <strong>example:</strong>
     * <p>c9ad2a0717032427e920754e25b49e3b5</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Specifies whether to update the Ingress status.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-c70622ff52fe49beb29bea9a6f52****</p>
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
     * 
     * <strong>example:</strong>
     * <p>istio</p>
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
     * <ul>
     * <li>K8s: ACK cluster</li>
     * <li>NACOS: MSE Nacos instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>K8s,MSE</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The list of security groups to be authorized. You can specify security groups to allow backend services to access data sources that you create.</p>
     */
    @NameInMap("ToAuthorizeSecurityGroups")
    public String toAuthorizeSecurityGroupsShrink;

    /**
     * <p>The type of the service source.</p>
     * <ul>
     * <li>K8s: Container Service for Kubernetes (ACK) cluster</li>
     * <li>NACOS: Nacos instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The Ingress configuration.</p>
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
