// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupEgressRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("IpProtocol")
    @Validation(required = true)
    public String ipProtocol;

    @NameInMap("PortRange")
    @Validation(required = true)
    public String portRange;

    @NameInMap("DestGroupId")
    public String destGroupId;

    @NameInMap("DestGroupOwnerId")
    public Long destGroupOwnerId;

    @NameInMap("DestGroupOwnerAccount")
    public String destGroupOwnerAccount;

    @NameInMap("DestCidrIp")
    public String destCidrIp;

    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("NicType")
    public String nicType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    public static ModifySecurityGroupEgressRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupEgressRuleRequest self = new ModifySecurityGroupEgressRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupEgressRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySecurityGroupEgressRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifySecurityGroupEgressRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifySecurityGroupEgressRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public ModifySecurityGroupEgressRuleRequest setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }
    public String getDestGroupId() {
        return this.destGroupId;
    }

    public ModifySecurityGroupEgressRuleRequest setDestGroupOwnerId(Long destGroupOwnerId) {
        this.destGroupOwnerId = destGroupOwnerId;
        return this;
    }
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    public ModifySecurityGroupEgressRuleRequest setDestGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
        return this;
    }
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    public ModifySecurityGroupEgressRuleRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public ModifySecurityGroupEgressRuleRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public ModifySecurityGroupEgressRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public ModifySecurityGroupEgressRuleRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public ModifySecurityGroupEgressRuleRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public ModifySecurityGroupEgressRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifySecurityGroupEgressRuleRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ModifySecurityGroupEgressRuleRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public ModifySecurityGroupEgressRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySecurityGroupEgressRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
