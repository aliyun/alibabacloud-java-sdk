// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainDetailResponseBody extends TeaModel {
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    @NameInMap("AssetList")
    public java.util.List<DescribeOutgoingDomainDetailResponseBodyAssetList> assetList;

    /**
     * <strong>example:</strong>
     * <p>98AF5888-9606-59CF-888F-032A9ED0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOutgoingDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDomainDetailResponseBody self = new DescribeOutgoingDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDomainDetailResponseBody setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public DescribeOutgoingDomainDetailResponseBody setAssetList(java.util.List<DescribeOutgoingDomainDetailResponseBodyAssetList> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<DescribeOutgoingDomainDetailResponseBodyAssetList> getAssetList() {
        return this.assetList;
    }

    public DescribeOutgoingDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingDomainDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOutgoingDomainDetailResponseBodyAssetListTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ClassId")
        public String classId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <strong>example:</strong>
         * <p>FirstFlow</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static DescribeOutgoingDomainDetailResponseBodyAssetListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDomainDetailResponseBodyAssetListTagList self = new DescribeOutgoingDomainDetailResponseBodyAssetListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetListTagList setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetListTagList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetListTagList setTagDescribe(String tagDescribe) {
            this.tagDescribe = tagDescribe;
            return this;
        }
        public String getTagDescribe() {
            return this.tagDescribe;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetListTagList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetListTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class DescribeOutgoingDomainDetailResponseBodyAssetList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FullCoverage</p>
         */
        @NameInMap("AclCoverage")
        public String aclCoverage;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>1738548990</p>
         */
        @NameInMap("FirstTime")
        public Integer firstTime;

        /**
         * <strong>example:</strong>
         * <p>244438.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("IpsHitCnt")
        public Long ipsHitCnt;

        /**
         * <strong>example:</strong>
         * <p>1739326614</p>
         */
        @NameInMap("LastTime")
        public Integer lastTime;

        /**
         * <strong>example:</strong>
         * <p>ngw-bp1utx6wj4x9qu9tl****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <strong>example:</strong>
         * <p>ngw-test</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <strong>example:</strong>
         * <p>10.21.242XXX</p>
         */
        @NameInMap("PrivateIP")
        public String privateIP;

        /**
         * <strong>example:</strong>
         * <p>47.96.181.XXX</p>
         */
        @NameInMap("PublicIP")
        public String publicIP;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>i-uf63wjhyoohc1g4z****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <strong>example:</strong>
         * <p>NatEIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>08a58465-ff4d-4c47-8782-eb008301****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDomainDetailResponseBodyAssetListTagList> tagList;

        /**
         * <strong>example:</strong>
         * <p>321120825843</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <strong>example:</strong>
         * <p>vpc-9dp16jgwgyvn****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeOutgoingDomainDetailResponseBodyAssetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDomainDetailResponseBodyAssetList self = new DescribeOutgoingDomainDetailResponseBodyAssetList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setAclCoverage(String aclCoverage) {
            this.aclCoverage = aclCoverage;
            return this;
        }
        public String getAclCoverage() {
            return this.aclCoverage;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setFirstTime(Integer firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Integer getFirstTime() {
            return this.firstTime;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setIpsHitCnt(Long ipsHitCnt) {
            this.ipsHitCnt = ipsHitCnt;
            return this;
        }
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setLastTime(Integer lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Integer getLastTime() {
            return this.lastTime;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setTagList(java.util.List<DescribeOutgoingDomainDetailResponseBodyAssetListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeOutgoingDomainDetailResponseBodyAssetListTagList> getTagList() {
            return this.tagList;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeOutgoingDomainDetailResponseBodyAssetList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
