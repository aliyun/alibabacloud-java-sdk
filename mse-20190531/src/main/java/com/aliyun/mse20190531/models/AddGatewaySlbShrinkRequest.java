// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewaySlbShrinkRequest extends TeaModel {
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
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-9cdcf8e4f58144059e73ff4c5ef9****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The HTTP port number (virtual service group).</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HttpPort")
    public Integer httpPort;

    /**
     * <p>The HTTPS port number (virtual service group).</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("HttpsPort")
    public Integer httpsPort;

    /**
     * <p>The ID of the HTTPS virtual service group.</p>
     * 
     * <strong>example:</strong>
     * <p>353</p>
     */
    @NameInMap("HttpsVServerGroupId")
    public String httpsVServerGroupId;

    /**
     * <p>The service weight.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ServiceWeight")
    public Integer serviceWeight;

    /**
     * <p>The ID of the SLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp18t6jjskwxh6wy1****</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The type of the service source. Valid values:</p>
     * <ul>
     * <li>PUB_NET: Internet</li>
     * <li>PRIVATE_NET: VPC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUB_NET</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the HTTP virtual service group.</p>
     * 
     * <strong>example:</strong>
     * <p>353</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The SLB monitoring information.</p>
     */
    @NameInMap("VServiceList")
    public String VServiceListShrink;

    public static AddGatewaySlbShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewaySlbShrinkRequest self = new AddGatewaySlbShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewaySlbShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewaySlbShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewaySlbShrinkRequest setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public Integer getHttpPort() {
        return this.httpPort;
    }

    public AddGatewaySlbShrinkRequest setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public Integer getHttpsPort() {
        return this.httpsPort;
    }

    public AddGatewaySlbShrinkRequest setHttpsVServerGroupId(String httpsVServerGroupId) {
        this.httpsVServerGroupId = httpsVServerGroupId;
        return this;
    }
    public String getHttpsVServerGroupId() {
        return this.httpsVServerGroupId;
    }

    public AddGatewaySlbShrinkRequest setServiceWeight(Integer serviceWeight) {
        this.serviceWeight = serviceWeight;
        return this;
    }
    public Integer getServiceWeight() {
        return this.serviceWeight;
    }

    public AddGatewaySlbShrinkRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public AddGatewaySlbShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddGatewaySlbShrinkRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public AddGatewaySlbShrinkRequest setVServiceListShrink(String VServiceListShrink) {
        this.VServiceListShrink = VServiceListShrink;
        return this;
    }
    public String getVServiceListShrink() {
        return this.VServiceListShrink;
    }

}
