// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SecurityGroupRule extends TeaModel {
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

    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    @NameInMap("priority")
    public Integer priority;

    public static SecurityGroupRule build(java.util.Map<String, ?> map) throws Exception {
        SecurityGroupRule self = new SecurityGroupRule();
        return TeaModel.build(map, self);
    }

    public SecurityGroupRule setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SecurityGroupRule setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public SecurityGroupRule setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public SecurityGroupRule setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public SecurityGroupRule setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SecurityGroupRule setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public SecurityGroupRule setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public SecurityGroupRule setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public SecurityGroupRule setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

}
