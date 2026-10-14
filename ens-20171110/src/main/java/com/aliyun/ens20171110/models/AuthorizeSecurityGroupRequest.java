// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupRequest extends TeaModel {
    /**
     * <p>The transport-layer protocol. The value is case-sensitive. Valid values:</p>
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
     * <li>accept: accepts access.</li>
     * <li>drop: deny access without returning a rejection message.</li>
     * </ul>
     * <p>Default value: accept.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of port numbers for the transport-layer protocol of the security group. Valid values:</p>
     * <ul>
     * <li>TCP/UDP protocol: valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
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
     * <p>The priority of the security group rule. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
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
     * <p>The source IP address range. CIDR blocks and IPv4 addresses are supported.</p>
     * <p>Default value: none.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX/8</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The range of port numbers for the transport-layer protocol of the source security group. Valid values:</p>
     * <ul>
     * <li>TCP/UDP protocol: valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
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

    public static AuthorizeSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupRequest self = new AuthorizeSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AuthorizeSecurityGroupRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AuthorizeSecurityGroupRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public AuthorizeSecurityGroupRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AuthorizeSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AuthorizeSecurityGroupRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public AuthorizeSecurityGroupRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

}
