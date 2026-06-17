// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainResponseBody extends TeaModel {
    /**
     * <p>An array of outbound domains.</p>
     */
    @NameInMap("DomainList")
    public java.util.List<DescribeOutgoingDomainResponseBodyDomainList> domainList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of outbound domains found.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOutgoingDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDomainResponseBody self = new DescribeOutgoingDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDomainResponseBody setDomainList(java.util.List<DescribeOutgoingDomainResponseBodyDomainList> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<DescribeOutgoingDomainResponseBodyDomainList> getDomainList() {
        return this.domainList;
    }

    public DescribeOutgoingDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingDomainResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOutgoingDomainResponseBodyDomainListTagList extends TeaModel {
        /**
         * <p>The category of the intelligence tag. Valid values:</p>
         * <ul>
         * <li><p><strong>Suspicious</strong>: suspicious</p>
         * </li>
         * <li><p><strong>Malicious</strong>: malicious</p>
         * </li>
         * <li><p><strong>Trusted</strong>: trusted</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("ClassId")
        public String classId;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: low</p>
         * </li>
         * <li><p><strong>2</strong>: medium</p>
         * </li>
         * <li><p><strong>3</strong>: high</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The description of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-describe</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <p>The ID of the intelligence tag.</p>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-name</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static DescribeOutgoingDomainResponseBodyDomainListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDomainResponseBodyDomainListTagList self = new DescribeOutgoingDomainResponseBodyDomainListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDomainResponseBodyDomainListTagList setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

        public DescribeOutgoingDomainResponseBodyDomainListTagList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOutgoingDomainResponseBodyDomainListTagList setTagDescribe(String tagDescribe) {
            this.tagDescribe = tagDescribe;
            return this;
        }
        public String getTagDescribe() {
            return this.tagDescribe;
        }

        public DescribeOutgoingDomainResponseBodyDomainListTagList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeOutgoingDomainResponseBodyDomainListTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class DescribeOutgoingDomainResponseBodyDomainList extends TeaModel {
        /**
         * <p>Indicates whether an access control policy is configured for the domain. Valid values:</p>
         * <ul>
         * <li><p><strong>Uncovered</strong>: no</p>
         * </li>
         * <li><p><strong>FullCoverage</strong>: yes</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Uncovered</p>
         */
        @NameInMap("AclCoverage")
        public String aclCoverage;

        /**
         * <p>The recommended action for the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>RecommendedRelease</p>
         */
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        /**
         * <p>The health status of the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: healthy</p>
         * </li>
         * <li><p><strong>Abnormal</strong>: unhealthy</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The name of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>Outreach Address Book</p>
         */
        @NameInMap("AddressGroupName")
        public String addressGroupName;

        /**
         * <p>The UUID of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>fdad-fdafa-dafa-dfa****</p>
         */
        @NameInMap("AddressGroupUUID")
        public String addressGroupUUID;

        /**
         * <p>An array of application names.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>The total number of assets that initiate outbound connections to the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AssetCount")
        public Long assetCount;

        /**
         * <p>The business to which the website belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Business")
        public String business;

        /**
         * <p>The category of the intelligence tag. Valid values:</p>
         * <ul>
         * <li><p><strong>Suspicious</strong>: suspicious</p>
         * </li>
         * <li><p><strong>Malicious</strong>: malicious</p>
         * </li>
         * <li><p><strong>Trusted</strong>: trusted</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("CategoryClassId")
        public String categoryClassId;

        /**
         * <p>The ID of the asset category. Valid values:</p>
         * <ul>
         * <li><p><strong>Aliyun</strong>: Alibaba Cloud service</p>
         * </li>
         * <li><p><strong>NotAliyun</strong>: third-party service</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The name of the asset category. Valid values:</p>
         * <ul>
         * <li><p>Alibaba Cloud product</p>
         * </li>
         * <li><p>Non-Alibaba Cloud product</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud product</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The outbound domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The name of the policy group.</p>
         * 
         * <strong>example:</strong>
         * <p>group-name</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether an access control policy is configured for the domain name. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes</p>
         * </li>
         * <li><p><strong>false</strong>: no</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAcl")
        public String hasAcl;

        /**
         * <p>Indicates whether a recommended access control policy exists. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes</p>
         * </li>
         * <li><p><strong>false</strong>: no</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        /**
         * <p>The volume of inbound traffic, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3214</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>Indicates whether the outbound domain name is marked as normal. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: normal</p>
         * </li>
         * <li><p><strong>false</strong>: not normal</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        /**
         * <p>The name of the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Computing Limited</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The volume of outbound traffic, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4582</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The total number of assets in a private network that initiate outbound connections to the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PrivateAssetCount")
        public Long privateAssetCount;

        /**
         * <p>The ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>add-dfadf-f****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The reason for the security recommendation.</p>
         * 
         * <strong>example:</strong>
         * <p>Smart policy: The target domain name belongs to Aliyun Computing Co., Ltd., and its main business is Aliyun. No security risks have been found. It can be used to configure an outreach whitelist.</p>
         */
        @NameInMap("SecurityReason")
        public String securityReason;

        /**
         * <p>The recommended security action for the outbound domain name. Valid values:</p>
         * <ul>
         * <li><p><strong>pass</strong>: allow</p>
         * </li>
         * <li><p><strong>alert</strong>: monitor</p>
         * </li>
         * <li><p><strong>drop</strong>: deny</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("SecuritySuggest")
        public String securitySuggest;

        /**
         * <p>The number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>An array of tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDomainResponseBodyDomainListTagList> tagList;

        /**
         * <p>The total traffic volume, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        public static DescribeOutgoingDomainResponseBodyDomainList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDomainResponseBodyDomainList self = new DescribeOutgoingDomainResponseBodyDomainList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDomainResponseBodyDomainList setAclCoverage(String aclCoverage) {
            this.aclCoverage = aclCoverage;
            return this;
        }
        public String getAclCoverage() {
            return this.aclCoverage;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setAclRecommendDetail(String aclRecommendDetail) {
            this.aclRecommendDetail = aclRecommendDetail;
            return this;
        }
        public String getAclRecommendDetail() {
            return this.aclRecommendDetail;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setAddressGroupName(String addressGroupName) {
            this.addressGroupName = addressGroupName;
            return this;
        }
        public String getAddressGroupName() {
            return this.addressGroupName;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setAddressGroupUUID(String addressGroupUUID) {
            this.addressGroupUUID = addressGroupUUID;
            return this;
        }
        public String getAddressGroupUUID() {
            return this.addressGroupUUID;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setAssetCount(Long assetCount) {
            this.assetCount = assetCount;
            return this;
        }
        public Long getAssetCount() {
            return this.assetCount;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setCategoryClassId(String categoryClassId) {
            this.categoryClassId = categoryClassId;
            return this;
        }
        public String getCategoryClassId() {
            return this.categoryClassId;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setHasAcl(String hasAcl) {
            this.hasAcl = hasAcl;
            return this;
        }
        public String getHasAcl() {
            return this.hasAcl;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setHasAclRecommend(Boolean hasAclRecommend) {
            this.hasAclRecommend = hasAclRecommend;
            return this;
        }
        public Boolean getHasAclRecommend() {
            return this.hasAclRecommend;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setIsMarkNormal(Boolean isMarkNormal) {
            this.isMarkNormal = isMarkNormal;
            return this;
        }
        public Boolean getIsMarkNormal() {
            return this.isMarkNormal;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setPrivateAssetCount(Long privateAssetCount) {
            this.privateAssetCount = privateAssetCount;
            return this;
        }
        public Long getPrivateAssetCount() {
            return this.privateAssetCount;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setSecurityReason(String securityReason) {
            this.securityReason = securityReason;
            return this;
        }
        public String getSecurityReason() {
            return this.securityReason;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setSecuritySuggest(String securitySuggest) {
            this.securitySuggest = securitySuggest;
            return this;
        }
        public String getSecuritySuggest() {
            return this.securitySuggest;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setTagList(java.util.List<DescribeOutgoingDomainResponseBodyDomainListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeOutgoingDomainResponseBodyDomainListTagList> getTagList() {
            return this.tagList;
        }

        public DescribeOutgoingDomainResponseBodyDomainList setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

    }

}
