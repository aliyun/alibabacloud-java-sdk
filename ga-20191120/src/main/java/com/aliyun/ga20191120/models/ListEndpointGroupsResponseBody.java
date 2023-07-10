// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the endpoint group.</p>
     */
    @NameInMap("EndpointGroups")
    public java.util.List<ListEndpointGroupsResponseBodyEndpointGroups> endpointGroups;

    /**
     * <p>Indicates whether the client IP address preservation feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: The client IP address preservation feature is enabled.</p>
     * <p>*   **false**: The client IP address preservation feature is disabled.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of consecutive failed health checks that must occur before an endpoint is considered unhealthy.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The weight of the endpoint.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointGroupsResponseBody self = new ListEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEndpointGroupsResponseBody setEndpointGroups(java.util.List<ListEndpointGroupsResponseBodyEndpointGroups> endpointGroups) {
        this.endpointGroups = endpointGroups;
        return this;
    }
    public java.util.List<ListEndpointGroupsResponseBodyEndpointGroups> getEndpointGroups() {
        return this.endpointGroups;
    }

    public ListEndpointGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListEndpointGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("ProbePort")
        public Integer probePort;

        @NameInMap("ProbeProtocol")
        public String probeProtocol;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        public static ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations self = new ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setProbePort(Integer probePort) {
            this.probePort = probePort;
            return this;
        }
        public Integer getProbePort() {
            return this.probePort;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setProbeProtocol(String probeProtocol) {
            this.probeProtocol = probeProtocol;
            return this;
        }
        public String getProbeProtocol() {
            return this.probeProtocol;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides extends TeaModel {
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides self = new ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class ListEndpointGroupsResponseBodyEndpointGroupsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListEndpointGroupsResponseBodyEndpointGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroupsTags self = new ListEndpointGroupsResponseBodyEndpointGroupsTags();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEndpointGroupsResponseBodyEndpointGroups extends TeaModel {
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndpointConfigurations")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The ID of an endpoint group.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The mappings between ports.</p>
         */
        @NameInMap("EndpointGroupIpList")
        public java.util.List<String> endpointGroupIpList;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The health check feature is enabled.</p>
         * <p>*   **false**: The health check feature is disabled.</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         */
        @NameInMap("EndpointGroupUnconfirmedIpList")
        public java.util.List<String> endpointGroupUnconfirmedIpList;

        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        @NameInMap("ForwardingRuleIds")
        public java.util.List<String> forwardingRuleIds;

        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        @NameInMap("HealthCheckIntervalSeconds")
        public Integer healthCheckIntervalSeconds;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        @NameInMap("HealthCheckPort")
        public Integer healthCheckPort;

        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PortOverrides")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides> portOverrides;

        /**
         * <p>The protocol over which health check requests are sent. Valid values:</p>
         * <br>
         * <p>*   **tcp**: TCP</p>
         * <p>*   **http**: HTTP</p>
         * <p>*   **https**: HTTPS</p>
         */
        @NameInMap("State")
        public String state;

        @NameInMap("Tags")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsTags> tags;

        @NameInMap("ThresholdCount")
        public Integer thresholdCount;

        @NameInMap("TrafficPercentage")
        public Integer trafficPercentage;

        public static ListEndpointGroupsResponseBodyEndpointGroups build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroups self = new ListEndpointGroupsResponseBodyEndpointGroups();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointConfigurations(java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
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

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointGroupUnconfirmedIpList(java.util.List<String> endpointGroupUnconfirmedIpList) {
            this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
            return this;
        }
        public java.util.List<String> getEndpointGroupUnconfirmedIpList() {
            return this.endpointGroupUnconfirmedIpList;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setForwardingRuleIds(java.util.List<String> forwardingRuleIds) {
            this.forwardingRuleIds = forwardingRuleIds;
            return this;
        }
        public java.util.List<String> getForwardingRuleIds() {
            return this.forwardingRuleIds;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        public Integer getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckPort(Integer healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public Integer getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setPortOverrides(java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setTags(java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsTags> getTags() {
            return this.tags;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setThresholdCount(Integer thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }
        public Integer getThresholdCount() {
            return this.thresholdCount;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setTrafficPercentage(Integer trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public Integer getTrafficPercentage() {
            return this.trafficPercentage;
        }

    }

}
