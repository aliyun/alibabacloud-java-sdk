// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainResponseBody extends TeaModel {
    // An array that consists of the domain names in outbound connections.
    @NameInMap("DomainList")
    public java.util.List<DescribeOutgoingDomainResponseBodyDomainList> domainList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of the domain names in outbound connections.
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
        // The type of the tag. Valid values:
        // 
        // *   **Suspicious**
        // *   **Malicious**
        // *   **Trusted**
        @NameInMap("ClassId")
        public String classId;

        // The risk level. Valid values:
        // 
        // *   **1**: low
        // *   **2**: medium
        // *   **3**: high
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        // The description of the tag.
        @NameInMap("TagDescribe")
        public String tagDescribe;

        // The ID of the tag.
        @NameInMap("TagId")
        public String tagId;

        // The name of the tag.
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
        // Indicates whether an access control policy is configured. Valid values:
        // 
        // *   **Uncovered**: No access control policies are configured.
        // *   **FullCoverage**: An access control policy is configured.
        @NameInMap("AclCoverage")
        public String aclCoverage;

        // The suggestion in an access control policy.
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        // The state of the access control policy. Valid values:
        // 
        // *   **normal**: healthy
        // *   **abnormal**: unhealthy
        @NameInMap("AclStatus")
        public String aclStatus;

        // The name of the address book.
        @NameInMap("AddressGroupName")
        public String addressGroupName;

        // The UUID of the address book.
        @NameInMap("AddressGroupUUID")
        public String addressGroupUUID;

        // The website service.
        @NameInMap("Business")
        public String business;

        // The type of the tag. Valid values:
        // 
        // *   **Suspicious**
        // *   **Malicious**
        // *   **Trusted**
        @NameInMap("CategoryClassId")
        public String categoryClassId;

        // The ID of the service to which the destination IP address belongs. Valid values:
        // 
        // *   **Aliyun**: Alibaba Cloud services
        // *   **NotAliyun**: third-party services
        @NameInMap("CategoryId")
        public String categoryId;

        // The type of the service to which the domain name belongs. Valid values:
        // 
        // *   **Alibaba Cloud services**
        // *   **third-party services**
        @NameInMap("CategoryName")
        public String categoryName;

        // The domain name in outbound connections.
        @NameInMap("Domain")
        public String domain;

        // The name of the group to which the access control policy belongs.
        @NameInMap("GroupName")
        public String groupName;

        // Indicates whether an `access control policy` is configured for the domain name. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("HasAcl")
        public String hasAcl;

        // Indicates whether an access control policy is recommended. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        // The inbound traffic.
        @NameInMap("InBytes")
        public Long inBytes;

        // Indicates whether the domain name is marked as normal. Valid values:
        // 
        // *   **true**: normal
        // *   **false**: abnormal
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        // The name of the organization.
        @NameInMap("Organization")
        public String organization;

        // The outbound traffic.
        @NameInMap("OutBytes")
        public Long outBytes;

        // The ID of the access control policy.
        @NameInMap("RuleId")
        public String ruleId;

        // The name of the access control policy.
        @NameInMap("RuleName")
        public String ruleName;

        // The reason why the domain name is secure.
        @NameInMap("SecurityReason")
        public String securityReason;

        // The suggestion to handle the traffic of the domain name in outbound connections. Valid values:
        // 
        // *   **pass**: allow
        // *   **alert**: monitor
        // *   **drop**: deny
        @NameInMap("SecuritySuggest")
        public String securitySuggest;

        // The number of requests.
        @NameInMap("SessionCount")
        public Long sessionCount;

        // An array that consists of tags.
        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDomainResponseBodyDomainListTagList> tagList;

        // The total volume of traffic. Unit: bytes.
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
