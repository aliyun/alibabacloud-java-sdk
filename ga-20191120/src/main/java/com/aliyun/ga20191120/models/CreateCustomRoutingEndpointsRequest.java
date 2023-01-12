// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
         * <p>The start port of the port range in the destination to which to allow traffic. The specified port must fall within the port range of the specified endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 start ports for each destination.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The end port of the port range in the destination to which to allow traffic. The specified port must fall within the port range of the specified endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 end ports for each destination.</p>
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
         * <p>The IP address of the destination which to allow traffic.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify up to 20 destination IP addresses for each endpoint.</p>
         */
        @NameInMap("Address")
        public String address;

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
         * <p>The name of the endpoint (vSwitch).</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("PolicyConfigurations")
        public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations> policyConfigurations;

        /**
         * <p>The access policy of traffic to the endpoint. Defualt value: DenyAll. Valid values:</p>
         * <br>
         * <p>*   **DenyAll**: denies all traffic to the endpoint.</p>
         * <br>
         * <p>*   **AllowAll**: allows all traffic to the endpoint.</p>
         * <br>
         * <p>*   **AllowCustom**: allows traffic only to specified destinations in the endpoint</p>
         * <br>
         * <p>    If you set this parameter to AllowCustom, you must specify IP addresses and port ranges of destinations to which to allow traffic. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to all ports and the specified IP addresses in the destinations.</p>
         */
        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        /**
         * <p>The backend service type of the endpoint. Default value: PrivateSubNet.</p>
         * <br>
         * <p>Set the value to **PrivateSubNet**, which indicates private CIDR blocks.</p>
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
