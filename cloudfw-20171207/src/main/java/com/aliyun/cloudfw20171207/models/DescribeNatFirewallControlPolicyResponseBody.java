// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("Policys")
    public java.util.List<DescribeNatFirewallControlPolicyResponseBodyPolicys> policys;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AclAction")
        public String aclAction;

        @NameInMap("AclUuid")
        public String aclUuid;

        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        @NameInMap("CreateTime")
        public Long createTime;

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

        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("DnsResult")
        public String dnsResult;

        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        @NameInMap("HitLastTime")
        public Long hitLastTime;

        @NameInMap("HitTimes")
        public Integer hitTimes;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("Release")
        public String release;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SpreadCnt")
        public String spreadCnt;

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

    }

}
