// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of a request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> value as the <strong>ClientToken</strong> value. The <strong>RequestId</strong> value is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The endpoint configurations.</p>
     * <p>You can specify up to 20 endpoint configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The ID of the endpoint group in which you want to create an endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1bpn0kn908w4nb****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The region ID of the Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
         * <p>The start port of the traffic destination that can receive traffic. The port value must fall within the backend service port range of the endpoint group.</p>
         * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 port ranges for each endpoint, and up to 20 start ports for each traffic destination.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The end port of the traffic destination that can receive traffic. The port value must fall within the backend service port range of the endpoint group.</p>
         * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 port ranges for each endpoint, and up to 20 end ports for each traffic destination.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * <p>The IP address of the traffic destination that can receive traffic.</p>
         * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 traffic destination IP addresses for each endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The port range of the traffic destination that can receive traffic. The port range must fall within the backend service port range of the endpoint group.</p>
         * <p>If this parameter is left empty, all ports of the traffic destination are supported.</p>
         * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 port ranges for each endpoint, and up to 20 port ranges for each traffic destination.</p>
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
         * <p>The instance ID of the endpoint vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-test01</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The traffic destination configurations.</p>
         * <p>You can specify up to 20 traffic destinations for each endpoint.</p>
         */
        @NameInMap("PolicyConfigurations")
        public java.util.List<CreateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations> policyConfigurations;

        /**
         * <p>The traffic policy for the backend service. Valid values:</p>
         * <ul>
         * <li><strong>DenyAll</strong> (default): denies all traffic to the specified backend service.</li>
         * <li><strong>AllowAll</strong>: allows all traffic to the specified backend service.</li>
         * <li><strong>AllowCustom</strong>: allows traffic only to specified destinations.
         * You must specify the IP address and port range of the destination. If the port range is left empty, all ports of the destination are supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DenyAll</p>
         */
        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        /**
         * <p>The backend service type of the endpoint. Valid values:</p>
         * <p> <strong>PrivateSubNet</strong> (default): private CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateSubNet</p>
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
