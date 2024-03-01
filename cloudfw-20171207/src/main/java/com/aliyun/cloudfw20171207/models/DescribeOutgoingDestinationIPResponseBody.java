// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPResponseBody extends TeaModel {
    /**
     * <p>The IP addresses in outbound connections.</p>
     */
    @NameInMap("DstIPList")
    public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> dstIPList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of destination IP addresses in outbound connections.</p>
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
         */
        @NameInMap("AddressGroupName")
        public String addressGroupName;

        /**
         * <p>The UUID of the address book.</p>
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
         * <p>The application type used in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **FTP**</p>
         * <p>*   **HTTP**</p>
         * <p>*   **HTTPS**</p>
         * <p>*   **Memcache**</p>
         * <p>*   **MongoDB**</p>
         * <p>*   **MQTT**</p>
         * <p>*   **MySQL**</p>
         * <p>*   **RDP**</p>
         * <p>*   **Redis**</p>
         * <p>*   **SMTP**</p>
         * <p>*   **SMTPS**</p>
         * <p>*   **SSH**</p>
         * <p>*   **SSL_No_Cert**</p>
         * <p>*   **SSL**</p>
         * <p>*   **VNC**</p>
         * <br>
         * <p>>  The value of this parameter depends on the value of the Proto parameter. If you set Proto to TCP, you can set ApplicationNameList to any valid value. If you configure both ApplicationNameList and ApplicationName, only the value of ApplicationNameList is used.</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The application port.</p>
         */
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
        /**
         * <p>The type of the tag. Valid values:</p>
         * <br>
         * <p>*   **Suspicious**</p>
         * <p>*   **Malicious**</p>
         * <p>*   **Trusted**</p>
         */
        @NameInMap("ClassId")
        public String classId;

        /**
         * <p>The risk level. Valid values:</p>
         * <br>
         * <p>*   **1**: low</p>
         * <p>*   **2**: medium</p>
         * <p>*   **3**: high</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The description of the tag.</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <p>The ID of the tag.</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The name of the tag.</p>
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
         * <p>Indicates whether an access control policy is configured. Valid values:</p>
         * <br>
         * <p>*   **Uncovered**: no</p>
         * <p>*   **FullCoverage**: yes</p>
         */
        @NameInMap("AclCoverage")
        public String aclCoverage;

        /**
         * <p>The suggestion to configure an access control policy.</p>
         */
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        /**
         * <p>The status of the access control policy. Valid values:</p>
         * <br>
         * <p>*   **normal**: healthy</p>
         * <p>*   **Abnormal**: unhealthy</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The information about the address book.</p>
         */
        @NameInMap("AddressGroupList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListAddressGroupList> addressGroupList;

        /**
         * <p>The application ports.</p>
         */
        @NameInMap("ApplicationPortList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> applicationPortList;

        /**
         * <p>The type of the tag. Valid values:</p>
         * <br>
         * <p>*   **Suspicious**</p>
         * <p>*   **Malicious**</p>
         * <p>*   **Trusted**</p>
         */
        @NameInMap("CategoryClassId")
        public String categoryClassId;

        /**
         * <p>The ID of the service type. Valid values:</p>
         * <br>
         * <p>*   **Aliyun**: Alibaba Cloud services</p>
         * <p>*   **NotAliyun**: third-party services</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The type of the service to which the destination IP address belongs. Valid values:</p>
         * <br>
         * <p>*   **Alibaba Cloud services**</p>
         * <p>*   **Third-party services**</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The destination IP addresses in outbound connections.</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <p>The name of the group to which the access control policy belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether an access control policy is configured. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("HasAcl")
        public String hasAcl;

        /**
         * <p>Indicates whether an access control policy is recommended. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        /**
         * <p>The inbound traffic. Unit: bytes.</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>Indicates whether the destination IP address is added to a whitelist. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        /**
         * <p>The outbound traffic. Unit: bytes.</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The UUID of the access control policy.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the access control policy.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The reason why the domain name is secure.</p>
         */
        @NameInMap("SecurityReason")
        public String securityReason;

        /**
         * <p>The suggestion to handle the traffic of the domain name in outbound connections. Valid values:</p>
         * <br>
         * <p>*   **pass**: allow</p>
         * <p>*   **alert**: deny</p>
         * <p>*   **drop**: monitor</p>
         */
        @NameInMap("SecuritySuggest")
        public String securitySuggest;

        /**
         * <p>The number of requests.</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> tagList;

        /**
         * <p>The total traffic. Unit: bytes</p>
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
