// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLiveSubMetricDataResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribeLiveSubMetricDataResponseBodyNodes> nodes;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveSubMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSubMetricDataResponseBody self = new DescribeLiveSubMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSubMetricDataResponseBody setNodes(java.util.List<DescribeLiveSubMetricDataResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeLiveSubMetricDataResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeLiveSubMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveSubMetricDataResponseBodyNodes extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Time")
        public Long time;

        public static DescribeLiveSubMetricDataResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSubMetricDataResponseBodyNodes self = new DescribeLiveSubMetricDataResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSubMetricDataResponseBodyNodes setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeLiveSubMetricDataResponseBodyNodes setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
