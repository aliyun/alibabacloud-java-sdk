// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupAttributeRequest extends TeaModel {
    @NameInMap("AuthorizeEgress")
    public java.util.List<ModifySecurityGroupAttributeRequestAuthorizeEgress> authorizeEgress;

    @NameInMap("AuthorizeIngress")
    public java.util.List<ModifySecurityGroupAttributeRequestAuthorizeIngress> authorizeIngress;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RevokeEgress")
    public java.util.List<ModifySecurityGroupAttributeRequestRevokeEgress> revokeEgress;

    @NameInMap("RevokeIngress")
    public java.util.List<ModifySecurityGroupAttributeRequestRevokeIngress> revokeIngress;

    public static ModifySecurityGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupAttributeRequest self = new ModifySecurityGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupAttributeRequest setAuthorizeEgress(java.util.List<ModifySecurityGroupAttributeRequestAuthorizeEgress> authorizeEgress) {
        this.authorizeEgress = authorizeEgress;
        return this;
    }
    public java.util.List<ModifySecurityGroupAttributeRequestAuthorizeEgress> getAuthorizeEgress() {
        return this.authorizeEgress;
    }

    public ModifySecurityGroupAttributeRequest setAuthorizeIngress(java.util.List<ModifySecurityGroupAttributeRequestAuthorizeIngress> authorizeIngress) {
        this.authorizeIngress = authorizeIngress;
        return this;
    }
    public java.util.List<ModifySecurityGroupAttributeRequestAuthorizeIngress> getAuthorizeIngress() {
        return this.authorizeIngress;
    }

    public ModifySecurityGroupAttributeRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifySecurityGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySecurityGroupAttributeRequest setRevokeEgress(java.util.List<ModifySecurityGroupAttributeRequestRevokeEgress> revokeEgress) {
        this.revokeEgress = revokeEgress;
        return this;
    }
    public java.util.List<ModifySecurityGroupAttributeRequestRevokeEgress> getRevokeEgress() {
        return this.revokeEgress;
    }

    public ModifySecurityGroupAttributeRequest setRevokeIngress(java.util.List<ModifySecurityGroupAttributeRequestRevokeIngress> revokeIngress) {
        this.revokeIngress = revokeIngress;
        return this;
    }
    public java.util.List<ModifySecurityGroupAttributeRequestRevokeIngress> getRevokeIngress() {
        return this.revokeIngress;
    }

    public static class ModifySecurityGroupAttributeRequestAuthorizeEgress extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("IpProtocol")
        public String ipProtocol;

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

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static ModifySecurityGroupAttributeRequestAuthorizeEgress build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupAttributeRequestAuthorizeEgress self = new ModifySecurityGroupAttributeRequestAuthorizeEgress();
            return TeaModel.build(map, self);
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeEgress setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class ModifySecurityGroupAttributeRequestAuthorizeIngress extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("IpProtocol")
        public String ipProtocol;

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

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static ModifySecurityGroupAttributeRequestAuthorizeIngress build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupAttributeRequestAuthorizeIngress self = new ModifySecurityGroupAttributeRequestAuthorizeIngress();
            return TeaModel.build(map, self);
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public ModifySecurityGroupAttributeRequestAuthorizeIngress setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class ModifySecurityGroupAttributeRequestRevokeEgress extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("IpProtocol")
        public String ipProtocol;

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

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static ModifySecurityGroupAttributeRequestRevokeEgress build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupAttributeRequestRevokeEgress self = new ModifySecurityGroupAttributeRequestRevokeEgress();
            return TeaModel.build(map, self);
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public ModifySecurityGroupAttributeRequestRevokeEgress setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class ModifySecurityGroupAttributeRequestRevokeIngress extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("IpProtocol")
        public String ipProtocol;

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

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static ModifySecurityGroupAttributeRequestRevokeIngress build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupAttributeRequestRevokeIngress self = new ModifySecurityGroupAttributeRequestRevokeIngress();
            return TeaModel.build(map, self);
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public ModifySecurityGroupAttributeRequestRevokeIngress setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
