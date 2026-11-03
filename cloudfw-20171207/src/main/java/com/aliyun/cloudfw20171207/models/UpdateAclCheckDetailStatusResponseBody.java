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
     * <p>The request ID.</p>
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
         * <p>The ECS tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>produce</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The ECS tag key.</p>
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
         * <p>The action that Cloud Firewall performs on the traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the traffic.</li>
         * <li><strong>drop</strong>: blocks the traffic.</li>
         * <li><strong>log</strong>: monitors the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>log</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The unique ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1e8ed1b2-cebc-4b95-a9cc-0cb7ce2c0c2c</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The list of addresses in the address book.</p>
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
         * <p>The ID of the application for the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application type supported by the access control policy. Valid values:</p>
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
         * <p>The valid values of the application type depend on the protocol type specified by Proto. If Proto is set to TCP, ApplicationNameList supports all the preceding application types. If both ApplicationNameList and ApplicationName are specified, ApplicationNameList takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The list of application types supported by the access control policy.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>Specifies whether to automatically add the public IP addresses of newly tagged ECS instances to the address book. Newly tagged ECS instances include newly purchased ECS instances with tags configured and ECS instances with modified tags.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        /**
         * <p>The time when the policy was created. The value is a UNIX timestamp measured in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test_policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port of the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The type of the destination port in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: port</li>
         * <li><strong>group</strong>: port address book</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>The list of ports in the destination port address book.</p>
         */
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <p>The type of the destination port in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: port</li>
         * <li><strong>group</strong>: port address book</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the destination type (DestinationType).</p>
         * <ul>
         * <li>If DestinationType is set to <code>net</code>, the value is a CIDR block. Example: 10.0.3.0/24.</li>
         * <li>If DestinationType is set to <code>domain</code>, the value is a domain name. Example: aliyun.</li>
         * <li>If DestinationType is set to <code>group</code>, the value is the name of an address book. Example: db_group.</li>
         * <li>If DestinationType is set to <code>location</code>, the value is an area name. For more information about the area positional encoding, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
         * </ul>
         * <blockquote>
         * <p>If the Settings for this parameter are not specified, all types of destination addresses are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>kms.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The list of CIDR blocks in the destination address book of the access control policy.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address book that contains one or more CIDR blocks</li>
         * <li><strong>tag</strong>: ECS tag-based address book that contains the IP addresses of one or more ECS tags</li>
         * <li><strong>domain</strong>: domain name address book that contains one or more domain names</li>
         * <li><strong>threat</strong>: threat intelligence address book that contains one or more malicious IP addresses or domain names</li>
         * <li><strong>backsrc</strong>: back-to-origin address book that contains the back-to-origin addresses of one or more Anti-DDoS or WAF instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The type of the destination address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: destination CIDR block</li>
         * <li><strong>group</strong>: destination address book</li>
         * <li><strong>domain</strong>: destination domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The traffic direction controlled by the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound traffic</li>
         * <li><strong>out</strong>: outbound traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The DNS resolution result.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/32</p>
         */
        @NameInMap("DnsResult")
        public String dnsResult;

        /**
         * <p>The timestamp of the DNS resolution. The value is a UNIX timestamp measured in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <p>The domain name resolution mode of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>FQDN</strong>: FQDN-based resolution</li>
         * <li><strong>DNS</strong>: DNS-based dynamic resolution</li>
         * <li><strong>FQDN_AND_DNS</strong>: FQDN- and DNS-based dynamic resolution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        /**
         * <p>The end time of the query. The value is a UNIX timestamp measured in seconds.</p>
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
         * <li><strong>ip</strong>: IP address book</li>
         * <li><strong>domain</strong>: domain name address book</li>
         * <li><strong>port</strong>: port address book</li>
         * <li><strong>tag</strong>: ECS tag-based address book</li>
         * <li><strong>allCloud</strong>: cloud service address book</li>
         * <li><strong>threat</strong>: threat intelligence address book</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The unique ID of the address book.</p>
         * <blockquote>
         * <p>Value source: <a href="~~DescribeAddressBook~~">List address books</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5a96a798-9b73-47f7-831e-1d7aa3c987a9</p>
         */
        @NameInMap("GroupUuid")
        public String groupUuid;

        /**
         * <p>The timestamp of the latest time of hits. The value is in the UNIX timestamp format measured in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The number of hits of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <p>The IP version of the asset protected by Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4 (default).</li>
         * <li><strong>6</strong>: IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The time when the policy was last modified. The value is a UNIX timestamp measured in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw85zno51npz7lgc04z89</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The priority of the access control policy.
         * The priority starts from 1 and increases in ascending order. A smaller priority number indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ICMP</strong></li>
         * <li><strong>ANY</strong>: all protocol types<blockquote>
         * <p>If this parameter is not specified, all protocol types are queried.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The status of the access control policy. By default, a policy is enabled after it is created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The policy is enabled.</li>
         * <li><strong>false</strong>: The policy is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The set of recurrence days for the Policy Validity Period of the access control policy.</p>
         * <ul>
         * <li>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, RepeatDays is an empty set. Example: [].</li>
         * <li>If RepeatType is set to <code>Weekly</code>, RepeatDays cannot be empty. Example: [0, 6].<blockquote>
         * <p>If the Settings for RepeatType are <code>Weekly</code>, the values in RepeatDays cannot be duplicate.</p>
         * </blockquote>
         * </li>
         * <li>If RepeatType is set to <code>Monthly</code>, RepeatDays cannot be empty. Example: [1, 31].<blockquote>
         * <p>If the Settings for RepeatType are <code>Monthly</code>, the values in RepeatDays cannot be duplicate.</p>
         * </blockquote>
         * </li>
         * </ul>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The recurrence end time of the policy validity period. The time must be in the 24-hour HH:mm format, such as 23:30. It must be on the hour or half hour, and at least 30 minutes later than the recurrence start time.</p>
         * <blockquote>
         * <p>If RepeatType is set to <code>Permanent</code> or <code>None</code>, RepeatEndTime is empty. If RepeatType is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, RepeatEndTime must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The recurrence start time of the policy validity period. The time must be in the 24-hour HH:mm format, such as 08:00. It must be on the hour or half hour, and at least 30 minutes earlier than the recurrence end time.</p>
         * <blockquote>
         * <p>If RepeatType is set to <code>Permanent</code> or <code>None</code>, RepeatStartTime is empty. If RepeatType is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, RepeatStartTime must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type of the Policy Validity Period for the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>Permanent</strong>: always (default)</li>
         * <li><strong>None</strong>: specified single time</li>
         * <li><strong>Daily</strong>: every day</li>
         * <li><strong>Weekly</strong>: every week</li>
         * <li><strong>Monthly</strong>: every month</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <p>The source address in the access control policy. Valid values:</p>
         * <ul>
         * <li>If <strong>SourceType</strong> is set to <code>net</code>, the value is a source CIDR block. Example: 10.2.4.0/24.</li>
         * <li>If <strong>SourceType</strong> is set to <code>group</code>, the value is the name of a source address book. Example: db_group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.71.94.24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The list of CIDR blocks in the source address book of the access control policy.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address book that contains one or more CIDR blocks</li>
         * <li><strong>tag</strong>: ECS tag-based address book that contains the IP addresses of one or more ECS tags</li>
         * <li><strong>domain</strong>: domain name address book that contains one or more domain names</li>
         * <li><strong>threat</strong>: threat intelligence address book that contains one or more malicious IP addresses or domain names</li>
         * <li><strong>backsrc</strong>: back-to-origin address book that contains the back-to-origin addresses of one or more Anti-DDoS or WAF instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: source CIDR block</li>
         * <li><strong>group</strong>: source address book</li>
         * <li><strong>location</strong>: source region</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The number of access control policy quotas consumed. This value is the sum of the quotas consumed by each policy.
         * The number of quotas consumed by a single policy = Number of source CIDR blocks × Number of destination addresses (number of CIDR blocks, regions, or domain names) × Number of applications × Number of port ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

        /**
         * <p>The start time of the query. The value is a UNIX timestamp measured in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1736130347</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The list of ECS tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList> tagList;

        /**
         * <p>The relationship between multiple ECS tags.</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("TagRelation")
        public String tagRelation;

        /**
         * <p>The instance ID of the border virtual private cloud (VPC) firewalls.</p>
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
         * <p>The assessment details of the ACL policy.</p>
         * 
         * <strong>example:</strong>
         * <p>No traffic hit policy.</p>
         */
        @NameInMap("AclAssessmentDetail")
        public String aclAssessmentDetail;

        /**
         * <p>The ACL check status.</p>
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
         * <p>The list of ACL check results.</p>
         */
        @NameInMap("Acls")
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls> acls;

        /**
         * <p>The name of the ACL check. Valid values:</p>
         * <ul>
         * <li><strong>PolicyHitCountZero</strong>: policies with no traffic hits</li>
         * <li><strong>PolicySourceDestinationSame</strong>: Invalid policy with the same source and destination</li>
         * <li><strong>PolicyDuplicate</strong>: Duplicate or redundant policy</li>
         * <li><strong>PolicyConflict</strong>: Policy that conflicts with business</li>
         * <li><strong>DefaultPolicyNotDeny</strong>: default policy that does not use the Deny All whitelist mechanism</li>
         * <li><strong>PolicyPortHighRisk</strong>: policies that allow traffic on high-risk ports</li>
         * <li><strong>PolicyTooLoose</strong>: overly loose control policy</li>
         * <li><strong>AddressBookIpSeparated</strong>: duplicate, overlapping, or scattered IP address books</li>
         * <li><strong>AddressBookPortSeparated</strong>: duplicate, overlapping, or scattered port address books</li>
         * <li><strong>AddressBookDomainValid</strong>: validity check for domain name address books</li>
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
         * <p>The timestamp of the last check. The value is a UNIX timestamp measured in seconds.</p>
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
         * <p>The assessment details of the ACL check record.</p>
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
