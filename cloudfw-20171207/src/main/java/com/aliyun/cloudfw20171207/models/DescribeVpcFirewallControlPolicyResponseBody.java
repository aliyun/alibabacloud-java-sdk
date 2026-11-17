// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The information about the access control policies of the virtual private cloud (VPC) firewalls.</p>
     */
    @NameInMap("Policys")
    public java.util.List<DescribeVpcFirewallControlPolicyResponseBodyPolicys> policys;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of access control policies of the virtual private cloud (VPC) firewalls.</p>
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
         * <p>The action that Cloud Firewall performs on the traffic in the access control policy of the virtual private cloud (VPC) firewalls. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the traffic.</li>
         * <li><strong>drop</strong>: denies the traffic.</li>
         * <li><strong>log</strong>: monitors the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The unique identifier of the access control policy of the virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>4037fbf7-3e39-4634-92a4-d0155247****</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The ID of the application configured for the traffic in the access control policy of the virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>10**</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application type supported by the access control policy of the virtual private cloud (VPC) firewalls. Use ApplicationNameList instead. Valid values:</p>
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
         * <li><strong>ANY</strong>: all application types supported by the access control policy.</li>
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
         * <p>The time when the policy was created. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the access control policy of the virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port for the traffic in the access control policy of the virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book for the traffic in the access control policy of the virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>my_port_group</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>The details of the destination port address book in the access control policy of the virtual private cloud (VPC) firewalls.</p>
         */
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <p>The type of the destination port for the traffic in the access control policy of the virtual private cloud (VPC) firewalls. Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: a single port.</li>
         * <li><strong>group</strong>: a port address book.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy of the virtual private cloud (VPC) firewalls. Valid values:</p>
         * <ul>
         * <li><p>If <strong>DestinationType</strong> is <code>net</code>, Destination is the destination CIDR block.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <code>domain</code>, Destination is the destination domain name.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <code>group</code>, Destination is the name of the destination address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The CIDR block information in the destination address book of the access control policy of the virtual private cloud (VPC) firewalls.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: an IP address book that contains one or more CIDR blocks.</li>
         * <li><strong>domain</strong>: a domain name address book that contains one or more domain names.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The type of the destination address in the access control policy of the virtual private cloud (VPC) firewalls. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: destination CIDR block.</li>
         * <li><strong>group</strong>: destination address book.</li>
         * <li><strong>domain</strong>: destination domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The domain name resolution method of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>FQDN</strong>: FQDN-based resolution.</li>
         * <li><strong>DNS</strong>: DNS-based dynamic resolution.</li>
         * <li><strong>FQDN_AND_DNS</strong>: FQDN and DNS-based dynamic resolution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FQDN</p>
         */
        @NameInMap("DomainResolveType")
        public String domainResolveType;

        /**
         * <p>The end time of the policy validity period for the access control policy. The value is a UNIX timestamp in seconds. The time must be on the hour or half-hour, and it must be at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p>If RepeatType is <code>Permanent</code>, EndTime is empty. If RepeatType is <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, EndTime must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694764800</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The latest hit timestamp. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The number of hits of the access control policy of the virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <p>The UID of the member account of the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The time when the policy was modified. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The priority of the access control policy of the virtual private cloud (VPC) firewalls.</p>
         * <p>The priority value starts from 1 and increments sequentially. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The protocol type of the traffic in the access control policy of the virtual private cloud (VPC) firewalls. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ICMP</strong></li>
         * <li><strong>ANY</strong>: all protocol types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The enabling status of the access control policy. By default, a policy is enabled after it is created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The access control policy is enabled.</li>
         * <li><strong>false</strong>: The access control policy is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The set of recurrence days for the policy validity period of the access control policy.</p>
         * <ul>
         * <li>If RepeatType is <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, RepeatDays is an empty set.
         * Example: []</li>
         * <li>If RepeatType is <code>Weekly</code>, RepeatDays cannot be empty.
         * Example: [0, 6]<blockquote>
         * <p>When RepeatType is <code>Weekly</code>, the values in RepeatDays must be unique.</p>
         * </blockquote>
         * </li>
         * <li>If RepeatType is <code>Monthly</code>, RepeatDays cannot be empty.
         * Example: [1, 31]<blockquote>
         * <p>When RepeatType is <code>Monthly</code>, the values in RepeatDays must be unique.</p>
         * </blockquote>
         * </li>
         * </ul>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The recurrence end time when the policy takes effect. The time is in the 24-hour HH:mm format, such as 23:00.</p>
         * <blockquote>
         * <p>If RepeatType is <code>Permanent</code> or <code>None</code>, RepeatEndTime is empty. If RepeatType is <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, RepeatEndTime must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The recurrence start time when the policy takes effect. The time is in the 24-hour HH:mm format, such as 08:00.</p>
         * <blockquote>
         * <p>If RepeatType is <code>Permanent</code> or <code>None</code>, RepeatStartTime is empty. If RepeatType is <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, RepeatStartTime must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type of the policy validity period for the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>Permanent</strong> (default): always.</li>
         * <li><strong>None</strong>: a specific single time.</li>
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
         * <p>The source address in the access control policy of the virtual private cloud (VPC) firewalls. Valid values:</p>
         * <ul>
         * <li><p>If <strong>SourceType</strong> is <code>net</code>, Source is the source CIDR block.</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is <code>group</code>, Source is the name of the address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The details of the source address book in the access control policy of the virtual private cloud (VPC) firewalls.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. Valid value: <strong>ip</strong>, which indicates an IP address book that contains one or more CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The type of the source address in the access control policy of the virtual private cloud (VPC) firewalls. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: source CIDR block.</li>
         * <li><strong>group</strong>: source address book.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The number of access control policy quotas consumed. This value is the sum of the quotas consumed by each policy.
         * The number of quotas consumed by a single policy = Number of source CIDR blocks × Number of destination addresses (CIDR blocks or domain names) × Number of applications × Number of port ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("SpreadCnt")
        public Long spreadCnt;

        /**
         * <p>The start time of the policy validity period for the access control policy. The value is a UNIX timestamp in seconds. The time must be on the hour or half-hour, and it must be at least 30 minutes earlier than the end time.</p>
         * <blockquote>
         * <p>If RepeatType is <code>Permanent</code>, StartTime is empty. If RepeatType is <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, StartTime must be specified.</p>
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
