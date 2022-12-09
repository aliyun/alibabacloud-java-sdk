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

    public static class ListBasicAccelerateIpsResponseBodyAccelerateIps extends TeaModel {
        @NameInMap("AccelerateIpAddress")
        public String accelerateIpAddress;

        @NameInMap("AccelerateIpId")
        public String accelerateIpId;

        @NameInMap("AcceleratorId")
        public String acceleratorId;

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
