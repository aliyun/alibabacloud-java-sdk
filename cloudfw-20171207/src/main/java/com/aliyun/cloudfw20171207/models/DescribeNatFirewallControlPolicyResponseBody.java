// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The information about the access control policies.</p>
     */
    @NameInMap("Policys")
    public java.util.List<DescribeNatFirewallControlPolicyResponseBodyPolicys> policys;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The application names.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>The time when the access control policy was created.</p>
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
         * <p>The ports in the destination port address book.</p>
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
         * <p>The destination address in the access control policy. The value of this parameter varies based on the value of DestinationType. Valid values:</p>
         * <br>
         * <p>*   If the value of **DestinationType** is **net**, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * <p>*   If the value of **DestinationType** is **domain**, the value of this parameter is a domain name. Example: aliyuncs.com.</p>
         * <p>*   If the value of **DestinationType** is **group**, the value of this parameter is the name of an address book. Example: db_group.</p>
         * <p>*   If the value of **DestinationType** is **location**, the value of this parameter is a location. For more information about location codes, see [AddControlPolicy](https://help.aliyun.com/document_detail/138867.html). Example: ["BJ11", "ZB"].</p>
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
         * <p>*   **location**: location</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The DNS resolution result.</p>
         */
        @NameInMap("DnsResult")
        public String dnsResult;

        /**
         * <p>The time when the Domain Name System (DNS) resolution was performed. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <p>The domain name resolution method of the access control policy. By default, an access control policy is enabled after the policy is created. Valid values:</p>
         * <br>
         * <p>*   **0**: fully qualified domain name (FQDN)-based resolution</p>
         * <p>*   **1**: DNS-based dynamic resolution</p>
         * <p>*   **2**: FQDN and DNS-based dynamic resolution</p>
         */
        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        /**
         * <p>The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.</p>
         * <br>
         * <p>>  If RepeatType is set to Permanent, this parameter is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter must be specified.</p>
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
        public Integer hitTimes;

        /**
         * <p>The time when the access control policy was modified.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the NAT gateway.</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

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
         * <p>*   **ANY**</p>
         * <p>*   **TCP**</p>
         * <p>*   **UDP**</p>
         * <p>*   **ICMP**</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The status of the access control policy. By default, an access control policy is enabled after it is created. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The days of a week or of a month on which the access control policy takes effect.</p>
         * <br>
         * <p>*   If RepeatType is set to `Permanent`, `None`, or `Daily`, the value of this parameter is an empty array. Example: [].</p>
         * <p>*   If RepeatType is set to Weekly, this parameter must be specified. Example: [0, 6].</p>
         * <br>
         * <p>>  If RepeatType is set to Weekly, the fields in the value of this parameter cannot be repeated.</p>
         * <br>
         * <p>*   If RepeatType is set to `Monthly`, this parameter must be specified. Example: [1, 31].</p>
         * <br>
         * <p>>  If RepeatType is set to Monthly, the fields in the value of this parameter cannot be repeated.</p>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The point in time when the recurrence ends. Example: 23:30. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.</p>
         * <br>
         * <p>>  If RepeatType is set to Permanent or None, this parameter is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter must be specified.</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The point in time when the recurrence starts. Example: 08:00. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.</p>
         * <br>
         * <p>>  If RepeatType is set to Permanent or None, this parameter is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter must be specified.</p>
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
         * <p>*   If the value of **SourceType** is `net`, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * <p>*   If the value of **SourceType** is `group`, the value of this parameter is the name of an address book. Example: db_group.</p>
         * <p>*   If the value of **SourceType** is `location`, the value of this parameter is a location. For more information about location codes, see [AddControlPolicy](https://help.aliyun.com/document_detail/138867.html). Example: ["BJ11", "ZB"].</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The CIDR blocks in the source address book.</p>
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
         * <p>*   **location**: location</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The total quota consumed by the returned access control policies, which is the sum of the quota consumed by each policy. The quota that is consumed by an access control policy is calculated by using the following formula: Quota that is consumed by an access control policy = Number of source addresses (number of CIDR blocks or regions) × Number of destination addresses (number of CIDR blocks, regions, or domain names) × Number of port ranges × Number of applications.</p>
         */
        @NameInMap("SpreadCnt")
        public String spreadCnt;

        /**
         * <p>The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.</p>
         * <br>
         * <p>>  If RepeatType is set to Permanent, this parameter is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter must be specified.</p>
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

        public DescribeNatFirewallControlPolicyResponseBodyPolicys setHitTimes(Integer hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Integer getHitTimes() {
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
