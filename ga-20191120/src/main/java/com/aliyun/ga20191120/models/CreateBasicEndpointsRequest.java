// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointsRequest extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

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
     * <p>The ID of the endpoint group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The endpoints.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<CreateBasicEndpointsRequestEndpoints> endpoints;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointsRequest self = new CreateBasicEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicEndpointsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicEndpointsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateBasicEndpointsRequest setEndpoints(java.util.List<CreateBasicEndpointsRequestEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateBasicEndpointsRequestEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateBasicEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateBasicEndpointsRequestEndpoints extends TeaModel {
        /**
         * <p>The address of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1a05txelswuj8g****</p>
         */
        @NameInMap("EndpointAddress")
        public String endpointAddress;

        /**
         * <p>The secondary address of the endpoint.</p>
         * <p>This parameter is required only if you set the endpoint type to <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
         * <ul>
         * <li>If you set the endpoint type to <strong>ECS</strong>, you can set <strong>EndpointSubAddress</strong> to the secondary private IP address of the primary ENI. If you leave this parameter empty, the primary private IP address of the primary ENI is used.</li>
         * <li>If you set the endpoint type to <strong>ENI</strong>, you can set <strong>EndpointSubAddress</strong> to the secondary private IP address of the secondary ENI. If you leave this parameter empty, the primary private IP address of the secondary ENI is used.</li>
         * <li>If you set the endpoint type to <strong>NLB</strong>, you can set <strong>EndpointSubAddress</strong> to the primary private IP address of the NLB backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        /**
         * <p>The secondary address type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong>: a primary private IP address.</li>
         * <li><strong>secondary</strong>: a secondary private IP address.</li>
         * </ul>
         * <p>This parameter is required only if you set the endpoint type to <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>. If you set the endpoint type to <strong>NLB</strong>, only <strong>primary</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("EndpointSubAddressType")
        public String endpointSubAddressType;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>ENI</strong>: elastic network interface (ENI).</li>
         * <li><strong>SLB</strong>: Classic Load Balancer (CLB) instance.</li>
         * <li><strong>ECS</strong>: Elastic Compute Service (ECS) instance.</li>
         * <li><strong>NLB</strong>: Network Load Balancer (NLB) instance.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ENI</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The ID of the zone where the endpoint resides.</p>
         * <p>This parameter is required only if you set the endpoint type to <strong>NLB</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("EndpointZoneId")
        public String endpointZoneId;

        /**
         * <p>The name of the endpoint.</p>
         * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>ep01</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateBasicEndpointsRequestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateBasicEndpointsRequestEndpoints self = new CreateBasicEndpointsRequestEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointSubAddress(String endpointSubAddress) {
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointSubAddressType(String endpointSubAddressType) {
            this.endpointSubAddressType = endpointSubAddressType;
            return this;
        }
        public String getEndpointSubAddressType() {
            return this.endpointSubAddressType;
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointZoneId(String endpointZoneId) {
            this.endpointZoneId = endpointZoneId;
            return this;
        }
        public String getEndpointZoneId() {
            return this.endpointZoneId;
        }

        public CreateBasicEndpointsRequestEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
