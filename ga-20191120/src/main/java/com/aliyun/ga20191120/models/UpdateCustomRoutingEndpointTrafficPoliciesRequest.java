// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointTrafficPoliciesRequest extends TeaModel {
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
     * <p>The ID of the endpoint for which you want to modify the access policies of traffic.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("PolicyConfigurations")
    public java.util.List<UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations> policyConfigurations;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateCustomRoutingEndpointTrafficPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointTrafficPoliciesRequest self = new UpdateCustomRoutingEndpointTrafficPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesRequest setPolicyConfigurations(java.util.List<UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations> policyConfigurations) {
        this.policyConfigurations = policyConfigurations;
        return this;
    }
    public java.util.List<UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations> getPolicyConfigurations() {
        return this.policyConfigurations;
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges extends TeaModel {
        /**
         * <p>The start port of the port range in the destination to which to allow traffic. The specified port must fall within the port range of the specified endpoint group.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**. You can call the [DescribeCustomRoutingEndpoint](~~449386~~) operation to query the access policy of traffic for the specified endpoint.</p>
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
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**. You can call the [DescribeCustomRoutingEndpoint](~~449386~~) operation to query the access policy of traffic for the specified endpoint.</p>
         * <br>
         * <p>If the start port and end port values are empty, traffic on all ports in destinations are allowed.</p>
         * <br>
         * <p>You can specify port ranges for up to 500 destinations for each endpoint and specify up to 10 end ports for each destination.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges self = new UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges();
            return TeaModel.build(map, self);
        }

        public UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations extends TeaModel {
        /**
         * <p>The IP address of the destination to which to allow traffic.</p>
         * <br>
         * <p>This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**. You can call the [DescribeCustomRoutingEndpoint](~~449386~~) operation to query the access policy of traffic for the specified endpoint.</p>
         * <br>
         * <p>You can specify up to 500 destination IP addresses for each endpoint.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the access policy of traffic that you want to modify.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PortRanges")
        public java.util.List<UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges> portRanges;

        public static UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations self = new UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations setPortRanges(java.util.List<UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

    }

}
