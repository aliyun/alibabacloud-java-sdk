// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupEgressRequest extends TeaModel {
    /**
     * <p>The destination IP address range. CIDR blocks and IPv4 address ranges are supported.</p>
     * <p>Default value: null.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    /**
     * <p>The transport layer protocol. The value is case-sensitive. Valid values:</p>
     * <ul>
     * <li>tcp</li>
     * <li>udp</li>
     * <li>icmp</li>
     * <li>gre</li>
     * <li>all: all protocols are supported</li>
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
     * <li><strong>accept</strong>: accepts access.</li>
     * <li><strong>drop</strong>: deny access without returning any denial information.</li>
     * </ul>
     * <p>Default value: <strong>accept</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination ports that correspond to the transport layer protocol. Valid values:</p>
     * <ul>
     * <li>TCP/UDP protocol: Valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
     * <li>ICMP protocol: <strong>-1/-1</strong>.</li>
     * <li>GRE protocol: <strong>-1/-1</strong>.</li>
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
     * <p>The priority of the security group rule. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
     * <p>Default value: <strong>1</strong>.</p>
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
     * <p>sg-bp67acfmxazb4ph***</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The range of source ports that correspond to the transport layer protocol. Valid values:</p>
     * <ul>
     * <li>TCP/UDP protocol: Valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
     * <li>ICMP protocol: <strong>-1/-1</strong>.</li>
     * <li>GRE protocol: <strong>-1/-1</strong>.</li>
     * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>22/22</p>
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
