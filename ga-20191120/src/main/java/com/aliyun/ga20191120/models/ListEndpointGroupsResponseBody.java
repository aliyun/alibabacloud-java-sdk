// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupsResponseBody extends TeaModel {
    /**
     * <p>The configurations of the endpoint group.</p>
     */
    @NameInMap("EndpointGroups")
    public java.util.List<ListEndpointGroupsResponseBodyEndpointGroups> endpointGroups;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A052D49E-CCC2-41DB-816C-DC3381503194</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
        /**
         * <p>Indicates whether the client IP address preservation feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>The IP address or domain name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>47.1.XX.XX</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp1d2utp8qqe2a44t****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The port that is used to monitor latency.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ProbePort")
        public Integer probePort;

        /**
         * <p>The protocol that is used to monitor latency.</p>
         * <ul>
         * <li><strong>icmp</strong></li>
         * <li><strong>tcp</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("ProbeProtocol")
        public String probeProtocol;

        /**
         * <p>The private IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XX</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Domain:</strong> a custom domain name.</li>
         * <li><strong>Ip:</strong> a custom IP address.</li>
         * <li><strong>PublicIp:</strong> a public IP address provided by Alibaba Cloud.</li>
         * <li><strong>ECS:</strong> an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>SLB:</strong> a Classic Load Balancer (SLB) instance.</li>
         * <li><strong>ALB:</strong> an Application Load Balancer (ALB) instance.</li>
         * <li><strong>OSS:</strong> an Object Storage Service (OSS) bucket.</li>
         * <li><strong>ENI:</strong> an elastic network interface (ENI).</li>
         * <li><strong>NLB:</strong> a Network Load Balancer (NLB) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ip</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
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
        /**
         * <p>The endpoint port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        /**
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
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

    public static class ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos extends TeaModel {
        /**
         * <p>The name of the action that was performed on the managed instance. Valid values:</p>
         * <ul>
         * <li><strong>Create:</strong> Create an instance.</li>
         * <li><strong>Update:</strong> Update the current instance.</li>
         * <li><strong>Delete:</strong> Delete the current instance.</li>
         * <li><strong>Associate:</strong> Reference the current instance.</li>
         * <li><strong>UserUnmanaged:</strong> Unmanage the instance.</li>
         * <li><strong>CreateChild:</strong> Create a child resource in the current instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <ul>
         * <li><strong>Listener:</strong> listener.</li>
         * <li><strong>IpSet:</strong> acceleration region.</li>
         * <li><strong>EndpointGroup:</strong> endpoint group.</li>
         * <li><strong>ForwardingRule:</strong> forwarding rule.</li>
         * <li><strong>Endpoint:</strong> endpoint.</li>
         * <li><strong>EndpointGroupDestination:</strong> the protocol mapping of an endpoint group associated with a custom routing listener.</li>
         * <li><strong>EndpointPolicy:</strong> the traffic policy of an endpoint associated with a custom routing listener.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>Action</strong> to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The specified actions are managed, and users cannot perform the specified actions on the managed instance.</li>
         * <li><strong>false</strong>: The specified actions are not managed, and users can perform the specified actions on the managed instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos self = new ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListEndpointGroupsResponseBodyEndpointGroupsTags extends TeaModel {
        /**
         * <p>The tag key of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
         */
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
        /**
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The description of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The configurations of endpoints in the endpoint group.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The ID of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp16jdc00bhe97sr5****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The endpoint group IP addresses.</p>
         */
        @NameInMap("EndpointGroupIpList")
        public java.util.List<String> endpointGroupIpList;

        /**
         * <p>The ID of the region where the endpoint group is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The type of the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: a default endpoint group</li>
         * <li><strong>virtual:</strong> a virtual endpoint group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        /**
         * <p>The endpoint group IP addresses to be confirmed after the GA instance is upgraded.</p>
         */
        @NameInMap("EndpointGroupUnconfirmedIpList")
        public java.util.List<String> endpointGroupUnconfirmedIpList;

        @NameInMap("EndpointProtocolVersion")
        public String endpointProtocolVersion;

        /**
         * <p>The protocol that is used by the backend server.</p>
         * <ul>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        /**
         * <p>The IDs of the forwarding rules that are associated with the endpoint group.</p>
         */
        @NameInMap("ForwardingRuleIds")
        public java.util.List<String> forwardingRuleIds;

        /**
         * <p>Indicates whether the health check feature is enabled.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The interval at which you want to perform health checks. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckIntervalSeconds")
        public Integer healthCheckIntervalSeconds;

        /**
         * <p>The path that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HealthCheckPort")
        public Integer healthCheckPort;

        /**
         * <p>The protocol over which health check requests are sent. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong> or <strong>TCP</strong></li>
         * <li><strong>http</strong> or <strong>HTTP</strong></li>
         * <li><strong>https</strong> or <strong>HTTPS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The name of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port mapping.</p>
         */
        @NameInMap("PortOverrides")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides> portOverrides;

        /**
         * <p>The service that manages the instance.</p>
         * <blockquote>
         * <p> This parameter takes effect only if the value of <strong>Service managed</strong> is <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that users can perform on the managed instance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
         * </li>
         * <li><p>Users can perform only specific actions on a managed instance.</p>
         * </li>
         * </ul>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The status of the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>init:</strong> The endpoint group is being initialized.</li>
         * <li><strong>active:</strong> The endpoint group is running normally.</li>
         * <li>**updating:**The endpoint group is being updated.</li>
         * <li><strong>deleteing:</strong> The endpoint group is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The tag of the endpoint group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsTags> tags;

        /**
         * <p>The number of consecutive failed health checks that must occur before an endpoint is considered unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ThresholdCount")
        public Integer thresholdCount;

        /**
         * <p>The value of the traffic distribution ratio. If a listener is associated with multiple endpoint groups, you can set this parameter to distribute different percentages of traffic to the endpoint groups.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointProtocolVersion(String endpointProtocolVersion) {
            this.endpointProtocolVersion = endpointProtocolVersion;
            return this;
        }
        public String getEndpointProtocolVersion() {
            return this.endpointProtocolVersion;
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

        public ListEndpointGroupsResponseBodyEndpointGroups setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setServiceManagedInfos(java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
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
