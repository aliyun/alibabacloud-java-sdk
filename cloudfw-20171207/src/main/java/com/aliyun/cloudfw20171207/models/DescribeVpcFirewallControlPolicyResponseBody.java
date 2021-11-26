// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("Policys")
    public java.util.List<DescribeVpcFirewallControlPolicyResponseBodyPolicys> policys;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AclAction")
        public String aclAction;

        @NameInMap("AclUuid")
        public String aclUuid;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestPort")
        public String destPort;

        @NameInMap("DestPortGroup")
        public String destPortGroup;

        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        @NameInMap("DestPortType")
        public String destPortType;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("HitTimes")
        public Integer hitTimes;

        @NameInMap("MemberUid")
        public String memberUid;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

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

        public DescribeVpcFirewallControlPolicyResponseBodyPolicys setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
