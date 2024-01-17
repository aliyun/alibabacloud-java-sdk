// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The access control policies.</p>
     */
    @NameInMap("Policys")
    public java.util.List<DescribeVpcFirewallControlPolicyResponseBodyPolicys> policys;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of access control policies returned.</p>
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
         * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
         * <br>
         * <p>*   **accept**: allows the traffic.</p>
         * <p>*   **drop**: denies the traffic.</p>
         * <p>*   **log**: monitors the traffic.</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The UUID of the access control policy.</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The application ID in the access control policy.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application types supported by the access control policy. We recommend that you specify ApplicationNameList. Valid values:</p>
         * <br>
         * <p>*   **HTTP**</p>
         * <p>*   **HTTPS**</p>
         * <p>*   **MySQL**</p>
         * <p>*   **SMTP**</p>
         * <p>*   **SMTPS**</p>
         * <p>*   **RDP**</p>
         * <p>*   **VNC**</p>
         * <p>*   **SSH**</p>
         * <p>*   **Redis**</p>
         * <p>*   **MQTT**</p>
         * <p>*   **MongoDB**</p>
         * <p>*   **Memcache**</p>
         * <p>*   **SSL**</p>
         * <p>*   **ANY**: all application types</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The application types supported by the access control policy.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>The time when the access control policy was created. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the access control policy.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port in the access control policy.</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book in the access control policy.</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>The ports in the destination port address book of the access control policy.</p>
         */
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <p>The type of the destination port in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **port**: port</p>
         * <p>*   **group**: port address book</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. Valid values:</p>
         * <br>
         * <p>*   If **DestinationType** is set to `net`, the value of this parameter is a CIDR block.</p>
         * <p>*   If **DestinationType** is set to `domain`, the value of this parameter is a domain name.</p>
         * <p>*   If **DestinationType** is set to `group`, the value of this parameter is an address book name.</p>
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
         * <br>
         * <p>*   **ip**: an address book that includes one or more CIDR blocks</p>
         * <p>*   **domain**: an address book that includes one or more domain names</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The type of the destination address in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **net**: CIDR block</p>
         * <p>*   **group**: address book</p>
         * <p>*   **domain**: domain name</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of StartTime.</p>
         * <br>
         * <p>>  If RepeatType is set to Permanent, EndTime is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, EndTime must be specified.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The time when the access control policy was last hit. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The number of hits for the access control policy.</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The time when the access control policy was modified. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The priority of the access control policy.</p>
         * <br>
         * <p>The priority value starts from 1. A smaller priority value indicates a higher priority.</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The protocol type in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **TCP**</p>
         * <p>*   **UDP**</p>
         * <p>*   **ICMP**</p>
         * <p>*   **ANY**: all protocol types</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>Indicates whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The days of a week or of a month on which the access control policy takes effect.</p>
         * <br>
         * <p>*   If RepeatType is set to `Permanent`, `None`, or `Daily`, RepeatDays is left empty. Example: \[].</p>
         * <p>*   If RepeatType is set to Weekly, RepeatDays must be specified. Example: \[0, 6].</p>
         * <br>
         * <p>>  If RepeatType is set to Weekly, the fields in the value of RepeatDays cannot be repeated.</p>
         * <br>
         * <p>*   If RepeatType is set to `Monthly`, RepeatDays must be specified. Example: \[1, 31].</p>
         * <br>
         * <p>>  If RepeatType is set to Monthly, the fields in the value of RepeatDays cannot be repeated.</p>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The point in time when the recurrence ends. Example: 23:30. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of RepeatStartTime.</p>
         * <br>
         * <p>>  If RepeatType is set to Permanent or None, RepeatEndTime is left empty. If RepeatType is set to Daily, Weekly, or Monthly, RepeatEndTime must be specified.</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The point in time when the recurrence starts. Example: 08:00. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of RepeatEndTime.</p>
         * <br>
         * <p>>  If RepeatType is set to Permanent or None, RepeatStartTime is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter must be specified.</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type for the access control policy to take effect. Valid values:</p>
         * <br>
         * <p>*   **Permanent** (default): The policy always takes effect.</p>
         * <p>*   **None**: The policy takes effect for only once.</p>
         * <p>*   **Daily**: The policy takes effect on a daily basis.</p>
         * <p>*   **Weekly**: The policy takes effect on a weekly basis.</p>
         * <p>*   **Monthly**: The policy takes effect on a monthly basis.</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <p>The source address in the access control policy. Valid values:</p>
         * <br>
         * <p>*   If **SourceType** is set to `net`, the value of this parameter is a CIDR block.</p>
         * <p>*   If **SourceType** is set to `group`, the value of this parameter is an address book name.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The CIDR blocks in the source address book of the access control policy.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. The value is fixed as **ip**. The value indicates an address book that includes one or more CIDR blocks.</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **net**: CIDR block</p>
         * <p>*   **group**: address book</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The total quota consumed by the returned access control policies, which is the sum of the quota consumed by each policy. The quota that is consumed by an access control policy is calculated by using the following formula: Quota that is consumed by an access control policy = Number of source addresses × Number of destination addresses (number of CIDR blocks or domain names) × Number of applications × Number of port ranges.</p>
         */
        @NameInMap("SpreadCnt")
        public Long spreadCnt;

        /**
         * <p>The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of EndTime.</p>
         * <br>
         * <p>>  If RepeatType is set to Permanent, StartTime is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, StartTime must be specified.</p>
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
