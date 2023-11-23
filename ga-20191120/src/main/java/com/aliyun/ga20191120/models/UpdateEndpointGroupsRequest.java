// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true:** performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The configuration of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations;

    /**
     * <p>The listener ID.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateEndpointGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupsRequest self = new UpdateEndpointGroupsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEndpointGroupsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateEndpointGroupsRequest setEndpointGroupConfigurations(java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations) {
        this.endpointGroupConfigurations = endpointGroupConfigurations;
        return this;
    }
    public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    public UpdateEndpointGroupsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateEndpointGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
        /**
         * <p>The IP address, domain name, or instance ID based on the value of Type.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The private IP address of the ENI.</p>
         * <br>
         * <p>> When the Endpoint type is ENI, this parameter can be configured. If not configured, it defaults to the primary private IP address of ENI.</p>
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
         * <br>
         * <p>>- If you set this parameter to **ECS** or **SLB** and the service-linked role AliyunServiceRoleForGaVpcEndpoint does not exist, the system automatically creates the service-linked role. </p>
         * <p>>- If you set this parameter to **ALB** and the service-linked role AliyunServiceRoleForGaAlb does not exist, the system automatically creates the service-linked role.</p>
         * <p>>- If you set this parameter to **OSS** and the service-linked role AliyunServiceRoleForGaOss does not exist, the system automatically creates the service-linked role.</p>
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
         * <p>>  If you set the weight of an endpoint to 0, the GA instance stops distributing traffic to the endpoint.</p>
         */
        @NameInMap("Weight")
        public Long weight;

        public static UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations self = new UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port.</p>
         * <br>
         * <p>Valid values: **1** to **65499**.</p>
         */
        @NameInMap("EndpointPort")
        public Long endpointPort;

        /**
         * <p>The listener port.</p>
         * <br>
         * <p>Valid values: **1** to **65499**.</p>
         * <br>
         * <p>> * Only HTTP and HTTPS listeners support port mappings.</p>
         * <p>> * The listener port in a port mapping must be the one used by the current listener.</p>
         */
        @NameInMap("ListenerPort")
        public Long listenerPort;

        public static UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides self = new UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides setEndpointPort(Long endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Long getEndpointPort() {
            return this.endpointPort;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class UpdateEndpointGroupsRequestEndpointGroupConfigurations extends TeaModel {
        /**
         * <p>Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableClientIPPreservationProxyProtocol")
        public Boolean enableClientIPPreservationProxyProtocol;

        /**
         * <p>Specifies whether to preserve client IP addresses by using the TCP Option Address (TOA) module. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableClientIPPreservationToa")
        public Boolean enableClientIPPreservationToa;

        /**
         * <p>The configurations of the endpoints in the endpoint group.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The description of the endpoint group.</p>
         * <br>
         * <p>The description can be up to 256 characters in length and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        /**
         * <p>The endpoint ID.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The name of the endpoint group.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
         */
        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        /**
         * <p>The protocol that is used by the backend service. Valid values:</p>
         * <br>
         * <p>*   **HTTP**</p>
         * <p>*   **HTTPS**</p>
         * <br>
         * <p>> * You can specify this parameter only if the listener that is associated with the endpoint group uses HTTP or HTTPS.</p>
         * <p>> * For an HTTP listener, the backend service protocol must be HTTP.</p>
         */
        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds. Valid values: **1** to **50**.</p>
         */
        @NameInMap("HealthCheckIntervalSeconds")
        public Long healthCheckIntervalSeconds;

        /**
         * <p>The path to which health check requests are sent.</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port that is used for health checks.</p>
         * <br>
         * <p>Valid values: **1** to **65535**.</p>
         */
        @NameInMap("HealthCheckPort")
        public Long healthCheckPort;

        /**
         * <p>The protocol over which health check requests are sent. Valid values:</p>
         * <br>
         * <p>*   **tcp**</p>
         * <p>*   **http**</p>
         * <p>*   **https**</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The port mapping.</p>
         */
        @NameInMap("PortOverrides")
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides;

        /**
         * <p>The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         */
        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        /**
         * <p>The traffic ratio of the endpoint group when the specified listener is associated with multiple endpoint groups.</p>
         * <br>
         * <p>Valid values: **1** to **100**.</p>
         */
        @NameInMap("TrafficPercentage")
        public Long trafficPercentage;

        public static UpdateEndpointGroupsRequestEndpointGroupConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupsRequestEndpointGroupConfigurations self = new UpdateEndpointGroupsRequestEndpointGroupConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEnableClientIPPreservationProxyProtocol(Boolean enableClientIPPreservationProxyProtocol) {
            this.enableClientIPPreservationProxyProtocol = enableClientIPPreservationProxyProtocol;
            return this;
        }
        public Boolean getEnableClientIPPreservationProxyProtocol() {
            return this.enableClientIPPreservationProxyProtocol;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEnableClientIPPreservationToa(Boolean enableClientIPPreservationToa) {
            this.enableClientIPPreservationToa = enableClientIPPreservationToa;
            return this;
        }
        public Boolean getEnableClientIPPreservationToa() {
            return this.enableClientIPPreservationToa;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointConfigurations(java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupDescription(String endpointGroupDescription) {
            this.endpointGroupDescription = endpointGroupDescription;
            return this;
        }
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupName(String endpointGroupName) {
            this.endpointGroupName = endpointGroupName;
            return this;
        }
        public String getEndpointGroupName() {
            return this.endpointGroupName;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        public Long getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckPort(Long healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setPortOverrides(java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setThresholdCount(Long thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setTrafficPercentage(Long trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

    }

}
