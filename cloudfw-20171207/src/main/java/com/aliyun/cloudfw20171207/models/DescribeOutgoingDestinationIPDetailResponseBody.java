// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPDetailResponseBody extends TeaModel {
    /**
     * <p>The list of assets.</p>
     */
    @NameInMap("AssetList")
    public java.util.List<DescribeOutgoingDestinationIPDetailResponseBodyAssetList> assetList;

    /**
     * <p>The ISP of the destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("IspName")
    public String ispName;

    /**
     * <p>The name of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("LocationName")
    public String locationName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOutgoingDestinationIPDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationIPDetailResponseBody self = new DescribeOutgoingDestinationIPDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationIPDetailResponseBody setAssetList(java.util.List<DescribeOutgoingDestinationIPDetailResponseBodyAssetList> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<DescribeOutgoingDestinationIPDetailResponseBodyAssetList> getAssetList() {
        return this.assetList;
    }

    public DescribeOutgoingDestinationIPDetailResponseBody setIspName(String ispName) {
        this.ispName = ispName;
        return this;
    }
    public String getIspName() {
        return this.ispName;
    }

    public DescribeOutgoingDestinationIPDetailResponseBody setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public DescribeOutgoingDestinationIPDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingDestinationIPDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList extends TeaModel {
        /**
         * <p>The classification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClassId")
        public String classId;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The description of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <p>The ID of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>FirstFlow</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList self = new DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList setTagDescribe(String tagDescribe) {
            this.tagDescribe = tagDescribe;
            return this;
        }
        public String getTagDescribe() {
            return this.tagDescribe;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class DescribeOutgoingDestinationIPDetailResponseBodyAssetList extends TeaModel {
        /**
         * <p>The status of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>FullCoverage</p>
         */
        @NameInMap("AclCoverage")
        public String aclCoverage;

        /**
         * <p>The time of the first access. This is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1744682438</p>
         */
        @NameInMap("FirstTime")
        public Integer firstTime;

        /**
         * <p>The inbound traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>The ISP of the destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>The time of the last access. This is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1739326614</p>
         */
        @NameInMap("LastTime")
        public Integer lastTime;

        /**
         * <p>The name of the region where the destination IP address is located.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("LocationName")
        public String locationName;

        /**
         * <p>The ID of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1utx6wj4x9qu9tl****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The name of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-test</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        /**
         * <p>The outbound traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.21.242XXX</p>
         */
        @NameInMap("PrivateIP")
        public String privateIP;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.96.181.XXX</p>
         */
        @NameInMap("PublicIP")
        public String publicIP;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The instance ID of the cloud product.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf63wjhyoohc1g4z****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The name of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <p>The type of the public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsPublicIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08a58465-ff4d-4c47-8782-eb008301****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList> tagList;

        /**
         * <p>The total traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>458681</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <p>The ID of the VPC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-9dp16jgwgyvn****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeOutgoingDestinationIPDetailResponseBodyAssetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPDetailResponseBodyAssetList self = new DescribeOutgoingDestinationIPDetailResponseBodyAssetList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setAclCoverage(String aclCoverage) {
            this.aclCoverage = aclCoverage;
            return this;
        }
        public String getAclCoverage() {
            return this.aclCoverage;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setFirstTime(Integer firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Integer getFirstTime() {
            return this.firstTime;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setLastTime(Integer lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Integer getLastTime() {
            return this.lastTime;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setTagList(java.util.List<DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeOutgoingDestinationIPDetailResponseBodyAssetListTagList> getTagList() {
            return this.tagList;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeOutgoingDestinationIPDetailResponseBodyAssetList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
