// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainResponseBody extends TeaModel {
    /**
     * <p>The list of Outbound Domain names.</p>
     */
    @NameInMap("DomainList")
    public java.util.List<DescribeOutgoingDomainResponseBodyDomainList> domainList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of Outbound Domain names.</p>
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

    public static class DescribeOutgoingDomainResponseBodyDomainListApplicationPortList extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("Port")
        public Integer port;

        public static DescribeOutgoingDomainResponseBodyDomainListApplicationPortList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDomainResponseBodyDomainListApplicationPortList self = new DescribeOutgoingDomainResponseBodyDomainListApplicationPortList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDomainResponseBodyDomainListApplicationPortList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeOutgoingDomainResponseBodyDomainListApplicationPortList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeOutgoingDomainResponseBodyDomainListTagList extends TeaModel {
        /**
         * <p>The categorization of the intelligence tags label. Valid values:</p>
         * <ul>
         * <li><strong>Suspicious</strong>: Suspicious.</li>
         * <li><strong>Malicious</strong>: Malicious.</li>
         * <li><strong>Trusted</strong>: Trusted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("ClassId")
        public String classId;

        /**
         * <p>The risk assessment level. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Low.</li>
         * <li><strong>2</strong>: Medium.</li>
         * <li><strong>3</strong>: High.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The tag description.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-describe</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <p>The intelligence tags label ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The tag name.</p>
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
         * <p>Indicates whether the access control policy covers the domain name. Valid values:</p>
         * <ul>
         * <li><strong>Uncovered</strong>: Not covered.</li>
         * <li><strong>FullCoverage</strong>: Covered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Uncovered</p>
         */
        @NameInMap("AclCoverage")
        public String aclCoverage;

        /**
         * <p>The ACL recommendation details.</p>
         * 
         * <strong>example:</strong>
         * <p>RecommendedRelease</p>
         */
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        /**
         * <p>The health status of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Healthy.</li>
         * <li><strong>Abnormal</strong>: Unhealthy.</li>
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
         * <p>The application names.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        @NameInMap("ApplicationPortList")
        public java.util.List<DescribeOutgoingDomainResponseBodyDomainListApplicationPortList> applicationPortList;

        /**
         * <p>The total number of assets that initiate outbound connections.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AssetCount")
        public Long assetCount;

        /**
         * <p>The website business.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Business")
        public String business;

        /**
         * <p>The categorization of the intelligence tags label. Valid values:</p>
         * <ul>
         * <li><strong>Suspicious</strong>: Suspicious.</li>
         * <li><strong>Malicious</strong>: Malicious.</li>
         * <li><strong>Trusted</strong>: Trusted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("CategoryClassId")
        public String categoryClassId;

        /**
         * <p>The product category ID. Valid values:</p>
         * <ul>
         * <li><strong>Aliyun</strong>: Alibaba Cloud product.</li>
         * <li><strong>NotAliyun</strong>: Non-Alibaba Cloud product.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The category name of the product. Valid values:</p>
         * <ul>
         * <li><strong>Alibaba Cloud product</strong></li>
         * <li><strong>Non-Alibaba Cloud product</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud product</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The domain name of outbound connections.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The group name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>group-name</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether an ACL already covers this domain name. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAcl")
        public String hasAcl;

        /**
         * <p>Indicates whether an ACL recommendation exists. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        /**
         * <p>The inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>3214</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>Indicates whether the Outbound Domain is marked as normal. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Normal.</li>
         * <li><strong>false</strong>: Abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        /**
         * <p>The organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Computing Limited</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>4582</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The total number of private network assets that initiate outbound connections.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PrivateAssetCount")
        public Long privateAssetCount;

        /**
         * <p>The ACL rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>add-dfadf-f****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The ACL rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The security reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Smart policy: The target domain name belongs to Aliyun Computing Co., Ltd., and its main business is Aliyun. No security risks have been found. It can be used to configure an outreach whitelist.</p>
         */
        @NameInMap("SecurityReason")
        public String securityReason;

        /**
         * <p>The security policy for the Outbound Domain of outbound connections. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: Allow.</li>
         * <li><strong>alert</strong>: Monitor.</li>
         * <li><strong>drop</strong>: Deny.</li>
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
         * <p>The tag list.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDomainResponseBodyDomainListTagList> tagList;

        /**
         * <p>The total traffic. Unit: bytes.</p>
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

        public DescribeOutgoingDomainResponseBodyDomainList setApplicationPortList(java.util.List<DescribeOutgoingDomainResponseBodyDomainListApplicationPortList> applicationPortList) {
            this.applicationPortList = applicationPortList;
            return this;
        }
        public java.util.List<DescribeOutgoingDomainResponseBodyDomainListApplicationPortList> getApplicationPortList() {
            return this.applicationPortList;
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
