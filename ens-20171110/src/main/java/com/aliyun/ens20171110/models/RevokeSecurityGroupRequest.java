// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupRequest extends TeaModel {
    /**
     * <p>The transport layer protocol. The value is case-sensitive. Valid values:</p>
     * <ul>
     * <li>tcp: TCP.</li>
     * <li>udp: UDP.</li>
     * <li>icmp: ICMP.</li>
     * <li>gre: GRE.</li>
     * <li>all: All protocols are supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>Settings for access permissions. Valid values:</p>
     * <ul>
     * <li>accept (default): Accepts access.</li>
     * <li>drop: Deny access without returning a deny message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination port numbers relevant to the transport layer protocol for the security group. Valid values:</p>
     * <ul>
     * <li>TCP/UDP: Valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and end port with a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
     * <li>ICMP: <strong>-1/-1</strong>.</li>
     * <li>GRE: <strong>-1/-1</strong>.</li>
     * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22/22</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The priority of the security group rule. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The security group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The source IP address range. CIDR format and IPv4 format are supported. Default value: 0.0.XX.XX/0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX/8</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The range of source port numbers relevant to the transport layer protocol for the security group. Valid values:</p>
     * <ul>
     * <li>TCP/UDP: Valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and end port with a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
     * <li>ICMP: <strong>-1/-1</strong>.</li>
     * <li>GRE: <strong>-1/-1</strong>.</li>
     * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>22/22</p>
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
