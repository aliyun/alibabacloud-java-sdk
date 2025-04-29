// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeMetricDataResponseBody extends TeaModel {
    /**
     * <p>The disk monitoring data.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeMetricDataResponseBodyDataList> dataList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11B55F58-D3A4-4A9B-9596-342420D0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of data entries queried.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Warnings")
    public java.util.List<String> warnings;

    public static DescribeMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDataResponseBody self = new DescribeMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricDataResponseBody setDataList(java.util.List<DescribeMetricDataResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeMetricDataResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricDataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeMetricDataResponseBody setWarnings(java.util.List<String> warnings) {
        this.warnings = warnings;
        return this;
    }
    public java.util.List<String> getWarnings() {
        return this.warnings;
    }

    public static class DescribeMetricDataResponseBodyDataList extends TeaModel {
        /**
         * <p>The datapoints that consist of consecutive timestamps in seconds and metric values that were recorded at these time points.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;1699258861&quot;: 1,
         *         &quot;1699259461&quot;: 0,
         *         &quot;1699260061&quot;: 0,
         *         &quot;1699260661&quot;: 0,
         *         &quot;1699261261&quot;: 0,
         *         &quot;1699261861&quot;: 0,
         *         &quot;1699262461&quot;: 0,
         *         &quot;1699263061&quot;: 0,
         *         &quot;1699263661&quot;: 0,
         *         &quot;1699264261&quot;: 0,
         *         &quot;1699264861&quot;: 0
         * }</p>
         */
        @NameInMap("Datapoints")
        public Object datapoints;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DiskId&quot;: &quot;d-1234&quot;}</p>
         */
        @NameInMap("Labels")
        public Object labels;

        public static DescribeMetricDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricDataResponseBodyDataList self = new DescribeMetricDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricDataResponseBodyDataList setDatapoints(Object datapoints) {
            this.datapoints = datapoints;
            return this;
        }
        public Object getDatapoints() {
            return this.datapoints;
        }

        public DescribeMetricDataResponseBodyDataList setLabels(Object labels) {
            this.labels = labels;
            return this;
        }
        public Object getLabels() {
            return this.labels;
        }

    }

}
