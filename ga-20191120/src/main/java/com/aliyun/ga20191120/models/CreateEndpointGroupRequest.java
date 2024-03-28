// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupRequest extends TeaModel {
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
     * <p>The description of the endpoint group.</p>
     * <br>
     * <p>The description can be up to 200 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configurations of endpoints in the endpoint group.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<CreateEndpointGroupRequestEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The ID of the region in which to create the endpoint group.</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The type of the endpoint group. Valid values:</p>
     * <br>
     * <p>*   **default** (default): a default endpoint group.</p>
     * <p>*   **virtual**: a virtual endpoint group.</p>
     * <br>
     * <p>>  When you call this operation to create a virtual endpoint group for a Layer 4 listener, make sure that a default endpoint group is created.</p>
     */
    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

    /**
     * <p>The protocol that is used by the backend service. Default value: HTTP. Valid values:</p>
     * <br>
     * <p>*   **HTTP**</p>
     * <p>*   **HTTPS**</p>
     * <br>
     * <p>> *   You can set this parameter only when the listener that is associated with the endpoint group uses **HTTP** or **HTTPS**.</p>
     * <p>>*   For an **HTTP** listener, the backend service protocol must be **HTTP**.</p>
     */
    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("HealthCheckEnabled")
    public Boolean healthCheckEnabled;

    /**
     * <p>The interval at which health checks are performed. Unit: seconds.</p>
     */
    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    /**
     * <p>The path to which to send health check requests.</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The port that is used for health checks.</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The protocol over which to send health check requests. Valid values:</p>
     * <br>
     * <p>*   **tcp** or **TCP**</p>
     * <p>*   **http** or **HTTP**</p>
     * <p>*   **https** or **HTTPS**</p>
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
     * <br>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The mappings between ports.</p>
     */
    @NameInMap("PortOverrides")
    public java.util.List<CreateEndpointGroupRequestPortOverrides> portOverrides;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Tags of GA instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEndpointGroupRequestTag> tag;

    /**
     * <p>The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy.</p>
     * <br>
     * <p>Valid values: **2** to **10**. Default value: **3**.</p>
     */
    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    /**
     * <p>The traffic ratio for the endpoint group when the specified listener is associated with multiple endpoint groups.</p>
     * <br>
     * <p>Valid values: **1** to **100**.</p>
     */
    @NameInMap("TrafficPercentage")
    public Integer trafficPercentage;

    public static CreateEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupRequest self = new CreateEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEndpointGroupRequest setEndpointConfigurations(java.util.List<CreateEndpointGroupRequestEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<CreateEndpointGroupRequestEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public CreateEndpointGroupRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public CreateEndpointGroupRequest setEndpointGroupType(String endpointGroupType) {
        this.endpointGroupType = endpointGroupType;
        return this;
    }
    public String getEndpointGroupType() {
        return this.endpointGroupType;
    }

    public CreateEndpointGroupRequest setEndpointRequestProtocol(String endpointRequestProtocol) {
        this.endpointRequestProtocol = endpointRequestProtocol;
        return this;
    }
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    public CreateEndpointGroupRequest setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    public CreateEndpointGroupRequest setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    public CreateEndpointGroupRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public CreateEndpointGroupRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public CreateEndpointGroupRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public CreateEndpointGroupRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEndpointGroupRequest setPortOverrides(java.util.List<CreateEndpointGroupRequestPortOverrides> portOverrides) {
        this.portOverrides = portOverrides;
        return this;
    }
    public java.util.List<CreateEndpointGroupRequestPortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    public CreateEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEndpointGroupRequest setTag(java.util.List<CreateEndpointGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEndpointGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateEndpointGroupRequest setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public CreateEndpointGroupRequest setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static class CreateEndpointGroupRequestEndpointConfigurations extends TeaModel {
        /**
         * <p>Specifies whether to preserve client IP addresses by using the TCP Option Address (TOA) module. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>Enter the IP address, domain name, or instance ID based on the value of the Type parameter.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The private IP address of the ENI.</p>
         * <br>
         * <p>>  This parameter is available only when you set the endpoint type to **ENI**. If you leave this parameter empty, the primary private IP address of the ENI is used.</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Domain:** a custom domain name.</p>
         * <p>*   **Ip:** a custom IP address.</p>
         * <p>*   **PublicIp:** a public IP address provided by Alibaba Cloud.</p>
         * <p>*   **ECS:** an Elastic Compute Service (ECS) instance.</p>
         * <p>*   **SLB:** a Classic Load Balancer (CLB) instance.</p>
         * <p>*   **ALB:** an Application Load Balancer (ALB) instance.</p>
         * <p>*   **OSS:** an Object Storage Service (OSS) bucket.</p>
         * <p>*   **ENI:** an elastic network interface (ENI).</p>
         * <p>*   **NLB:** a Network Load Balancer (NLB) instance.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If you set this parameter to **ECS**, **ENI**, **SLB**, **ALB**, or **NLB** and the AliyunServiceRoleForGaVpcEndpoint service-linked role does not exist, the system automatically creates the service-linked role.</p>
         * <br>
         * <p>*   If you set this parameter to **ALB** and the AliyunServiceRoleForGaAlb service-linked role does not exist, the system automatically creates the role.</p>
         * <br>
         * <p>*   If you set this parameter to **OSS** and the AliyunServiceRoleForGaOss service-linked role does not exist, the system automatically creates the role.</p>
         * <br>
         * <p>*   If you set this parameter to **NLB** and the AliyunServiceRoleForGaNlb service-linked role does not exist, the system automatically creates the role.</p>
         * <br>
         * <p>For more information, see [Service-linked roles](~~178360~~).</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the endpoint.</p>
         * <br>
         * <p>Valid values: **0** to **255**.</p>
         * <br>
         * <p>>  If you set the weight of an endpoint to 0, GA stops distributing traffic to the endpoint. Proceed with caution.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateEndpointGroupRequestEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupRequestEndpointConfigurations self = new CreateEndpointGroupRequestEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupRequestEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateEndpointGroupRequestPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port that is mapped to the listener port.</p>
         */
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        /**
         * <p>The listener port that is mapped to the endpoint port.</p>
         * <br>
         * <p>> *   Only HTTP and HTTPS listeners support port mappings.</p>
         * <p>>*   The listener port must be the one used by the current listener.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static CreateEndpointGroupRequestPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupRequestPortOverrides self = new CreateEndpointGroupRequestPortOverrides();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupRequestPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        public CreateEndpointGroupRequestPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class CreateEndpointGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key of the GA instance. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify up to 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the GA instance. The tag value cannot be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify up to 20 tag values.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEndpointGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupRequestTag self = new CreateEndpointGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEndpointGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
