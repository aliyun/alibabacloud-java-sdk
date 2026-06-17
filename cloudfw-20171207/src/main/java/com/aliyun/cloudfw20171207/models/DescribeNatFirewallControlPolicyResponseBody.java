// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The information about the access control policies for the NAT firewall.</p>
     */
    @NameInMap("Policys")
    public java.util.List<DescribeNatFirewallControlPolicyResponseBodyPolicys> policys;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F283567D-8A52-5BAE-9472-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeNatFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallControlPolicyResponseBody self = new DescribeNatFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallControlPolicyResponseBody setPolicys(java.util.List<DescribeNatFirewallControlPolicyResponseBodyPolicys> policys) {
        this.policys = policys;
        return this;
    }
    public java.util.List<DescribeNatFirewallControlPolicyResponseBodyPolicys> getPolicys() {
        return this.policys;
    }

    public DescribeNatFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatFirewallControlPolicyResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNatFirewallControlPolicyResponseBodyPolicys extends TeaModel {
        /**
         * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: Allow</p>
         * </li>
         * <li><p><strong>drop</strong>: Deny</p>
         * </li>
         * <li><p><strong>log</strong>: Monitor</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The unique ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>01281255-d220-4db1-8f4f-c4df221a****</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The application names. Multiple applications are supported.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>The time when the policy was created. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>test-description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port for the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book for the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>my_port_group</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>The list of ports in the destination port address book.</p>
         */
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <p>The destination port type for the traffic in the access control policy. Valid values:</p>
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
         * <p>The destination address in the access control policy. The value of this parameter varies based on the value of the DestinationType parameter. Valid values:</p>
         * <ul>
         * <li><p>If <strong>DestinationType</strong> is <strong>net</strong>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <strong>domain</strong>, the value of this parameter is a domain name. Example: aliyuncs.com.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <strong>group</strong>, the value of this parameter is the name of an address book. Example: db_group.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <strong>location</strong>, the value of this parameter is a region name. For more information, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x.x.x.x/32</p>
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
         * <li><p><strong>ip</strong>: an IP address book that contains one or more IP address CIDR blocks.</p>
         * </li>
         * <li><p><strong>domain</strong>: a domain name address book that contains one or more domain names.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The destination address type in the access control policy. Valid values:</p>
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
         * <p>net</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The DNS resolution result.</p>
         * 
         * <strong>example:</strong>
         * <p>111.0.XX.XX,112.0.XX.XX</p>
         */
        @NameInMap("DnsResult")
        public String dnsResult;

        /**
         * <p>The timestamp of the DNS resolution. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <p>The domain name resolution method of the access control policy. By default, this feature is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: FQDN-based</p>
         * </li>
         * <li><p><strong>1</strong>: DNS-based dynamic resolution</p>
         * </li>
         * <li><p><strong>2</strong>: FQDN- and DNS-based dynamic resolution</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        /**
         * <p>The end time of the policy validity period. The value is a UNIX timestamp. Unit: seconds. The time must be on the hour or half hour, and at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent, this parameter is empty. If RepeatType is set to None, Daily, Weekly, or Monthly, you must set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694764800</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The timestamp of the last hit. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The number of hits for the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

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
         * <p>ngw-xxxxxx</p>
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
         * <li><p><strong>ANY</strong></p>
         * </li>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * <li><p><strong>ICMP</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The status of the access control policy. By default, an access control policy is enabled after it is created. Valid values:</p>
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
         * <p>The days of the week or month for the policy to repeat.</p>
         * <ul>
         * <li><p>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, this parameter is an empty set.
         * Example: []</p>
         * </li>
         * <li><p>If RepeatType is set to Weekly, this parameter cannot be empty.
         * Example: [0, 6]</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If RepeatType is set to Weekly, the days in RepeatDays cannot be repeated.</p>
         * </blockquote>
         * <ul>
         * <li>If RepeatType is set to <code>Monthly</code>, this parameter cannot be empty.
         * Example: [1, 31]</li>
         * </ul>
         * <blockquote>
         * <p>If RepeatType is set to Monthly, the days in RepeatDays cannot be repeated.</p>
         * </blockquote>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The end time of the recurrence. The time is in the HH:mm format, based on a 24-hour clock. Example: 23:00.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent or None, this parameter is empty. If RepeatType is set to Daily, Weekly, or Monthly, you must set this parameter.
         * The time is in the HH:mm format, based on a 24-hour clock. Examples: 08:00 and 23:30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The start time of the recurrence. The time is in the HH:mm format, based on a 24-hour clock. Example: 08:00.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent or None, this parameter is empty. If RepeatType is set to Daily, Weekly, or Monthly, you must set this parameter.
         * The time is in the HH:mm format, based on a 24-hour clock. Examples: 08:00 and 23:30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type for the policy validity period. Valid values:</p>
         * <ul>
         * <li><p><strong>Permanent</strong> (default): always</p>
         * </li>
         * <li><p><strong>None</strong>: one-time</p>
         * </li>
         * <li><p><strong>Daily</strong>: daily</p>
         * </li>
         * <li><p><strong>Weekly</strong>: weekly</p>
         * </li>
         * <li><p><strong>Monthly</strong>: monthly</p>
         * </li>
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
         * <li><p>If <strong>SourceType</strong> is <code>net</code>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is <code>group</code>, the value of this parameter is the name of a source address book. Example: db_group.</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is <code>location</code>, the value of this parameter is a region. For more information, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The list of CIDR blocks in the source address book of the access control policy.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. The value is fixed at <strong>ip</strong>. This indicates an IP address book that contains one or more IP address CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The source address type in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: source address book</p>
         * </li>
         * <li><p><strong>location</strong>: source region</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The number of policy specifications that are occupied. This is the cumulative value of the number of specifications occupied by each policy.
         * The number of specifications occupied by a single policy = Number of source CIDR blocks × Number of destination addresses (IP address CIDR blocks, regions, or domain names) × Number of applications × Number of port ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>10,000</p>
         */
        @NameInMap("SpreadCnt")
        public String spreadCnt;

        /**
         * <p>The start time of the policy validity period. The value is a UNIX timestamp. Unit: seconds. The time must be on the hour or half hour, and at least 30 minutes earlier than the end time.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent, this parameter is empty. If RepeatType is set to None, Daily, Weekly, or Monthly, you must set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694761200</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeNatFirewallControlPolicyResponseBodyPolicys build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallControlPolicyResponseBodyPolicys self = new DescribeNatFirewallControlPolicyResponseBodyPolicys();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDestPortGroupPorts(java.util.List<String> destPortGroupPorts) {
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDestinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDnsResult(String dnsResult) {
            this.dnsResult = dnsResult;
            return this;
        }
        public String getDnsResult() {
            return this.dnsResult;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDnsResultTime(Long dnsResultTime) {
            this.dnsResultTime = dnsResultTime;
            return this;
        }
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setDomainResolveType(Integer domainResolveType) {
            this.domainResolveType = domainResolveType;
            return this;
        }
        public Integer getDomainResolveType() {
            return this.domainResolveType;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setRepeatDays(java.util.List<Long> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<Long> getRepeatDays() {
            return this.repeatDays;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setRepeatEndTime(String repeatEndTime) {
            this.repeatEndTime = repeatEndTime;
            return this;
        }
        public String getRepeatEndTime() {
            return this.repeatEndTime;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setRepeatStartTime(String repeatStartTime) {
            this.repeatStartTime = repeatStartTime;
            return this;
        }
        public String getRepeatStartTime() {
            return this.repeatStartTime;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setRepeatType(String repeatType) {
            this.repeatType = repeatType;
            return this;
        }
        public String getRepeatType() {
            return this.repeatType;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setSourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setSpreadCnt(String spreadCnt) {
            this.spreadCnt = spreadCnt;
            return this;
        }
        public String getSpreadCnt() {
            return this.spreadCnt;
        }

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
