// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointTrafficPoliciesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint for which you want to create the access policies of traffic.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("PolicyConfigurations")
    public java.util.List<CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations> policyConfigurations;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateCustomRoutingEndpointTrafficPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointTrafficPoliciesRequest self = new CreateCustomRoutingEndpointTrafficPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointTrafficPoliciesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCustomRoutingEndpointTrafficPoliciesRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public CreateCustomRoutingEndpointTrafficPoliciesRequest setPolicyConfigurations(java.util.List<CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations> policyConfigurations) {
        this.policyConfigurations = policyConfigurations;
        return this;
    }
    public java.util.List<CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations> getPolicyConfigurations() {
        return this.policyConfigurations;
    }

    public CreateCustomRoutingEndpointTrafficPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges extends TeaModel {
        /**
         * <p>The start port of the port range in the destination to which to allow traffic. The specified port must fall within the port range of the specified endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>If the start port and end port values are empty, traffic on all ports in destinations are allowed.</p>
         * <br>
         * <p>You can specify port ranges for up to 500 destinations for each endpoint and specify up to 10 start ports for each destination.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The end port of the port range in the destination to which to allow traffic. The specified port must fall within the port range of the specified endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>If the start port and end port values are empty, traffic on all ports in destinations are allowed.</p>
         * <br>
         * <p>You can specify port ranges for up to 500 destinations for each endpoint and specify up to 10 end ports for each destination.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges self = new CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations extends TeaModel {
        /**
         * <p>The IP address of the destination to which to allow traffic.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.</p>
         * <br>
         * <p>You can specify up to 500 destination IP addresses for each endpoint.</p>
         */
        @NameInMap("Address")
        public String address;

        @NameInMap("PortRanges")
        public java.util.List<CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges> portRanges;

        public static CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations self = new CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations setPortRanges(java.util.List<CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

    }

}
