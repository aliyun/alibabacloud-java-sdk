// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ConfigEndpointProbeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable latency monitoring. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The endpoint.</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The endpoint group ID.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The type of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Ip:** a custom IP address.</p>
     * <p>*   **Domain:** a custom domain name.</p>
     * <p>*   **EIP:** an Alibaba Cloud elastic IP address (EIP).</p>
     * <p>*   **PublicIp:** an Alibaba Cloud public IP address.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The port that is used to monitor latency. Valid values: **0** to **65535**.</p>
     */
    @NameInMap("ProbePort")
    public String probePort;

    /**
     * <p>The protocol that is used to monitor latency. Valid values:</p>
     * <br>
     * <p>*   **tcp:** TCP.</p>
     * <p>*   **icmp:** ICMP.</p>
     */
    @NameInMap("ProbeProtocol")
    public String probeProtocol;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
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
