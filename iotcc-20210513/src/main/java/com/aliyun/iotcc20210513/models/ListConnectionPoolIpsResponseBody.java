// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListConnectionPoolIpsResponseBody extends TeaModel {
    @NameInMap("ConnectionPoolIps")
    public java.util.List<ListConnectionPoolIpsResponseBodyConnectionPoolIps> connectionPoolIps;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListConnectionPoolIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolIpsResponseBody self = new ListConnectionPoolIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolIpsResponseBody setConnectionPoolIps(java.util.List<ListConnectionPoolIpsResponseBodyConnectionPoolIps> connectionPoolIps) {
        this.connectionPoolIps = connectionPoolIps;
        return this;
    }
    public java.util.List<ListConnectionPoolIpsResponseBodyConnectionPoolIps> getConnectionPoolIps() {
        return this.connectionPoolIps;
    }

    public ListConnectionPoolIpsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionPoolIpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectionPoolIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionPoolIpsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListConnectionPoolIpsResponseBodyConnectionPoolIps extends TeaModel {
        @NameInMap("ConnectionPoolId")
        public String connectionPoolId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Status")
        public String status;

        public static ListConnectionPoolIpsResponseBodyConnectionPoolIps build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionPoolIpsResponseBodyConnectionPoolIps self = new ListConnectionPoolIpsResponseBodyConnectionPoolIps();
            return TeaModel.build(map, self);
        }

        public ListConnectionPoolIpsResponseBodyConnectionPoolIps setConnectionPoolId(String connectionPoolId) {
            this.connectionPoolId = connectionPoolId;
            return this;
        }
        public String getConnectionPoolId() {
            return this.connectionPoolId;
        }

        public ListConnectionPoolIpsResponseBodyConnectionPoolIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListConnectionPoolIpsResponseBodyConnectionPoolIps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
