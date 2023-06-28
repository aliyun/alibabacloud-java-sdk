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
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The endpoints in the endpoint group.</p>
     */
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
         * <p>This parameter is required if the endpoint type is **ECS**, **ENI**, or **NLB**.</p>
         * <br>
         * <p>*   If the endpoint type is **ECS**, you can set the **EndpointSubAddress** parameter to the secondary private IP address of the primary ENI. If the parameter is left empty, the primary private IP address of the primary ENI is used.</p>
         * <p>*   If the endpoint type is **ENI**, you can set the **EndpointSubAddress** parameter to the secondary private IP address of the secondary ENI. If the parameter is left empty, the primary private IP address of the secondary ENI is used.</p>
         * <p>*   This parameter is required if the endpoint type is **NLB**. **EndpointSubAddress** is the primary private IP address of the NLB backend server.</p>
         */
        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        /**
         * <p>The secondary address type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **primary:** a primary private IP address.</p>
         * <p>*   **secondary:** a secondary private IP address.</p>
         * <br>
         * <p>This parameter is required if the endpoint type is **ECS**, **ENI**, or **NLB**. If the endpoint type is **NLB**, only **primary** is supported.</p>
         */
        @NameInMap("EndpointSubAddressType")
        public String endpointSubAddressType;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **ENI:** elastic network interface (ENI).</p>
         * <p>*   **SLB:** Classic Load Balancer (CLB) instance.</p>
         * <p>*   **ECS:** Elastic Compute Service (ECS) instance.</p>
         * <p>*   **NLB:** Network Load Balancer (NLB) instance.</p>
         * <br>
         * <p>>  This parameter is required.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The ID of the zone where the endpoint resides.</p>
         * <br>
         * <p>This parameter is required only if the endpoint type is **NLB**.</p>
         */
        @NameInMap("EndpointZoneId")
        public String endpointZoneId;

        /**
         * <p>The name of the endpoint.</p>
         * <br>
         * <p>The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
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
