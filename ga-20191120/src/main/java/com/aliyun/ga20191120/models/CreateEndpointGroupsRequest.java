// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupsRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateEndpointGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupsRequest self = new CreateEndpointGroupsRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
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

    public CreateEndpointGroupsRequest setEndpointGroupConfigurations(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations) {
        this.endpointGroupConfigurations = endpointGroupConfigurations;
        return this;
    }
    public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    public CreateEndpointGroupsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateEndpointGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Long weight;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations self = new CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides extends TeaModel {
        @NameInMap("EndpointPort")
        public Long endpointPort;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides self = new CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides setEndpointPort(Long endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Long getEndpointPort() {
            return this.endpointPort;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservationProxyProtocol")
        public Boolean enableClientIPPreservationProxyProtocol;

        @NameInMap("EnableClientIPPreservationToa")
        public Boolean enableClientIPPreservationToa;

        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

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

        @NameInMap("PortOverrides")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides;

        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        @NameInMap("TrafficPercentage")
        public Long trafficPercentage;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurations self = new CreateEndpointGroupsRequestEndpointGroupConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEnableClientIPPreservationProxyProtocol(Boolean enableClientIPPreservationProxyProtocol) {
            this.enableClientIPPreservationProxyProtocol = enableClientIPPreservationProxyProtocol;
            return this;
        }
        public Boolean getEnableClientIPPreservationProxyProtocol() {
            return this.enableClientIPPreservationProxyProtocol;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEnableClientIPPreservationToa(Boolean enableClientIPPreservationToa) {
            this.enableClientIPPreservationToa = enableClientIPPreservationToa;
            return this;
        }
        public Boolean getEnableClientIPPreservationToa() {
            return this.enableClientIPPreservationToa;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointConfigurations(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupDescription(String endpointGroupDescription) {
            this.endpointGroupDescription = endpointGroupDescription;
            return this;
        }
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupName(String endpointGroupName) {
            this.endpointGroupName = endpointGroupName;
            return this;
        }
        public String getEndpointGroupName() {
            return this.endpointGroupName;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        public Long getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckPort(Long healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setPortOverrides(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setThresholdCount(Long thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setTrafficPercentage(Long trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

    }

}
