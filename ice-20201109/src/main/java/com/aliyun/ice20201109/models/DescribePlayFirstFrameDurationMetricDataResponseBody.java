// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayFirstFrameDurationMetricDataResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribePlayFirstFrameDurationMetricDataResponseBodyNodes> nodes;

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
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static DescribePlayFirstFrameDurationMetricDataResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayFirstFrameDurationMetricDataResponseBodyNodes self = new DescribePlayFirstFrameDurationMetricDataResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribePlayFirstFrameDurationMetricDataResponseBodyNodes setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public DescribePlayFirstFrameDurationMetricDataResponseBodyNodes setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

}
