// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiLatencyResponseBody extends TeaModel {
    @NameInMap("Latencys")
    public DescribeApiLatencyResponseBodyLatencys latencys;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApiLatencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiLatencyResponseBody self = new DescribeApiLatencyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiLatencyResponseBody setLatencys(DescribeApiLatencyResponseBodyLatencys latencys) {
        this.latencys = latencys;
        return this;
    }
    public DescribeApiLatencyResponseBodyLatencys getLatencys() {
        return this.latencys;
    }

    public DescribeApiLatencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApiLatencyResponseBodyLatencysLatency extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static DescribeApiLatencyResponseBodyLatencysLatency build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiLatencyResponseBodyLatencysLatency self = new DescribeApiLatencyResponseBodyLatencysLatency();
            return TeaModel.build(map, self);
        }

        public DescribeApiLatencyResponseBodyLatencysLatency setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeApiLatencyResponseBodyLatencysLatency setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApiLatencyResponseBodyLatencys extends TeaModel {
        @NameInMap("Latency")
        public java.util.List<DescribeApiLatencyResponseBodyLatencysLatency> latency;

        public static DescribeApiLatencyResponseBodyLatencys build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiLatencyResponseBodyLatencys self = new DescribeApiLatencyResponseBodyLatencys();
            return TeaModel.build(map, self);
        }

        public DescribeApiLatencyResponseBodyLatencys setLatency(java.util.List<DescribeApiLatencyResponseBodyLatencysLatency> latency) {
            this.latency = latency;
            return this;
        }
        public java.util.List<DescribeApiLatencyResponseBodyLatencysLatency> getLatency() {
            return this.latency;
        }

    }

}
