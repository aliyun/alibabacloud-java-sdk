// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAccelerateIpsResponseBody extends TeaModel {
    @NameInMap("AccelerateIps")
    public java.util.List<ListBasicAccelerateIpsResponseBodyAccelerateIps> accelerateIps;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBasicAccelerateIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAccelerateIpsResponseBody self = new ListBasicAccelerateIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBasicAccelerateIpsResponseBody setAccelerateIps(java.util.List<ListBasicAccelerateIpsResponseBodyAccelerateIps> accelerateIps) {
        this.accelerateIps = accelerateIps;
        return this;
    }
    public java.util.List<ListBasicAccelerateIpsResponseBodyAccelerateIps> getAccelerateIps() {
        return this.accelerateIps;
    }

    public ListBasicAccelerateIpsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBasicAccelerateIpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBasicAccelerateIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBasicAccelerateIpsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint extends TeaModel {
        @NameInMap("EndPointId")
        public String endPointId;

        @NameInMap("EndpointAddress")
        public String endpointAddress;

        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

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

        public static ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint self = new ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint();
            return TeaModel.build(map, self);
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setEndPointId(String endPointId) {
            this.endPointId = endPointId;
            return this;
        }
        public String getEndPointId() {
            return this.endPointId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setEndpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setEndpointSubAddress(String endpointSubAddress) {
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setEndpointSubAddressType(String endpointSubAddressType) {
            this.endpointSubAddressType = endpointSubAddressType;
            return this;
        }
        public String getEndpointSubAddressType() {
            return this.endpointSubAddressType;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setEndpointZoneId(String endpointZoneId) {
            this.endpointZoneId = endpointZoneId;
            return this;
        }
        public String getEndpointZoneId() {
            return this.endpointZoneId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListBasicAccelerateIpsResponseBodyAccelerateIps extends TeaModel {
        @NameInMap("AccelerateIpAddress")
        public String accelerateIpAddress;

        @NameInMap("AccelerateIpId")
        public String accelerateIpId;

        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("Endpoint")
        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint endpoint;

        @NameInMap("IpSetId")
        public String ipSetId;

        @NameInMap("State")
        public String state;

        public static ListBasicAccelerateIpsResponseBodyAccelerateIps build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAccelerateIpsResponseBodyAccelerateIps self = new ListBasicAccelerateIpsResponseBodyAccelerateIps();
            return TeaModel.build(map, self);
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setAccelerateIpAddress(String accelerateIpAddress) {
            this.accelerateIpAddress = accelerateIpAddress;
            return this;
        }
        public String getAccelerateIpAddress() {
            return this.accelerateIpAddress;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setAccelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
            return this;
        }
        public String getAccelerateIpId() {
            return this.accelerateIpId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setEndpoint(ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public ListBasicAccelerateIpsResponseBodyAccelerateIpsEndpoint getEndpoint() {
            return this.endpoint;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setIpSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }
        public String getIpSetId() {
            return this.ipSetId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
