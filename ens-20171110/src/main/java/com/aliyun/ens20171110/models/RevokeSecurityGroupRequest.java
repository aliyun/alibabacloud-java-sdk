// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("IpProtocol")
    @Validation(required = true)
    public String ipProtocol;

    @NameInMap("PortRange")
    @Validation(required = true)
    public String portRange;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("SourceCidrIp")
    @Validation(required = true)
    public String sourceCidrIp;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    public static RevokeSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupRequest self = new RevokeSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public RevokeSecurityGroupRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public RevokeSecurityGroupRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public RevokeSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RevokeSecurityGroupRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public RevokeSecurityGroupRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public RevokeSecurityGroupRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public RevokeSecurityGroupRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

}
