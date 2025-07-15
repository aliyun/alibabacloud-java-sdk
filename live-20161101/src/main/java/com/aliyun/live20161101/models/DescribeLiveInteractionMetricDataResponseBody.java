// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveInteractionMetricDataResponseBody extends TeaModel {
    /**
     * <p>The node data.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<DescribeLiveInteractionMetricDataResponseBodyNodes> nodes;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A01C98C5-25AE-124A-83FE-514DF5C5BE36</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The summary data.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("SummaryData")
    public String summaryData;

    public static DescribeLiveInteractionMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveInteractionMetricDataResponseBody self = new DescribeLiveInteractionMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveInteractionMetricDataResponseBody setNodes(java.util.List<DescribeLiveInteractionMetricDataResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeLiveInteractionMetricDataResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeLiveInteractionMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveInteractionMetricDataResponseBody setSummaryData(String summaryData) {
        this.summaryData = summaryData;
        return this;
    }
    public String getSummaryData() {
        return this.summaryData;
    }

    public static class DescribeLiveInteractionMetricDataResponseBodyNodes extends TeaModel {
        /**
         * <p>The time when the metric was queried. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1548670257000</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>66.670000</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLiveInteractionMetricDataResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveInteractionMetricDataResponseBodyNodes self = new DescribeLiveInteractionMetricDataResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeLiveInteractionMetricDataResponseBodyNodes setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeLiveInteractionMetricDataResponseBodyNodes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
