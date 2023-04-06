// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request is different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The information about the endpoint groups.</p>
     * <br>
     * <p>You can specify at most five endpoint groups.</p>
     */
    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations;

    /**
     * <p>The ID of the custom routing listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateCustomRoutingEndpointGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointGroupsRequest self = new CreateCustomRoutingEndpointGroupsRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointGroupsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateCustomRoutingEndpointGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCustomRoutingEndpointGroupsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateCustomRoutingEndpointGroupsRequest setEndpointGroupConfigurations(java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations) {
        this.endpointGroupConfigurations = endpointGroupConfigurations;
        return this;
    }
    public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    public CreateCustomRoutingEndpointGroupsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateCustomRoutingEndpointGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations extends TeaModel {
        /**
         * <p>The first backend service port for the endpoint group.</p>
         * <br>
         * <p>Valid values: **1** to **65499**. The value of **FromPort** must be smaller than or equal to the value of **ToPort**.</p>
         * <br>
         * <p>You can specify at most 20 first backend service ports for each endpoint group.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The backend service protocol.</p>
         * <br>
         * <p>You can specify up to four backend service protocols in each mapping configuration.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The last backend service port for the endpoint group.</p>
         * <br>
         * <p>Valid values: **1** to **65499**. The value of **FromPort** must be smaller than or equal to the value of **ToPort**.</p>
         * <br>
         * <p>You can specify at most 20 last backend service ports for each endpoint group.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations self = new CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges extends TeaModel {
        /**
         * <p>The first port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify port ranges for at most 20 destinations in each endpoint and specify at most five first ports for each destination.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify port ranges for at most 20 destinations in each endpoint and specify at most five last ports for each destination.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges self = new CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations extends TeaModel {
        /**
         * <p>The IP address of the destination to which traffic is forwarded.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify at most 20 destination IP addresses for each endpoint.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <br>
         * <p>If you leave this parameter empty, traffic is forwarded to all destination ports.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify port ranges for at most 20 destinations in each endpoint and specify at most five port ranges for each destination.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges> portRanges;

        public static CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations self = new CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations setPortRanges(java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

    }

    public static class CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
        /**
         * <p>The name of the vSwitch that is specified as an endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The destination to which traffic is forwarded.</p>
         * <br>
         * <p>You can specify at most 20 destinations for each endpoint.</p>
         */
        @NameInMap("PolicyConfigurations")
        public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations> policyConfigurations;

        /**
         * <p>The traffic policy that is used to process traffic to the endpoint. Valid values:</p>
         * <br>
         * <p>*   **AllowAll**: allows all traffic to the endpoint.</p>
         * <p>*   **DenyAll** (default): denies all traffic to the endpoint.</p>
         * <p>*   **AllowCustom**: allows traffic only to specified destinations in the endpoint.</p>
         * <br>
         * <p>If you set this parameter to AllowCustom, you must specify IP addresses and port ranges as the destinations to which traffic is distributed. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to the specified IP addresses over all destination ports.</p>
         */
        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        /**
         * <p>The type of endpoint.</p>
         * <br>
         * <p>Set the value to **PrivateSubNet**, which specifies a private CIDR block. This is the default value.</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations self = new CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setPolicyConfigurations(java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations> policyConfigurations) {
            this.policyConfigurations = policyConfigurations;
            return this;
        }
        public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations> getPolicyConfigurations() {
            return this.policyConfigurations;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
            this.trafficToEndpointPolicy = trafficToEndpointPolicy;
            return this;
        }
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations extends TeaModel {
        /**
         * <p>The description of the endpoint group.</p>
         * <br>
         * <p>The description cannot exceed 256 characters in length and cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>You can specify at most five endpoint group descriptions.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mapping configuration of the endpoint group.</p>
         * <br>
         * <p>You need to specify the backend service ports and protocols for the endpoint group. The ports are mapped to listener ports.</p>
         * <br>
         * <p>You can specify at most 20 mapping configurations for each endpoint group.</p>
         */
        @NameInMap("DestinationConfigurations")
        public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations> destinationConfigurations;

        /**
         * <p>The information about the endpoints.</p>
         * <br>
         * <p>You can specify at most 10 endpoints for each endpoint group.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The ID of the region in which the endpoint group resides.</p>
         * <br>
         * <p>You can specify at most five region IDs.</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The name of the endpoint group.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
         * <br>
         * <p>You can specify at most five endpoint group names.</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations self = new CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations setDestinationConfigurations(java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations> destinationConfigurations) {
            this.destinationConfigurations = destinationConfigurations;
            return this;
        }
        public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsDestinationConfigurations> getDestinationConfigurations() {
            return this.destinationConfigurations;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations setEndpointConfigurations(java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public CreateCustomRoutingEndpointGroupsRequestEndpointGroupConfigurations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
