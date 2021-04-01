// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeIpTrafficResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MaxInBps")
    @Validation(required = true)
    public Long maxInBps;

    @NameInMap("AvgInBps")
    @Validation(required = true)
    public Long avgInBps;

    @NameInMap("MaxOutBps")
    @Validation(required = true)
    public Long maxOutBps;

    @NameInMap("AvgOutBps")
    @Validation(required = true)
    public Long avgOutBps;

    @NameInMap("IpTrafficPoints")
    @Validation(required = true)
    public java.util.List<DescribeIpTrafficResponseIpTrafficPoints> ipTrafficPoints;

    public static DescribeIpTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpTrafficResponse self = new DescribeIpTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpTrafficResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpTrafficResponse setMaxInBps(Long maxInBps) {
        this.maxInBps = maxInBps;
        return this;
    }
    public Long getMaxInBps() {
        return this.maxInBps;
    }

    public DescribeIpTrafficResponse setAvgInBps(Long avgInBps) {
        this.avgInBps = avgInBps;
        return this;
    }
    public Long getAvgInBps() {
        return this.avgInBps;
    }

    public DescribeIpTrafficResponse setMaxOutBps(Long maxOutBps) {
        this.maxOutBps = maxOutBps;
        return this;
    }
    public Long getMaxOutBps() {
        return this.maxOutBps;
    }

    public DescribeIpTrafficResponse setAvgOutBps(Long avgOutBps) {
        this.avgOutBps = avgOutBps;
        return this;
    }
    public Long getAvgOutBps() {
        return this.avgOutBps;
    }

    public DescribeIpTrafficResponse setIpTrafficPoints(java.util.List<DescribeIpTrafficResponseIpTrafficPoints> ipTrafficPoints) {
        this.ipTrafficPoints = ipTrafficPoints;
        return this;
    }
    public java.util.List<DescribeIpTrafficResponseIpTrafficPoints> getIpTrafficPoints() {
        return this.ipTrafficPoints;
    }

    public static class DescribeIpTrafficResponseIpTrafficPoints extends TeaModel {
        @NameInMap("Time")
        @Validation(required = true)
        public Long time;

        @NameInMap("MaxInbps")
        @Validation(required = true)
        public Long maxInbps;

        @NameInMap("MaxOutbps")
        @Validation(required = true)
        public Long maxOutbps;

        @NameInMap("Cps")
        @Validation(required = true)
        public Integer cps;

        @NameInMap("ActConns")
        @Validation(required = true)
        public Integer actConns;

        @NameInMap("InactConns")
        @Validation(required = true)
        public Integer inactConns;

        public static DescribeIpTrafficResponseIpTrafficPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpTrafficResponseIpTrafficPoints self = new DescribeIpTrafficResponseIpTrafficPoints();
            return TeaModel.build(map, self);
        }

        public DescribeIpTrafficResponseIpTrafficPoints setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeIpTrafficResponseIpTrafficPoints setMaxInbps(Long maxInbps) {
            this.maxInbps = maxInbps;
            return this;
        }
        public Long getMaxInbps() {
            return this.maxInbps;
        }

        public DescribeIpTrafficResponseIpTrafficPoints setMaxOutbps(Long maxOutbps) {
            this.maxOutbps = maxOutbps;
            return this;
        }
        public Long getMaxOutbps() {
            return this.maxOutbps;
        }

        public DescribeIpTrafficResponseIpTrafficPoints setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeIpTrafficResponseIpTrafficPoints setActConns(Integer actConns) {
            this.actConns = actConns;
            return this;
        }
        public Integer getActConns() {
            return this.actConns;
        }

        public DescribeIpTrafficResponseIpTrafficPoints setInactConns(Integer inactConns) {
            this.inactConns = inactConns;
            return this;
        }
        public Integer getInactConns() {
            return this.inactConns;
        }

    }

}
