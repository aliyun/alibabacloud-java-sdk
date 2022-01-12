// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListConnectionPoolAllIpsResponseBody extends TeaModel {
    @NameInMap("ConnectionPoolIps")
    public java.util.List<ListConnectionPoolAllIpsResponseBodyConnectionPoolIps> connectionPoolIps;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalIpsCount")
    public Integer totalIpsCount;

    public static ListConnectionPoolAllIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolAllIpsResponseBody self = new ListConnectionPoolAllIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolAllIpsResponseBody setConnectionPoolIps(java.util.List<ListConnectionPoolAllIpsResponseBodyConnectionPoolIps> connectionPoolIps) {
        this.connectionPoolIps = connectionPoolIps;
        return this;
    }
    public java.util.List<ListConnectionPoolAllIpsResponseBodyConnectionPoolIps> getConnectionPoolIps() {
        return this.connectionPoolIps;
    }

    public ListConnectionPoolAllIpsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionPoolAllIpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectionPoolAllIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionPoolAllIpsResponseBody setTotalIpsCount(Integer totalIpsCount) {
        this.totalIpsCount = totalIpsCount;
        return this;
    }
    public Integer getTotalIpsCount() {
        return this.totalIpsCount;
    }

    public static class ListConnectionPoolAllIpsResponseBodyConnectionPoolIps extends TeaModel {
        @NameInMap("ConnectionPoolId")
        public String connectionPoolId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("IpNum")
        public Long ipNum;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListConnectionPoolAllIpsResponseBodyConnectionPoolIps build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionPoolAllIpsResponseBodyConnectionPoolIps self = new ListConnectionPoolAllIpsResponseBodyConnectionPoolIps();
            return TeaModel.build(map, self);
        }

        public ListConnectionPoolAllIpsResponseBodyConnectionPoolIps setConnectionPoolId(String connectionPoolId) {
            this.connectionPoolId = connectionPoolId;
            return this;
        }
        public String getConnectionPoolId() {
            return this.connectionPoolId;
        }

        public ListConnectionPoolAllIpsResponseBodyConnectionPoolIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListConnectionPoolAllIpsResponseBodyConnectionPoolIps setIpNum(Long ipNum) {
            this.ipNum = ipNum;
            return this;
        }
        public Long getIpNum() {
            return this.ipNum;
        }

        public ListConnectionPoolAllIpsResponseBodyConnectionPoolIps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListConnectionPoolAllIpsResponseBodyConnectionPoolIps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
