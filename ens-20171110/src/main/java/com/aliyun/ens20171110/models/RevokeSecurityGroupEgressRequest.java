// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupEgressRequest extends TeaModel {
    /**
     * <p>The destination IP addresses. CIDR blocks and IPv4 addresses are supported.</p>
     * <br>
     * <p>By default, this parameter is empty.</p>
     */
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    /**
     * <p>The transport layer protocol. The value of this parameter is case-sensitive. Valid values:</p>
     * <br>
     * <p>*   tcp</p>
     * <p>*   udp</p>
     * <p>*   icmp</p>
     * <p>*   gre</p>
     * <p>*   all: All protocols are supported.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The action of the security group rule. Valid values:</p>
     * <br>
     * <p>*   **accept**: allows access.</p>
     * <p>*   **drop**: denies access and returns no responses.</p>
     * <br>
     * <p>Default value: **accept**.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination ports that correspond to the transport layer protocol for the security group rule. Valid values:</p>
     * <br>
     * <p>*   If you set the IpProtocol parameter to tcp or udp, the port number ranges from **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.</p>
     * <p>*   When the IpProtocol parameter is set to icmp, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to gre, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to all, the port number range is **-1/-1**, which indicates all ports.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The priority of the security group rule. Valid values: **1** to **100**. A smaller value indicates a higher priority.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The range of port numbers that correspond to the transport layer protocol for the source security group. Valid values:</p>
     * <br>
     * <p>*   If you set the IpProtocol parameter to tcp or udp, the port number ranges from **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.</p>
     * <p>*   When the IpProtocol parameter is set to icmp, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to gre, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to all, the port number range is **-1/-1**, which indicates all ports.</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    public static RevokeSecurityGroupEgressRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupEgressRequest self = new RevokeSecurityGroupEgressRequest();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupEgressRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public RevokeSecurityGroupEgressRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public RevokeSecurityGroupEgressRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public RevokeSecurityGroupEgressRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public RevokeSecurityGroupEgressRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RevokeSecurityGroupEgressRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

}
