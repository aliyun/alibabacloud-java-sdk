// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenPortResponseBody extends TeaModel {
    /**
     * <p>The list of returned data.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeInternetOpenPortResponseBodyDataList> dataList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeInternetOpenPortResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F3637663-991B-547F-9163-1A5AC367****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInternetOpenPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenPortResponseBody self = new DescribeInternetOpenPortResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenPortResponseBody setDataList(java.util.List<DescribeInternetOpenPortResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetOpenPortResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetOpenPortResponseBody setPageInfo(DescribeInternetOpenPortResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInternetOpenPortResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInternetOpenPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInternetOpenPortResponseBodyDataList extends TeaModel {
        /**
         * <p>The number of details.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DetailNum")
        public Integer detailNum;

        /**
         * <p>The inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>1456536639.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>The outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>117200.0</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The open port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The security threat.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProbRisk")
        public String probRisk;

        /**
         * <p>The description of the security threat.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("ProbRiskDesc")
        public String probRiskDesc;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The number of public IP addresses that have the port open.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PublicIpNum")
        public Integer publicIpNum;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The description of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RiskReason")
        public String riskReason;

        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("ServiceNameList")
        public java.util.List<String> serviceNameList;

        /**
         * <p>The recommended policy level.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SuggestLevel")
        public Integer suggestLevel;

        /**
         * <p>The total traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>621404</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        /**
         * <p>The percentage of traffic in the last 24 hours. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TrafficPercent1Day")
        public String trafficPercent1Day;

        /**
         * <p>The percentage of traffic in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("TrafficPercent30Day")
        public String trafficPercent30Day;

        /**
         * <p>The percentage of traffic in the last 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TrafficPercent7Day")
        public String trafficPercent7Day;

        /**
         * <p>The reason why the protocol is not identified when the protocol is detected as Unknown.</p>
         */
        @NameInMap("UnknownReason")
        public java.util.List<String> unknownReason;

        public static DescribeInternetOpenPortResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenPortResponseBodyDataList self = new DescribeInternetOpenPortResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenPortResponseBodyDataList setDetailNum(Integer detailNum) {
            this.detailNum = detailNum;
            return this;
        }
        public Integer getDetailNum() {
            return this.detailNum;
        }

        public DescribeInternetOpenPortResponseBodyDataList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeInternetOpenPortResponseBodyDataList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeInternetOpenPortResponseBodyDataList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeInternetOpenPortResponseBodyDataList setProbRisk(String probRisk) {
            this.probRisk = probRisk;
            return this;
        }
        public String getProbRisk() {
            return this.probRisk;
        }

        public DescribeInternetOpenPortResponseBodyDataList setProbRiskDesc(String probRiskDesc) {
            this.probRiskDesc = probRiskDesc;
            return this;
        }
        public String getProbRiskDesc() {
            return this.probRiskDesc;
        }

        public DescribeInternetOpenPortResponseBodyDataList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeInternetOpenPortResponseBodyDataList setPublicIpNum(Integer publicIpNum) {
            this.publicIpNum = publicIpNum;
            return this;
        }
        public Integer getPublicIpNum() {
            return this.publicIpNum;
        }

        public DescribeInternetOpenPortResponseBodyDataList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeInternetOpenPortResponseBodyDataList setRiskReason(String riskReason) {
            this.riskReason = riskReason;
            return this;
        }
        public String getRiskReason() {
            return this.riskReason;
        }

        public DescribeInternetOpenPortResponseBodyDataList setServiceNameList(java.util.List<String> serviceNameList) {
            this.serviceNameList = serviceNameList;
            return this;
        }
        public java.util.List<String> getServiceNameList() {
            return this.serviceNameList;
        }

        public DescribeInternetOpenPortResponseBodyDataList setSuggestLevel(Integer suggestLevel) {
            this.suggestLevel = suggestLevel;
            return this;
        }
        public Integer getSuggestLevel() {
            return this.suggestLevel;
        }

        public DescribeInternetOpenPortResponseBodyDataList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeInternetOpenPortResponseBodyDataList setTrafficPercent1Day(String trafficPercent1Day) {
            this.trafficPercent1Day = trafficPercent1Day;
            return this;
        }
        public String getTrafficPercent1Day() {
            return this.trafficPercent1Day;
        }

        public DescribeInternetOpenPortResponseBodyDataList setTrafficPercent30Day(String trafficPercent30Day) {
            this.trafficPercent30Day = trafficPercent30Day;
            return this;
        }
        public String getTrafficPercent30Day() {
            return this.trafficPercent30Day;
        }

        public DescribeInternetOpenPortResponseBodyDataList setTrafficPercent7Day(String trafficPercent7Day) {
            this.trafficPercent7Day = trafficPercent7Day;
            return this;
        }
        public String getTrafficPercent7Day() {
            return this.trafficPercent7Day;
        }

        public DescribeInternetOpenPortResponseBodyDataList setUnknownReason(java.util.List<String> unknownReason) {
            this.unknownReason = unknownReason;
            return this;
        }
        public java.util.List<String> getUnknownReason() {
            return this.unknownReason;
        }

    }

    public static class DescribeInternetOpenPortResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInternetOpenPortResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenPortResponseBodyPageInfo self = new DescribeInternetOpenPortResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenPortResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInternetOpenPortResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInternetOpenPortResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
