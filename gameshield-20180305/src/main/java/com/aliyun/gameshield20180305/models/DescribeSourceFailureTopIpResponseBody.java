// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSourceFailureTopIpResponseBody extends TeaModel {
    @NameInMap("TopIps")
    public java.util.List<DescribeSourceFailureTopIpResponseBodyTopIps> topIps;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSourceFailureTopIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceFailureTopIpResponseBody self = new DescribeSourceFailureTopIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSourceFailureTopIpResponseBody setTopIps(java.util.List<DescribeSourceFailureTopIpResponseBodyTopIps> topIps) {
        this.topIps = topIps;
        return this;
    }
    public java.util.List<DescribeSourceFailureTopIpResponseBodyTopIps> getTopIps() {
        return this.topIps;
    }

    public DescribeSourceFailureTopIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSourceFailureTopIpResponseBodyTopIps extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public Long port;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeSourceFailureTopIpResponseBodyTopIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceFailureTopIpResponseBodyTopIps self = new DescribeSourceFailureTopIpResponseBodyTopIps();
            return TeaModel.build(map, self);
        }

        public DescribeSourceFailureTopIpResponseBodyTopIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeSourceFailureTopIpResponseBodyTopIps setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeSourceFailureTopIpResponseBodyTopIps setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
