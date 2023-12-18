// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupRequest extends TeaModel {
    /**
     * <p>The transport layer protocol. The values of this parameter are case-sensitive. Valid values:</p>
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
     * <p>The action of security group rule N that determines whether to allow inbound access. Valid values:</p>
     * <br>
     * <p>*   accept: allows access.</p>
     * <p>*   drop: denies access and returns no responses.</p>
     * <br>
     * <p>Default value: accept.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination ports that correspond to the transport layer protocol for security group rule N. Valid values:</p>
     * <br>
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.</p>
     * <p>*   When the IpProtocol parameter is set to icmp, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to gre, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to all, the port number range is **-1/-1**, which indicates all ports.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The priority of the security group rule. Valid values: **1** to **100**.</p>
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
     * <p>The source IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The range of port numbers that correspond to the transport layer protocol for the source security group. Valid values:</p>
     * <br>
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is **1 to 65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.</p>
     * <p>*   When the IpProtocol parameter is set to icmp, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to gre, the port number range is **-1/-1**, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to all, the port number range is **-1/-1**, which indicates all ports.</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>2017-11-10</p>
     */
    @NameInMap("Version")
    public String version;

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

    public AuthorizeSecurityGroupRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
