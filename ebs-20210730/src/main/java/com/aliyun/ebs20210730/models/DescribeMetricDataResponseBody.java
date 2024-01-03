// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeMetricDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeMetricDataResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public static class DescribeMetricDataResponseBodyDataList extends TeaModel {
        @NameInMap("Datapoints")
        public Object datapoints;

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
