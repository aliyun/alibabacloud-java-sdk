// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPResponseBody extends TeaModel {
    /**
     * <p>The list of IP addresses for outbound connections.</p>
     */
    @NameInMap("DstIPList")
    public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> dstIPList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of outbound IP addresses.</p>
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
         * <p>IP address book</p>
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
         * <p>The Protocol Type supported by the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>FTP</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>Memcache</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>MQTT</strong></li>
         * <li><strong>MySQL</strong></li>
         * <li><strong>RDP</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>SMTP</strong></li>
         * <li><strong>SMTPS</strong></li>
         * <li><strong>SSH</strong></li>
         * <li><strong>SSL_No_Cert</strong></li>
         * <li><strong>SSL</strong></li>
         * <li><strong>VNC</strong></li>
         * </ul>
         * <blockquote>
         * <p>The valid values of this parameter depend on the value of the Proto parameter. If Proto is set to TCP, ApplicationNameList supports all the preceding Protocol Types. If both ApplicationNameList and ApplicationName are specified, ApplicationNameList takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The port of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The list of reasons why the protocol is not analyzed when the identified protocol is Unknown.</p>
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
         * <li><strong>1</strong>: Low risk.</li>
         * <li><strong>2</strong>: Medium risk.</li>
         * <li><strong>3</strong>: High risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The description of the intelligence tags label.</p>
         * 
         * <strong>example:</strong>
         * <p>ReleaseLabel</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <p>The ID of the intelligence tags label.</p>
         * 
         * <strong>example:</strong>
         * <p>ReleaseLabel</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The name of the intelligence label sign.</p>
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
         * <p>Specifies whether to overwrite the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Uncovered</strong>: Not covered.</p>
         * </li>
         * <li><p><strong>FullCoverage</strong>: Covered.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Uncovered</p>
         */
        @NameInMap("AclCoverage")
        public String aclCoverage;

        /**
         * <p>The recommendation information for the ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow recommended</p>
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
         * <p>The address book information.</p>
         */
        @NameInMap("AddressGroupList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList> addressGroupList;

        /**
         * <p>The list of application ports.</p>
         * <blockquote>
         * <p>The list displays only the first 99 application ports. If the number of outbound application ports exceeds 99, only the first 99 entries are displayed.</p>
         * </blockquote>
         */
        @NameInMap("ApplicationPortList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> applicationPortList;

        /**
         * <p>The total number of assets that initiate outbound connections.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AssetCount")
        public Long assetCount;

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
         * <p>The category ID of the product. Valid values:</p>
         * <ul>
         * <li><p><strong>Aliyun</strong>: Alibaba Cloud service.</p>
         * </li>
         * <li><p><strong>NotAliyun</strong>: Non-Alibaba Cloud service.</p>
         * </li>
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
         * <li><p><strong>Alibaba Cloud service</strong></p>
         * </li>
         * <li><p><strong>Non-Alibaba Cloud service</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud service</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The destination IP address of the domain name for outbound connections.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <p>The name of the group in the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rules_test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether an access control rule exists. Valid values:</p>
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
         * <p>Indicates whether an ACL recommendation is available. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        /**
         * <p>The inbound traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>472</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>Indicates whether the IP address is added to the whitelist. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Added.</p>
         * </li>
         * <li><p><strong>false</strong>: Not added.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qingdao, Shandong Province</p>
         */
        @NameInMap("LocationName")
        public String locationName;

        /**
         * <p>The outbound traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>965</p>
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
         * <p>Default rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The security reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Intelligent policy: The organization to which the destination domain name belongs is Alibaba Cloud Computing Ltd. Its main business is Alibaba Cloud. No security risks are found. It can be used to configure an outbound whitelist.</p>
         */
        @NameInMap("SecurityReason")
        public String securityReason;

        /**
         * <p>The security policy for the domain name for outbound connections. Valid values:</p>
         * <ul>
         * <li><p><strong>pass</strong>: Allow.</p>
         * </li>
         * <li><p><strong>alert</strong>: Deny.</p>
         * </li>
         * <li><p><strong>drop</strong>: Monitor.</p>
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
         * <p>The list of tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> tagList;

        /**
         * <p>The total traffic. Unit: bytes.</p>
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
