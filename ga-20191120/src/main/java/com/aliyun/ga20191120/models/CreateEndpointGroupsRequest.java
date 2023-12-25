// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The configurations of the endpoint groups.</p>
     */
    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations;

    /**
     * <p>The ID of the listener.</p>
     * <br>
     * <p>>  If the listener protocol is **HTTP** or **HTTPS**, you can call the **CreateEndpointGroups** operation to create only one endpoint group.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
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
        /**
         * <p>The IP address, domain name, or instance ID based on the value of Type.</p>
         * <br>
         * <p>You can specify up to 100 endpoint IP addresses or domain names in an endpoint group.</p>
         * <br>
         * <p>>  This parameter is required.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The private IP address of the ENI.</p>
         * <br>
         * <p>>  If you set Type to ENI, you can specify this parameter. If you do not specify this parameter, the primary private IP address of the ENI is used.</p>
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
         * <p>*   **ENI**: an elastic network interface (ENI)</p>
         * <p>*   **NLB**: a Network Load Balancer (NLB) instance</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If you set this parameter to **ECS** or **SLB** and the service-linked role AliyunServiceRoleForGaVpcEndpoint does not exist, the system automatically creates the service-linked role.</p>
         * <br>
         * <p>*   If you set this parameter to **ALB** and the service-linked role AliyunServiceRoleForGaAlb does not exist, the system automatically creates the service-linked role.</p>
         * <br>
         * <p>*   If you set this parameter to **OSS** and the service-linked role AliyunServiceRoleForGaOss does not exist, the system automatically creates the service-linked role.</p>
         * <br>
         * <p>For more information, see [Service linked roles](~~178360~~).</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the endpoint.</p>
         * <br>
         * <p>Valid values: **0** to **255**.</p>
         * <br>
         * <p>You can set the weights of up to 100 endpoints in an endpoint group.</p>
         * <br>
         * <p>> *   This parameter is required.</p>
         * <p>> *   If you set the weight of an endpoint to 0, GA does not route network traffic to the endpoint. Make sure that you are aware of the impact on your business before you set the endpoint weight to 0.</p>
         */
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

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
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
        /**
         * <p>The endpoint port that is mapped to the listener port.</p>
         * <br>
         * <p>You can specify up to five endpoint ports.</p>
         */
        @NameInMap("EndpointPort")
        public Long endpointPort;

        /**
         * <p>The listener port that is mapped to the endpoint port.</p>
         * <br>
         * <p>You can specify up to five listener ports.</p>
         * <br>
         * <p>> *   Only HTTP and HTTPS listeners support port mappings.</p>
         * <p>> *   The listener port in a port mapping must be the port that is used by the current listener.</p>
         */
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

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag extends TeaModel {
        /**
         * <p>The key of the system tag.</p>
         * <br>
         * <p>You can enter up to 20 system tags.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The visibility of the system tag. Valid values:</p>
         * <br>
         * <p>*   **public** (default): The system tag is visible and can be used for filtering.</p>
         * <p>*   **private**: The system tag is invisible.</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The value of the system tag.</p>
         * <br>
         * <p>You can enter up to 20 system tags.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag self = new CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurationsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * <br>
         * <p>You can enter up to 20 tags.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <br>
         * <p>You can enter up to 20 tags.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurationsTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurationsTag self = new CreateEndpointGroupsRequestEndpointGroupConfigurationsTag();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurations extends TeaModel {
        /**
         * <p>Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>You can specify this parameter for up to 10 endpoint groups.</p>
         */
        @NameInMap("EnableClientIPPreservationProxyProtocol")
        public Boolean enableClientIPPreservationProxyProtocol;

        /**
         * <p>Specifies whether to preserve the IP addresses of clients that access the endpoint by using the TCP Option Address (TOA) module. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>You can specify this parameter for up to 10 endpoint groups.</p>
         */
        @NameInMap("EnableClientIPPreservationToa")
        public Boolean enableClientIPPreservationToa;

        /**
         * <p>The configurations of the endpoints.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The description of the endpoint group.</p>
         * <br>
         * <p>The description can be up to 256 characters in length and cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>You can enter the descriptions of up to 10 endpoint groups.</p>
         */
        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        /**
         * <p>The name of the endpoint group.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
         * <br>
         * <p>You can specify the names of up to 10 endpoint groups.</p>
         */
        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        /**
         * <p>The ID of the region where you want to create the endpoint group.</p>
         * <br>
         * <p>You can enter the region IDs of up to 10 endpoint groups.</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The type of the endpoint group. Valid values:</p>
         * <br>
         * <p>*   **default** (default)</p>
         * <p>*   **virtual**</p>
         * <br>
         * <p>You can specify the types of up to 10 endpoint groups.</p>
         * <br>
         * <p>>  Only HTTP and HTTPS listeners support virtual endpoint groups.</p>
         */
        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        /**
         * <p>The protocol that is used by the backend service. Valid values:</p>
         * <br>
         * <p>*   **HTTP** (default)</p>
         * <p>*   **HTTPS**</p>
         * <br>
         * <p>You can specify up to 10 backend service protocols.</p>
         * <br>
         * <p>> *   You can specify this parameter only if the listener that is associated with the endpoint group uses **HTTP** or **HTTPS**.</p>
         * <p>> *   For an **HTTP** listener, the backend service protocol must be **HTTP**.</p>
         */
        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>You can enable the health check feature for up to 10 endpoint groups.</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         * <br>
         * <p>You can specify up to 10 health check intervals.</p>
         */
        @NameInMap("HealthCheckIntervalSeconds")
        public Long healthCheckIntervalSeconds;

        /**
         * <p>The path to which health check requests are sent.</p>
         * <br>
         * <p>You can specify up to 10 health check paths.</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port that is used for health checks. Valid values: **1** to **65535**.</p>
         * <br>
         * <p>You can specify up to 10 ports for health checks.</p>
         */
        @NameInMap("HealthCheckPort")
        public Long healthCheckPort;

        /**
         * <p>The protocol over which health check requests are sent. Valid values:</p>
         * <br>
         * <p>*   **tcp**</p>
         * <p>*   **http**</p>
         * <p>*   **https**</p>
         * <br>
         * <p>You can specify up to 10 health check protocols.</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The port mapping.</p>
         */
        @NameInMap("PortOverrides")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides;

        /**
         * <p>The system tag.</p>
         */
        @NameInMap("SystemTag")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag> systemTag;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tag")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsTag> tag;

        /**
         * <p>The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy. Valid values: **2** to **10**. Default value: **3**.</p>
         * <br>
         * <p>You can specify the number of successful consecutive health checks or failed consecutive health checks for up to 10 endpoint groups.</p>
         */
        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        /**
         * <p>The traffic distribution ratio. If a listener is associated with multiple endpoint groups, you can specify this parameter to distribute traffic to the endpoint groups based on ratios.</p>
         * <br>
         * <p>Valid values: **1** to **100**. Default value: **100**.</p>
         * <br>
         * <p>You can specify traffic distribution ratios for up to 10 endpoint groups.</p>
         */
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

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setSystemTag(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag> systemTag) {
            this.systemTag = systemTag;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag> getSystemTag() {
            return this.systemTag;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setTag(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsTag> getTag() {
            return this.tag;
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
