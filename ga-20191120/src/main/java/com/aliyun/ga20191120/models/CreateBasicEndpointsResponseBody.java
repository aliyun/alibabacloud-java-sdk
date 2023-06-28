// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointsResponseBody extends TeaModel {
    /**
     * <p>The ID of the endpoint group.</p>
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
         * <p>This parameter is returned if the endpoint type is **ECS**, **ENI**, or **NLB**.</p>
         * <br>
         * <p>*   If the endpoint type is **ECS**, **EndpointSubAddress** returns the primary or secondary private IP address of the primary ENI.</p>
         * <p>*   If the endpoint type is **ENI**, **EndpointSubAddress** returns the primary or secondary private IP address of the secondary ENI.</p>
         * <p>*   If the endpoint type is **NLB**, **EndpointSubAddress** returns the primary private IP address of the NLB backend server.</p>
         */
        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **ENI:** ENI.</p>
         * <p>*   **SLB:** CLB instance.</p>
         * <p>*   **ECS:** ECS instance.</p>
         * <p>*   **NLB:** NLB instance.</p>
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
