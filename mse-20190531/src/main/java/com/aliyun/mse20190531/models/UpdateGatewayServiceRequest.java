// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("DnsServerList")
    public java.util.List<String> dnsServerList;

    /**
     * <strong>example:</strong>
     * <p>501</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <strong>example:</strong>
     * <p>gw-c9bc5afd61014165bd58f621b491*****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <strong>example:</strong>
     * <p>322</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("IpList")
    public java.util.List<String> ipList;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ServicePort")
    public String servicePort;

    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ServiceProtocol")
    public String serviceProtocol;

    /**
     * <strong>example:</strong>
     * <p>{
     *       &quot;mode&quot;: &quot;MUTUAL&quot;,
     *       &quot;certId&quot;: &quot;1*****-cn-hangzhou&quot;,
     *       &quot;caCertContent&quot;: &quot;123&quot;,
     *       &quot;sni&quot;: &quot;ceshi&quot;
     * }</p>
     */
    @NameInMap("TlsSetting")
    public String tlsSetting;

    public static UpdateGatewayServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceRequest self = new UpdateGatewayServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayServiceRequest setDnsServerList(java.util.List<String> dnsServerList) {
        this.dnsServerList = dnsServerList;
        return this;
    }
    public java.util.List<String> getDnsServerList() {
        return this.dnsServerList;
    }

    public UpdateGatewayServiceRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayServiceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateGatewayServiceRequest setIpList(java.util.List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    public UpdateGatewayServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayServiceRequest setServicePort(String servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public String getServicePort() {
        return this.servicePort;
    }

    public UpdateGatewayServiceRequest setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }
    public String getServiceProtocol() {
        return this.serviceProtocol;
    }

    public UpdateGatewayServiceRequest setTlsSetting(String tlsSetting) {
        this.tlsSetting = tlsSetting;
        return this;
    }
    public String getTlsSetting() {
        return this.tlsSetting;
    }

}
