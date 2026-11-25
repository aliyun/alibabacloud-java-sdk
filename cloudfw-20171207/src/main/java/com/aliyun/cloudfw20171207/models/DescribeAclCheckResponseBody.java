// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclCheckResponseBody extends TeaModel {
    /**
     * <p>The check record.</p>
     */
    @NameInMap("CheckRecord")
    public DescribeAclCheckResponseBodyCheckRecord checkRecord;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25E655B0-CAED-53D4-8054-F983126****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAclCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclCheckResponseBody self = new DescribeAclCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclCheckResponseBody setCheckRecord(DescribeAclCheckResponseBodyCheckRecord checkRecord) {
        this.checkRecord = checkRecord;
        return this;
    }
    public DescribeAclCheckResponseBodyCheckRecord getCheckRecord() {
        return this.checkRecord;
    }

    public DescribeAclCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses extends TeaModel {
        /**
         * <p>The address information in the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/32</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The description note.</p>
         * 
         * <strong>example:</strong>
         * <p>Reviewed</p>
         */
        @NameInMap("Note")
        public String note;

        public static DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses self = new DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsAclTagList extends TeaModel {
        /**
         * <p>The key of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ss</p>
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

        public static DescribeAclCheckResponseBodyCheckRecordAclsAclTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsAclTagList self = new DescribeAclCheckResponseBodyCheckRecordAclsAclTagList();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAclTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAclTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsAcl extends TeaModel {
        /**
         * <p>The action that Cloud Firewall performs on the traffic that matches the access control policy. Valid values:</p>
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
         * <p>The UUID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>997b38e0-01fa-4db7-8d30-02ebf6fdb747</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The address information in the address book.</p>
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
         * <p>The list of addresses and description notes.</p>
         */
        @NameInMap("Addresses")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses> addresses;

        /**
         * <p>The ID of the application for the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>plugin_idp4_ciam</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application types supported by the access control policies for VPC border firewalls. Use ApplicationNameList. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SMTP</strong></li>
         * <li><strong>SMTPS</strong></li>
         * <li><strong>RDP</strong></li>
         * <li><strong>VNC</strong></li>
         * <li><strong>SSH</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>MQTT</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>Memcache</strong></li>
         * <li><strong>SSL</strong></li>
         * <li><strong>ANY</strong>: all application types of the access control policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The list of application types supported by the access control policy. Valid values:</p>
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
         * <li><strong>SSL</strong></li>
         * <li><strong>VNC</strong></li>
         * <li><strong>ANY</strong>: all application types.</li>
         * </ul>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>Specifies whether to automatically add the public IP addresses of newly matched ECS instances to the address book. Newly matched ECS instances refer to newly purchased ECS instances with tags configured or ECS instances with modified tags.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        /**
         * <p>The creation time of the policy. The value is a UNIX timestamp in seconds.</p>
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
         * <p>80/80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The type of the destination port for traffic access in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: port.</li>
         * <li><strong>group</strong>: port address book.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>my_port_group</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>The ports in the destination port address book.</p>
         */
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <p>The type of the destination port for traffic access in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: port.</li>
         * <li><strong>group</strong>: port address book.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the destination type.</p>
         * <ul>
         * <li><p>If the destination type is <code>net</code>, the destination address is a CIDR block. Example: 10.0.3.0/24.</p>
         * </li>
         * <li><p>If the destination type is <code>domain</code>, the destination address is a domain name. Example: aliyun.</p>
         * </li>
         * <li><p>If the destination type is <code>group</code>, the destination address is the name of an address book. Example: db_group.</p>
         * </li>
         * <li><p>If the destination type is <code>location</code>, the destination address is an area name. For more information about the positional encoding of specific areas, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, all types of destination addresses are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>kms.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The CIDR blocks in the destination address book of the access control policy.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: IP address book, which contains one or more CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: ECS tag-based address book, which contains the IP addresses of one or more ECS tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: domain name address book, which contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: back-to-origin address book, which contains the back-to-origin addresses of one or more Anti-DDoS or WAF instances.</p>
         * </li>
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
         * <li><strong>net</strong>: destination CIDR block.</li>
         * <li><strong>group</strong>: destination address book.</li>
         * <li><strong>domain</strong>: destination domain name.</li>
         * <li><strong>location</strong>: destination location.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The traffic direction on the Internet. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound traffic access control.</li>
         * <li><strong>out</strong>: outbound traffic access control.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The DNS resolution result.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("DnsResult")
        public String dnsResult;

        /**
         * <p>The timestamp of DNS resolution. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <p>The domain name resolution mode of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>FQDN</strong>: FQDN-based resolution.</li>
         * <li><strong>DNS</strong>: DNS-based dynamic resolution.</li>
         * <li><strong>FQDN_AND_DNS</strong>: FQDN- and DNS-based dynamic resolution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FQDN</p>
         */
        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        /**
         * <p>The end time of the Policy Validity Period for the access control policy. The value is a UNIX timestamp in the seconds format. The time must be on the hour or half-hour, and must be at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p>If RepeatType is Permanent, EndTime is empty. If RepeatType is None, Daily, Weekly, or Monthly, EndTime must have a value, and you must specify the end time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1758334822</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhong Kui Open White List</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the address book. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: IP address book.</p>
         * </li>
         * <li><p><strong>domain</strong>: domain name address book.</p>
         * </li>
         * <li><p><strong>port</strong>: port address book.</p>
         * </li>
         * <li><p><strong>tag</strong>: ECS tag-based address book.</p>
         * </li>
         * <li><p><strong>allCloud</strong>: cloud service address book.</p>
         * </li>
         * <li><p><strong>threat</strong>: threat intelligence address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The UUID of the address book.</p>
         * <p>To delete an address book for access control, you must provide the UUID of the address book. You can call the <a href="https://help.aliyun.com/document_detail/138869.html">DescribeAddressBook</a> operation to obtain the UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>b91d86c3-2b52-4534-aae9-8d0339b12a48</p>
         */
        @NameInMap("GroupUuid")
        public String groupUuid;

        /**
         * <p>The latest time of hits. The value is a UNIX timestamp in the seconds format.</p>
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
         * <p>The IP address version. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4.</li>
         * <li><strong>6</strong>: IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The last modification time of the policy. The value is a UNIX timestamp in seconds.</p>
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
         * <p>ngw-2ze4w62zbdkwjmoqeokgl</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The priority of the access control policy.</p>
         * <p>The priority starts from 1 and increments sequentially. A smaller priority number indicates a higher priority.</p>
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
         * <li><strong>ANY</strong>: all protocol types.<blockquote>
         * <p>If you do not specify this parameter, all protocol types are queried.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
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
         * <p>The status of the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The access control policy is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: The access control policy is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The recurrence days of the Policy Validity Period for the access control policy.</p>
         * <blockquote>
         * <p>If RepeatType is set to Weekly, valid values are 0 to 6, where 0 indicates Sunday.
         * If RepeatType is set to Monthly, valid values are 1 to 31.</p>
         * </blockquote>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The recurrence end time of the Policy Validity Period for the access control policy. Example: 23:30. The time must be on the hour or half-hour, and must be at least 30 minutes later than the recurrence start time.</p>
         * <blockquote>
         * <p>If RepeatType is Permanent or None, RepeatEndTime is empty. If RepeatType is Daily, Weekly, or Monthly, RepeatEndTime must have a value, and you must specify the recurrence end time.
         * The time is in the HH:mm format (24-hour clock). Examples: 08:00 and 23:30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The recurrence start time of the Policy Validity Period for the access control policy. Example: 08:00. The time must be on the hour or half-hour, and must be at least 30 minutes earlier than the recurrence end time.</p>
         * <blockquote>
         * <p>If RepeatType is Permanent or None, RepeatStartTime is empty. If RepeatType is Daily, Weekly, or Monthly, RepeatStartTime must have a value, and you must specify the recurrence start time.
         * The time is in the HH:mm format (24-hour clock). Examples: 08:00 and 23:30.</p>
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
         * <li><strong>Permanent</strong> (default): always.</li>
         * <li><strong>None</strong>: specified single time.</li>
         * <li><strong>Daily</strong>: every day.</li>
         * <li><strong>Weekly</strong>: every week.</li>
         * <li><strong>Monthly</strong>: every month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Permanent</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <p>The source address in the access control policy. Valid values:</p>
         * <ul>
         * <li>If <strong>SourceType</strong> is set to <code>net</code>, the source address is a CIDR block. Example: 192.0.XX.XX/24.</li>
         * <li>If <strong>SourceType</strong> is set to <code>group</code>, the source address is the name of a source address book. Example: db_group.</li>
         * <li>If <strong>SourceType</strong> is set to <code>location</code>, the source address is an area. For more information about the positional encoding of specific areas, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.28.7.167</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The CIDR blocks in the source address book of the access control policy.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: IP address book, which contains one or more CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: ECS tag-based address book, which contains the IP addresses of one or more ECS tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: domain name address book, which contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: back-to-origin address book, which contains the back-to-origin addresses of one or more Anti-DDoS or WAF instances.</p>
         * </li>
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
         * <li><strong>net</strong>: source CIDR block.</li>
         * <li><strong>group</strong>: source address book.</li>
         * <li><strong>location</strong>: source location.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The quota consumed by the access control policy, which is the sum of the quota consumed by each policy.
         * Quota consumed by a single policy = Number of source addresses (number of CIDR blocks or locations) × Number of destination addresses (number of CIDR blocks, locations, or domain names) × Number of port ranges × Number of applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1730318400</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The list of ECS tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclTagList> tagList;

        /**
         * <p>The relationship between multiple ECS tags. Valid values:</p>
         * <ul>
         * <li><p><strong>and</strong>: The logical AND relation. The public IP addresses of Elastic Compute Service (ECS) instances that match all specified tags are added to the address book.</p>
         * </li>
         * <li><p><strong>or</strong>: The logical OR relation. The public IP addresses of Elastic Compute Service (ECS) instances that match any of the specified tags are added to the address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        @NameInMap("TagRelation")
        public String tagRelation;

        /**
         * <p>The instance ID of the VPC border firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-925514970c2c4bcab222</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        public static DescribeAclCheckResponseBodyCheckRecordAclsAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsAcl self = new DescribeAclCheckResponseBodyCheckRecordAclsAcl();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAddressList(java.util.List<String> addressList) {
            this.addressList = addressList;
            return this;
        }
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAddressListCount(Integer addressListCount) {
            this.addressListCount = addressListCount;
            return this;
        }
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAddresses(java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses> getAddresses() {
            return this.addresses;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAutoAddTagEcs(Integer autoAddTagEcs) {
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }
        public Integer getAutoAddTagEcs() {
            return this.autoAddTagEcs;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestPortGroupPorts(java.util.List<String> destPortGroupPorts) {
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDnsResult(String dnsResult) {
            this.dnsResult = dnsResult;
            return this;
        }
        public String getDnsResult() {
            return this.dnsResult;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDnsResultTime(Long dnsResultTime) {
            this.dnsResultTime = dnsResultTime;
            return this;
        }
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDomainResolveType(Integer domainResolveType) {
            this.domainResolveType = domainResolveType;
            return this;
        }
        public Integer getDomainResolveType() {
            return this.domainResolveType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setGroupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }
        public String getGroupUuid() {
            return this.groupUuid;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRepeatDays(java.util.List<Long> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<Long> getRepeatDays() {
            return this.repeatDays;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRepeatEndTime(String repeatEndTime) {
            this.repeatEndTime = repeatEndTime;
            return this;
        }
        public String getRepeatEndTime() {
            return this.repeatEndTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRepeatStartTime(String repeatStartTime) {
            this.repeatStartTime = repeatStartTime;
            return this;
        }
        public String getRepeatStartTime() {
            return this.repeatStartTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRepeatType(String repeatType) {
            this.repeatType = repeatType;
            return this;
        }
        public String getRepeatType() {
            return this.repeatType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSpreadCnt(Integer spreadCnt) {
            this.spreadCnt = spreadCnt;
            return this;
        }
        public Integer getSpreadCnt() {
            return this.spreadCnt;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setTagList(java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclTagList> getTagList() {
            return this.tagList;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setTagRelation(String tagRelation) {
            this.tagRelation = tagRelation;
            return this;
        }
        public String getTagRelation() {
            return this.tagRelation;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses extends TeaModel {
        /**
         * <p>The address in the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1/32</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The description of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Note")
        public String note;

        public static DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses self = new DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent extends TeaModel {
        /**
         * <p>The action that Cloud Firewall performs on traffic in an access control policy. Valid values:</p>
         * <ul>
         * <li>accept: Allows the traffic.</li>
         * <li>drop: Denies the traffic.</li>
         * <li>log: Monitors the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The address book.</p>
         */
        @NameInMap("Addresses")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses> addresses;

        /**
         * <p>The list of application types supported by the access control policy.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port for traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li>If the protocol type is ICMP, DestPort is left empty.</li>
         * </ul>
         * <blockquote>
         * <p>When the protocol type is ICMP, access control on destination ports is not supported.</p>
         * </blockquote>
         * <ul>
         * <li>If the protocol type is TCP, UDP, or ANY, and the destination port type (DestPortType) is group, DestPort is left empty.</li>
         * </ul>
         * <blockquote>
         * <p>If you set the destination port type to group (destination port address book), you do not need to specify a destination port number. All ports that you want the access control policy to manage are included in the destination port address book.</p>
         * </blockquote>
         * <ul>
         * <li>If the protocol type is TCP, UDP, or ANY, and the destination port type (DestPortType) is port, DestPort is the destination port number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book for traffic in the access control policy.</p>
         * <blockquote>
         * <p>If DestPortType is set to group, you must specify the name of the destination port address book.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>my_port_group</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>The type of the destination port for traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li>port: Port.</li>
         * <li>group: Port address book.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. Valid values:</p>
         * <p>If DestinationType is set to net, Destination is the destination CIDR block.
         * Example: 1.2.XX.XX/24</p>
         * <p>If DestinationType is set to group, Destination is the name of the destination address book.
         * Example: db_group</p>
         * <p>If DestinationType is set to domain, Destination is the destination domain name.
         * Example: *.aliyuncs.com</p>
         * <p>If DestinationType is set to location, Destination is the destination region.
         * Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.2.2/32</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The type of the destination address in the access control policy. Valid values:</p>
         * <ul>
         * <li><p>net: Destination CIDR block.</p>
         * </li>
         * <li><p>group: Destination address book.</p>
         * </li>
         * <li><p>domain: Destination domain name.</p>
         * </li>
         * <li><p>location: Destination region.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The priority of the access control policy. The priority value starts from 1 and increases sequentially. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Long order;

        /**
         * <p>The protocol type of traffic in an access control policy. Valid values:</p>
         * <ul>
         * <li>ANY (any protocol)</li>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>ICMP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The status of the access control policy. By default, a policy is enabled after it is created. Valid values:</p>
         * <ul>
         * <li>true: Enables the access control policy.</li>
         * <li>false: Disables the access control policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The source address in the access control policy. Valid values:</p>
         * <p>If SourceType is set to net, Source is the source CIDR block.
         * Example: 1.1.XX.XX/24</p>
         * <p>If SourceType is set to group, Source is the name of the source address book.
         * Example: db_group</p>
         * <p>If SourceType is set to location, Source is the source region.
         * Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1/32</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <ul>
         * <li>net: Source CIDR block.</li>
         * <li>group: Source address book.</li>
         * <li>location: Source region.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent self = new DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setAddresses(java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContentAddresses> getAddresses() {
            return this.addresses;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setOrder(Long order) {
            this.order = order;
            return this;
        }
        public Long getOrder() {
            return this.order;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions extends TeaModel {
        /**
         * <p>The recommended action. Valid values:</p>
         * <ul>
         * <li>CreateRule: Creates a policy.</li>
         * <li>DeleteRule: Deletes a policy.</li>
         * <li>DisableRule: Disables a policy.</li>
         * <li>ModifyRule: Modifies a policy.</li>
         * <li>ModifyAddressGroup: Modifies an IP or domain name address book.</li>
         * <li>ModifyPortGroup: Modifies a port address book.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DisableRule</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The recommended content.</p>
         */
        @NameInMap("RecommendContent")
        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent recommendContent;

        public static DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions self = new DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions setRecommendContent(DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent recommendContent) {
            this.recommendContent = recommendContent;
            return this;
        }
        public DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptionsRecommendContent getRecommendContent() {
            return this.recommendContent;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAcls extends TeaModel {
        /**
         * <p>The access control policy check result.</p>
         */
        @NameInMap("Acl")
        public DescribeAclCheckResponseBodyCheckRecordAclsAcl acl;

        /**
         * <p>The assessment details of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>No traffic hit policy.</p>
         */
        @NameInMap("AclAssessmentDetail")
        public String aclAssessmentDetail;

        /**
         * <p>The access control policy check status.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The action taken for rules that are being processed or have been processed.</p>
         * <ol>
         * <li>CreateRule: Creates a policy.</li>
         * <li>DeleteRule: Deletes a policy.</li>
         * <li>DisableRule: Disables a policy.</li>
         * <li>ModifyRule: Modifies a policy.</li>
         * <li>ModifyAddressGroup: Modifies an IP or domain name address book.</li>
         * <li>ModifyPortGroup: Modifies a port address book.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>DisableRule</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The processing status. Valid values:</p>
         * <ol>
         * <li>Pending: unprocessed</li>
         * <li>Success: processed successfully</li>
         * <li>Processing: being processed</li>
         * <li>Ignored: ignored</li>
         * <li>Failed: processing failed</li>
         * <li>PendingOrFailed: unprocessed or processing failed</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("ProcessStatus")
        public String processStatus;

        /**
         * <p>The recommended options.</p>
         */
        @NameInMap("RecommendOptions")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions> recommendOptions;

        public static DescribeAclCheckResponseBodyCheckRecordAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAcls self = new DescribeAclCheckResponseBodyCheckRecordAcls();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setAcl(DescribeAclCheckResponseBodyCheckRecordAclsAcl acl) {
            this.acl = acl;
            return this;
        }
        public DescribeAclCheckResponseBodyCheckRecordAclsAcl getAcl() {
            return this.acl;
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setAclAssessmentDetail(String aclAssessmentDetail) {
            this.aclAssessmentDetail = aclAssessmentDetail;
            return this;
        }
        public String getAclAssessmentDetail() {
            return this.aclAssessmentDetail;
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setProcessStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public String getProcessStatus() {
            return this.processStatus;
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setRecommendOptions(java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions> recommendOptions) {
            this.recommendOptions = recommendOptions;
            return this;
        }
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsRecommendOptions> getRecommendOptions() {
            return this.recommendOptions;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecord extends TeaModel {
        /**
         * <p>The total number of access control policies at the time of the check.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AclTotalCount")
        public Long aclTotalCount;

        /**
         * <p>The list of access control policy check results.</p>
         */
        @NameInMap("Acls")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAcls> acls;

        /**
         * <p>The name of the access control policy check.</p>
         * 
         * <strong>example:</strong>
         * <p>PolicyHitCountZero</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <p>The description of the access control policy check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Due to business offline or other reasons, the number of hits of the object policy in a period of time is 0.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp of the last check. Unit: seconds.</p>
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
         * <p>The assessment details of the access control policy check.</p>
         * 
         * <strong>example:</strong>
         * <p>It is recommended to remove the invalid policy, while helping to save the specification.</p>
         */
        @NameInMap("RecordAssessmentDetail")
        public String recordAssessmentDetail;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-c92d4544ef7b6a42</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeAclCheckResponseBodyCheckRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecord self = new DescribeAclCheckResponseBodyCheckRecord();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecord setAclTotalCount(Long aclTotalCount) {
            this.aclTotalCount = aclTotalCount;
            return this;
        }
        public Long getAclTotalCount() {
            return this.aclTotalCount;
        }

        public DescribeAclCheckResponseBodyCheckRecord setAcls(java.util.List<DescribeAclCheckResponseBodyCheckRecordAcls> acls) {
            this.acls = acls;
            return this;
        }
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAcls> getAcls() {
            return this.acls;
        }

        public DescribeAclCheckResponseBodyCheckRecord setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public DescribeAclCheckResponseBodyCheckRecord setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAclCheckResponseBodyCheckRecord setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public DescribeAclCheckResponseBodyCheckRecord setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAclCheckResponseBodyCheckRecord setRecordAssessmentDetail(String recordAssessmentDetail) {
            this.recordAssessmentDetail = recordAssessmentDetail;
            return this;
        }
        public String getRecordAssessmentDetail() {
            return this.recordAssessmentDetail;
        }

        public DescribeAclCheckResponseBodyCheckRecord setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
