// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenServiceResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeInternetOpenServiceResponseBodyDataList> dataList;

    @NameInMap("PageInfo")
    public DescribeInternetOpenServiceResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>99A65AA0-C5B5-5092-BFCF-8111B436****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInternetOpenServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenServiceResponseBody self = new DescribeInternetOpenServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenServiceResponseBody setDataList(java.util.List<DescribeInternetOpenServiceResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetOpenServiceResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetOpenServiceResponseBody setPageInfo(DescribeInternetOpenServiceResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInternetOpenServiceResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInternetOpenServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInternetOpenServiceResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DetailNum")
        public Integer detailNum;

        /**
         * <strong>example:</strong>
         * <p>447458.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        @NameInMap("PortList")
        public java.util.List<String> portList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProbRisk")
        public String probRisk;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProbRiskDesc")
        public String probRiskDesc;

        /**
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PublicIpNum")
        public Integer publicIpNum;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RiskReason")
        public String riskReason;

        /**
         * <strong>example:</strong>
         * <p>SMB</p>
         */
        @NameInMap("ServiceName")
        public Integer serviceName;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SuggestLevel")
        public Integer suggestLevel;

        /**
         * <strong>example:</strong>
         * <p>621404</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TrafficPercent1Day")
        public String trafficPercent1Day;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TrafficPercent30Day")
        public String trafficPercent30Day;

        /**
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("TrafficPercent7Day")
        public String trafficPercent7Day;

        @NameInMap("UnknownReason")
        public java.util.List<String> unknownReason;

        public static DescribeInternetOpenServiceResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenServiceResponseBodyDataList self = new DescribeInternetOpenServiceResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenServiceResponseBodyDataList setDetailNum(Integer detailNum) {
            this.detailNum = detailNum;
            return this;
        }
        public Integer getDetailNum() {
            return this.detailNum;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setPortList(java.util.List<String> portList) {
            this.portList = portList;
            return this;
        }
        public java.util.List<String> getPortList() {
            return this.portList;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setProbRisk(String probRisk) {
            this.probRisk = probRisk;
            return this;
        }
        public String getProbRisk() {
            return this.probRisk;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setProbRiskDesc(String probRiskDesc) {
            this.probRiskDesc = probRiskDesc;
            return this;
        }
        public String getProbRiskDesc() {
            return this.probRiskDesc;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setPublicIpNum(Integer publicIpNum) {
            this.publicIpNum = publicIpNum;
            return this;
        }
        public Integer getPublicIpNum() {
            return this.publicIpNum;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setRiskReason(String riskReason) {
            this.riskReason = riskReason;
            return this;
        }
        public String getRiskReason() {
            return this.riskReason;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setServiceName(Integer serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Integer getServiceName() {
            return this.serviceName;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setSuggestLevel(Integer suggestLevel) {
            this.suggestLevel = suggestLevel;
            return this;
        }
        public Integer getSuggestLevel() {
            return this.suggestLevel;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setTrafficPercent1Day(String trafficPercent1Day) {
            this.trafficPercent1Day = trafficPercent1Day;
            return this;
        }
        public String getTrafficPercent1Day() {
            return this.trafficPercent1Day;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setTrafficPercent30Day(String trafficPercent30Day) {
            this.trafficPercent30Day = trafficPercent30Day;
            return this;
        }
        public String getTrafficPercent30Day() {
            return this.trafficPercent30Day;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setTrafficPercent7Day(String trafficPercent7Day) {
            this.trafficPercent7Day = trafficPercent7Day;
            return this;
        }
        public String getTrafficPercent7Day() {
            return this.trafficPercent7Day;
        }

        public DescribeInternetOpenServiceResponseBodyDataList setUnknownReason(java.util.List<String> unknownReason) {
            this.unknownReason = unknownReason;
            return this;
        }
        public java.util.List<String> getUnknownReason() {
            return this.unknownReason;
        }

    }

    public static class DescribeInternetOpenServiceResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInternetOpenServiceResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenServiceResponseBodyPageInfo self = new DescribeInternetOpenServiceResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenServiceResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInternetOpenServiceResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInternetOpenServiceResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
