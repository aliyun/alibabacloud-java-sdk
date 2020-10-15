// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressRequest extends TeaModel {
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

    @NameInMap("DestCidrIp")
    @Validation(required = true)
    public String destCidrIp;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    public static AuthorizeSecurityGroupEgressRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupEgressRequest self = new AuthorizeSecurityGroupEgressRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupEgressRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AuthorizeSecurityGroupEgressRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AuthorizeSecurityGroupEgressRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public AuthorizeSecurityGroupEgressRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AuthorizeSecurityGroupEgressRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AuthorizeSecurityGroupEgressRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AuthorizeSecurityGroupEgressRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public AuthorizeSecurityGroupEgressRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

}
