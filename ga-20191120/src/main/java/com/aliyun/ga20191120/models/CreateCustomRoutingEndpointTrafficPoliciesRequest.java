// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointTrafficPoliciesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint for which you want to create traffic destinations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-2zewuzypq5e6r3pfh****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The configurations of the traffic destinations.</p>
     * <p>You can specify up to 500 traffic destinations for each endpoint.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyConfigurations")
    public java.util.List<CreateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations> policyConfigurations;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
         * <p>The first port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>If the first port and the last port are not specified, traffic on all ports of the destination is allowed.</p>
         * <p>You can specify port ranges for up to 500 destinations in each endpoint and specify up to 10 first ports for each destination.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>If the first port and the last port are not specified, traffic on all ports of the destination is allowed.</p>
         * <p>You can specify port ranges for up to 500 destinations in each endpoint and specify up to 10 last ports for each destination.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * <p>The IP address of the destination to which traffic is forwarded.</p>
         * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 500 destination IP addresses for each endpoint.</p>
         * <blockquote>
         * <p>This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <p>If you leave this parameter empty, traffic is forwarded to all destination ports.</p>
         * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify port ranges for up to 500 traffic destinations in each endpoint and specify up to 10 port ranges for each traffic destination.</p>
         */
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
