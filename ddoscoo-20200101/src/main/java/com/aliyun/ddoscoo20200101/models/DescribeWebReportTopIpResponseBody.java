// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebReportTopIpResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeWebReportTopIpResponseBodyDataList> dataList;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The ID of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>90998690</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The Internet service provider (ISP) for the attack. Valid values:</p>
         * <ul>
         * <li><strong>100017</strong>: China Telecom</li>
         * <li><strong>100026</strong>: China Unicom</li>
         * <li><strong>100025</strong>: China Mobile</li>
         * <li><strong>100027</strong>: China Education and Research Network</li>
         * <li><strong>100020</strong>: China Mobile Tietong</li>
         * <li><strong>1000143</strong>: Dr.Peng Telecom &amp; Media Group</li>
         * <li><strong>100080</strong>: Beijing Gehua CATV Network</li>
         * <li><strong>1000139</strong>: National Radio and Television Administration</li>
         * <li><strong>100023</strong>: Oriental Cable Network</li>
         * <li><strong>100063</strong>: Founder Broadband</li>
         * <li><strong>1000337</strong>: China Internet Exchange</li>
         * <li><strong>100021</strong>: 21Vianet Group</li>
         * <li><strong>1000333</strong>: Wasu Media Holding</li>
         * <li><strong>100093</strong>: Wangsu Science &amp; Technology</li>
         * <li><strong>1000401</strong>: Tencent</li>
         * <li><strong>100099</strong>: Baidu</li>
         * <li><strong>1000323</strong>: Alibaba Cloud</li>
         * <li><strong>100098</strong>: Alibaba</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100017</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The source IP address.</p>
         * 
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
