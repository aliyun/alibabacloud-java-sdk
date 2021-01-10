// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeMetricDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Datapoints")
    public java.util.List<DescribeMetricDetailResponseBodyDatapoints> datapoints;

    public static DescribeMetricDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDetailResponseBody self = new DescribeMetricDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricDetailResponseBody setDatapoints(java.util.List<DescribeMetricDetailResponseBodyDatapoints> datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public java.util.List<DescribeMetricDetailResponseBodyDatapoints> getDatapoints() {
        return this.datapoints;
    }

    public static class DescribeMetricDetailResponseBodyDatapoints extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMetricDetailResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricDetailResponseBodyDatapoints self = new DescribeMetricDetailResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public DescribeMetricDetailResponseBodyDatapoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeMetricDetailResponseBodyDatapoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
