// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainResponseBody extends TeaModel {
    @NameInMap("DomainList")
    public java.util.List<DescribeOutgoingDomainResponseBodyDomainList> domainList;

    @NameInMap("RequestId")
    public String requestId;

    // 总数
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
        // 风险等级
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        // 标签描述
        @NameInMap("TagDescribe")
        public String tagDescribe;

        // 标签ID
        @NameInMap("TagId")
        public String tagId;

        // 标签名称
        @NameInMap("TagName")
        public String tagName;

        public static DescribeOutgoingDomainResponseBodyDomainListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDomainResponseBodyDomainListTagList self = new DescribeOutgoingDomainResponseBodyDomainListTagList();
            return TeaModel.build(map, self);
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
        // ACL覆盖
        @NameInMap("AclCoverage")
        public String aclCoverage;

        // ACL推荐内容
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        // ACL状态
        @NameInMap("AclStatus")
        public String aclStatus;

        // 地址簿名称
        @NameInMap("AddressGroupName")
        public String addressGroupName;

        // 地址簿UUID
        @NameInMap("AddressGroupUUID")
        public String addressGroupUUID;

        // 分类ID
        @NameInMap("CategoryId")
        public String categoryId;

        // 分类名称
        @NameInMap("CategoryName")
        public String categoryName;

        // 域名
        @NameInMap("Domain")
        public String domain;

        // 规则中的组名称
        @NameInMap("GroupName")
        public String groupName;

        // 是否有ACL推荐规则
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        // 入流量
        @NameInMap("InBytes")
        public Long inBytes;

        // 是否正常
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        // 出流量
        @NameInMap("OutBytes")
        public Long outBytes;

        // ACL规则ID
        @NameInMap("RuleId")
        public String ruleId;

        // 规则名称
        @NameInMap("RuleName")
        public String ruleName;

        // 安全建议
        @NameInMap("SecuritySuggest")
        public String securitySuggest;

        // 会话数
        @NameInMap("SessionCount")
        public Long sessionCount;

        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDomainResponseBodyDomainListTagList> tagList;

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

    }

}
