// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("TrafficPercentage")
    public Integer trafficPercentage;

    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    @NameInMap("EndpointConfigurations")
    public java.util.List<CreateEndpointGroupRequestEndpointConfigurations> endpointConfigurations;

    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

    @NameInMap("PortOverrides")
    public java.util.List<CreateEndpointGroupRequestPortOverrides> portOverrides;

    @NameInMap("HealthCheckEnabled")
    public Boolean healthCheckEnabled;

    public static CreateEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupRequest self = new CreateEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEndpointGroupRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEndpointGroupRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public CreateEndpointGroupRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateEndpointGroupRequest setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public CreateEndpointGroupRequest setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    public CreateEndpointGroupRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public CreateEndpointGroupRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public CreateEndpointGroupRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public CreateEndpointGroupRequest setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public CreateEndpointGroupRequest setEndpointConfigurations(java.util.List<CreateEndpointGroupRequestEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<CreateEndpointGroupRequestEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public CreateEndpointGroupRequest setEndpointRequestProtocol(String endpointRequestProtocol) {
        this.endpointRequestProtocol = endpointRequestProtocol;
        return this;
    }
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    public CreateEndpointGroupRequest setEndpointGroupType(String endpointGroupType) {
        this.endpointGroupType = endpointGroupType;
        return this;
    }
    public String getEndpointGroupType() {
        return this.endpointGroupType;
    }

    public CreateEndpointGroupRequest setPortOverrides(java.util.List<CreateEndpointGroupRequestPortOverrides> portOverrides) {
        this.portOverrides = portOverrides;
        return this;
    }
    public java.util.List<CreateEndpointGroupRequestPortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    public CreateEndpointGroupRequest setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    public static class CreateEndpointGroupRequestEndpointConfigurations extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Endpoint")
        public String endpoint;

        public static CreateEndpointGroupRequestEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupRequestEndpointConfigurations self = new CreateEndpointGroupRequestEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupRequestEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

    }

    public static class CreateEndpointGroupRequestPortOverrides extends TeaModel {
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("EndpointPort")
        public Integer endpointPort;

        public static CreateEndpointGroupRequestPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupRequestPortOverrides self = new CreateEndpointGroupRequestPortOverrides();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupRequestPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public CreateEndpointGroupRequestPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

    }

}
