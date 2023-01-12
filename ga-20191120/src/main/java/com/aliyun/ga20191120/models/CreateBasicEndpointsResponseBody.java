// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointsResponseBody extends TeaModel {
    /**
     * <p>The ID of the endpoint group that is associated with the basic GA instance.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The endpoints in the endpoint group.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<CreateBasicEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBasicEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointsResponseBody self = new CreateBasicEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointsResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateBasicEndpointsResponseBody setEndpoints(java.util.List<CreateBasicEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateBasicEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateBasicEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateBasicEndpointsResponseBodyEndpoints extends TeaModel {
        /**
         * <p>The address of the endpoint.</p>
         */
        @NameInMap("EndpointAddress")
        public String endpointAddress;

        /**
         * <p>The ID of the endpoint.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The secondary address of the endpoint.</p>
         * <br>
         * <p>This parameter is returned when the accelerated IP address is associated with the secondary private IP address of an ECS instance or ENI.</p>
         * <br>
         * <p>*   When the endpoint type is **ECS**, you can set **EndpointSubAddress** to the secondary private IP address of the primary ENI. If the parameter is left empty, the primary private IP address of the primary ENI is used.</p>
         * <p>*   When the endpoint type is **ENI**, you can set **EndpointSubAddress** to the secondary private IP address of the secondary ENI. If the parameter is left empty, the primary private IP address of the secondary ENI is used.</p>
         */
        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        /**
         * <p>The type of endpoint. Valid values:</p>
         * <br>
         * <p>*   **ENI**: ENI</p>
         * <p>*   **SLB**: CLB</p>
         * <p>*   **ECS**: ECS</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        public static CreateBasicEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateBasicEndpointsResponseBodyEndpoints self = new CreateBasicEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateBasicEndpointsResponseBodyEndpoints setEndpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        public CreateBasicEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public CreateBasicEndpointsResponseBodyEndpoints setEndpointSubAddress(String endpointSubAddress) {
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        public CreateBasicEndpointsResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

    }

}
