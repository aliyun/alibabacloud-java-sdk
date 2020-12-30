// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeIpTrafficResponseBody extends TeaModel {
    @NameInMap("MaxOutBps")
    public Long maxOutBps;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvgInBps")
    public Long avgInBps;

    @NameInMap("MaxInBps")
    public Long maxInBps;

    @NameInMap("AvgOutBps")
    public Long avgOutBps;

    @NameInMap("IpTrafficPoints")
    public java.util.List<DescribeIpTrafficResponseBodyIpTrafficPoints> ipTrafficPoints;

    public static DescribeIpTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpTrafficResponseBody self = new DescribeIpTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpTrafficResponseBody setMaxOutBps(Long maxOutBps) {
        this.maxOutBps = maxOutBps;
        return this;
    }
    public Long getMaxOutBps() {
        return this.maxOutBps;
    }

    public DescribeIpTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpTrafficResponseBody setAvgInBps(Long avgInBps) {
        this.avgInBps = avgInBps;
        return this;
    }
    public Long getAvgInBps() {
        return this.avgInBps;
    }

    public DescribeIpTrafficResponseBody setMaxInBps(Long maxInBps) {
        this.maxInBps = maxInBps;
        return this;
    }
    public Long getMaxInBps() {
        return this.maxInBps;
    }

    public DescribeIpTrafficResponseBody setAvgOutBps(Long avgOutBps) {
        this.avgOutBps = avgOutBps;
        return this;
    }
    public Long getAvgOutBps() {
        return this.avgOutBps;
    }

    public DescribeIpTrafficResponseBody setIpTrafficPoints(java.util.List<DescribeIpTrafficResponseBodyIpTrafficPoints> ipTrafficPoints) {
        this.ipTrafficPoints = ipTrafficPoints;
        return this;
    }
    public java.util.List<DescribeIpTrafficResponseBodyIpTrafficPoints> getIpTrafficPoints() {
        return this.ipTrafficPoints;
    }

    public static class DescribeIpTrafficResponseBodyIpTrafficPoints extends TeaModel {
        @NameInMap("ActConns")
        public Integer actConns;

        @NameInMap("Time")
        public Long time;

        @NameInMap("InactConns")
        public Integer inactConns;

        @NameInMap("MaxInbps")
        public Long maxInbps;

        @NameInMap("MaxOutbps")
        public Long maxOutbps;

        @NameInMap("Cps")
        public Integer cps;

        public static DescribeIpTrafficResponseBodyIpTrafficPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpTrafficResponseBodyIpTrafficPoints self = new DescribeIpTrafficResponseBodyIpTrafficPoints();
            return TeaModel.build(map, self);
        }

        public DescribeIpTrafficResponseBodyIpTrafficPoints setActConns(Integer actConns) {
            this.actConns = actConns;
            return this;
        }
        public Integer getActConns() {
            return this.actConns;
        }

        public DescribeIpTrafficResponseBodyIpTrafficPoints setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeIpTrafficResponseBodyIpTrafficPoints setInactConns(Integer inactConns) {
            this.inactConns = inactConns;
            return this;
        }
        public Integer getInactConns() {
            return this.inactConns;
        }

        public DescribeIpTrafficResponseBodyIpTrafficPoints setMaxInbps(Long maxInbps) {
            this.maxInbps = maxInbps;
            return this;
        }
        public Long getMaxInbps() {
            return this.maxInbps;
        }

        public DescribeIpTrafficResponseBodyIpTrafficPoints setMaxOutbps(Long maxOutbps) {
            this.maxOutbps = maxOutbps;
            return this;
        }
        public Long getMaxOutbps() {
            return this.maxOutbps;
        }

        public DescribeIpTrafficResponseBodyIpTrafficPoints setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

    }

}
