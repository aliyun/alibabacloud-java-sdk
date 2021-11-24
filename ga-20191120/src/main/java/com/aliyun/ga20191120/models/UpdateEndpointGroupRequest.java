// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndpointConfigurations")
    public java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> endpointConfigurations;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    @NameInMap("HealthCheckEnabled")
    public Boolean healthCheckEnabled;

    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    @NameInMap("Name")
    public String name;

    @NameInMap("PortOverrides")
    public java.util.List<UpdateEndpointGroupRequestPortOverrides> portOverrides;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    @NameInMap("TrafficPercentage")
    public Integer trafficPercentage;

    public static UpdateEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupRequest self = new UpdateEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEndpointGroupRequest setEndpointConfigurations(java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public UpdateEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateEndpointGroupRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public UpdateEndpointGroupRequest setEndpointRequestProtocol(String endpointRequestProtocol) {
        this.endpointRequestProtocol = endpointRequestProtocol;
        return this;
    }
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    public UpdateEndpointGroupRequest setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    public UpdateEndpointGroupRequest setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    public UpdateEndpointGroupRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public UpdateEndpointGroupRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public UpdateEndpointGroupRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public UpdateEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEndpointGroupRequest setPortOverrides(java.util.List<UpdateEndpointGroupRequestPortOverrides> portOverrides) {
        this.portOverrides = portOverrides;
        return this;
    }
    public java.util.List<UpdateEndpointGroupRequestPortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    public UpdateEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEndpointGroupRequest setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public UpdateEndpointGroupRequest setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static class UpdateEndpointGroupRequestEndpointConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        public static UpdateEndpointGroupRequestEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupRequestEndpointConfigurations self = new UpdateEndpointGroupRequestEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateEndpointGroupRequestPortOverrides extends TeaModel {
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static UpdateEndpointGroupRequestPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupRequestPortOverrides self = new UpdateEndpointGroupRequestPortOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupRequestPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        public UpdateEndpointGroupRequestPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

}
