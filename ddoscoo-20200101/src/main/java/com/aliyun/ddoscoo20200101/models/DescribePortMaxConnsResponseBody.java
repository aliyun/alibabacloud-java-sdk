// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortMaxConnsResponseBody extends TeaModel {
    /**
     * <p>An array consisting of the details of the maximum number of connections that are established over a port of the instance.</p>
     */
    @NameInMap("PortMaxConns")
    public java.util.List<DescribePortMaxConnsResponseBodyPortMaxConns> portMaxConns;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>08F79110-2AF5-4FA7-998E-7C5E75EACF9C</p>
     */
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
        /**
         * <p>The maximum number of connections per second (CPS).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Cps")
        public Long cps;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.<em><strong>.</strong></em>.117</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
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
