// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDomainRelationListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVpcFirewallDomainRelationListResponseBodyDataList> dataList;

    @NameInMap("DstVpcList")
    public java.util.List<DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList> dstVpcList;

    /**
     * <strong>example:</strong>
     * <p>C5DDD596-1191-5F36-A504-8733045A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVpcFirewallDomainRelationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDomainRelationListResponseBody self = new DescribeVpcFirewallDomainRelationListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDomainRelationListResponseBody setDataList(java.util.List<DescribeVpcFirewallDomainRelationListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallDomainRelationListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVpcFirewallDomainRelationListResponseBody setDstVpcList(java.util.List<DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList> dstVpcList) {
        this.dstVpcList = dstVpcList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList> getDstVpcList() {
        return this.dstVpcList;
    }

    public DescribeVpcFirewallDomainRelationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallDomainRelationListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcFirewallDomainRelationListResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Google</p>
         */
        @NameInMap("Business")
        public String business;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("DstRegionId")
        public String dstRegionId;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp10w5nb30r4jzfyc****</p>
         */
        @NameInMap("DstVpcId")
        public String dstVpcId;

        /**
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        @NameInMap("DstVpcName")
        public String dstVpcName;

        /**
         * <strong>example:</strong>
         * <p>1767147003</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <strong>example:</strong>
         * <p>Google</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IpsHitCnt")
        public Long ipsHitCnt;

        /**
         * <strong>example:</strong>
         * <p>1767147003</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("RequestBytes")
        public Long requestBytes;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ResponseBytes")
        public Long responseBytes;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SrcRegionId")
        public String srcRegionId;

        /**
         * <strong>example:</strong>
         * <p>vpc-t4nlt09olhpazpoeg****</p>
         */
        @NameInMap("SrcVpcId")
        public String srcVpcId;

        /**
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        @NameInMap("SrcVpcName")
        public String srcVpcName;

        /**
         * <strong>example:</strong>
         * <p>16287823</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        public static DescribeVpcFirewallDomainRelationListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDomainRelationListResponseBodyDataList self = new DescribeVpcFirewallDomainRelationListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setDstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }
        public String getDstIP() {
            return this.dstIP;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setDstRegionId(String dstRegionId) {
            this.dstRegionId = dstRegionId;
            return this;
        }
        public String getDstRegionId() {
            return this.dstRegionId;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setDstVpcId(String dstVpcId) {
            this.dstVpcId = dstVpcId;
            return this;
        }
        public String getDstVpcId() {
            return this.dstVpcId;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setDstVpcName(String dstVpcName) {
            this.dstVpcName = dstVpcName;
            return this;
        }
        public String getDstVpcName() {
            return this.dstVpcName;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setIpsHitCnt(Long ipsHitCnt) {
            this.ipsHitCnt = ipsHitCnt;
            return this;
        }
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setRequestBytes(Long requestBytes) {
            this.requestBytes = requestBytes;
            return this;
        }
        public Long getRequestBytes() {
            return this.requestBytes;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setResponseBytes(Long responseBytes) {
            this.responseBytes = responseBytes;
            return this;
        }
        public Long getResponseBytes() {
            return this.responseBytes;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setSrcRegionId(String srcRegionId) {
            this.srcRegionId = srcRegionId;
            return this;
        }
        public String getSrcRegionId() {
            return this.srcRegionId;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setSrcVpcId(String srcVpcId) {
            this.srcVpcId = srcVpcId;
            return this;
        }
        public String getSrcVpcId() {
            return this.srcVpcId;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setSrcVpcName(String srcVpcName) {
            this.srcVpcName = srcVpcName;
            return this;
        }
        public String getSrcVpcName() {
            return this.srcVpcName;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDataList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

    }

    public static class DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vpc-bp10w5nb30r4jzfyc****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList self = new DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallDomainRelationListResponseBodyDstVpcList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
