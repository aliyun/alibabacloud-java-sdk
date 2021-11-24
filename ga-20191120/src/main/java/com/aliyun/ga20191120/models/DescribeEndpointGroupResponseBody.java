// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeEndpointGroupResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("AccessLogSwitch")
    public String accessLogSwitch;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnableAccessLog")
    public Boolean enableAccessLog;

    @NameInMap("EndpointConfigurations")
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointConfigurations> endpointConfigurations;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointGroupIpList")
    public java.util.List<String> endpointGroupIpList;

    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

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
    public java.util.List<DescribeEndpointGroupResponseBodyPortOverrides> portOverrides;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsLogStoreName")
    public String slsLogStoreName;

    @NameInMap("SlsProjectName")
    public String slsProjectName;

    @NameInMap("SlsRegion")
    public String slsRegion;

    @NameInMap("State")
    public String state;

    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TrafficPercentage")
    public Integer trafficPercentage;

    public static DescribeEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointGroupResponseBody self = new DescribeEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointGroupResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeEndpointGroupResponseBody setAccessLogSwitch(String accessLogSwitch) {
        this.accessLogSwitch = accessLogSwitch;
        return this;
    }
    public String getAccessLogSwitch() {
        return this.accessLogSwitch;
    }

    public DescribeEndpointGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeEndpointGroupResponseBody setEnableAccessLog(Boolean enableAccessLog) {
        this.enableAccessLog = enableAccessLog;
        return this;
    }
    public Boolean getEnableAccessLog() {
        return this.enableAccessLog;
    }

    public DescribeEndpointGroupResponseBody setEndpointConfigurations(java.util.List<DescribeEndpointGroupResponseBodyEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupIpList(java.util.List<String> endpointGroupIpList) {
        this.endpointGroupIpList = endpointGroupIpList;
        return this;
    }
    public java.util.List<String> getEndpointGroupIpList() {
        return this.endpointGroupIpList;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupType(String endpointGroupType) {
        this.endpointGroupType = endpointGroupType;
        return this;
    }
    public String getEndpointGroupType() {
        return this.endpointGroupType;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupUnconfirmedIpList(java.util.List<String> endpointGroupUnconfirmedIpList) {
        this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
        return this;
    }
    public java.util.List<String> getEndpointGroupUnconfirmedIpList() {
        return this.endpointGroupUnconfirmedIpList;
    }

    public DescribeEndpointGroupResponseBody setEndpointRequestProtocol(String endpointRequestProtocol) {
        this.endpointRequestProtocol = endpointRequestProtocol;
        return this;
    }
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    public DescribeEndpointGroupResponseBody setForwardingRuleIds(java.util.List<String> forwardingRuleIds) {
        this.forwardingRuleIds = forwardingRuleIds;
        return this;
    }
    public java.util.List<String> getForwardingRuleIds() {
        return this.forwardingRuleIds;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public DescribeEndpointGroupResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeEndpointGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeEndpointGroupResponseBody setPortOverrides(java.util.List<DescribeEndpointGroupResponseBodyPortOverrides> portOverrides) {
        this.portOverrides = portOverrides;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyPortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    public DescribeEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndpointGroupResponseBody setSlsLogStoreName(String slsLogStoreName) {
        this.slsLogStoreName = slsLogStoreName;
        return this;
    }
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    public DescribeEndpointGroupResponseBody setSlsProjectName(String slsProjectName) {
        this.slsProjectName = slsProjectName;
        return this;
    }
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    public DescribeEndpointGroupResponseBody setSlsRegion(String slsRegion) {
        this.slsRegion = slsRegion;
        return this;
    }
    public String getSlsRegion() {
        return this.slsRegion;
    }

    public DescribeEndpointGroupResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeEndpointGroupResponseBody setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public DescribeEndpointGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEndpointGroupResponseBody setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static class DescribeEndpointGroupResponseBodyEndpointConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ProbePort")
        public Integer probePort;

        @NameInMap("ProbeProtocol")
        public String probeProtocol;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeEndpointGroupResponseBodyEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyEndpointConfigurations self = new DescribeEndpointGroupResponseBodyEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setProbePort(Integer probePort) {
            this.probePort = probePort;
            return this;
        }
        public Integer getProbePort() {
            return this.probePort;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setProbeProtocol(String probeProtocol) {
            this.probeProtocol = probeProtocol;
            return this;
        }
        public String getProbeProtocol() {
            return this.probeProtocol;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeEndpointGroupResponseBodyPortOverrides extends TeaModel {
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static DescribeEndpointGroupResponseBodyPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyPortOverrides self = new DescribeEndpointGroupResponseBodyPortOverrides();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        public DescribeEndpointGroupResponseBodyPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

}
