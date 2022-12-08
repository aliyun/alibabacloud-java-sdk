// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    public java.util.List<ListBasicEndpointsResponseBodyEndpoints> endpoints;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListBasicEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBasicEndpointsResponseBody self = new ListBasicEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBasicEndpointsResponseBody setEndpoints(java.util.List<ListBasicEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListBasicEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListBasicEndpointsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListBasicEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBasicEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBasicEndpointsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListBasicEndpointsResponseBodyEndpoints extends TeaModel {
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("EndpointAddress")
        public String endpointAddress;

        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        @NameInMap("EndpointSubAddressType")
        public String endpointSubAddressType;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("EndpointZoneId")
        public String endpointZoneId;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        public static ListBasicEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListBasicEndpointsResponseBodyEndpoints self = new ListBasicEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListBasicEndpointsResponseBodyEndpoints setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListBasicEndpointsResponseBodyEndpoints setEndpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        public ListBasicEndpointsResponseBodyEndpoints setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListBasicEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListBasicEndpointsResponseBodyEndpoints setEndpointSubAddress(String endpointSubAddress) {
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        public ListBasicEndpointsResponseBodyEndpoints setEndpointSubAddressType(String endpointSubAddressType) {
            this.endpointSubAddressType = endpointSubAddressType;
            return this;
        }
        public String getEndpointSubAddressType() {
            return this.endpointSubAddressType;
        }

        public ListBasicEndpointsResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListBasicEndpointsResponseBodyEndpoints setEndpointZoneId(String endpointZoneId) {
            this.endpointZoneId = endpointZoneId;
            return this;
        }
        public String getEndpointZoneId() {
            return this.endpointZoneId;
        }

        public ListBasicEndpointsResponseBodyEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBasicEndpointsResponseBodyEndpoints setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
