// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The VPC firewall access control policies.</p>
     */
    @NameInMap("Policys")
    public java.util.List<DescribeVpcFirewallControlPolicyResponseBodyPolicys> policys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of VPC firewall access control policies.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeVpcFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallControlPolicyResponseBody self = new DescribeVpcFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallControlPolicyResponseBody setPolicys(java.util.List<DescribeVpcFirewallControlPolicyResponseBodyPolicys> policys) {
        this.policys = policys;
        return this;
    }
    public java.util.List<DescribeVpcFirewallControlPolicyResponseBodyPolicys> getPolicys() {
        return this.policys;
    }

    public DescribeVpcFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallControlPolicyResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcFirewallControlPolicyResponseBodyPolicys extends TeaModel {
        /**
         * <p>The action to perform on traffic that matches the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: allows the traffic.</p>
         * </li>
         * <li><p><strong>drop</strong>: denies the traffic.</p>
         * </li>
         * <li><p><strong>log</strong>: logs the traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The unique identifier of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>4037fbf7-3e39-4634-92a4-d0155247****</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>10**</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application type. We recommend that you use <code>ApplicationNameList</code> instead. Valid values:</p>
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
         * <li><p><strong>ANY</strong> (all application types)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The list of application names.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>The UNIX timestamp, in seconds, of when the policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book.</p>
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
         * <p>The type of the destination port. Valid values:</p>
         * <ul>
         * <li><p><strong>port</strong>: a single port</p>
         * </li>
         * <li><p><strong>group</strong>: a port address book</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address for the access control policy. The value depends on <code>DestinationType</code>.</p>
         * <ul>
         * <li><p>If <code>DestinationType</code> is <code>net</code>, the value is a destination CIDR block.</p>
         * </li>
         * <li><p>If <code>DestinationType</code> is <code>domain</code>, the value is a destination domain name.</p>
         * </li>
         * <li><p>If <code>DestinationType</code> is <code>group</code>, the value is the name of a destination address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The CIDR blocks in the destination address book.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: an address book of IP addresses or CIDR blocks.</p>
         * </li>
         * <li><p><strong>domain</strong>: an address book of domain names.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The type of the destination address. Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: a destination CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: a destination address book</p>
         * </li>
         * <li><p><strong>domain</strong>: a destination domain name</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The domain name resolution mode. Valid values:</p>
         * <ul>
         * <li><p><strong>FQDN</strong>: FQDN-based resolution</p>
         * </li>
         * <li><p><strong>DNS</strong>: DNS-based dynamic resolution</p>
         * </li>
         * <li><p><strong>FQDN_AND_DNS</strong>: FQDN-based and DNS-based dynamic resolution</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FQDN</p>
         */
        @NameInMap("DomainResolveType")
        public String domainResolveType;

        /**
         * <p>The UNIX timestamp, in seconds, for the end of the policy\&quot;s effective period. The time must be on the hour or half-hour and at least 30 minutes after the start time.</p>
         * <blockquote>
         * <p>This parameter is not used if <code>RepeatType</code> is <code>Permanent</code>. It is required for <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code> recurrence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694764800</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The UNIX timestamp, in seconds, of the last policy hit.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The number of policy hits.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <p>The UID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The UNIX timestamp, in seconds, of when the policy was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The priority of the access control policy, starting from 1. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * <li><p><strong>ICMP</strong></p>
         * </li>
         * <li><p><strong>ANY</strong> (all protocol types)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The enabled status of the access control policy. A policy is enabled by default after it is created. Valid values:</p>
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
         * <p>The days of the week or month on which the policy recurs.</p>
         * <ul>
         * <li><p>If <code>RepeatType</code> is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, this parameter is empty. Example: <code>[]</code></p>
         * </li>
         * <li><p>If <code>RepeatType</code> is set to <code>Weekly</code>, this parameter is required. Example: <code>[0, 6]</code></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If <code>RepeatType</code> is set to <code>Weekly</code>, do not specify duplicate values for this parameter.</p>
         * </blockquote>
         * <ul>
         * <li>If <code>RepeatType</code> is set to <code>Monthly</code>, this parameter is required. Example: <code>[1, 31]</code></li>
         * </ul>
         * <blockquote>
         * <p>If <code>RepeatType</code> is set to <code>Monthly</code>, do not specify duplicate values for this parameter.</p>
         * </blockquote>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The recurrence end time. The time is in the <code>HH:mm</code> 24-hour format, such as <code>23:30</code>.</p>
         * <blockquote>
         * <p>This parameter is not used if <code>RepeatType</code> is <code>Permanent</code> or <code>None</code>. It is required for <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code> recurrence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The recurrence start time. The time is in the <code>HH:mm</code> 24-hour format, such as <code>08:00</code>.</p>
         * <blockquote>
         * <p>This parameter is not used if <code>RepeatType</code> is <code>Permanent</code> or <code>None</code>. It is required for <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code> recurrence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type for the policy\&quot;s effective period. Valid values:</p>
         * <ul>
         * <li><p><strong>Permanent</strong> (default): The policy is always active.</p>
         * </li>
         * <li><p><strong>None</strong>: The policy applies only once.</p>
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
         * <p>The source address for the access control policy. The value depends on <code>SourceType</code>.</p>
         * <ul>
         * <li><p>If <code>SourceType</code> is <code>net</code>, the value is a source CIDR block.</p>
         * </li>
         * <li><p>If <code>SourceType</code> is <code>group</code>, the value is the name of a source address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The CIDR blocks in the source address book.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book. The value is always <strong>ip</strong>, which indicates an address book that contains IP addresses or CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The type of the source address. Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: a source CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: a source address book</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The number of rule capacity units that the access control policy consumes. This is calculated as: Number of source addresses × Number of destination addresses × Number of applications × Number of port ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("SpreadCnt")
        public Long spreadCnt;

        /**
         * <p>The UNIX timestamp, in seconds, for the start of the policy\&quot;s effective period. The time must be on the hour or half-hour and at least 30 minutes before the end time.</p>
         * <blockquote>
         * <p>This parameter is not used if <code>RepeatType</code> is <code>Permanent</code>. It is required for <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code> recurrence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694761200</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeVpcFirewallControlPolicyResponseBodyPolicys build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallControlPolicyResponseBodyPolicys self = new DescribeVpcFirewallControlPolicyResponseBodyPolicys();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDestPortGroupPorts(java.util.List<String> destPortGroupPorts) {
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDestinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setDomainResolveType(String domainResolveType) {
            this.domainResolveType = domainResolveType;
            return this;
        }
        public String getDomainResolveType() {
            return this.domainResolveType;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setRepeatDays(java.util.List<Long> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<Long> getRepeatDays() {
            return this.repeatDays;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setRepeatEndTime(String repeatEndTime) {
            this.repeatEndTime = repeatEndTime;
            return this;
        }
        public String getRepeatEndTime() {
            return this.repeatEndTime;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setRepeatStartTime(String repeatStartTime) {
            this.repeatStartTime = repeatStartTime;
            return this;
        }
        public String getRepeatStartTime() {
            return this.repeatStartTime;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setRepeatType(String repeatType) {
            this.repeatType = repeatType;
            return this;
        }
        public String getRepeatType() {
            return this.repeatType;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setSourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setSpreadCnt(Long spreadCnt) {
            this.spreadCnt = spreadCnt;
            return this;
        }
        public Long getSpreadCnt() {
            return this.spreadCnt;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
