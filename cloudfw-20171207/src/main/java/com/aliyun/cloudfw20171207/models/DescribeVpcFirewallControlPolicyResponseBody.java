// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyResponseBody extends TeaModel {
    // The details of the access control policies.
    @NameInMap("Policys")
    public java.util.List<DescribeVpcFirewallControlPolicyResponseBodyPolicys> policys;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of the access control policies that are returned.
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
        // The action that Cloud Firewall performs on the traffic. Valid values:
        // 
        // *   **accept**: allows the traffic.
        // *   **drop**: blocks the traffic.
        // *   **log**: monitors the traffic.
        @NameInMap("AclAction")
        public String aclAction;

        // The unique ID of the access control policy.
        @NameInMap("AclUuid")
        public String aclUuid;

        // The application ID in the access control policy.
        @NameInMap("ApplicationId")
        public String applicationId;

        // The application type in the access control policy. Valid values:
        // 
        // *   **HTTP**
        // *   **HTTPS**
        // *   **MySQL**
        // *   **SMTP**
        // *   **SMTPS**
        // *   **RDP**
        // *   **VNC**
        // *   **SSH**
        // *   **Redis**
        // *   **MQTT**
        // *   **MongoDB**
        // *   **Memcache**
        // *   **SSL**
        // *   **ANY**: all application types
        @NameInMap("ApplicationName")
        public String applicationName;

        // The description of the access control policy.
        @NameInMap("Description")
        public String description;

        // The destination port in the access control policy.
        @NameInMap("DestPort")
        public String destPort;

        // The name of the destination port address book in the access control policy.
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        // The ports in the destination port address book of the access control policy.
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        // The type of the destination port in the access control policy. Valid values:
        // 
        // *   **port**: port
        // *   **group**: port address book
        @NameInMap("DestPortType")
        public String destPortType;

        // The destination address in the access control policy. Valid values:
        // 
        // *   If **DestinationType** is set to `net`, the value of this parameter is a CIDR block.
        // *   If **DestinationType** is set to `domain`, the value of this parameter is a domain name.
        // *   If **DestinationType** is set to `group`, the value of this parameter is the name of an address book name.
        @NameInMap("Destination")
        public String destination;

        // The CIDR blocks in the destination address book of the access control policy.
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        // The type of the destination address book in the access control policy. Valid values:
        // 
        // *   **ip**: an address book that includes one or more CIDR blocks
        // *   **domain**: an address book that includes one or more domain names
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        // The type of the destination address in the access control policy. Valid values:
        // 
        // *   **net**: CIDR block
        // *   **group**: address book
        // *   **domain**: domain name
        @NameInMap("DestinationType")
        public String destinationType;

        // The number of hits for the access control policy.
        @NameInMap("HitTimes")
        public Integer hitTimes;

        // The UID of the member that is managed by your Alibaba Cloud account.
        @NameInMap("MemberUid")
        public String memberUid;

        // The priority of the access control policy.
        // 
        // The priority value starts from 1. A smaller priority value indicates a higher priority.
        @NameInMap("Order")
        public Integer order;

        // The protocol type in the access control policy. Valid values:
        // 
        // *   **TCP**
        // *   **UDP**
        // *   **ICMP**
        // *   **ANY**: all protocol types
        @NameInMap("Proto")
        public String proto;

        // Indicates whether the access control policy is enabled. By default, an access control policy is enabled after the policy is created. Valid values:
        // 
        // *   **true**: The access control policy is enabled.
        // *   **false**: The access control policy is disabled.
        @NameInMap("Release")
        public String release;

        // The source address in the access control policy. Valid values:
        // 
        // *   If **SourceType** is set to `net`, the value of this parameter is a CIDR block.
        // *   If **SourceType** is set to `group`, the value of this parameter is an address book name.
        @NameInMap("Source")
        public String source;

        // The CIDR blocks in the source address book of the access control policy.
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        // The type of the source address in the access control policy. The value is fixed as **ip**. The value indicates an address book that includes one or more CIDR blocks.
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        // The type of the source address in the access control policy. Valid values:
        // 
        // *   **net**: CIDR block
        // *   **group**: address book
        @NameInMap("SourceType")
        public String sourceType;

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

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setHitTimes(Integer hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Integer getHitTimes() {
            return this.hitTimes;
        }

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
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

    }

}
