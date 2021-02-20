// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortMaxConnsResponseBody extends TeaModel {
    @NameInMap("PortMaxConns")
    public java.util.List<DescribePortMaxConnsResponseBodyPortMaxConns> portMaxConns;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortMaxConnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortMaxConnsResponseBody self = new DescribePortMaxConnsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortMaxConnsResponseBody setPortMaxConns(java.util.List<DescribePortMaxConnsResponseBodyPortMaxConns> portMaxConns) {
        this.portMaxConns = portMaxConns;
        return this;
    }
    public java.util.List<DescribePortMaxConnsResponseBodyPortMaxConns> getPortMaxConns() {
        return this.portMaxConns;
    }

    public DescribePortMaxConnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortMaxConnsResponseBodyPortMaxConns extends TeaModel {
        @NameInMap("Cps")
        public Long cps;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        public static DescribePortMaxConnsResponseBodyPortMaxConns build(java.util.Map<String, ?> map) throws Exception {
            DescribePortMaxConnsResponseBodyPortMaxConns self = new DescribePortMaxConnsResponseBodyPortMaxConns();
            return TeaModel.build(map, self);
        }

        public DescribePortMaxConnsResponseBodyPortMaxConns setCps(Long cps) {
            this.cps = cps;
            return this;
        }
        public Long getCps() {
            return this.cps;
        }

        public DescribePortMaxConnsResponseBodyPortMaxConns setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePortMaxConnsResponseBodyPortMaxConns setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
