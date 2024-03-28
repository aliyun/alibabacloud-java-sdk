// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointsRequest extends TeaModel {
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
     * <p>The information about the endpoints.</p>
     * <br>
     * <p>You can specify information for up to 20 endpoints.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The ID of the endpoint group in which to create endpoints.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateCustomRoutingEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointsRequest self = new CreateCustomRoutingEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCustomRoutingEndpointsRequest setEndpointConfigurations(java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public CreateCustomRoutingEndpointsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateCustomRoutingEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges extends TeaModel {
        /**
         * <p>The first port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 first ports for each destination.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 last ports for each destination.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges self = new CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations extends TeaModel {
        /**
         * <p>The IP address of the destination to which traffic is forwarded.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify up to 20 destination IP addresses for each endpoint.</p>
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
         * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 port ranges for each destination.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges> portRanges;

        public static CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations self = new CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations setPortRanges(java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

    }

    public static class CreateCustomRoutingEndpointsRequestEndpointConfigurations extends TeaModel {
        /**
         * <p>The ID of the vSwitch that is specified as an endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The destination to which traffic is forwarded.</p>
         * <br>
         * <p>You can specify up to 20 destinations for each endpoint.</p>
         */
        @NameInMap("PolicyConfigurations")
        public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations> policyConfigurations;

        /**
         * <p>The traffic policy that is used to process traffic to the endpoint. Valid values:</p>
         * <br>
         * <p>*   **DenyAll** (default): denies all traffic to the endpoint.</p>
         * <p>*   **AllowAll**: allows all traffic to the endpoint.</p>
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

        public static CreateCustomRoutingEndpointsRequestEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointsRequestEndpointConfigurations self = new CreateCustomRoutingEndpointsRequestEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointsRequestEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateCustomRoutingEndpointsRequestEndpointConfigurations setPolicyConfigurations(java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations> policyConfigurations) {
            this.policyConfigurations = policyConfigurations;
            return this;
        }
        public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations> getPolicyConfigurations() {
            return this.policyConfigurations;
        }

        public CreateCustomRoutingEndpointsRequestEndpointConfigurations setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
            this.trafficToEndpointPolicy = trafficToEndpointPolicy;
            return this;
        }
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        public CreateCustomRoutingEndpointsRequestEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
