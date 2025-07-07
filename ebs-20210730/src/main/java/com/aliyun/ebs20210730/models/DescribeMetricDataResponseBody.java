// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeMetricDataResponseBody extends TeaModel {
    /**
     * <p>Collection of monitoring data for the cloud disk.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeMetricDataResponseBodyDataList> dataList;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11B55F58-D3A4-4A9B-9596-342420D0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of data points queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>List of warning messages.</p>
     */
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
         * <p>List of monitoring data, consisting of a series of consecutive second-level timestamps and the corresponding metric values at those times.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;1699258861&quot;: 1,&quot;1699259461&quot;: 0}</p>
         */
        @NameInMap("Datapoints")
        public Object datapoints;

        /**
         * <p>Labels.</p>
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
