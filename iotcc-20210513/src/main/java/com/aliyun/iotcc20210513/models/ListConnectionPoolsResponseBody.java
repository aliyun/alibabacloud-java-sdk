// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListConnectionPoolsResponseBody extends TeaModel {
    @NameInMap("ConnectionPools")
    public java.util.List<ListConnectionPoolsResponseBodyConnectionPools> connectionPools;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListConnectionPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolsResponseBody self = new ListConnectionPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolsResponseBody setConnectionPools(java.util.List<ListConnectionPoolsResponseBodyConnectionPools> connectionPools) {
        this.connectionPools = connectionPools;
        return this;
    }
    public java.util.List<ListConnectionPoolsResponseBodyConnectionPools> getConnectionPools() {
        return this.connectionPools;
    }

    public ListConnectionPoolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public static class ListConnectionPoolsResponseBodyConnectionPools extends TeaModel {
        @NameInMap("Cidrs")
        public java.util.List<String> cidrs;

        @NameInMap("ConnectionPoolDescription")
        public String connectionPoolDescription;

        @NameInMap("ConnectionPoolId")
        public String connectionPoolId;

        @NameInMap("ConnectionPoolName")
        public String connectionPoolName;

        @NameInMap("ConnectionPoolStatus")
        public String connectionPoolStatus;

        @NameInMap("OperateResultRequestID")
        public String operateResultRequestID;

        public static ListConnectionPoolsResponseBodyConnectionPools build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionPoolsResponseBodyConnectionPools self = new ListConnectionPoolsResponseBodyConnectionPools();
            return TeaModel.build(map, self);
        }

        public ListConnectionPoolsResponseBodyConnectionPools setCidrs(java.util.List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public java.util.List<String> getCidrs() {
            return this.cidrs;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setConnectionPoolDescription(String connectionPoolDescription) {
            this.connectionPoolDescription = connectionPoolDescription;
            return this;
        }
        public String getConnectionPoolDescription() {
            return this.connectionPoolDescription;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setConnectionPoolId(String connectionPoolId) {
            this.connectionPoolId = connectionPoolId;
            return this;
        }
        public String getConnectionPoolId() {
            return this.connectionPoolId;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setConnectionPoolName(String connectionPoolName) {
            this.connectionPoolName = connectionPoolName;
            return this;
        }
        public String getConnectionPoolName() {
            return this.connectionPoolName;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setConnectionPoolStatus(String connectionPoolStatus) {
            this.connectionPoolStatus = connectionPoolStatus;
            return this;
        }
        public String getConnectionPoolStatus() {
            return this.connectionPoolStatus;
        }

        public ListConnectionPoolsResponseBodyConnectionPools setOperateResultRequestID(String operateResultRequestID) {
            this.operateResultRequestID = operateResultRequestID;
            return this;
        }
        public String getOperateResultRequestID() {
            return this.operateResultRequestID;
        }

    }

}
