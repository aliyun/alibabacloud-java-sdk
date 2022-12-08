// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointsResponseBody extends TeaModel {
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("Endpoints")
    public java.util.List<CreateBasicEndpointsResponseBodyEndpoints> endpoints;

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
        @NameInMap("EndpointAddress")
        public String endpointAddress;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

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
