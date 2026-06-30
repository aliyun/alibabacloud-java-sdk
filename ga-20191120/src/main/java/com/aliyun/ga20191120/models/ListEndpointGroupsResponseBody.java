// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of endpoint groups.</p>
     */
    @NameInMap("EndpointGroups")
    public java.util.List<ListEndpointGroupsResponseBodyEndpointGroups> endpointGroups;

    /**
     * <p>The page number.</p>
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
     * <p>The request ID.</p>
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
         * <p>The API keys in the endpoint configuration.</p>
         */
        @NameInMap("ApiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <p>Specifies whether to preserve client IP addresses.</p>
         * <ul>
         * <li><p><strong>true</strong>: Client IP preservation is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Client IP preservation is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Specifies whether to use Proxy Protocol to preserve client IP addresses.</p>
         * <ul>
         * <li><p><strong>true</strong>: Proxy Protocol is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Proxy Protocol is disabled.</p>
         * </li>
         * </ul>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The endpoint\&quot;s IP address, domain name, or instance ID.</p>
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
         * <p>The port used for latency monitoring probes.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ProbePort")
        public Integer probePort;

        /**
         * <p>The protocol that is used for latency monitoring probes.</p>
         * <ul>
         * <li><p><strong>icmp</strong>: ICMP</p>
         * </li>
         * <li><p><strong>tcp</strong>: TCP</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("ProbeProtocol")
        public String probeProtocol;

        /**
         * <p>The service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The private IP address of the elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XX</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Domain</strong>: a custom domain name.</p>
         * </li>
         * <li><p><strong>Ip</strong>: a custom IP address.</p>
         * </li>
         * <li><p><strong>IpTarget</strong>: a custom private IP address.</p>
         * </li>
         * <li><p><strong>PublicIp</strong>: an Alibaba Cloud public IP address.</p>
         * </li>
         * <li><p><strong>ECS</strong>: an Alibaba Cloud ECS instance.</p>
         * </li>
         * <li><p><strong>SLB</strong>: an Alibaba Cloud SLB instance.</p>
         * </li>
         * <li><p><strong>ALB</strong>: an Alibaba Cloud ALB instance.</p>
         * </li>
         * <li><p><strong>OSS</strong>: an Alibaba Cloud OSS bucket.</p>
         * </li>
         * <li><p><strong>ENI</strong>: an Alibaba Cloud elastic network interface.</p>
         * </li>
         * <li><p><strong>NLB</strong>: an Alibaba Cloud NLB instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ip</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>A list of vSwitches in the VPC.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbhucmd5b2q2fpqqu****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
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

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
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

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList extends TeaModel {
        @NameInMap("CIDR")
        public String CIDR;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.19.115.37</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>gsw-0jl6tmriqep1ga***</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList self = new ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList setCIDR(String CIDR) {
            this.CIDR = CIDR;
            return this;
        }
        public String getCIDR() {
            return this.CIDR;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
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
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Create</strong>: creates an instance.</p>
         * </li>
         * <li><p><strong>Update</strong>: updates the instance.</p>
         * </li>
         * <li><p><strong>Delete</strong>: deletes the instance.</p>
         * </li>
         * <li><p><strong>Associate</strong>: associates the instance with other resources.</p>
         * </li>
         * <li><p><strong>UserUnmanaged</strong>: Reverts the instance to an unmanaged state.</p>
         * </li>
         * <li><p><strong>CreateChild</strong>: creates a child resource for the instance.</p>
         * </li>
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
         * <li><p><strong>Listener</strong>: a listener.</p>
         * </li>
         * <li><p><strong>IpSet</strong>: an acceleration region.</p>
         * </li>
         * <li><p><strong>EndpointGroup</strong>: an endpoint group.</p>
         * </li>
         * <li><p><strong>ForwardingRule</strong>: a forwarding rule.</p>
         * </li>
         * <li><p><strong>Endpoint</strong>: an endpoint.</p>
         * </li>
         * <li><p><strong>EndpointGroupDestination</strong>: a protocol mapping for an endpoint group of a custom routing listener.</p>
         * </li>
         * <li><p><strong>EndpointPolicy</strong>: a traffic policy for an endpoint of a custom routing listener.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Specifies whether the action is managed. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The action is managed. You cannot perform the specified action on the managed instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The action is not managed. You can perform the specified action on the managed instance.</p>
         * </li>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <p>The ID of the Global Accelerator instance.</p>
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
         * <p>A list of endpoint configurations.</p>
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
         * <p>A list of public egress IP addresses of the endpoint group.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>For endpoint groups connected to private backend services, the console shows only the private source IP addresses, not the public ones. If the network connection type of a backend service changes (for example, from private to public), monitor the source IP addresses and update the backend service\&quot;s access control list (ACL).</p>
         */
        @NameInMap("EndpointGroupIpList")
        public java.util.List<String> endpointGroupIpList;

        /**
         * <p>The ID of the region where the endpoint group is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The type of the endpoint group. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: a default endpoint group.</p>
         * </li>
         * <li><p><strong>virtual</strong>: a virtual endpoint group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        /**
         * <p>The list of new IP addresses in the endpoint group that require confirmation after a Global Accelerator instance is upgraded.</p>
         */
        @NameInMap("EndpointGroupUnconfirmedIpList")
        public java.util.List<String> endpointGroupUnconfirmedIpList;

        /**
         * <p>The IP protocol of the backend service. Valid values:</p>
         * <ul>
         * <li><p><strong>IPv4</strong> (default): Connections to the backend service use IPv4.</p>
         * </li>
         * <li><p><strong>IPv6</strong>: Connections to the backend service use IPv6.</p>
         * </li>
         * <li><p><strong>ProtocolAffinity</strong>: The connection to the backend service uses the same IP protocol as the client request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("EndpointIpVersion")
        public String endpointIpVersion;

        /**
         * <p>A list of private IP addresses of the endpoints.</p>
         */
        @NameInMap("EndpointPrivateIpList")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList> endpointPrivateIpList;

        /**
         * <p>The version of the backend service protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP1.1</strong>: HTTP/1.1</p>
         * </li>
         * <li><p><strong>HTTP2</strong>: HTTP/2</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.1</p>
         */
        @NameInMap("EndpointProtocolVersion")
        public String endpointProtocolVersion;

        /**
         * <p>The protocol of the backend service. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong>: HTTP</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: HTTPS</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        /**
         * <p>The IDs of forwarding rules associated with the endpoint group.</p>
         */
        @NameInMap("ForwardingRuleIds")
        public java.util.List<String> forwardingRuleIds;

        /**
         * <p>Specifies whether to enable health checks.</p>
         * <ul>
         * <li><p><strong>true</strong>: Health checks are enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Health checks are disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The health check interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckIntervalSeconds")
        public Integer healthCheckIntervalSeconds;

        /**
         * <p>The health check path.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HealthCheckPort")
        public Integer healthCheckPort;

        /**
         * <p>The protocol used for health checks.</p>
         * <ul>
         * <li><p><strong>tcp</strong> or <strong>TCP</strong>: TCP</p>
         * </li>
         * <li><p><strong>http</strong> or <strong>HTTP</strong>: HTTP</p>
         * </li>
         * <li><p><strong>https</strong> or <strong>HTTPS</strong>: HTTPS</p>
         * </li>
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
         * <p>The port mappings.</p>
         */
        @NameInMap("PortOverrides")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsPortOverrides> portOverrides;

        /**
         * <p>The ID of the service that manages the instance.</p>
         * <blockquote>
         * <p>This parameter is returned only if <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Specifies whether the instance is managed. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The instance is a managed instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The instance is not a managed instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that you can perform on the managed instance.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is returned only if <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
         * </li>
         * <li><p>Your permissions to operate on a managed instance are restricted.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The state of the endpoint group.</p>
         * <ul>
         * <li><p><strong>init</strong>: The endpoint group is initializing.</p>
         * </li>
         * <li><p><strong>active</strong>: The endpoint group is stable.</p>
         * </li>
         * <li><p><strong>updating</strong>: The endpoint group is updating.</p>
         * </li>
         * <li><p><strong>deleting</strong>: The endpoint group is deleting.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The tags attached to the endpoint group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsTags> tags;

        /**
         * <p>The number of consecutive failed health checks required to mark an endpoint as unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ThresholdCount")
        public Integer thresholdCount;

        /**
         * <p>The percentage of traffic routed to the endpoint group. This parameter applies only if a listener is associated with multiple endpoint groups.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointIpVersion(String endpointIpVersion) {
            this.endpointIpVersion = endpointIpVersion;
            return this;
        }
        public String getEndpointIpVersion() {
            return this.endpointIpVersion;
        }

        public ListEndpointGroupsResponseBodyEndpointGroups setEndpointPrivateIpList(java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList> endpointPrivateIpList) {
            this.endpointPrivateIpList = endpointPrivateIpList;
            return this;
        }
        public java.util.List<ListEndpointGroupsResponseBodyEndpointGroupsEndpointPrivateIpList> getEndpointPrivateIpList() {
            return this.endpointPrivateIpList;
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

        public ListEndpointGroupsResponseBodyEndpointGroups setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
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
