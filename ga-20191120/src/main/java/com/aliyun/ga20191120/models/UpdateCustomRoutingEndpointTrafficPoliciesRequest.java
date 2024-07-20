// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointTrafficPoliciesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint for which you want to modify the traffic policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-2zewuzypq5e6r3pfh****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The access policies.</p>
     * <p>You can specify a maximum of 500 traffic policies for each endpoint.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyConfigurations")
    public java.util.List<UpdateCustomRoutingEndpointTrafficPoliciesRequestPolicyConfigurations> policyConfigurations;

    /**
     * <p>The region ID of the Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
         * <p>The first port of the destination port range. The value of this parameter must fall within the port range of the backend service.</p>
         * <p>This parameter takes effect only when you set the <strong>TrafficToEndpointPolicy</strong> parameter to <strong>AllowCustom</strong>. You can call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation to query the traffic policy of an endpoint.</p>
         * <p>If the start port and end port values are empty, traffic on all ports of the destination is allowed.</p>
         * <p>You can specify a maximum of 500 port ranges for each endpoint and a maximum of 10 port ranges for each traffic policy.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the destination port range. The value of this parameter must fall within the port range of the backend service.</p>
         * <p>This parameter takes effect only when you set the <strong>TrafficToEndpointPolicy</strong> parameter to <strong>AllowCustom</strong>. You can call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation to query the traffic policy of an endpoint.</p>
         * <p>If the start port and end port values are empty, traffic on all ports of the destination is allowed.</p>
         * <p>You can specify a maximum of 500 port ranges for each endpoint and a maximum of 10 port ranges for each traffic policy.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * <p>The IP address of the destination which to allow traffic.</p>
         * <p>This parameter takes effect only when you set the <strong>TrafficToEndpointPolicy</strong> parameter to <strong>AllowCustom</strong>. You can call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation to query the traffic policy of an endpoint.</p>
         * <p>You can specify a maximum of 500 traffic policies for each endpoint.</p>
         * <blockquote>
         * <p> This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the traffic policy that you want to modify.</p>
         * <blockquote>
         * <p> This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ply-bptest2****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <p>If you do not specify object, traffic is forwarded to all ports.</p>
         * <p>This parameter takes effect only when you set the <strong>TrafficToEndpointPolicy</strong> parameter to <strong>AllowCustom</strong>. You can call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation to query the traffic policy of an endpoint.</p>
         * <p>You can specify a maximum of 500 port ranges for each endpoint and a maximum of 10 port ranges for each traffic policy.</p>
         */
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
