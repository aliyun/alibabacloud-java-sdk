// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayFirstFrameDurationMetricDataResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribePlayFirstFrameDurationMetricDataResponseBodyNodes> nodes;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlayFirstFrameDurationMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayFirstFrameDurationMetricDataResponseBody self = new DescribePlayFirstFrameDurationMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayFirstFrameDurationMetricDataResponseBody setNodes(java.util.List<DescribePlayFirstFrameDurationMetricDataResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribePlayFirstFrameDurationMetricDataResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribePlayFirstFrameDurationMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlayFirstFrameDurationMetricDataResponseBodyNodes extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Time")
        public Long time;

        public static DescribePlayFirstFrameDurationMetricDataResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayFirstFrameDurationMetricDataResponseBodyNodes self = new DescribePlayFirstFrameDurationMetricDataResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribePlayFirstFrameDurationMetricDataResponseBodyNodes setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribePlayFirstFrameDurationMetricDataResponseBodyNodes setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
