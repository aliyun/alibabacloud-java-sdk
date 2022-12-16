// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewaySlbRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The HTTP port number (virtual service group).
    @NameInMap("HttpPort")
    public Integer httpPort;

    // The HTTPS port number (virtual service group).
    @NameInMap("HttpsPort")
    public Integer httpsPort;

    // The ID of the HTTPS virtual service group.
    @NameInMap("HttpsVServerGroupId")
    public String httpsVServerGroupId;

    // The service weight.
    @NameInMap("ServiceWeight")
    public Integer serviceWeight;

    // SLB ID.
    @NameInMap("SlbId")
    public String slbId;

    // The type.
    @NameInMap("Type")
    public String type;

    // The ID of the HTTP virtual service group.
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static AddGatewaySlbRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewaySlbRequest self = new AddGatewaySlbRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewaySlbRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewaySlbRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewaySlbRequest setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public Integer getHttpPort() {
        return this.httpPort;
    }

    public AddGatewaySlbRequest setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public Integer getHttpsPort() {
        return this.httpsPort;
    }

    public AddGatewaySlbRequest setHttpsVServerGroupId(String httpsVServerGroupId) {
        this.httpsVServerGroupId = httpsVServerGroupId;
        return this;
    }
    public String getHttpsVServerGroupId() {
        return this.httpsVServerGroupId;
    }

    public AddGatewaySlbRequest setServiceWeight(Integer serviceWeight) {
        this.serviceWeight = serviceWeight;
        return this;
    }
    public Integer getServiceWeight() {
        return this.serviceWeight;
    }

    public AddGatewaySlbRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public AddGatewaySlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddGatewaySlbRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

}
