// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayMetricDataResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribePlayMetricDataResponseBodyNodes> nodes;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlayMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayMetricDataResponseBody self = new DescribePlayMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayMetricDataResponseBody setNodes(java.util.List<DescribePlayMetricDataResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribePlayMetricDataResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribePlayMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlayMetricDataResponseBodyNodes extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static DescribePlayMetricDataResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayMetricDataResponseBodyNodes self = new DescribePlayMetricDataResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribePlayMetricDataResponseBodyNodes setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public DescribePlayMetricDataResponseBodyNodes setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

}
