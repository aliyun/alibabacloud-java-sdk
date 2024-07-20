// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ConfigEndpointProbeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable latency monitoring. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The endpoint group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The type of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Ip:</strong> a custom IP address.</li>
     * <li><strong>Domain:</strong> a custom domain name.</li>
     * <li><strong>EIP:</strong> an Alibaba Cloud elastic IP address (EIP).</li>
     * <li><strong>PublicIp:</strong> an Alibaba Cloud public IP address.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ip</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The port that is used to monitor latency. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ProbePort")
    public String probePort;

    /**
     * <p>The protocol that is used to monitor latency. Valid values:</p>
     * <ul>
     * <li><strong>tcp:</strong> TCP.</li>
     * <li><strong>icmp:</strong> ICMP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("ProbeProtocol")
    public String probeProtocol;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ConfigEndpointProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigEndpointProbeRequest self = new ConfigEndpointProbeRequest();
        return TeaModel.build(map, self);
    }

    public ConfigEndpointProbeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfigEndpointProbeRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public ConfigEndpointProbeRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ConfigEndpointProbeRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public ConfigEndpointProbeRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public ConfigEndpointProbeRequest setProbePort(String probePort) {
        this.probePort = probePort;
        return this;
    }
    public String getProbePort() {
        return this.probePort;
    }

    public ConfigEndpointProbeRequest setProbeProtocol(String probeProtocol) {
        this.probeProtocol = probeProtocol;
        return this;
    }
    public String getProbeProtocol() {
        return this.probeProtocol;
    }

    public ConfigEndpointProbeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
