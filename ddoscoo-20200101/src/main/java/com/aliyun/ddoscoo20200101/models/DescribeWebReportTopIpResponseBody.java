// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebReportTopIpResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeWebReportTopIpResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>D21BE0C4-8E83-5E32-86C6-AA6BE9B1B5BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebReportTopIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebReportTopIpResponseBody self = new DescribeWebReportTopIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebReportTopIpResponseBody setDataList(java.util.List<DescribeWebReportTopIpResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeWebReportTopIpResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeWebReportTopIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebReportTopIpResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>90998690</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>100017</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>117.186.XX.XX</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        public static DescribeWebReportTopIpResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebReportTopIpResponseBodyDataList self = new DescribeWebReportTopIpResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeWebReportTopIpResponseBodyDataList setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public DescribeWebReportTopIpResponseBodyDataList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeWebReportTopIpResponseBodyDataList setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeWebReportTopIpResponseBodyDataList setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

    }

}
