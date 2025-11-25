// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenDetailResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeInternetOpenDetailResponseBodyDataList> dataList;

    @NameInMap("PageInfo")
    public DescribeInternetOpenDetailResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>3495E758-BB4B-5F5C-8AE0-897489F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInternetOpenDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenDetailResponseBody self = new DescribeInternetOpenDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenDetailResponseBody setDataList(java.util.List<DescribeInternetOpenDetailResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetOpenDetailResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetOpenDetailResponseBody setPageInfo(DescribeInternetOpenDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInternetOpenDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInternetOpenDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInternetOpenDetailResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-bp1ix9w22kv6aew9****</p>
         */
        @NameInMap("AssetsInstanceId")
        public String assetsInstanceId;

        /**
         * <strong>example:</strong>
         * <p>launch-advisor-2023****</p>
         */
        @NameInMap("AssetsName")
        public String assetsName;

        /**
         * <strong>example:</strong>
         * <p>EcsEIP</p>
         */
        @NameInMap("AssetsType")
        public String assetsType;

        /**
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <strong>example:</strong>
         * <p>3389</p>
         */
        @NameInMap("Port")
        public Integer port;

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
         * <p>39.101.167.XX</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

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
         * <p>Redis</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SuggestLevel")
        public Integer suggestLevel;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TrafficPercent1Day")
        public String trafficPercent1Day;

        /**
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("TrafficPercent30Day")
        public String trafficPercent30Day;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TrafficPercent7Day")
        public String trafficPercent7Day;

        @NameInMap("UnknownReason")
        public java.util.List<String> unknownReason;

        public static DescribeInternetOpenDetailResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenDetailResponseBodyDataList self = new DescribeInternetOpenDetailResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenDetailResponseBodyDataList setAssetsInstanceId(String assetsInstanceId) {
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }
        public String getAssetsInstanceId() {
            return this.assetsInstanceId;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setAssetsName(String assetsName) {
            this.assetsName = assetsName;
            return this;
        }
        public String getAssetsName() {
            return this.assetsName;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setAssetsType(String assetsType) {
            this.assetsType = assetsType;
            return this;
        }
        public String getAssetsType() {
            return this.assetsType;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setProbRisk(String probRisk) {
            this.probRisk = probRisk;
            return this;
        }
        public String getProbRisk() {
            return this.probRisk;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setProbRiskDesc(String probRiskDesc) {
            this.probRiskDesc = probRiskDesc;
            return this;
        }
        public String getProbRiskDesc() {
            return this.probRiskDesc;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setRiskReason(String riskReason) {
            this.riskReason = riskReason;
            return this;
        }
        public String getRiskReason() {
            return this.riskReason;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setSuggestLevel(Integer suggestLevel) {
            this.suggestLevel = suggestLevel;
            return this;
        }
        public Integer getSuggestLevel() {
            return this.suggestLevel;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setTrafficPercent1Day(String trafficPercent1Day) {
            this.trafficPercent1Day = trafficPercent1Day;
            return this;
        }
        public String getTrafficPercent1Day() {
            return this.trafficPercent1Day;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setTrafficPercent30Day(String trafficPercent30Day) {
            this.trafficPercent30Day = trafficPercent30Day;
            return this;
        }
        public String getTrafficPercent30Day() {
            return this.trafficPercent30Day;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setTrafficPercent7Day(String trafficPercent7Day) {
            this.trafficPercent7Day = trafficPercent7Day;
            return this;
        }
        public String getTrafficPercent7Day() {
            return this.trafficPercent7Day;
        }

        public DescribeInternetOpenDetailResponseBodyDataList setUnknownReason(java.util.List<String> unknownReason) {
            this.unknownReason = unknownReason;
            return this;
        }
        public java.util.List<String> getUnknownReason() {
            return this.unknownReason;
        }

    }

    public static class DescribeInternetOpenDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInternetOpenDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenDetailResponseBodyPageInfo self = new DescribeInternetOpenDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInternetOpenDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInternetOpenDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
