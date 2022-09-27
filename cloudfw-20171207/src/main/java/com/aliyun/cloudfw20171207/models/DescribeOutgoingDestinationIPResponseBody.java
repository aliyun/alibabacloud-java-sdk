// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPResponseBody extends TeaModel {
    @NameInMap("DstIPList")
    public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> dstIPList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOutgoingDestinationIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationIPResponseBody self = new DescribeOutgoingDestinationIPResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationIPResponseBody setDstIPList(java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> dstIPList) {
        this.dstIPList = dstIPList;
        return this;
    }
    public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> getDstIPList() {
        return this.dstIPList;
    }

    public DescribeOutgoingDestinationIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingDestinationIPResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList extends TeaModel {
        @NameInMap("AddressGroupName")
        public String addressGroupName;

        @NameInMap("AddressGroupUUID")
        public String addressGroupUUID;

        public static DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList self = new DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList setAddressGroupName(String addressGroupName) {
            this.addressGroupName = addressGroupName;
            return this;
        }
        public String getAddressGroupName() {
            return this.addressGroupName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList setAddressGroupUUID(String addressGroupUUID) {
            this.addressGroupUUID = addressGroupUUID;
            return this;
        }
        public String getAddressGroupUUID() {
            return this.addressGroupUUID;
        }

    }

    public static class DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("Port")
        public Integer port;

        public static DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList self = new DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeOutgoingDestinationIPResponseBodyDstIPListTagList extends TeaModel {
        @NameInMap("ClassId")
        public String classId;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("TagDescribe")
        public String tagDescribe;

        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagName")
        public String tagName;

        public static DescribeOutgoingDestinationIPResponseBodyDstIPListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPResponseBodyDstIPListTagList self = new DescribeOutgoingDestinationIPResponseBodyDstIPListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setTagDescribe(String tagDescribe) {
            this.tagDescribe = tagDescribe;
            return this;
        }
        public String getTagDescribe() {
            return this.tagDescribe;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class DescribeOutgoingDestinationIPResponseBodyDstIPList extends TeaModel {
        @NameInMap("AclCoverage")
        public String aclCoverage;

        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        @NameInMap("AclStatus")
        public String aclStatus;

        @NameInMap("AddressGroupList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList> addressGroupList;

        @NameInMap("ApplicationPortList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> applicationPortList;

        @NameInMap("CategoryClassId")
        public String categoryClassId;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("DstIP")
        public String dstIP;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("HasAcl")
        public String hasAcl;

        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        @NameInMap("InBytes")
        public Long inBytes;

        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        @NameInMap("OutBytes")
        public Long outBytes;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SecurityReason")
        public String securityReason;

        @NameInMap("SecuritySuggest")
        public String securitySuggest;

        @NameInMap("SessionCount")
        public Long sessionCount;

        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> tagList;

        @NameInMap("TotalBytes")
        public String totalBytes;

        public static DescribeOutgoingDestinationIPResponseBodyDstIPList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPResponseBodyDstIPList self = new DescribeOutgoingDestinationIPResponseBodyDstIPList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAclCoverage(String aclCoverage) {
            this.aclCoverage = aclCoverage;
            return this;
        }
        public String getAclCoverage() {
            return this.aclCoverage;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAclRecommendDetail(String aclRecommendDetail) {
            this.aclRecommendDetail = aclRecommendDetail;
            return this;
        }
        public String getAclRecommendDetail() {
            return this.aclRecommendDetail;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAddressGroupList(java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList> addressGroupList) {
            this.addressGroupList = addressGroupList;
            return this;
        }
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList> getAddressGroupList() {
            return this.addressGroupList;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setApplicationPortList(java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> applicationPortList) {
            this.applicationPortList = applicationPortList;
            return this;
        }
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> getApplicationPortList() {
            return this.applicationPortList;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setCategoryClassId(String categoryClassId) {
            this.categoryClassId = categoryClassId;
            return this;
        }
        public String getCategoryClassId() {
            return this.categoryClassId;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setDstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }
        public String getDstIP() {
            return this.dstIP;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setHasAcl(String hasAcl) {
            this.hasAcl = hasAcl;
            return this;
        }
        public String getHasAcl() {
            return this.hasAcl;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setHasAclRecommend(Boolean hasAclRecommend) {
            this.hasAclRecommend = hasAclRecommend;
            return this;
        }
        public Boolean getHasAclRecommend() {
            return this.hasAclRecommend;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setIsMarkNormal(Boolean isMarkNormal) {
            this.isMarkNormal = isMarkNormal;
            return this;
        }
        public Boolean getIsMarkNormal() {
            return this.isMarkNormal;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setSecurityReason(String securityReason) {
            this.securityReason = securityReason;
            return this;
        }
        public String getSecurityReason() {
            return this.securityReason;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setSecuritySuggest(String securitySuggest) {
            this.securitySuggest = securitySuggest;
            return this;
        }
        public String getSecuritySuggest() {
            return this.securitySuggest;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setTagList(java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> getTagList() {
            return this.tagList;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

    }

}
