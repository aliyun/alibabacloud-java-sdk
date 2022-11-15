// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointConfigurations")
    public java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurations> endpointConfigurations;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateCustomRoutingEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointsRequest self = new UpdateCustomRoutingEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCustomRoutingEndpointsRequest setEndpointConfigurations(java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public UpdateCustomRoutingEndpointsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateCustomRoutingEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges extends TeaModel {
        @NameInMap("FromPort")
        public String fromPort;

        @NameInMap("ToPort")
        public String toPort;

        public static UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges self = new UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges();
            return TeaModel.build(map, self);
        }

        public UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges setFromPort(String fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public String getFromPort() {
            return this.fromPort;
        }

        public UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges setToPort(String toPort) {
            this.toPort = toPort;
            return this;
        }
        public String getToPort() {
            return this.toPort;
        }

    }

    public static class UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("PortRanges")
        public java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges> portRanges;

        public static UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations self = new UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations setPortRanges(java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

    }

    public static class UpdateCustomRoutingEndpointsRequestEndpointConfigurations extends TeaModel {
        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("PolicyConfigurations")
        public java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations> policyConfigurations;

        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        public static UpdateCustomRoutingEndpointsRequestEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomRoutingEndpointsRequestEndpointConfigurations self = new UpdateCustomRoutingEndpointsRequestEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateCustomRoutingEndpointsRequestEndpointConfigurations setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public UpdateCustomRoutingEndpointsRequestEndpointConfigurations setPolicyConfigurations(java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations> policyConfigurations) {
            this.policyConfigurations = policyConfigurations;
            return this;
        }
        public java.util.List<UpdateCustomRoutingEndpointsRequestEndpointConfigurationsPolicyConfigurations> getPolicyConfigurations() {
            return this.policyConfigurations;
        }

        public UpdateCustomRoutingEndpointsRequestEndpointConfigurations setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
            this.trafficToEndpointPolicy = trafficToEndpointPolicy;
            return this;
        }
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

    }

}
