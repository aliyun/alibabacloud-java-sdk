// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("EndpointGroupConfigrations")
    public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrations> endpointGroupConfigrations;

    public static CreateEndpointGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupsRequest self = new CreateEndpointGroupsRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEndpointGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEndpointGroupsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEndpointGroupsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateEndpointGroupsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateEndpointGroupsRequest setEndpointGroupConfigrations(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrations> endpointGroupConfigrations) {
        this.endpointGroupConfigrations = endpointGroupConfigrations;
        return this;
    }
    public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrations> getEndpointGroupConfigrations() {
        return this.endpointGroupConfigrations;
    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Endpoint")
        public String endpoint;

        public static CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations self = new CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides extends TeaModel {
        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("EndpointPort")
        public Long endpointPort;

        public static CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides self = new CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides setEndpointPort(Long endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Long getEndpointPort() {
            return this.endpointPort;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigrations extends TeaModel {
        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        @NameInMap("TrafficPercentage")
        public Long trafficPercentage;

        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        @NameInMap("HealthCheckIntervalSeconds")
        public Long healthCheckIntervalSeconds;

        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        @NameInMap("HealthCheckPort")
        public Long healthCheckPort;

        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations> endpointConfigurations;

        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        @NameInMap("PortOverrides")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides> portOverrides;

        public static CreateEndpointGroupsRequestEndpointGroupConfigrations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigrations self = new CreateEndpointGroupsRequestEndpointGroupConfigrations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setEndpointGroupName(String endpointGroupName) {
            this.endpointGroupName = endpointGroupName;
            return this;
        }
        public String getEndpointGroupName() {
            return this.endpointGroupName;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setEndpointGroupDescription(String endpointGroupDescription) {
            this.endpointGroupDescription = endpointGroupDescription;
            return this;
        }
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setTrafficPercentage(Long trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setHealthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        public Long getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setHealthCheckPort(Long healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setThresholdCount(Long thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setEndpointConfigurations(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setEndpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setEndpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigrations setPortOverrides(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigrationsPortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

    }

}
