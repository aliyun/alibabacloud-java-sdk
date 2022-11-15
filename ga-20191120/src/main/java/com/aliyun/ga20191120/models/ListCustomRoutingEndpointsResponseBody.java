// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> endpoints;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomRoutingEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointsResponseBody self = new ListCustomRoutingEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointsResponseBody setEndpoints(java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListCustomRoutingEndpointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingEndpointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomRoutingEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomRoutingEndpointsResponseBodyEndpoints extends TeaModel {
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        @NameInMap("Type")
        public String type;

        public static ListCustomRoutingEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointsResponseBodyEndpoints self = new ListCustomRoutingEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
            this.trafficToEndpointPolicy = trafficToEndpointPolicy;
            return this;
        }
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
