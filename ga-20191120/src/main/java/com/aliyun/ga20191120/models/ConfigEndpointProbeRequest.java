// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ConfigEndpointProbeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("ProbeProtocol")
    public String probeProtocol;

    @NameInMap("ProbePort")
    public String probePort;

    @NameInMap("Enable")
    public String enable;

    public static ConfigEndpointProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigEndpointProbeRequest self = new ConfigEndpointProbeRequest();
        return TeaModel.build(map, self);
    }

    public ConfigEndpointProbeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigEndpointProbeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public ConfigEndpointProbeRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ConfigEndpointProbeRequest setProbeProtocol(String probeProtocol) {
        this.probeProtocol = probeProtocol;
        return this;
    }
    public String getProbeProtocol() {
        return this.probeProtocol;
    }

    public ConfigEndpointProbeRequest setProbePort(String probePort) {
        this.probePort = probePort;
        return this;
    }
    public String getProbePort() {
        return this.probePort;
    }

    public ConfigEndpointProbeRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

}
