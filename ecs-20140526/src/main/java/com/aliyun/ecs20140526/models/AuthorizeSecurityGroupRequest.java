// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupRequest extends TeaModel {
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

    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    @NameInMap("SourceGroupOwnerId")
    public Long sourceGroupOwnerId;

    @NameInMap("SourceGroupOwnerAccount")
    public String sourceGroupOwnerAccount;

    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    @NameInMap("DestCidrIp")
    public String destCidrIp;

    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

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

    public static AuthorizeSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupRequest self = new AuthorizeSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AuthorizeSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AuthorizeSecurityGroupRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AuthorizeSecurityGroupRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupOwnerId(Long sourceGroupOwnerId) {
        this.sourceGroupOwnerId = sourceGroupOwnerId;
        return this;
    }
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
        return this;
    }
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    public AuthorizeSecurityGroupRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public AuthorizeSecurityGroupRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public AuthorizeSecurityGroupRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public AuthorizeSecurityGroupRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public AuthorizeSecurityGroupRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public AuthorizeSecurityGroupRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AuthorizeSecurityGroupRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public AuthorizeSecurityGroupRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public AuthorizeSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AuthorizeSecurityGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
