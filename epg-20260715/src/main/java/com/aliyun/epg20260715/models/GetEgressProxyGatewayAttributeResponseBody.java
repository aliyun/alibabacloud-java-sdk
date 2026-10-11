// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the egress proxy gateway was created. The time is displayed in UTC and follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-02T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the default egress IP pool.</p>
     * 
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("DefaultEgressProxyIpPoolId")
    public String defaultEgressProxyIpPoolId;

    /**
     * <p>The description of the egress proxy gateway instance. The description must be 2 to 256 characters in length and can contain Chinese characters and English letters. It can also contain digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The DNS domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-gw80bb6a94f835****.cn-shanghai.epg.aliyuncs.com</p>
     */
    @NameInMap("DnsName")
    public String dnsName;

    /**
     * <p>The ID of the associated egress proxy configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>epc-uf609a6a8fdf9f4d****</p>
     */
    @NameInMap("EgressProxyConfigurationId")
    public String egressProxyConfigurationId;

    /**
     * <p>The ID of the egress proxy gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-gw80bb6a94f835db****</p>
     */
    @NameInMap("EgressProxyGatewayId")
    public String egressProxyGatewayId;

    /**
     * <p>The name of the egress proxy gateway. The name must be 2 to 128 characters in length and can contain English letters and Chinese characters. It must start with a letter or a Chinese character and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyGatewayName")
    public String egressProxyGatewayName;

    /**
     * <p>The list of listener properties.</p>
     */
    @NameInMap("ListenerProperties")
    public java.util.List<GetEgressProxyGatewayAttributeResponseBodyListenerProperties> listenerProperties;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A05AB7-6C14-5A12-94E7-F20F9F69AE3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2zye42m****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance status of the egress proxy gateway. Valid values:</p>
     * <ul>
     * <li><strong>Provisioning</strong>: The instance is being created.</li>
     * <li><strong>Active</strong>: The instance is running.</li>
     * <li><strong>Configuring</strong>: The instance is being reconfigured.</li>
     * <li><strong>Inactive</strong>: The instance is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetEgressProxyGatewayAttributeResponseBodyTags> tags;

    /**
     * <p>The TLS interception properties.</p>
     */
    @NameInMap("TlsInterceptProperties")
    public GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties tlsInterceptProperties;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-n4appznmjjr362yd3****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The list of zone and vSwitch mappings. If the current region supports two or more zones, at least two zones must be returned.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<GetEgressProxyGatewayAttributeResponseBodyZoneMappings> zoneMappings;

    public static GetEgressProxyGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyGatewayAttributeResponseBody self = new GetEgressProxyGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyGatewayAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetEgressProxyGatewayAttributeResponseBody setDefaultEgressProxyIpPoolId(String defaultEgressProxyIpPoolId) {
        this.defaultEgressProxyIpPoolId = defaultEgressProxyIpPoolId;
        return this;
    }
    public String getDefaultEgressProxyIpPoolId() {
        return this.defaultEgressProxyIpPoolId;
    }

    public GetEgressProxyGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetEgressProxyGatewayAttributeResponseBody setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
    public String getDnsName() {
        return this.dnsName;
    }

    public GetEgressProxyGatewayAttributeResponseBody setEgressProxyConfigurationId(String egressProxyConfigurationId) {
        this.egressProxyConfigurationId = egressProxyConfigurationId;
        return this;
    }
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public GetEgressProxyGatewayAttributeResponseBody setEgressProxyGatewayId(String egressProxyGatewayId) {
        this.egressProxyGatewayId = egressProxyGatewayId;
        return this;
    }
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    public GetEgressProxyGatewayAttributeResponseBody setEgressProxyGatewayName(String egressProxyGatewayName) {
        this.egressProxyGatewayName = egressProxyGatewayName;
        return this;
    }
    public String getEgressProxyGatewayName() {
        return this.egressProxyGatewayName;
    }

    public GetEgressProxyGatewayAttributeResponseBody setListenerProperties(java.util.List<GetEgressProxyGatewayAttributeResponseBodyListenerProperties> listenerProperties) {
        this.listenerProperties = listenerProperties;
        return this;
    }
    public java.util.List<GetEgressProxyGatewayAttributeResponseBodyListenerProperties> getListenerProperties() {
        return this.listenerProperties;
    }

    public GetEgressProxyGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEgressProxyGatewayAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetEgressProxyGatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEgressProxyGatewayAttributeResponseBody setTags(java.util.List<GetEgressProxyGatewayAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetEgressProxyGatewayAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetEgressProxyGatewayAttributeResponseBody setTlsInterceptProperties(GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties tlsInterceptProperties) {
        this.tlsInterceptProperties = tlsInterceptProperties;
        return this;
    }
    public GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties getTlsInterceptProperties() {
        return this.tlsInterceptProperties;
    }

    public GetEgressProxyGatewayAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetEgressProxyGatewayAttributeResponseBody setZoneMappings(java.util.List<GetEgressProxyGatewayAttributeResponseBodyZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<GetEgressProxyGatewayAttributeResponseBodyZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class GetEgressProxyGatewayAttributeResponseBodyListenerProperties extends TeaModel {
        /**
         * <p>The listener port. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The listener protocol. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static GetEgressProxyGatewayAttributeResponseBodyListenerProperties build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyGatewayAttributeResponseBodyListenerProperties self = new GetEgressProxyGatewayAttributeResponseBodyListenerProperties();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyGatewayAttributeResponseBodyListenerProperties setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetEgressProxyGatewayAttributeResponseBodyListenerProperties setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class GetEgressProxyGatewayAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key. The key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 256 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEgressProxyGatewayAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyGatewayAttributeResponseBodyTags self = new GetEgressProxyGatewayAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyGatewayAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEgressProxyGatewayAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties extends TeaModel {
        /**
         * <p>The ID of the private CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1f01a6f9-a0e7-64e5-9d3c-29c056bf****</p>
         */
        @NameInMap("PrivateCaCertificateId")
        public String privateCaCertificateId;

        /**
         * <p>The TLS Block Mode. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: Enables the TLS Block Mode.</li>
         * <li><strong>disable</strong>: Disables the TLS Block Mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("TlsInterceptMode")
        public String tlsInterceptMode;

        public static GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties self = new GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties setPrivateCaCertificateId(String privateCaCertificateId) {
            this.privateCaCertificateId = privateCaCertificateId;
            return this;
        }
        public String getPrivateCaCertificateId() {
            return this.privateCaCertificateId;
        }

        public GetEgressProxyGatewayAttributeResponseBodyTlsInterceptProperties setTlsInterceptMode(String tlsInterceptMode) {
            this.tlsInterceptMode = tlsInterceptMode;
            return this;
        }
        public String getTlsInterceptMode() {
            return this.tlsInterceptMode;
        }

    }

    public static class GetEgressProxyGatewayAttributeResponseBodyZoneMappings extends TeaModel {
        /**
         * <p>The zone status. Valid values:</p>
         * <ul>
         * <li><strong>Provisioning</strong>: The zone is being created.</li>
         * <li><strong>Available</strong>: The zone is available.</li>
         * <li><strong>Configuring</strong>: The zone is being reconfigured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch that corresponds to the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-f8zvrktbjs9hh3xqz****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetEgressProxyGatewayAttributeResponseBodyZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyGatewayAttributeResponseBodyZoneMappings self = new GetEgressProxyGatewayAttributeResponseBodyZoneMappings();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyGatewayAttributeResponseBodyZoneMappings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEgressProxyGatewayAttributeResponseBodyZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetEgressProxyGatewayAttributeResponseBodyZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
