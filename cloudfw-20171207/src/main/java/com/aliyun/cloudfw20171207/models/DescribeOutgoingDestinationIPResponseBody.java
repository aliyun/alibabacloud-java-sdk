// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPResponseBody extends TeaModel {
    /**
     * <p>A list of destination IP addresses for outgoing connections.</p>
     */
    @NameInMap("DstIPList")
    public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> dstIPList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of outgoing IPs.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
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
        /**
         * <p>The name of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>IP地址簿</p>
         */
        @NameInMap("AddressGroupName")
        public String addressGroupName;

        /**
         * <p>The UUID of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
         */
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
        /**
         * <p>The application protocol detected for the connection. Valid values:</p>
         * <ul>
         * <li><p><strong>FTP</strong></p>
         * </li>
         * <li><p><strong>HTTP</strong></p>
         * </li>
         * <li><p><strong>HTTPS</strong></p>
         * </li>
         * <li><p><strong>Memcache</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * <li><p><strong>MQTT</strong></p>
         * </li>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>RDP</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
         * <li><p><strong>SMTP</strong></p>
         * </li>
         * <li><p><strong>SMTPS</strong></p>
         * </li>
         * <li><p><strong>SSH</strong></p>
         * </li>
         * <li><p><strong>SSL_No_Cert</strong></p>
         * </li>
         * <li><p><strong>SSL</strong></p>
         * </li>
         * <li><p><strong>VNC</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The application port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>A list of reasons why the application protocol was not identified.</p>
         */
        @NameInMap("UnknownReason")
        public java.util.List<String> unknownReason;

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

        public DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList setUnknownReason(java.util.List<String> unknownReason) {
            this.unknownReason = unknownReason;
            return this;
        }
        public java.util.List<String> getUnknownReason() {
            return this.unknownReason;
        }

    }

    public static class DescribeOutgoingDestinationIPResponseBodyDstIPListTagList extends TeaModel {
        /**
         * <p>The category of the threat intelligence tag. Valid values:</p>
         * <ul>
         * <li><p><strong>Suspicious</strong></p>
         * </li>
         * <li><p><strong>Malicious</strong></p>
         * </li>
         * <li><p><strong>Trusted</strong></p>
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
         * <li><p><strong>1</strong>: Low</p>
         * </li>
         * <li><p><strong>2</strong>: Medium</p>
         * </li>
         * <li><p><strong>3</strong>: High</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The description of the threat intelligence tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ReleaseLabel</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <p>The ID of the threat intelligence tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ReleaseLabel</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The name of the threat intelligence tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ReleaseLabel</p>
         */
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
        /**
         * <p>Indicates whether an access control policy is applied. Valid values:</p>
         * <ul>
         * <li><p><strong>Uncovered</strong>: No policy is applied.</p>
         * </li>
         * <li><p><strong>FullCoverage</strong>: A policy is applied.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Uncovered</p>
         */
        @NameInMap("AclCoverage")
        public String aclCoverage;

        /**
         * <p>Details of the ACL recommendation.</p>
         * 
         * <strong>example:</strong>
         * <p>建议放行</p>
         */
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        /**
         * <p>The health status of the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Healthy.</p>
         * </li>
         * <li><p><strong>Abnormal</strong>: Unhealthy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>A list of address books that contain this destination IP address.</p>
         */
        @NameInMap("AddressGroupList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList> addressGroupList;

        /**
         * <p>The list of application ports.</p>
         * <blockquote>
         * <p>This response returns a maximum of 99 application ports. If more than 99 ports exist, only the first 99 are returned.</p>
         * </blockquote>
         */
        @NameInMap("ApplicationPortList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> applicationPortList;

        /**
         * <p>The total number of assets that initiated outgoing connections to this destination IP.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AssetCount")
        public Long assetCount;

        /**
         * <p>The threat intelligence category of the destination IP address. Valid values:</p>
         * <ul>
         * <li><p><strong>Suspicious</strong></p>
         * </li>
         * <li><p><strong>Malicious</strong></p>
         * </li>
         * <li><p><strong>Trusted</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("CategoryClassId")
        public String categoryClassId;

        /**
         * <p>The ID of the service category. Valid values:</p>
         * <ul>
         * <li><p><strong>Aliyun</strong>: The destination is an Alibaba Cloud product.</p>
         * </li>
         * <li><p><strong>NotAliyun</strong>: The destination is a non-Alibaba Cloud product.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The service category of the destination IP address. Valid values:</p>
         * <ul>
         * <li><p><strong>Alibaba Cloud product</strong></p>
         * </li>
         * <li><p><strong>non-Alibaba Cloud product</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>阿里云产品</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The destination IP address of the outgoing connection.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <p>The name of the rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>rules_test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether an access control rule exists. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: An access control rule exists.</p>
         * </li>
         * <li><p><strong>false</strong>: No access control rule exists.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAcl")
        public String hasAcl;

        /**
         * <p>Indicates whether an ACL is recommended. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: An ACL is recommended.</p>
         * </li>
         * <li><p><strong>false</strong>: No ACL is recommended.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        /**
         * <p>The total inbound traffic in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>472</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>Indicates whether the destination IP address is added to the allowlist. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The destination IP address is on the allowlist.</p>
         * </li>
         * <li><p><strong>false</strong>: The destination IP address is not on the allowlist.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        /**
         * <p>The geographical location of the destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>山东省青岛市</p>
         */
        @NameInMap("LocationName")
        public String locationName;

        /**
         * <p>The total outbound traffic in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>965</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The total number of private assets that initiated outgoing connections to this destination IP.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PrivateAssetCount")
        public Long privateAssetCount;

        /**
         * <p>The UUID of the ACL rule.</p>
         * 
         * <strong>example:</strong>
         * <p>fadsfd-dfadf-df****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the ACL rule.</p>
         * 
         * <strong>example:</strong>
         * <p>默认规则</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The reason for the security recommendation.</p>
         * 
         * <strong>example:</strong>
         * <p>智能策略：该目的域名所属组织为阿里云计算有限公司，主要业务为阿里云，未发现安全风险，可用于配置外联白名单。</p>
         */
        @NameInMap("SecurityReason")
        public String securityReason;

        /**
         * <p>The recommended security action for the outgoing connection. Valid values:</p>
         * <ul>
         * <li><p><strong>pass</strong>: Allows the connection.</p>
         * </li>
         * <li><p><strong>alert</strong>: Rejects the connection.</p>
         * </li>
         * <li><p><strong>drop</strong>: Drops the connection.</p>
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
         * <p>4</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>A list of tags associated with the destination IP.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> tagList;

        /**
         * <p>The total traffic volume in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
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

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAssetCount(Long assetCount) {
            this.assetCount = assetCount;
            return this;
        }
        public Long getAssetCount() {
            return this.assetCount;
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

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setPrivateAssetCount(Long privateAssetCount) {
            this.privateAssetCount = privateAssetCount;
            return this;
        }
        public Long getPrivateAssetCount() {
            return this.privateAssetCount;
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
