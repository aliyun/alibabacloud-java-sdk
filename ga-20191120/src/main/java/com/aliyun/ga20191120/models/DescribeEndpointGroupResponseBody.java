// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>Indicates the status of the binding between the Log Service project and the endpoint group. Valid values:</p>
     * <br>
     * <p>*   **on**: The Log Service project is bound to the endpoint group.</p>
     * <p>*   **off**: No Log Service projects are bound to the endpoint group.</p>
     * <p>*   **binding**: The Log Service project is being bound to the endpoint group.</p>
     * <p>*   **unbinding**: The Log Service project is being unbound from the endpoint group.</p>
     */
    @NameInMap("AccessLogSwitch")
    public String accessLogSwitch;

    /**
     * <p>The description of the endpoint group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the access log feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("EnableAccessLog")
    public Boolean enableAccessLog;

    /**
     * <p>The configurations of the endpoints in the endpoint group.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The ID of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The active endpoint IP addresses of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupIpList")
    public java.util.List<String> endpointGroupIpList;

    /**
     * <p>The ID of the region where the endpoint group is deployed.</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The type of endpoint group. Valid values:</p>
     * <br>
     * <p>*   **default**: a default endpoint group</p>
     * <p>*   **virtual**: a virtual endpoint group</p>
     */
    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

    /**
     * <p>The endpoint group IP addresses to be confirmed. After the GA instance is upgraded, the IP addresses that are added to the endpoint group need to be confirmed.</p>
     */
    @NameInMap("EndpointGroupUnconfirmedIpList")
    public java.util.List<String> endpointGroupUnconfirmedIpList;

    /**
     * <p>The protocol that is used by the backend service.</p>
     * <br>
     * <p>*   **HTTP**</p>
     * <p>*   **HTTPS**</p>
     */
    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    /**
     * <p>The ID of the forwarding rule that is associated with the endpoint group.</p>
     */
    @NameInMap("ForwardingRuleIds")
    public java.util.List<String> forwardingRuleIds;

    /**
     * <p>Indicates whether the health check feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: enabled</p>
     * <p>*   **false**: disabled</p>
     */
    @NameInMap("HealthCheckEnabled")
    public Boolean healthCheckEnabled;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds.</p>
     */
    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    /**
     * <p>The path to which health check probes are sent.</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The port that is used for health checks.</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The protocol over which health check requests are sent. Valid values:</p>
     * <br>
     * <p>*   **tcp**: TCP</p>
     * <p>*   **http**: HTTP</p>
     * <p>*   **https**: HTTPS</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the endpoint group.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The mappings between ports.</p>
     */
    @NameInMap("PortOverrides")
    public java.util.List<DescribeEndpointGroupResponseBodyPortOverrides> portOverrides;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the service that manages the GA instance.</p>
     * <br>
     * <p>>  This parameter takes effect only if **ServiceManaged** is set to **True**.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Indicates whether the GA instance is managed. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The actions that users can perform on the managed instance.</p>
     * <br>
     * <p>>  This parameter takes effect only if **ServiceManaged** is set to **True**.</p>
     * <br>
     * <p>*   Users can perform only specific actions on a managed instance.</p>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeEndpointGroupResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The name of the Logstore.</p>
     */
    @NameInMap("SlsLogStoreName")
    public String slsLogStoreName;

    /**
     * <p>The name of the Log Service project.</p>
     */
    @NameInMap("SlsProjectName")
    public String slsProjectName;

    /**
     * <p>The region of the Log Service project.</p>
     */
    @NameInMap("SlsRegion")
    public String slsRegion;

    /**
     * <p>The status of the endpoint group. Valid values:</p>
     * <br>
     * <p>*   **init**: The endpoint group is being initialized.</p>
     * <p>*   **active**: The endpoint group is running as expected.</p>
     * <p>*   **updating**: The endpoint group is being updated.</p>
     * <p>*   **deleting**: The endpoint group is being deleted.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeEndpointGroupResponseBodyTags> tags;

    /**
     * <p>The number of consecutive failed health checks that must occur before an endpoint is considered unhealthy.</p>
     */
    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    /**
     * <p>The weight of the endpoint group. If the listener is associated with multiple endpoint groups, this parameter indicates the weight of the current endpoint group.</p>
     */
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

    public DescribeEndpointGroupResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeEndpointGroupResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeEndpointGroupResponseBody setServiceManagedInfos(java.util.List<DescribeEndpointGroupResponseBodyServiceManagedInfos> serviceManagedInfos) {
        this.serviceManagedInfos = serviceManagedInfos;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
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

    public DescribeEndpointGroupResponseBody setTags(java.util.List<DescribeEndpointGroupResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeEndpointGroupResponseBody setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public DescribeEndpointGroupResponseBody setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static class DescribeEndpointGroupResponseBodyEndpointConfigurations extends TeaModel {
        /**
         * <p>Indicates whether the client IP address preservation feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Indicates whether the proxy protocol is used to preserve client IP addresses.</p>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The IP address or domain name of the endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The port that is used to monitor latency.</p>
         */
        @NameInMap("ProbePort")
        public Integer probePort;

        /**
         * <p>The protocol that is used to monitor latency. Valid values:</p>
         * <br>
         * <p>*   **tcp**</p>
         * <p>*   **icmp**</p>
         */
        @NameInMap("ProbeProtocol")
        public String probeProtocol;

        /**
         * <p>The private IP address of the ENI.</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Domain**: a custom domain name</p>
         * <p>*   **Ip**: a custom IP address</p>
         * <p>*   **PublicIp**: a public IP address provided by Alibaba Cloud</p>
         * <p>*   **ECS**: an Elastic Compute Service (ECS) instance</p>
         * <p>*   **SLB**: a Server Load Balancer (SLB) instance</p>
         * <p>*   **ALB**: an Application Load Balancer (ALB) instance</p>
         * <p>*   **OSS**: an Object Storage Service (OSS) bucket</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the endpoint.</p>
         */
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

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
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

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
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
        /**
         * <p>The endpoint port.</p>
         */
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        /**
         * <p>The listener port.</p>
         */
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

    public static class DescribeEndpointGroupResponseBodyServiceManagedInfos extends TeaModel {
        /**
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <br>
         * <p>*   **Create**</p>
         * <p>*   **Update**</p>
         * <p>*   **Delete**</p>
         * <p>*   **Associate**</p>
         * <p>*   **UserUnmanaged**</p>
         * <p>*   **CreateChild**</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <br>
         * <p>*   **Listener**: listener</p>
         * <p>*   **IpSet**: acceleration region</p>
         * <p>*   **EndpointGroup**: endpoint group</p>
         * <p>*   **ForwardingRule**: forwarding rule</p>
         * <p>*   **Endpoint**: endpoint</p>
         * <p>*   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener</p>
         * <p>*   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener</p>
         * <br>
         * <p>>  This parameter takes effect only if **Action** is set to **CreateChild**.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed. Valid values:</p>
         * <br>
         * <p>*   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed instance.</p>
         * <p>*   **false**: The specified actions are not managed, and users can perform the specified actions on the managed instance.</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static DescribeEndpointGroupResponseBodyServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyServiceManagedInfos self = new DescribeEndpointGroupResponseBodyServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeEndpointGroupResponseBodyServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public DescribeEndpointGroupResponseBodyServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class DescribeEndpointGroupResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEndpointGroupResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyTags self = new DescribeEndpointGroupResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEndpointGroupResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
