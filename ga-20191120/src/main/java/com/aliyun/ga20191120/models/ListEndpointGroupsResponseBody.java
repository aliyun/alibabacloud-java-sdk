// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("EndpointGroups")
    public java.util.List<ListEndpointGroupsResponseBodyEndpointGroups> endpointGroups;

    public static ListEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointGroupsResponseBody self = new ListEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEndpointGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListEndpointGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEndpointGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEndpointGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEndpointGroupsResponseBody setEndpointGroups(java.util.List<ListEndpointGroupsResponseBodyEndpointGroups> endpointGroups) {
        this.endpointGroups = endpointGroups;
        return this;
    }
    public java.util.List<ListEndpointGroupsResponseBodyEndpointGroups> getEndpointGroups() {
        return this.endpointGroups;
    }

    public static class ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("ProbeProtocol")
        public String probeProtocol;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ProbePort")
        public Integer probePort;

        @NameInMap("EndpointId")
        public String endpointId;

        public static ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations self = new ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setProbeProtocol(String probeProtocol) {
            this.probeProtocol = probeProtocol;
            return this;
        }
        public String getProbeProtocol() {
            return this.probeProtocol;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setProbePort(Integer probePort) {
            this.probePort = probePort;
            return this;
        }
        public Integer getProbePort() {
            return this.probePort;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

    }

    public static class ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides extends TeaModel {
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("EndpointPort")
        public Integer endpointPort;

        public static ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides self = new ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

    }

    public static class ListEndpointGroupsResponseBodyEndpointGroups extends TeaModel {
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        @NameInMap("EndpointGroupIpList")
        public java.util.List<String> endpointGroupIpList;

        @NameInMap("EndpointGroupUnconfirmedIpList")
        public java.util.List<String> endpointGroupUnconfirmedIpList;

        @NameInMap("State")
        public String state;

        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        @NameInMap("HealthCheckIntervalSeconds")
        public Integer healthCheckIntervalSeconds;

        @NameInMap("TrafficPercentage")
        public Integer trafficPercentage;

        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        @NameInMap("ThresholdCount")
        public Integer thresholdCount;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("EndpointConfigurations")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations> endpointConfigurations;

        @NameInMap("PortOverrides")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides> portOverrides;

        @NameInMap("ForwardingRuleIds")
        public java.util.List<String> forwardingRuleIds;

        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("HealthCheckPort")
        public Integer healthCheckPort;

        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        public static ListEndpointGroupsResponseBodyEndpointGroups build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroups self = new ListEndpointGroupsResponseBodyEndpointGroups();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointGroupIpList(java.util.List<String> endpointGroupIpList) {
            this.endpointGroupIpList = endpointGroupIpList;
            return this;
        }
        public java.util.List<String> getEndpointGroupIpList() {
            return this.endpointGroupIpList;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointGroupUnconfirmedIpList(java.util.List<String> endpointGroupUnconfirmedIpList) {
            this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
            return this;
        }
        public java.util.List<String> getEndpointGroupUnconfirmedIpList() {
            return this.endpointGroupUnconfirmedIpList;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        public Integer getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setTrafficPercentage(Integer trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public Integer getTrafficPercentage() {
            return this.trafficPercentage;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setThresholdCount(Integer thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }
        public Integer getThresholdCount() {
            return this.thresholdCount;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointConfigurations(java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setPortOverrides(java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setForwardingRuleIds(java.util.List<String> forwardingRuleIds) {
            this.forwardingRuleIds = forwardingRuleIds;
            return this;
        }
        public java.util.List<String> getForwardingRuleIds() {
            return this.forwardingRuleIds;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckPort(Integer healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public Integer getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

    }

}
