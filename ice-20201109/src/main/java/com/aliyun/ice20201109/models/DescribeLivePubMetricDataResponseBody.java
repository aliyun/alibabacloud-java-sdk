// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubMetricDataResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribeLivePubMetricDataResponseBodyNodes> nodes;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLivePubMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubMetricDataResponseBody self = new DescribeLivePubMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubMetricDataResponseBody setNodes(java.util.List<DescribeLivePubMetricDataResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeLivePubMetricDataResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeLivePubMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLivePubMetricDataResponseBodyNodes extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Time")
        public Long time;

        public static DescribeLivePubMetricDataResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePubMetricDataResponseBodyNodes self = new DescribeLivePubMetricDataResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeLivePubMetricDataResponseBodyNodes setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeLivePubMetricDataResponseBodyNodes setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
