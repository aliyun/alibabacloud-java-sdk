// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateAclCheckDetailStatusResponseBody extends TeaModel {
    /**
     * <p>The ACL check record.</p>
     */
    @NameInMap("CheckRecord")
    public UpdateAclCheckDetailStatusResponseBodyCheckRecord checkRecord;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6************00090125EEB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAclCheckDetailStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclCheckDetailStatusResponseBody self = new UpdateAclCheckDetailStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAclCheckDetailStatusResponseBody setCheckRecord(UpdateAclCheckDetailStatusResponseBodyCheckRecord checkRecord) {
        this.checkRecord = checkRecord;
        return this;
    }
    public UpdateAclCheckDetailStatusResponseBodyCheckRecord getCheckRecord() {
        return this.checkRecord;
    }

    public UpdateAclCheckDetailStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList extends TeaModel {
        /**
         * <p>The key of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>produce</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tfTestAcc0</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList self = new UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList();
            return TeaModel.build(map, self);
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl extends TeaModel {
        /**
         * <p>The action performed on traffic that matches the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: Allows the traffic.</p>
         * </li>
         * <li><p><strong>drop</strong>: Denies the traffic.</p>
         * </li>
         * <li><p><strong>log</strong>: Monitors the traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>log</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The UUID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1e8ed1b2-cebc-4b95-a9cc-0cb7ce2c0c2c</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>A list of addresses in the address book.</p>
         */
        @NameInMap("AddressList")
        public java.util.List<String> addressList;

        /**
         * <p>The number of addresses in the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AddressListCount")
        public Integer addressListCount;

        /**
         * <p>The application ID for traffic in the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application types supported by the access control policy. Valid values:</p>
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
         * <p>The available application types depend on the <code>Proto</code> value. When <code>Proto</code> is <code>TCP</code>, all the above application types are supported. If both <code>ApplicationName</code> and <code>ApplicationNameList</code> are specified, <code>ApplicationNameList</code> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>A list of application types that are supported by the policy.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>Indicates if public IP addresses from new ECS instances with matching tags are automatically added to the address book. This applies to both newly purchased instances and existing instances whose tags are updated to match.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        /**
         * <p>The time when the policy was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test_policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port for traffic in the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The type of the destination port for traffic in the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>port</strong>: A single port or a port range.</p>
         * </li>
         * <li><p><strong>group</strong>: A port address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>A list of ports in the destination port address book.</p>
         */
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <p>The type of the destination port in the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>port</strong>: A single port or a port range.</p>
         * </li>
         * <li><p><strong>group</strong>: A port address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. This parameter supports fuzzy search. The value of this parameter varies based on the value of <code>DestinationType</code>.</p>
         * <ul>
         * <li><p>If <code>DestinationType</code> is set to<code>net</code>, the value of this parameter is a CIDR block. Example: 10.0.3.0/24.</p>
         * </li>
         * <li><p>If <code>DestinationType</code> is set to<code>domain</code>, the value of this parameter is a domain name. Example: aliyun.</p>
         * </li>
         * <li><p>If <code>DestinationType</code> is set to<code>group</code>, the value of this parameter is the name of an address book. Example: db_group.</p>
         * </li>
         * <li><p>If <code>DestinationType</code> is set to<code>location</code>, the value of this parameter is a location. For more information about location codes, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, all types of destination addresses are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>kms.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>A list of CIDR blocks in the destination address book of the policy.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book in the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: An address book containing IP addresses or CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: An address book containing the IP addresses of ECS instances that match specified tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: An address book containing one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: A threat intelligence address book containing malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: A back-to-source address book containing the back-to-source addresses of Anti-DDoS or WAF instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The type of the destination address in the policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: A destination CIDR block.</p>
         * </li>
         * <li><p><strong>group</strong>: A destination address book.</p>
         * </li>
         * <li><p><strong>domain</strong>: A destination domain name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The traffic direction for the access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>in</strong>: Inbound traffic.</p>
         * </li>
         * <li><p><strong>out</strong>: Outbound traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The result of the DNS resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/32</p>
         */
        @NameInMap("DnsResult")
        public String dnsResult;

        /**
         * <p>The UNIX timestamp, in seconds, of the DNS resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <p>The domain name resolution method of the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>FQDN</strong>: FQDN-based resolution.</p>
         * </li>
         * <li><p><strong>DNS</strong>: Dynamic DNS-based resolution.</p>
         * </li>
         * <li><p><strong>FQDN_AND_DNS</strong>: A combination of FQDN and dynamic DNS-based resolution.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        /**
         * <p>The end time of the query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1752754426</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>subscribe</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the address book. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: An IP address book.</p>
         * </li>
         * <li><p><strong>domain</strong>: A domain address book.</p>
         * </li>
         * <li><p><strong>port</strong>: A port address book.</p>
         * </li>
         * <li><p><strong>tag</strong>: An ECS tag-based address book.</p>
         * </li>
         * <li><p><strong>allCloud</strong>: A cloud service address book.</p>
         * </li>
         * <li><p><strong>threat</strong>: A threat intelligence address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The UUID of the address book.</p>
         * <blockquote>
         * <p>For more information, see <a href="~~DescribeAddressBook~~">DescribeAddressBook</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5a96a798-9b73-47f7-831e-1d7aa3c987a9</p>
         */
        @NameInMap("GroupUuid")
        public String groupUuid;

        /**
         * <p>The UNIX timestamp, in seconds, of the last policy hit.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The hit count of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <p>The IP version of the asset that is protected by Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: IPv4 (default).</p>
         * </li>
         * <li><p><strong>6</strong>: IPv6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The time when the policy was last modified. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw85zno51npz7lgc04z89</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The priority of the access control policy.</p>
         * <p>The priority value starts from 1. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The protocol type of traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * <li><p><strong>ICMP</strong></p>
         * </li>
         * <li><p><strong>ANY</strong>: All protocol types.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, all protocol types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The number of times the address book is referenced.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        /**
         * <p>Indicates whether the policy is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The policy is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: The policy is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>An array of the days of a week or month on which the policy recurs.</p>
         * <ul>
         * <li><p>If <code>RepeatType</code> is set to<code>Permanent</code>,<code>None</code>, or<code>Daily</code>, <code>RepeatDays</code> is an empty array.
         * Example: []</p>
         * </li>
         * <li><p>If <code>RepeatType</code> is set to <code>Weekly</code>, <code>RepeatDays</code> cannot be empty.
         * Example: [0, 6]</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If <code>RepeatType</code> is set to <code>Weekly</code>, <code>RepeatDays</code> cannot contain duplicate values.</p>
         * </blockquote>
         * <ul>
         * <li>If <code>RepeatType</code> is set to<code>Monthly</code>, <code>RepeatDays</code> cannot be empty.
         * Example: [1, 31]</li>
         * </ul>
         * <blockquote>
         * <p>If <code>RepeatType</code> is set to <code>Monthly</code>, <code>RepeatDays</code> cannot contain duplicate values.</p>
         * </blockquote>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The recurrence end time in HH:mm format. The time must be on the hour or half-hour and at least 30 minutes after the start time.</p>
         * <blockquote>
         * <p>This parameter is returned only if <code>RepeatType</code> is <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The recurrence start time in HH:mm format. The time must be on the hour or half-hour and at least 30 minutes before the end time.</p>
         * <blockquote>
         * <p>This parameter is returned only if <code>RepeatType</code> is <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type for the validity period of the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Permanent</strong>: Always.</p>
         * </li>
         * <li><p><strong>None</strong>: A single occurrence.</p>
         * </li>
         * <li><p><strong>Daily</strong>: Daily.</p>
         * </li>
         * <li><p><strong>Weekly</strong>: Weekly.</p>
         * </li>
         * <li><p><strong>Monthly</strong>: Monthly.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <p>The source address in the policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>If <strong>SourceType</strong> is set to<code>net</code>, the value of <code>Source</code> is a source CIDR block.</p>
         * <p>Example: 10.2.4.0/24</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is set to<code>group</code>, the value of <code>Source</code> is the name of a source address book.</p>
         * <p>Example: db_group</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.71.94.24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>A list of CIDR blocks in the source address book of the policy.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: An address book containing IP addresses or CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: An address book containing the IP addresses of ECS instances that match specified tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: An address book containing one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: A threat intelligence address book containing malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: A back-to-source address book containing the back-to-source addresses of Anti-DDoS or WAF instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The type of the source address in the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: A source CIDR block.</p>
         * </li>
         * <li><p><strong>group</strong>: A source address book.</p>
         * </li>
         * <li><p><strong>location</strong>: A source region.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The number of rule entries that the policy consumes. The number of entries that a single policy consumes is calculated by using the following formula: Number of source CIDR blocks × Number of destination addresses (CIDR blocks, locations, or domain names) × Number of applications × Number of port ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

        /**
         * <p>The start time of the query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1736130347</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>A list of ECS tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList> tagList;

        /**
         * <p>The logical relationship among multiple ECS tags.</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("TagRelation")
        public String tagRelation;

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-cw4z051hr8x53qniv5</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        public static UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl build(java.util.Map<String, ?> map) throws Exception {
            UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl self = new UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl();
            return TeaModel.build(map, self);
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAddressList(java.util.List<String> addressList) {
            this.addressList = addressList;
            return this;
        }
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAddressListCount(Integer addressListCount) {
            this.addressListCount = addressListCount;
            return this;
        }
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAutoAddTagEcs(Integer autoAddTagEcs) {
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }
        public Integer getAutoAddTagEcs() {
            return this.autoAddTagEcs;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestPortGroupPorts(java.util.List<String> destPortGroupPorts) {
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDnsResult(String dnsResult) {
            this.dnsResult = dnsResult;
            return this;
        }
        public String getDnsResult() {
            return this.dnsResult;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDnsResultTime(Long dnsResultTime) {
            this.dnsResultTime = dnsResultTime;
            return this;
        }
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDomainResolveType(Integer domainResolveType) {
            this.domainResolveType = domainResolveType;
            return this;
        }
        public Integer getDomainResolveType() {
            return this.domainResolveType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setGroupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }
        public String getGroupUuid() {
            return this.groupUuid;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRepeatDays(java.util.List<Long> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<Long> getRepeatDays() {
            return this.repeatDays;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRepeatEndTime(String repeatEndTime) {
            this.repeatEndTime = repeatEndTime;
            return this;
        }
        public String getRepeatEndTime() {
            return this.repeatEndTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRepeatStartTime(String repeatStartTime) {
            this.repeatStartTime = repeatStartTime;
            return this;
        }
        public String getRepeatStartTime() {
            return this.repeatStartTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRepeatType(String repeatType) {
            this.repeatType = repeatType;
            return this;
        }
        public String getRepeatType() {
            return this.repeatType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSpreadCnt(Integer spreadCnt) {
            this.spreadCnt = spreadCnt;
            return this;
        }
        public Integer getSpreadCnt() {
            return this.spreadCnt;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setTagList(java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList> getTagList() {
            return this.tagList;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setTagRelation(String tagRelation) {
            this.tagRelation = tagRelation;
            return this;
        }
        public String getTagRelation() {
            return this.tagRelation;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

    }

    public static class UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls extends TeaModel {
        /**
         * <p>The ACL check result.</p>
         */
        @NameInMap("Acl")
        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl acl;

        /**
         * <p>The assessment details of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>No traffic hit policy.</p>
         */
        @NameInMap("AclAssessmentDetail")
        public String aclAssessmentDetail;

        /**
         * <p>The status of the policy check.</p>
         * 
         * <strong>example:</strong>
         * <p>configuring</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        public static UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls build(java.util.Map<String, ?> map) throws Exception {
            UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls self = new UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls();
            return TeaModel.build(map, self);
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls setAcl(UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl acl) {
            this.acl = acl;
            return this;
        }
        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl getAcl() {
            return this.acl;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls setAclAssessmentDetail(String aclAssessmentDetail) {
            this.aclAssessmentDetail = aclAssessmentDetail;
            return this;
        }
        public String getAclAssessmentDetail() {
            return this.aclAssessmentDetail;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

    }

    public static class UpdateAclCheckDetailStatusResponseBodyCheckRecord extends TeaModel {
        /**
         * <p>A list of ACL check results.</p>
         */
        @NameInMap("Acls")
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls> acls;

        /**
         * <p>The name of the ACL check. Valid values:</p>
         * <ul>
         * <li><p><strong>PolicyHitCountZero</strong>: The policy has no traffic hits.</p>
         * </li>
         * <li><p><strong>PolicySourceDestinationSame</strong>: The source and destination are the same, rendering the policy invalid.</p>
         * </li>
         * <li><p><strong>PolicyDuplicate</strong>: The policy is duplicate or redundant.</p>
         * </li>
         * <li><p><strong>PolicyConflict</strong>: The policy conflicts with business requirements.</p>
         * </li>
         * <li><p><strong>DefaultPolicyNotDeny</strong>: The default policy is not a Deny All policy, which is recommended for whitelist mechanisms.</p>
         * </li>
         * <li><p><strong>PolicyPortHighRisk</strong>: The policy allows traffic on high-risk ports.</p>
         * </li>
         * <li><p><strong>PolicyTooLoose</strong>: The policy is overly permissive or too broad.</p>
         * </li>
         * <li><p><strong>AddressBookIpSeparated</strong>: The IP address books contain duplicate, overlapping, or scattered entries.</p>
         * </li>
         * <li><p><strong>AddressBookPortSeparated</strong>: The port address books contain duplicate, overlapping, or scattered entries.</p>
         * </li>
         * <li><p><strong>AddressBookDomainValid</strong>: The domain name address book contains invalid entries.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PolicyHitCountZero</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_mysql_lingwan_faxing_chat_config_di</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The UNIX timestamp, in seconds, of the last check.</p>
         * 
         * <strong>example:</strong>
         * <p>1724982259</p>
         */
        @NameInMap("LastCheckTime")
        public String lastCheckTime;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The total number of policies.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PolicyTotalCount")
        public Long policyTotalCount;

        /**
         * <p>The assessment details of the check.</p>
         * 
         * <strong>example:</strong>
         * <p>Due to business offline or other reasons, the number of hits of the object policy in a period of time is 0.</p>
         */
        @NameInMap("RecordAssessmentDetail")
        public String recordAssessmentDetail;

        /**
         * <p>The ID of the ACL check task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-c92d4544ef7b6a42</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateAclCheckDetailStatusResponseBodyCheckRecord build(java.util.Map<String, ?> map) throws Exception {
            UpdateAclCheckDetailStatusResponseBodyCheckRecord self = new UpdateAclCheckDetailStatusResponseBodyCheckRecord();
            return TeaModel.build(map, self);
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setAcls(java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls> acls) {
            this.acls = acls;
            return this;
        }
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls> getAcls() {
            return this.acls;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setPolicyTotalCount(Long policyTotalCount) {
            this.policyTotalCount = policyTotalCount;
            return this;
        }
        public Long getPolicyTotalCount() {
            return this.policyTotalCount;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setRecordAssessmentDetail(String recordAssessmentDetail) {
            this.recordAssessmentDetail = recordAssessmentDetail;
            return this;
        }
        public String getRecordAssessmentDetail() {
            return this.recordAssessmentDetail;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
