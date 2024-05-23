// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupRequest extends TeaModel {
    /**
     * <p>The transport layer protocol. The value of this parameter is case-sensitive. Valid values:</p>
     * <br>
     * <p>*   tcp: TCP.</p>
     * <p>*   udp: UDP.</p>
     * <p>*   icmp: ICMP.</p>
     * <p>*   gre: GRE.</p>
     * <p>*   all: all protocols.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The authorization policy. Valid values:</p>
     * <br>
     * <p>*   accept: allows access. This is the default value.</p>
     * <p>*   drop: denies access and returns no responses.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination ports that correspond to the transport layer protocol for the security group rule. Valid values:</p>
     * <br>
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.</p>
     * <p>*   When the IpProtocol parameter is set to icmp, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to gre, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to all, the port number range is **-1/-1**, which indicates all ports.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The priority of security group rule N. Valid values: **1** to **100**. Default value: **1**.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the security group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The source CIDR block. CIDR blocks and IPv4 addresses are supported. Default value: 0.0.XX.XX/0.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The range of source ports that correspond to the transport layer protocol for the security group rule. Valid values:</p>
     * <br>
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.</p>
     * <p>*   When the IpProtocol parameter is set to icmp, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to gre, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to all, the port number range is **-1/-1**, which indicates all ports.</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    public static RevokeSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupRequest self = new RevokeSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public RevokeSecurityGroupRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public RevokeSecurityGroupRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public RevokeSecurityGroupRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public RevokeSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
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
