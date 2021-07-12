// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListConnectionPoolsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("ConnectionPools")
    public java.util.List<ListConnectionPoolsResponseBodyConnectionPools> connectionPools;

    public static ListConnectionPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolsResponseBody self = new ListConnectionPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionPoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListConnectionPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectionPoolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionPoolsResponseBody setConnectionPools(java.util.List<ListConnectionPoolsResponseBodyConnectionPools> connectionPools) {
        this.connectionPools = connectionPools;
        return this;
    }
    public java.util.List<ListConnectionPoolsResponseBodyConnectionPools> getConnectionPools() {
        return this.connectionPools;
    }

    public static class ListConnectionPoolsResponseBodyConnectionPools extends TeaModel {
        @NameInMap("ConnectionPoolId")
        public String connectionPoolId;

        @NameInMap("ConnectionPoolStatus")
        public String connectionPoolStatus;

        @NameInMap("ConnectionPoolName")
        public String connectionPoolName;

        @NameInMap("ConnectionPoolDescription")
        public String connectionPoolDescription;

        @NameInMap("Cidrs")
        public java.util.List<String> cidrs;

        public static ListConnectionPoolsResponseBodyConnectionPools build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionPoolsResponseBodyConnectionPools self = new ListConnectionPoolsResponseBodyConnectionPools();
            return TeaModel.build(map, self);
        }

        public ListConnectionPoolsResponseBodyConnectionPools setConnectionPoolId(String connectionPoolId) {
            this.connectionPoolId = connectionPoolId;
            return this;
        }
        public String getConnectionPoolId() {
            return this.connectionPoolId;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setConnectionPoolStatus(String connectionPoolStatus) {
            this.connectionPoolStatus = connectionPoolStatus;
            return this;
        }
        public String getConnectionPoolStatus() {
            return this.connectionPoolStatus;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setConnectionPoolName(String connectionPoolName) {
            this.connectionPoolName = connectionPoolName;
            return this;
        }
        public String getConnectionPoolName() {
            return this.connectionPoolName;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setConnectionPoolDescription(String connectionPoolDescription) {
            this.connectionPoolDescription = connectionPoolDescription;
            return this;
        }
        public String getConnectionPoolDescription() {
            return this.connectionPoolDescription;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setCidrs(java.util.List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public java.util.List<String> getCidrs() {
            return this.cidrs;
        }

    }

}
