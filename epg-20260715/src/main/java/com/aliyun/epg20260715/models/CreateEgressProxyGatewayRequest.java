// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyGatewayRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the egress proxy gateway instance.</p>
     * <p>The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: prechecks the request without creating the egress proxy gateway instance. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. If the request passes the precheck, the HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the egress proxy configuration that is associated with the egress proxy gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epc-uf609a6a8fdf9f4****</p>
     */
    @NameInMap("EgressProxyConfigurationId")
    public String egressProxyConfigurationId;

    /**
     * <p>The name of the egress proxy gateway instance.</p>
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyGatewayName")
    public String egressProxyGatewayName;

    /**
     * <p>The listener configurations of the egress proxy gateway instance.</p>
     * <p>Listeners in the same gateway instance cannot use the same port.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListenerProperties")
    public java.util.List<CreateEgressProxyGatewayRequestListenerProperties> listenerProperties;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-gw80bb6a94f835db****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEgressProxyGatewayRequestTag> tag;

    /**
     * <p>The TLS interception configuration of the egress proxy gateway instance.</p>
     */
    @NameInMap("TlsInterceptProperties")
    public CreateEgressProxyGatewayRequestTlsInterceptProperties tlsInterceptProperties;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the egress proxy gateway instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-zm0ejg5unozkhvuhd****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone and vSwitch mappings of the egress proxy gateway instance.</p>
     * <p>If the current region supports two or more zones, add at least two zones to improve availability.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<CreateEgressProxyGatewayRequestZoneMappings> zoneMappings;

    public static CreateEgressProxyGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyGatewayRequest self = new CreateEgressProxyGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEgressProxyGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEgressProxyGatewayRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEgressProxyGatewayRequest setEgressProxyConfigurationId(String egressProxyConfigurationId) {
        this.egressProxyConfigurationId = egressProxyConfigurationId;
        return this;
    }
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public CreateEgressProxyGatewayRequest setEgressProxyGatewayName(String egressProxyGatewayName) {
        this.egressProxyGatewayName = egressProxyGatewayName;
        return this;
    }
    public String getEgressProxyGatewayName() {
        return this.egressProxyGatewayName;
    }

    public CreateEgressProxyGatewayRequest setListenerProperties(java.util.List<CreateEgressProxyGatewayRequestListenerProperties> listenerProperties) {
        this.listenerProperties = listenerProperties;
        return this;
    }
    public java.util.List<CreateEgressProxyGatewayRequestListenerProperties> getListenerProperties() {
        return this.listenerProperties;
    }

    public CreateEgressProxyGatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEgressProxyGatewayRequest setTag(java.util.List<CreateEgressProxyGatewayRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEgressProxyGatewayRequestTag> getTag() {
        return this.tag;
    }

    public CreateEgressProxyGatewayRequest setTlsInterceptProperties(CreateEgressProxyGatewayRequestTlsInterceptProperties tlsInterceptProperties) {
        this.tlsInterceptProperties = tlsInterceptProperties;
        return this;
    }
    public CreateEgressProxyGatewayRequestTlsInterceptProperties getTlsInterceptProperties() {
        return this.tlsInterceptProperties;
    }

    public CreateEgressProxyGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateEgressProxyGatewayRequest setZoneMappings(java.util.List<CreateEgressProxyGatewayRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CreateEgressProxyGatewayRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CreateEgressProxyGatewayRequestListenerProperties extends TeaModel {
        /**
         * <p>The listener port.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type of the listener. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong>: HTTP.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: HTTPS.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static CreateEgressProxyGatewayRequestListenerProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyGatewayRequestListenerProperties self = new CreateEgressProxyGatewayRequestListenerProperties();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyGatewayRequestListenerProperties setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateEgressProxyGatewayRequestListenerProperties setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class CreateEgressProxyGatewayRequestTag extends TeaModel {
        /**
         * <p>The tag key. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 256 characters in length, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEgressProxyGatewayRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyGatewayRequestTag self = new CreateEgressProxyGatewayRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyGatewayRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEgressProxyGatewayRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEgressProxyGatewayRequestTlsInterceptProperties extends TeaModel {
        /**
         * <p>The ID of the private CA certificate.</p>
         * <ul>
         * <li>This parameter is required when <strong>TlsInterceptMode</strong> is set to <strong>enable</strong>.</li>
         * <li>Do not specify this parameter when <strong>TlsInterceptMode</strong> is set to <strong>disable</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1f01a6f9-a0e7-64e5-9d3c-29c056bf****</p>
         */
        @NameInMap("PrivateCaCertificateId")
        public String privateCaCertificateId;

        /**
         * <p>Specifies whether to enable TLS interception. Valid values:</p>
         * <ul>
         * <li><p><strong>enable</strong>: enables TLS interception.</p>
         * </li>
         * <li><p><strong>disable</strong>: disables TLS interception.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("TlsInterceptMode")
        public String tlsInterceptMode;

        public static CreateEgressProxyGatewayRequestTlsInterceptProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyGatewayRequestTlsInterceptProperties self = new CreateEgressProxyGatewayRequestTlsInterceptProperties();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyGatewayRequestTlsInterceptProperties setPrivateCaCertificateId(String privateCaCertificateId) {
            this.privateCaCertificateId = privateCaCertificateId;
            return this;
        }
        public String getPrivateCaCertificateId() {
            return this.privateCaCertificateId;
        }

        public CreateEgressProxyGatewayRequestTlsInterceptProperties setTlsInterceptMode(String tlsInterceptMode) {
            this.tlsInterceptMode = tlsInterceptMode;
            return this;
        }
        public String getTlsInterceptMode() {
            return this.tlsInterceptMode;
        }

    }

    public static class CreateEgressProxyGatewayRequestZoneMappings extends TeaModel {
        /**
         * <p>The ID of the vSwitch that corresponds to the zone.</p>
         * <p>The vSwitch must belong to the specified VPC and match the zone specified by ZoneId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9aejevoin852mo****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * <p>You can call the DescribeZones operation to query information about zones in a region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-m</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateEgressProxyGatewayRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyGatewayRequestZoneMappings self = new CreateEgressProxyGatewayRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyGatewayRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateEgressProxyGatewayRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
