// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SecurityGroupRule extends TeaModel {
    // 方向
    @NameInMap("Direction")
    public String direction;

    // 协议
    @NameInMap("IpProtocol")
    public String ipProtocol;

    // 目的端口
    @NameInMap("PortRange")
    public String portRange;

    // 源端口
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    // 授权策略
    @NameInMap("Policy")
    public String policy;

    // 目标网段
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    // 源网段
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    // 描述
    @NameInMap("Description")
    public String description;

    // 优先级
    @NameInMap("priority")
    public Integer priority;

    public static SecurityGroupRule build(java.util.Map<String, ?> map) throws Exception {
        SecurityGroupRule self = new SecurityGroupRule();
        return TeaModel.build(map, self);
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

    public SecurityGroupRule setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public SecurityGroupRule setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public SecurityGroupRule setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SecurityGroupRule setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public SecurityGroupRule setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public SecurityGroupRule setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SecurityGroupRule setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

}
