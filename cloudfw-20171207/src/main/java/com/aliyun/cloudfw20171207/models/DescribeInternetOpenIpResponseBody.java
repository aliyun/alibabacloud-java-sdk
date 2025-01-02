// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenIpResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeInternetOpenIpResponseBodyDataList> dataList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeInternetOpenIpResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6B780BD6-282C-51A9-A8E6-59F636BAFA54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInternetOpenIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenIpResponseBody self = new DescribeInternetOpenIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenIpResponseBody setDataList(java.util.List<DescribeInternetOpenIpResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetOpenIpResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetOpenIpResponseBody setPageInfo(DescribeInternetOpenIpResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInternetOpenIpResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInternetOpenIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInternetOpenIpResponseBodyDataList extends TeaModel {
        /**
         * <p>The reason why recommended intelligent policies are unavailable. Valid values:</p>
         * <ul>
         * <li>No recommended intelligent policies are available.</li>
         * <li>This feature is available only to some users.</li>
         * <li>The policy configuration has been modified. No recommended intelligent policies are available.</li>
         * <li>The recommended intelligent policies have been configured. No new recommended intelligent policies are available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>No recommended intelligent policies are available.</p>
         */
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1ix9w22kv6aew9****</p>
         */
        @NameInMap("AssetsInstanceId")
        public String assetsInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>launch-advisor-2023****</p>
         */
        @NameInMap("AssetsName")
        public String assetsName;

        /**
         * <p>The asset type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsEIP</p>
         */
        @NameInMap("AssetsType")
        public String assetsType;

        /**
         * <p>The total number of ports.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DetailNum")
        public Integer detailNum;

        /**
         * <p>Specifies whether an access control policy is recommended. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        /**
         * <p>The list of ports.</p>
         */
        @NameInMap("PortList")
        public java.util.List<String> portList;

        /**
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.1</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: high risk</li>
         * <li><strong>2</strong>: medium risk</li>
         * <li><strong>1</strong>: low risk</li>
         * <li><strong>0</strong>: no risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The reason for the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>Previous traffic is all malicious traffic.</p>
         */
        @NameInMap("RiskReason")
        public String riskReason;

        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("ServiceNameList")
        public java.util.List<String> serviceNameList;

        /**
         * <p>Number of source IPs.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("SrcIpCnt")
        public Long srcIpCnt;

        /**
         * <p>Outbound traffic in the last 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TotalReplyBytes")
        public Long totalReplyBytes;

        /**
         * <p>The percentage of traffic of a day. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>11.1</p>
         */
        @NameInMap("TrafficPercent1Day")
        public String trafficPercent1Day;

        /**
         * <p>The percentage of traffic of 30 days. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>99.9</p>
         */
        @NameInMap("TrafficPercent30Day")
        public String trafficPercent30Day;

        /**
         * <p>The percentage of traffic of seven days. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>77.7</p>
         */
        @NameInMap("TrafficPercent7Day")
        public String trafficPercent7Day;

        public static DescribeInternetOpenIpResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenIpResponseBodyDataList self = new DescribeInternetOpenIpResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenIpResponseBodyDataList setAclRecommendDetail(String aclRecommendDetail) {
            this.aclRecommendDetail = aclRecommendDetail;
            return this;
        }
        public String getAclRecommendDetail() {
            return this.aclRecommendDetail;
        }

        public DescribeInternetOpenIpResponseBodyDataList setAssetsInstanceId(String assetsInstanceId) {
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }
        public String getAssetsInstanceId() {
            return this.assetsInstanceId;
        }

        public DescribeInternetOpenIpResponseBodyDataList setAssetsName(String assetsName) {
            this.assetsName = assetsName;
            return this;
        }
        public String getAssetsName() {
            return this.assetsName;
        }

        public DescribeInternetOpenIpResponseBodyDataList setAssetsType(String assetsType) {
            this.assetsType = assetsType;
            return this;
        }
        public String getAssetsType() {
            return this.assetsType;
        }

        public DescribeInternetOpenIpResponseBodyDataList setDetailNum(Integer detailNum) {
            this.detailNum = detailNum;
            return this;
        }
        public Integer getDetailNum() {
            return this.detailNum;
        }

        public DescribeInternetOpenIpResponseBodyDataList setHasAclRecommend(Boolean hasAclRecommend) {
            this.hasAclRecommend = hasAclRecommend;
            return this;
        }
        public Boolean getHasAclRecommend() {
            return this.hasAclRecommend;
        }

        public DescribeInternetOpenIpResponseBodyDataList setPortList(java.util.List<String> portList) {
            this.portList = portList;
            return this;
        }
        public java.util.List<String> getPortList() {
            return this.portList;
        }

        public DescribeInternetOpenIpResponseBodyDataList setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeInternetOpenIpResponseBodyDataList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeInternetOpenIpResponseBodyDataList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeInternetOpenIpResponseBodyDataList setRiskReason(String riskReason) {
            this.riskReason = riskReason;
            return this;
        }
        public String getRiskReason() {
            return this.riskReason;
        }

        public DescribeInternetOpenIpResponseBodyDataList setServiceNameList(java.util.List<String> serviceNameList) {
            this.serviceNameList = serviceNameList;
            return this;
        }
        public java.util.List<String> getServiceNameList() {
            return this.serviceNameList;
        }

        public DescribeInternetOpenIpResponseBodyDataList setSrcIpCnt(Long srcIpCnt) {
            this.srcIpCnt = srcIpCnt;
            return this;
        }
        public Long getSrcIpCnt() {
            return this.srcIpCnt;
        }

        public DescribeInternetOpenIpResponseBodyDataList setTotalReplyBytes(Long totalReplyBytes) {
            this.totalReplyBytes = totalReplyBytes;
            return this;
        }
        public Long getTotalReplyBytes() {
            return this.totalReplyBytes;
        }

        public DescribeInternetOpenIpResponseBodyDataList setTrafficPercent1Day(String trafficPercent1Day) {
            this.trafficPercent1Day = trafficPercent1Day;
            return this;
        }
        public String getTrafficPercent1Day() {
            return this.trafficPercent1Day;
        }

        public DescribeInternetOpenIpResponseBodyDataList setTrafficPercent30Day(String trafficPercent30Day) {
            this.trafficPercent30Day = trafficPercent30Day;
            return this;
        }
        public String getTrafficPercent30Day() {
            return this.trafficPercent30Day;
        }

        public DescribeInternetOpenIpResponseBodyDataList setTrafficPercent7Day(String trafficPercent7Day) {
            this.trafficPercent7Day = trafficPercent7Day;
            return this;
        }
        public String getTrafficPercent7Day() {
            return this.trafficPercent7Day;
        }

    }

    public static class DescribeInternetOpenIpResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInternetOpenIpResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenIpResponseBodyPageInfo self = new DescribeInternetOpenIpResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenIpResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInternetOpenIpResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInternetOpenIpResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
