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
         * <p>The address in the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/32</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The remarks.</p>
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
         * <p>The action performed on traffic that matches the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: allow</p>
         * </li>
         * <li><p><strong>drop</strong>: deny</p>
         * </li>
         * <li><p><strong>log</strong>: monitor</p>
         * </li>
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
         * <p>997b38e0-01fa-4db7-8d30-02ebf6fdb747</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The addresses in the address book.</p>
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
         * <p>The addresses and their remarks.</p>
         */
        @NameInMap("Addresses")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses> addresses;

        /**
         * <p>The ID of the application that is used in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>plugin_idp4_ciam</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application type supported by the access control policy for the VPC firewall. We recommend that you use the ApplicationNameList parameter instead. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong></p>
         * </li>
         * <li><p><strong>HTTPS</strong></p>
         * </li>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>SMTP</strong></p>
         * </li>
         * <li><p><strong>SMTPS</strong></p>
         * </li>
         * <li><p><strong>RDP</strong></p>
         * </li>
         * <li><p><strong>VNC</strong></p>
         * </li>
         * <li><p><strong>SSH</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
         * <li><p><strong>MQTT</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * <li><p><strong>Memcache</strong></p>
         * </li>
         * <li><p><strong>SSL</strong></p>
         * </li>
         * <li><p><strong>ANY</strong>: All application types.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The application types that are supported by the access control policy. Valid values:</p>
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
         * <li><p><strong>SSL</strong></p>
         * </li>
         * <li><p><strong>VNC</strong></p>
         * </li>
         * <li><p><strong>ANY</strong> (indicates all application types)</p>
         * </li>
         * </ul>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>Indicates whether to automatically add the public IP addresses of new ECS instances that match the tags to the address book. New ECS instances include newly purchased instances with the specified tags and existing instances whose tags are modified to match.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        /**
         * <p>The time when the policy was created, provided as a UNIX timestamp in seconds.</p>
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
         * <p>The destination port that is used in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book.</p>
         * <ul>
         * <li><p><strong>port</strong>: Port</p>
         * </li>
         * <li><p><strong>group</strong>: Port address book</p>
         * </li>
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
         * <p>The type of the destination port in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>port</strong>: port</p>
         * </li>
         * <li><p><strong>group</strong>: port address book</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. The value of this parameter varies based on the value of DestinationType.</p>
         * <ul>
         * <li><p>If the value of DestinationType is<code>net</code>, the value of this parameter is a CIDR block. Example: 10.0.3.0/24.</p>
         * </li>
         * <li><p>If the value of DestinationType is<code>domain</code>, the value of this parameter is a domain name. Example: aliyun.</p>
         * </li>
         * <li><p>If the value of DestinationType is<code>group</code>, the value of this parameter is the name of an address book. Example: db_group.</p>
         * </li>
         * <li><p>If the value of DestinationType is<code>location</code>, the value of this parameter is a location. For more information about the location codes, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is omitted, all types of destination addresses are retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>kms.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The CIDR blocks in the destination address book.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: an IP address book, which contains one or more CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: an ECS tag-based address book, which contains the public IP addresses of ECS instances that have specific tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: a domain name address book, which contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: a threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: a back-to-source address book, which contains the back-to-source IP addresses of one or more Anti-DDoS or WAF instances.</p>
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
         * <li><p><strong>net</strong>: destination CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: destination address book</p>
         * </li>
         * <li><p><strong>domain</strong>: destination domain name</p>
         * </li>
         * <li><p><strong>location</strong>: destination region</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The direction of internet traffic. Valid values:</p>
         * <ul>
         * <li><p><strong>in</strong>: inbound traffic</p>
         * </li>
         * <li><p><strong>out</strong>: outbound traffic</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The result of the DNS resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("DnsResult")
        public String dnsResult;

        /**
         * <p>The time of the DNS resolution, provided as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <p>The DNS resolution method of the domain name in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: FQDN-based resolution</p>
         * </li>
         * <li><p><strong>1</strong>: DNS-based dynamic resolution</p>
         * </li>
         * <li><p><strong>2</strong>: FQDN-based and DNS-based dynamic resolution</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FQDN</p>
         */
        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        /**
         * <p>The end time of the policy validity period. This is a UNIX timestamp, accurate to the second. The time must be on the hour or half-hour and must be at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p>This parameter is empty if RepeatType is set to Permanent. It is required if RepeatType is set to None, Daily, Weekly, or Monthly.</p>
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
         * <li><p><strong>ip</strong>: IP address book</p>
         * </li>
         * <li><p><strong>domain</strong>: domain address book</p>
         * </li>
         * <li><p><strong>port</strong>: port address book</p>
         * </li>
         * <li><p><strong>tag</strong>: ECS tag-based address book</p>
         * </li>
         * <li><p><strong>allCloud</strong>: cloud service address book</p>
         * </li>
         * <li><p><strong>threat</strong>: threat intelligence address book</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The unique ID of the address book.</p>
         * <p>This ID is required for other operations, such as deleting the address book. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/138869.html">DescribeAddressBook</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>b91d86c3-2b52-4534-aae9-8d0339b12a48</p>
         */
        @NameInMap("GroupUuid")
        public String groupUuid;

        /**
         * <p>The time when the policy was last hit, provided as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The hit count of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: IPv4</p>
         * </li>
         * <li><p><strong>6</strong>: IPv6</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The time when the policy was last modified, provided as a UNIX timestamp in seconds.</p>
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
         * <p>The priority starts from 1. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * <li><p><strong>ICMP</strong></p>
         * </li>
         * <li><p><strong>ANY</strong>: All protocol types</p>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The number of policies that reference this address book.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        /**
         * <p>The status of the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled</p>
         * </li>
         * <li><p><strong>false</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The days of a week or month on which the policy recurs.</p>
         * <blockquote>
         * <p>If RepeatType is set to Weekly, the valid values are 0 to 6. The week starts on Sunday.
         * If RepeatType is set to Monthly, the valid values are 1 to 31.</p>
         * </blockquote>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The time when the policy stops to take effect. Example: 23:30. The time must be on the hour or half-hour and must be at least 30 minutes later than the recurrence start time.</p>
         * <blockquote>
         * <p>This parameter is returned empty if RepeatType is set to Permanent or None. This parameter is required if RepeatType is set to Daily, Weekly, or Monthly. The time is in the HH:mm format. Examples: 08:00 and 23:30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The time when the policy starts to take effect. Example: 08:00. The time must be on the hour or half-hour and must be at least 30 minutes earlier than the recurrence end time.</p>
         * <blockquote>
         * <p>This parameter is returned empty if RepeatType is set to Permanent or None. This parameter is required if RepeatType is set to Daily, Weekly, or Monthly. The time is in the HH:mm format. Examples: 08:00 and 23:30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type of the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Permanent</strong> (default): The policy is always valid.</p>
         * </li>
         * <li><p><strong>None</strong>: The policy is valid only once.</p>
         * </li>
         * <li><p><strong>Daily</strong>: The policy recurs daily.</p>
         * </li>
         * <li><p><strong>Weekly</strong>: The policy recurs weekly.</p>
         * </li>
         * <li><p><strong>Monthly</strong>: The policy recurs monthly.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Permanent</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <p>The source address in the access control policy. The value of this parameter varies based on the value of SourceType.</p>
         * <ul>
         * <li><p>If <strong>SourceType</strong> is set to<code>net</code>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is set to<code>group</code>, the value of this parameter is the name of a source address book. Example: db_group.</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is set to<code>location</code>, the value of this parameter is a location. For more information, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.28.7.167</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The CIDR blocks in the source address book.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: An address book that contains one or more IP addresses or CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: An address book that contains the public IP addresses of ECS instances with specific tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: A domain name address book, which contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: a threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: a back-to-source address book, which contains the back-to-source IP addresses of one or more Anti-DDoS or WAF instances.</p>
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
         * <li><p><strong>net</strong>: a source CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: a source address book</p>
         * </li>
         * <li><p><strong>location</strong>: a source region</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The number of specification units that the policy consumes. The value is calculated by using the following formula: Number of source addresses × Number of destination addresses × Number of port ranges × Number of applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

        /**
         * <p>The start of the policy\&quot;s validity period, provided as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1730318400</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The ECS tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclTagList> tagList;

        /**
         * <p>The logical relationship among multiple ECS tags. Valid values:</p>
         * <ul>
         * <li><p><strong>and</strong>: An ECS instance must have all the specified tags.</p>
         * </li>
         * <li><p><strong>or</strong>: An ECS instance must have one of the specified tags.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        @NameInMap("TagRelation")
        public String tagRelation;

        /**
         * <p>The instance ID of the VPC firewall.</p>
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

    public static class DescribeAclCheckResponseBodyCheckRecordAcls extends TeaModel {
        /**
         * <p>The ACL check result.</p>
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
         * <p>The status of the ACL check.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

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
         * <p>The ACL check results.</p>
         */
        @NameInMap("Acls")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAcls> acls;

        /**
         * <p>The name of the ACL check.</p>
         * 
         * <strong>example:</strong>
         * <p>PolicyHitCountZero</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <p>The description of the ACL check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Due to business offline or other reasons, the number of hits of the object policy in a period of time is 0.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time of the last check, provided as a UNIX timestamp in seconds.</p>
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
         * <p>The assessment details of the ACL check.</p>
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
