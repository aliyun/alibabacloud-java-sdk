// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the endpoint group.</p>
     * <br>
     * <p>The description cannot exceed 256 characters in length and cannot contain `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the endpoints.</p>
     * <br>
     * <p>You can specify information for up to 20 endpoints.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The ID of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the region where the endpoint group is created.</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The protocol that is used by the backend service. Valid values:</p>
     * <br>
     * <p>*   **HTTP**</p>
     * <p>*   **HTTPS**</p>
     * <br>
     * <p>> *   You can set this parameter only when the listener that is associated with the endpoint group uses the HTTP or HTTPS protocol.</p>
     * <p>> *   For an HTTP listener, the backend service protocol must be HTTP.</p>
     */
    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    /**
     * <p>Specifies whether to enable the health check feature. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the health check feature.</p>
     * <p>*   **false**: disables the health check feature.</p>
     */
    @NameInMap("HealthCheckEnabled")
    public Boolean healthCheckEnabled;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: **1** to **50**.</p>
     */
    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    /**
     * <p>The path to which health check requests are sent.</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The port that is used for health checks. Valid values: **1** to **65535**.</p>
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
     * <p>The name of the endpoint group.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The mappings between ports.</p>
     */
    @NameInMap("PortOverrides")
    public java.util.List<UpdateEndpointGroupRequestPortOverrides> portOverrides;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     */
    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    /**
     * <p>The weight of the endpoint group when the listener is associated with multiple endpoint groups.</p>
     */
    @NameInMap("TrafficPercentage")
    public Integer trafficPercentage;

    public static UpdateEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupRequest self = new UpdateEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEndpointGroupRequest setEndpointConfigurations(java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public UpdateEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateEndpointGroupRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public UpdateEndpointGroupRequest setEndpointRequestProtocol(String endpointRequestProtocol) {
        this.endpointRequestProtocol = endpointRequestProtocol;
        return this;
    }
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    public UpdateEndpointGroupRequest setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    public UpdateEndpointGroupRequest setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    public UpdateEndpointGroupRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public UpdateEndpointGroupRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public UpdateEndpointGroupRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public UpdateEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEndpointGroupRequest setPortOverrides(java.util.List<UpdateEndpointGroupRequestPortOverrides> portOverrides) {
        this.portOverrides = portOverrides;
        return this;
    }
    public java.util.List<UpdateEndpointGroupRequestPortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    public UpdateEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEndpointGroupRequest setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public UpdateEndpointGroupRequest setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static class UpdateEndpointGroupRequestEndpointConfigurations extends TeaModel {
        /**
         * <p>Specifies whether to reserve client IP addresses. Default value: false. Valid values:</p>
         * <br>
         * <p>*   **true**: reserves client IP addresses.</p>
         * <p>*   **false**: does not reserve client IP addresses.</p>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Specifies whether to preserve client IP addresses by using the ProxyProtocol module. Default value: false. Valid values:</p>
         * <br>
         * <p>*   **true**: preserves client IP addresses by using the ProxyProtocol module.</p>
         * <p>*   **false**: does not preserve client IP addresses by using the ProxyProtocol module.</p>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The IP address or domain name of the endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The private IP address of the ENI.</p>
         * <br>
         * <p>> - When the Endpoint type is ENI, this parameter can be configured. If not configured, it defaults to the primary private IP address of ENI.</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Domain:** a custom domain name.</p>
         * <p>*   **Ip:** a custom IP address.</p>
         * <p>*   **PublicIp:** a public IP address provided by Alibaba Cloud.</p>
         * <p>*   **ECS:** Elastic Compute Service (ECS) instance.</p>
         * <p>*   **SLB:** Server Load Balancer (SLB) instance.</p>
         * <p>*   **ALB:** Application Load Balancer (ALB) instance.</p>
         * <p>*   **OSS:** Object Storage Service (OSS) bucket.</p>
         * <p>*   **ENI:** Elastic Network interface (ENI).</p>
         * <p>*   **NLB:** Network Load Balancer (NLB) instance.</p>
         * <br>
         * <p>> *   If you set this parameter to **ECS** or **SLB** and the service-linked role AliyunServiceRoleForGaVpcEndpoint does not exist, the system automatically creates the service-linked role.</p>
         * <p>> *   If you set this parameter to **ALB** and the service-linked role AliyunServiceRoleForGaAlb does not exist, the system automatically creates the service-linked role.</p>
         * <p>> *   If you set this parameter to **OSS** and the service-linked role AliyunServiceRoleForGaOss does not exist, the system automatically creates the service-linked role.</p>
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
         * <p>>  If the weight of an endpoint is set to 0, GA stops distributing network traffic to the endpoint. Proceed with caution.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateEndpointGroupRequestEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupRequestEndpointConfigurations self = new UpdateEndpointGroupRequestEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateEndpointGroupRequestPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port that is mapped to the listener port.</p>
         */
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        /**
         * <p>The listener port that is mapped to the endpoint port.</p>
         * <br>
         * <p>> *   Only HTTP and HTTPS listeners support port mappings.</p>
         * <p>> *   The listener port in a port mapping must be the one used by the current listener.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static UpdateEndpointGroupRequestPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupRequestPortOverrides self = new UpdateEndpointGroupRequestPortOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupRequestPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        public UpdateEndpointGroupRequestPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

}
