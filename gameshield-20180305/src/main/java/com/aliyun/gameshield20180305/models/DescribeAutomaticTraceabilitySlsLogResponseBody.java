// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAutomaticTraceabilitySlsLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    public static DescribeAutomaticTraceabilitySlsLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomaticTraceabilitySlsLogResponseBody self = new DescribeAutomaticTraceabilitySlsLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutomaticTraceabilitySlsLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutomaticTraceabilitySlsLogResponseBody setStatistic(java.util.List<DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeAutomaticTraceabilitySlsLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic extends TeaModel {
        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("Time")
        public String time;

        @NameInMap("Token")
        public String token;

        @NameInMap("Point")
        public String point;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("SourceIpLocation")
        public String sourceIpLocation;

        public static DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic self = new DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeAutomaticTraceabilitySlsLogResponseBodyStatistic setSourceIpLocation(String sourceIpLocation) {
            this.sourceIpLocation = sourceIpLocation;
            return this;
        }
        public String getSourceIpLocation() {
            return this.sourceIpLocation;
        }

    }

}
