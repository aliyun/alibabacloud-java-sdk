// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeBizFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeBizFlowResponseBodyData data;

    public static DescribeBizFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizFlowResponseBody self = new DescribeBizFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBizFlowResponseBody setData(DescribeBizFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBizFlowResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeBizFlowResponseBodyDataTimeScope extends TeaModel {
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Interval")
        public Integer interval;

        public static DescribeBizFlowResponseBodyDataTimeScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizFlowResponseBodyDataTimeScope self = new DescribeBizFlowResponseBodyDataTimeScope();
            return TeaModel.build(map, self);
        }

        public DescribeBizFlowResponseBodyDataTimeScope setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeBizFlowResponseBodyDataTimeScope setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

    }

    public static class DescribeBizFlowResponseBodyData extends TeaModel {
        @NameInMap("InKbps")
        public java.util.List<String> inKbps;

        @NameInMap("OutKbps")
        public java.util.List<String> outKbps;

        @NameInMap("TimeScope")
        public DescribeBizFlowResponseBodyDataTimeScope timeScope;

        public static DescribeBizFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizFlowResponseBodyData self = new DescribeBizFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBizFlowResponseBodyData setInKbps(java.util.List<String> inKbps) {
            this.inKbps = inKbps;
            return this;
        }
        public java.util.List<String> getInKbps() {
            return this.inKbps;
        }

        public DescribeBizFlowResponseBodyData setOutKbps(java.util.List<String> outKbps) {
            this.outKbps = outKbps;
            return this;
        }
        public java.util.List<String> getOutKbps() {
            return this.outKbps;
        }

        public DescribeBizFlowResponseBodyData setTimeScope(DescribeBizFlowResponseBodyDataTimeScope timeScope) {
            this.timeScope = timeScope;
            return this;
        }
        public DescribeBizFlowResponseBodyDataTimeScope getTimeScope() {
            return this.timeScope;
        }

    }

}
