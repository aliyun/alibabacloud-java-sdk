// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicEndpointsResponseBody extends TeaModel {
    /**
     * <p>The endpoints that are associated with the basic GA instance.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<ListBasicEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is not returned, it indicates that no additional results exist.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the basic GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The address of the endpoint.</p>
         */
        @NameInMap("EndpointAddress")
        public String endpointAddress;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The ID of the endpoint that is associated with the basic GA instance.</p>
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
         * <p>The secondary address type of the endpoint.</p>
         * <br>
         * <p>*   **primary**: a primary private IP address.</p>
         * <p>*   **secondary**: a secondary private IP address.</p>
         * <br>
         * <p>This parameter is returned if the type of the endpoint is set to **ECS**, **ENI**, or **NLB**. If the endpoint type is set to **NLB**, **primary** is returned.</p>
         */
        @NameInMap("EndpointSubAddressType")
        public String endpointSubAddressType;

        /**
         * <p>The type of endpoint. Valid values:</p>
         * <br>
         * <p>*   **ENI**: ENI.</p>
         * <p>*   **SLB**: CLB instance.</p>
         * <p>*   **ECS**: ECS instance.</p>
         * <p>*   **NLB**: NLB instance.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The zone ID of the endpoint.</p>
         * <br>
         * <p>This parameter is returned only when the endpoint type is set to **NLB**.</p>
         */
        @NameInMap("EndpointZoneId")
        public String endpointZoneId;

        /**
         * <p>The name of the endpoint.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **init**: The endpoint is being initialized.</p>
         * <p>*   **active**: The endpoint is available.</p>
         * <p>*   **updating**: The endpoint is being configured.</p>
         * <p>*   **binding**: The endpoint is being associated.</p>
         * <p>*   **unbinding**: The endpoint is being disassociated.</p>
         * <p>*   **deleting**: The endpoint is being deleted.</p>
         * <p>*   **bound**: The endpoint is associated.</p>
         */
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
