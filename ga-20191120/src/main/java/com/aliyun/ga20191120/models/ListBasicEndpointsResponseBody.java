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
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>ga-bp17frjjh0udz4qz****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The address of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1a05txelswuj8g****</p>
         */
        @NameInMap("EndpointAddress")
        public String endpointAddress;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp1dmlohjjz4kqaun****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The ID of the endpoint that is associated with the basic GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The secondary address of the endpoint.</p>
         * <p>This parameter is returned if the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
         * <ul>
         * <li>If the endpoint type is <strong>ECS</strong>, <strong>EndpointSubAddress</strong> returns the primary or secondary private IP address of the primary ENI.</li>
         * <li>If the endpoint type is <strong>ENI</strong>, <strong>EndpointSubAddress</strong> returns the primary or secondary private IP address of the secondary ENI.</li>
         * <li>If the endpoint type is <strong>NLB</strong>, <strong>EndpointSubAddress</strong> returns the primary private IP address of the NLB backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        /**
         * <p>The secondary address type of the endpoint.</p>
         * <ul>
         * <li><strong>primary</strong>: a primary private IP address.</li>
         * <li><strong>secondary</strong>: a secondary private IP address.</li>
         * </ul>
         * <p>This parameter is returned if the type of the endpoint is set to <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>. If the endpoint type is set to <strong>NLB</strong>, <strong>primary</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("EndpointSubAddressType")
        public String endpointSubAddressType;

        /**
         * <p>The type of endpoint. Valid values:</p>
         * <ul>
         * <li><strong>ENI</strong>: ENI.</li>
         * <li><strong>SLB</strong>: CLB instance.</li>
         * <li><strong>ECS</strong>: ECS instance.</li>
         * <li><strong>NLB</strong>: NLB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENI</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The zone ID of the endpoint.</p>
         * <p>This parameter is returned only when the endpoint type is set to <strong>NLB</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("EndpointZoneId")
        public String endpointZoneId;

        /**
         * <p>The name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The endpoint is being initialized.</li>
         * <li><strong>active</strong>: The endpoint is available.</li>
         * <li><strong>updating</strong>: The endpoint is being configured.</li>
         * <li><strong>binding</strong>: The endpoint is being associated.</li>
         * <li><strong>unbinding</strong>: The endpoint is being disassociated.</li>
         * <li><strong>deleting</strong>: The endpoint is being deleted.</li>
         * <li><strong>bound</strong>: The endpoint is associated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
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
