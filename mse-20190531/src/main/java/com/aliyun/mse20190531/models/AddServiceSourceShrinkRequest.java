// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceShrinkRequest extends TeaModel {
    /**
     * <p>The supported languages. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese. This is the default value.</li>
     * <li>en-US: English.</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The access address. This parameter is required.</p>
     * <ul>
     * <li>Container Service: the ID of the Container Service cluster.</li>
     * <li>MSE Nacos: the internal endpoint of the instance.</li>
     * <li>MSE ZooKeeper: the internal endpoint of the instance.</li>
     * <li>SAE registry: the namespace TID.</li>
     * <li>EDAS registry: the microservice namespace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse-********-nacos-ans.mse.aliyuncs.com:8848</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-c70622ff52fe49beb29bea9a6f52****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The list of service groups.</p>
     */
    @NameInMap("GroupList")
    public String groupListShrink;

    /**
     * <p>The Ingress configurations. This parameter is used when the service source type is K8s.</p>
     */
    @NameInMap("IngressOptionsRequest")
    public String ingressOptionsRequestShrink;

    /**
     * <p>The name.</p>
     * <blockquote>
     * <p>Descriptions for different source types.</p>
     * </blockquote>
     * <ul>
     * <li>When the type is K8s, the input parameter is the name.</li>
     * <li>When the type is NACOS, the input parameter is the instance ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nacos</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The array of service root paths.</p>
     */
    @NameInMap("PathList")
    public String pathListShrink;

    /**
     * <p>The service source type:</p>
     * <ul>
     * <li>Container Service: K8S</li>
     * <li>MSE Nacos: MSE</li>
     * <li>MSE ZooKeeper: MSE_ZK</li>
     * <li>SAE registry: SAE</li>
     * <li>EDAS registry: EDAS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The list of security groups to be authorized. This parameter is used to remove security group restrictions for backend services when creating a source.</p>
     */
    @NameInMap("ToAuthorizeSecurityGroups")
    public String toAuthorizeSecurityGroupsShrink;

    /**
     * <p>The service registration type. Specify the corresponding value based on the source type:</p>
     * <ul>
     * <li>Container Service: K8S</li>
     * <li>MSE Nacos: NACOS</li>
     * <li>MSE ZooKeeper: ZOOKEEPER</li>
     * <li>SAE registry: NACOS</li>
     * <li>EDAS registry: NACOS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NACOS</p>
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
