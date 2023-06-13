// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh-CN: Chinese. This is the default value.</p>
     * <p>*   en-US: English.</p>
     * <p>*   ja: Japanese.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The address.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The list of service groups.</p>
     */
    @NameInMap("GroupList")
    public String groupListShrink;

    /**
     * <p>The Ingress configuration.</p>
     */
    @NameInMap("IngressOptionsRequest")
    public String ingressOptionsRequestShrink;

    /**
     * <p>The name.</p>
     * <br>
     * <p>> The meaning of this parameter varies with the type of the service source.</p>
     * <br>
     * <p>*   If Type is set to K8S, this parameter specifies the name of the ACK cluster.</p>
     * <p>*   If Type is set to NACOS, this parameter specifies the ID of the Nacos instance.</p>
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
     * <p>*   MSE: MSE Nacos instance</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the service source. Valid values:</p>
     * <br>
     * <p>*   K8S: ACK cluster</p>
     * <p>*   NACOS: MSE Nacos instance</p>
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

    public AddServiceSourceShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
