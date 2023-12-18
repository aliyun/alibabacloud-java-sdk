// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressRequest extends TeaModel {
    /**
     * <p>The destination IP addresses. CIDR blocks and IPv4 addresses are supported.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    /**
     * <p>The transport layer protocol. The values of this parameter are case-sensitive. Valid values:</p>
     * <br>
     * <p>*   tcp: TCP.</p>
     * <p>*   udp: UDP.</p>
     * <p>*   icmp: ICMP.</p>
     * <p>*   gre: GRE.</p>
     * <p>*   all: All protocols are supported.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The action of security group rule N that determines whether to allow inbound access. Valid values:</p>
     * <br>
     * <p>*   accept: allows access. This is the default value.</p>
     * <p>*   drop: denies access and returns no responses.</p>
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
     * <p>The priority of the security group rule. Valid values: **1 to 100**. Default value: **1**.</p>
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
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.</p>
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

    public static AuthorizeSecurityGroupEgressRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupEgressRequest self = new AuthorizeSecurityGroupEgressRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupEgressRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public AuthorizeSecurityGroupEgressRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AuthorizeSecurityGroupEgressRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AuthorizeSecurityGroupEgressRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public AuthorizeSecurityGroupEgressRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AuthorizeSecurityGroupEgressRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AuthorizeSecurityGroupEgressRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public AuthorizeSecurityGroupEgressRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
