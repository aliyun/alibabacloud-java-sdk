// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAccelerateIpEndpointRelationsResponseBody extends TeaModel {
    @NameInMap("AccelerateIpEndpointRelations")
    public java.util.List<ListBasicAccelerateIpEndpointRelationsResponseBodyAccelerateIpEndpointRelations> accelerateIpEndpointRelations;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccelerateIpId")
        public String accelerateIpId;

        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("EndpointAddress")
        public String endpointAddress;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        @NameInMap("EndpointSubAddressType")
        public String endpointSubAddressType;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("EndpointZoneId")
        public String endpointZoneId;

        @NameInMap("IpAddress")
        public String ipAddress;

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
