// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointsRequest extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint group that is associated with the basic GA instance.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("Endpoints")
    public java.util.List<CreateBasicEndpointsRequestEndpoints> endpoints;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
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
         */
        @NameInMap("EndpointAddress")
        public String endpointAddress;

        /**
         * <p>The secondary address of the endpoint.</p>
         * <br>
         * <p>This parameter is required when the accelerated IP address is associated with the secondary private IP address of an ECS instance or ENI.</p>
         * <br>
         * <p>*   When the endpoint type is **ECS**, you can set **EndpointSubAddress** to the secondary private IP address of the primary ENI. If the parameter is left empty, the primary private IP address of the primary ENI is used.</p>
         * <p>*   When the endpoint type is **ENI**, you can set **EndpointSubAddress** to the secondary private IP address of the secondary ENI. If the parameter is left empty, the primary private IP address of the secondary ENI is used.</p>
         */
        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        @NameInMap("EndpointSubAddressType")
        public String endpointSubAddressType;

        /**
         * <p>The type of endpoint. Valid values:</p>
         * <br>
         * <p>*   **ENI**: elastic network interface (ENI)</p>
         * <p>*   **SLB**: Classic Load Balancer (CLB)</p>
         * <p>*   **ECS**: Elastic Compute Service (ECS)</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("EndpointZoneId")
        public String endpointZoneId;

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
