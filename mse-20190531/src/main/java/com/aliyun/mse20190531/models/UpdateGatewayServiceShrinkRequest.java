// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceShrinkRequest extends TeaModel {
    /**
     * <p>The language in which you want the results to be displayed. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The list of Domain Name System (DNS) servers (for DNS domain name services only).</p>
     */
    @NameInMap("DnsServerList")
    public String dnsServerListShrink;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>501</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-c9bc5afd61014165bd58f621b491*****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>322</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The address list of fixed address services or domain name list of Domain Name System (DNS) services.</p>
     */
    @NameInMap("IpList")
    public String ipListShrink;

    /**
     * <p>The service name. This parameter is deprecated and cannot be modified. The value of this parameter must be the same as the current service name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The service port. Specify this parameter for DNS services.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ServicePort")
    public String servicePort;

    /**
     * <p>The service protocol.</p>
     * <ul>
     * <li><p>HTTP</p>
     * </li>
     * <li><p>HTTPS</p>
     * </li>
     * <li><p>HTTP2</p>
     * </li>
     * <li><p>GRPC</p>
     * </li>
     * <li><p>DUBBO</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ServiceProtocol")
    public String serviceProtocol;

    /**
     * <p>The Transport Layer Security (TLS) settings. Valid values:</p>
     * <ul>
     * <li><p>mode: TLS mode</p>
     * </li>
     * <li><p>certId: certificate ID</p>
     * </li>
     * <li><p>caCertId: CA certificate ID</p>
     * </li>
     * <li><p>caCertContent: CA certificate public key</p>
     * </li>
     * <li><p>sni: service name identification</p>
     * </li>
     * </ul>
     * 
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

    public static UpdateGatewayServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceShrinkRequest self = new UpdateGatewayServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayServiceShrinkRequest setDnsServerListShrink(String dnsServerListShrink) {
        this.dnsServerListShrink = dnsServerListShrink;
        return this;
    }
    public String getDnsServerListShrink() {
        return this.dnsServerListShrink;
    }

    public UpdateGatewayServiceShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayServiceShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayServiceShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateGatewayServiceShrinkRequest setIpListShrink(String ipListShrink) {
        this.ipListShrink = ipListShrink;
        return this;
    }
    public String getIpListShrink() {
        return this.ipListShrink;
    }

    public UpdateGatewayServiceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayServiceShrinkRequest setServicePort(String servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public String getServicePort() {
        return this.servicePort;
    }

    public UpdateGatewayServiceShrinkRequest setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }
    public String getServiceProtocol() {
        return this.serviceProtocol;
    }

    public UpdateGatewayServiceShrinkRequest setTlsSetting(String tlsSetting) {
        this.tlsSetting = tlsSetting;
        return this;
    }
    public String getTlsSetting() {
        return this.tlsSetting;
    }

}
