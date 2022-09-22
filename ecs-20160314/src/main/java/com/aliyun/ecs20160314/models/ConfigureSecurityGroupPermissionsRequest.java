// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ConfigureSecurityGroupPermissionsRequest extends TeaModel {
    @NameInMap("AuthorizePermission")
    public java.util.List<AuthorizePermission> authorizePermission;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RevokePermission")
    public java.util.List<RevokePermission> revokePermission;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static ConfigureSecurityGroupPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSecurityGroupPermissionsRequest self = new ConfigureSecurityGroupPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSecurityGroupPermissionsRequest setAuthorizePermission(java.util.List<AuthorizePermission> authorizePermission) {
        this.authorizePermission = authorizePermission;
        return this;
    }
    public java.util.List<AuthorizePermission> getAuthorizePermission() {
        return this.authorizePermission;
    }

    public ConfigureSecurityGroupPermissionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfigureSecurityGroupPermissionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ConfigureSecurityGroupPermissionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSecurityGroupPermissionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSecurityGroupPermissionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ConfigureSecurityGroupPermissionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ConfigureSecurityGroupPermissionsRequest setRevokePermission(java.util.List<RevokePermission> revokePermission) {
        this.revokePermission = revokePermission;
        return this;
    }
    public java.util.List<RevokePermission> getRevokePermission() {
        return this.revokePermission;
    }

    public ConfigureSecurityGroupPermissionsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static class AuthorizePermission extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("DestGroupId")
        public String destGroupId;

        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("GressFlow")
        public String gressFlow;

        @NameInMap("GroupOwnerAccount")
        public String groupOwnerAccount;

        @NameInMap("GroupOwnerId")
        public Long groupOwnerId;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        @NameInMap("NicType")
        public String nicType;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        @NameInMap("SourcePrefixListId")
        public String sourcePrefixListId;

        public static AuthorizePermission build(java.util.Map<String, ?> map) throws Exception {
            AuthorizePermission self = new AuthorizePermission();
            return TeaModel.build(map, self);
        }

        public AuthorizePermission setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AuthorizePermission setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public AuthorizePermission setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public AuthorizePermission setDestPrefixListId(String destPrefixListId) {
            this.destPrefixListId = destPrefixListId;
            return this;
        }
        public String getDestPrefixListId() {
            return this.destPrefixListId;
        }

        public AuthorizePermission setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public AuthorizePermission setGressFlow(String gressFlow) {
            this.gressFlow = gressFlow;
            return this;
        }
        public String getGressFlow() {
            return this.gressFlow;
        }

        public AuthorizePermission setGroupOwnerAccount(String groupOwnerAccount) {
            this.groupOwnerAccount = groupOwnerAccount;
            return this;
        }
        public String getGroupOwnerAccount() {
            return this.groupOwnerAccount;
        }

        public AuthorizePermission setGroupOwnerId(Long groupOwnerId) {
            this.groupOwnerId = groupOwnerId;
            return this;
        }
        public Long getGroupOwnerId() {
            return this.groupOwnerId;
        }

        public AuthorizePermission setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public AuthorizePermission setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public AuthorizePermission setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public AuthorizePermission setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public AuthorizePermission setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public AuthorizePermission setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public AuthorizePermission setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public AuthorizePermission setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public AuthorizePermission setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public AuthorizePermission setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public AuthorizePermission setSourcePrefixListId(String sourcePrefixListId) {
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }
        public String getSourcePrefixListId() {
            return this.sourcePrefixListId;
        }

    }

    public static class RevokePermission extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("DestGroupId")
        public String destGroupId;

        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("GressFlow")
        public String gressFlow;

        @NameInMap("GroupOwnerAccount")
        public String groupOwnerAccount;

        @NameInMap("GroupOwnerId")
        public Long groupOwnerId;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        @NameInMap("NicType")
        public String nicType;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        @NameInMap("SourcePrefixListId")
        public String sourcePrefixListId;

        public static RevokePermission build(java.util.Map<String, ?> map) throws Exception {
            RevokePermission self = new RevokePermission();
            return TeaModel.build(map, self);
        }

        public RevokePermission setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RevokePermission setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public RevokePermission setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public RevokePermission setDestPrefixListId(String destPrefixListId) {
            this.destPrefixListId = destPrefixListId;
            return this;
        }
        public String getDestPrefixListId() {
            return this.destPrefixListId;
        }

        public RevokePermission setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public RevokePermission setGressFlow(String gressFlow) {
            this.gressFlow = gressFlow;
            return this;
        }
        public String getGressFlow() {
            return this.gressFlow;
        }

        public RevokePermission setGroupOwnerAccount(String groupOwnerAccount) {
            this.groupOwnerAccount = groupOwnerAccount;
            return this;
        }
        public String getGroupOwnerAccount() {
            return this.groupOwnerAccount;
        }

        public RevokePermission setGroupOwnerId(Long groupOwnerId) {
            this.groupOwnerId = groupOwnerId;
            return this;
        }
        public Long getGroupOwnerId() {
            return this.groupOwnerId;
        }

        public RevokePermission setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public RevokePermission setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public RevokePermission setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public RevokePermission setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public RevokePermission setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public RevokePermission setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public RevokePermission setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public RevokePermission setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public RevokePermission setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public RevokePermission setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public RevokePermission setSourcePrefixListId(String sourcePrefixListId) {
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }
        public String getSourcePrefixListId() {
            return this.sourcePrefixListId;
        }

    }

}
