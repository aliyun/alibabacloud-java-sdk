// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ConfigureSecurityGroupPermissionsRequest extends TeaModel {
    @NameInMap("AuthorizePermissions")
    public java.util.List<ConfigureSecurityGroupPermissionsRequestAuthorizePermissions> authorizePermissions;

    @NameInMap("RevokePermissions")
    public java.util.List<ConfigureSecurityGroupPermissionsRequestRevokePermissions> revokePermissions;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static ConfigureSecurityGroupPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSecurityGroupPermissionsRequest self = new ConfigureSecurityGroupPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSecurityGroupPermissionsRequest setAuthorizePermissions(java.util.List<ConfigureSecurityGroupPermissionsRequestAuthorizePermissions> authorizePermissions) {
        this.authorizePermissions = authorizePermissions;
        return this;
    }
    public java.util.List<ConfigureSecurityGroupPermissionsRequestAuthorizePermissions> getAuthorizePermissions() {
        return this.authorizePermissions;
    }

    public ConfigureSecurityGroupPermissionsRequest setRevokePermissions(java.util.List<ConfigureSecurityGroupPermissionsRequestRevokePermissions> revokePermissions) {
        this.revokePermissions = revokePermissions;
        return this;
    }
    public java.util.List<ConfigureSecurityGroupPermissionsRequestRevokePermissions> getRevokePermissions() {
        return this.revokePermissions;
    }

    public ConfigureSecurityGroupPermissionsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static class ConfigureSecurityGroupPermissionsRequestAuthorizePermissions extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static ConfigureSecurityGroupPermissionsRequestAuthorizePermissions build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSecurityGroupPermissionsRequestAuthorizePermissions self = new ConfigureSecurityGroupPermissionsRequestAuthorizePermissions();
            return TeaModel.build(map, self);
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public ConfigureSecurityGroupPermissionsRequestAuthorizePermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class ConfigureSecurityGroupPermissionsRequestRevokePermissions extends TeaModel {
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static ConfigureSecurityGroupPermissionsRequestRevokePermissions build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSecurityGroupPermissionsRequestRevokePermissions self = new ConfigureSecurityGroupPermissionsRequestRevokePermissions();
            return TeaModel.build(map, self);
        }

        public ConfigureSecurityGroupPermissionsRequestRevokePermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public ConfigureSecurityGroupPermissionsRequestRevokePermissions setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ConfigureSecurityGroupPermissionsRequestRevokePermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ConfigureSecurityGroupPermissionsRequestRevokePermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ConfigureSecurityGroupPermissionsRequestRevokePermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ConfigureSecurityGroupPermissionsRequestRevokePermissions setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ConfigureSecurityGroupPermissionsRequestRevokePermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public ConfigureSecurityGroupPermissionsRequestRevokePermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
