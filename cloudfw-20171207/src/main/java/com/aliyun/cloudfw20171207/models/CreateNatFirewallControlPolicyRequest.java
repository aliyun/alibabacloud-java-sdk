// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallControlPolicyRequest extends TeaModel {
    @NameInMap("AclAction")
    public String aclAction;

    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    @NameInMap("Description")
    public String description;

    @NameInMap("DestPort")
    public String destPort;

    @NameInMap("DestPortGroup")
    public String destPortGroup;

    @NameInMap("DestPortType")
    public String destPortType;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("DomainResolveType")
    public Integer domainResolveType;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("NewOrder")
    public String newOrder;

    @NameInMap("Proto")
    public String proto;

    @NameInMap("Release")
    public String release;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceType")
    public String sourceType;

    public static CreateNatFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallControlPolicyRequest self = new CreateNatFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public CreateNatFirewallControlPolicyRequest setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public CreateNatFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNatFirewallControlPolicyRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }
    public String getDestPort() {
        return this.destPort;
    }

    public CreateNatFirewallControlPolicyRequest setDestPortGroup(String destPortGroup) {
        this.destPortGroup = destPortGroup;
        return this;
    }
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    public CreateNatFirewallControlPolicyRequest setDestPortType(String destPortType) {
        this.destPortType = destPortType;
        return this;
    }
    public String getDestPortType() {
        return this.destPortType;
    }

    public CreateNatFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateNatFirewallControlPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateNatFirewallControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateNatFirewallControlPolicyRequest setDomainResolveType(Integer domainResolveType) {
        this.domainResolveType = domainResolveType;
        return this;
    }
    public Integer getDomainResolveType() {
        return this.domainResolveType;
    }

    public CreateNatFirewallControlPolicyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateNatFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateNatFirewallControlPolicyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateNatFirewallControlPolicyRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public CreateNatFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public CreateNatFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public CreateNatFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateNatFirewallControlPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
