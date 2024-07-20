// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAccelerateIpEndpointRelationsResponseBody extends TeaModel {
    /**
     * <p>A list of accelerated IP addresses and the endpoints with which the accelerated IP addresses are associated.</p>
     */
    @NameInMap("AccelerateIpEndpointRelations")
    public java.util.List<ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations> accelerateIpEndpointRelations;

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

    public static ListBasicAccelerateIpEndpointRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAccelerateIpEndpointRelationsResponseBody self = new ListBasicAccelerateIpEndpointRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBasicAccelerateIpEndpointRelationsResponseBody setAccelerateIpEndpointRelations(java.util.List<ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations> accelerateIpEndpointRelations) {
        this.accelerateIpEndpointRelations = accelerateIpEndpointRelations;
        return this;
    }
    public java.util.List<ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations> getAccelerateIpEndpointRelations() {
        return this.accelerateIpEndpointRelations;
    }

    public ListBasicAccelerateIpEndpointRelationsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListBasicAccelerateIpEndpointRelationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBasicAccelerateIpEndpointRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBasicAccelerateIpEndpointRelationsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations extends TeaModel {
        /**
         * <p>The ID of the accelerated IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>gaip-bp1****</p>
         */
        @NameInMap("AccelerateIpId")
        public String accelerateIpId;

        /**
         * <p>The ID of the basic GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1miyl2kn2racucvegr5</p>
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
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep01</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

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
         * <p>The type of the secondary address of the endpoint.</p>
         * <ul>
         * <li><strong>primary</strong>: a primary private IP address.</li>
         * <li><strong>secondary</strong>: a secondary private IP address.</li>
         * </ul>
         * <p>This parameter is returned if the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>. If the endpoint type is set to <strong>NLB</strong>, <strong>primary</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("EndpointSubAddressType")
        public String endpointSubAddressType;

        /**
         * <p>The type of endpoint. Valid values:</p>
         * <ul>
         * <li><strong>ENI</strong>: elastic network interface (ENI).</li>
         * <li><strong>SLB</strong>: Classic Load Balancer (CLB) instance.</li>
         * <li><strong>ECS</strong>: Elastic Compute Service (ECS) instance.</li>
         * <li><strong>NLB</strong>: Network Load Balancer (NLB) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The ID of the zone where the endpoint is created.</p>
         * <p>This parameter is returned only when the endpoint type is <strong>NLB</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("EndpointZoneId")
        public String endpointZoneId;

        /**
         * <p>The accelerated IP address of the basic GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>116.132.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The association status between the accelerated IP address and endpoint.</p>
         * <p>A value of <strong>active</strong> indicates that the accelerated IP address is associated with the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

        public static ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations self = new ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations();
            return TeaModel.build(map, self);
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setAccelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
            return this;
        }
        public String getAccelerateIpId() {
            return this.accelerateIpId;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setEndpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setEndpointSubAddress(String endpointSubAddress) {
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setEndpointSubAddressType(String endpointSubAddressType) {
            this.endpointSubAddressType = endpointSubAddressType;
            return this;
        }
        public String getEndpointSubAddressType() {
            return this.endpointSubAddressType;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setEndpointZoneId(String endpointZoneId) {
            this.endpointZoneId = endpointZoneId;
            return this;
        }
        public String getEndpointZoneId() {
            return this.endpointZoneId;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
