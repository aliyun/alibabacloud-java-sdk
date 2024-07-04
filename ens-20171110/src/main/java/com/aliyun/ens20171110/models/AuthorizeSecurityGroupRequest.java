// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupRequest extends TeaModel {
    /**
     * <p>The transport layer protocol. The values of this parameter are case-sensitive. Valid values:</p>
     * <ul>
     * <li>tcp</li>
     * <li>udp</li>
     * <li>icmp</li>
     * <li>gre</li>
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
     * <p>The action of security group rule N that determines whether to allow inbound access. Valid values:</p>
     * <ul>
     * <li>accept: allows access.</li>
     * <li>drop: denies access and returns no responses.</li>
     * </ul>
     * <p>Default value: accept.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination ports that correspond to the transport layer protocol for security group rule N. Valid values:</p>
     * <ul>
     * <li>When the IpProtocol parameter is set to tcp or udp, the port number range is <strong>1</strong> to <strong>65535</strong>. The start port number and the end port number are separated by a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
     * <li>When the IpProtocol parameter is set to icmp, the port number range is <strong>-1/-1</strong>, which indicates all ports.</li>
     * <li>When the IpProtocol parameter is set to gre, the port number range is <strong>-1/-1</strong>, which indicates all ports.</li>
     * <li>When the IpProtocol parameter is set to all, the port number range is <strong>-1/-1</strong>, which indicates all ports.</li>
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
     * <p>The ID of the security group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4ph***</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The source IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
     * <p>This parameter is empty by default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX/8</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The range of port numbers that correspond to the transport layer protocol for the source security group. Valid values:</p>
     * <ul>
     * <li>When the IpProtocol parameter is set to tcp or udp, the port number range is <strong>1 to 65535</strong>. The start port number and the end port number are separated by a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
     * <li>When the IpProtocol parameter is set to icmp, the port number range is <strong>-1/-1</strong>, which indicates all ports.</li>
     * <li>When the IpProtocol parameter is set to gre, the port number range is <strong>-1/-1</strong>, which indicates all ports.</li>
     * <li>When the IpProtocol parameter is set to all, the port number range is <strong>-1/-1</strong>, which indicates all ports.</li>
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
