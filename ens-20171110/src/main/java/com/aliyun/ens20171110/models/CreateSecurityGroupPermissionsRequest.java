// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupPermissionsRequest extends TeaModel {
    /**
     * <p>The security group rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<CreateSecurityGroupPermissionsRequestPermissions> permissions;

    /**
     * <p>The IDs of the security groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static CreateSecurityGroupPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupPermissionsRequest self = new CreateSecurityGroupPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupPermissionsRequest setPermissions(java.util.List<CreateSecurityGroupPermissionsRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<CreateSecurityGroupPermissionsRequestPermissions> getPermissions() {
        return this.permissions;
    }

    public CreateSecurityGroupPermissionsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static class CreateSecurityGroupPermissionsRequestPermissions extends TeaModel {
        /**
         * <p>The description of the storage gateway. It must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.XX.XX.14/32</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The direction in which the security group rule is applied.</p>
         * <ul>
         * <li>egress</li>
         * <li>ingress</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>Protocol type. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>ICMP: the ICMP protocol</li>
         * <li>ICMPv6: the ICMP protocol for IPv6.</li>
         * <li>ALL: All protocols are supported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block. IPv6 CIDR blocks and IPv6 addresses are supported.</p>
         * <blockquote>
         * <p> This parameter and the <code>DestCidrIp</code> parameter cannot be set at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>::/0</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block of the security group rule. or IPv6 address.</p>
         * <blockquote>
         * <p> This parameter and the <code>DestCidrIp</code> parameter cannot be set at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>::/0</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The action specified in the security group rule. Valid values:</p>
         * <ul>
         * <li>Accept</li>
         * <li>Drop</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the security group rule. Valid values:</p>
         * <ul>
         * <li>If you set IpProtocol to TCP or UDP, the valid values of this parameter are 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>If you set IpProtocol to ICMP, the port range is -1/-1.</li>
         * <li>ICMPv6:-1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port number range is -1/-1.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule. A smaller value specifies a higher priority. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The source IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of source port numbers for the protocols specified in the security group rule. Valid values:</p>
         * <ul>
         * <li>If you set IpProtocol to TCP or UDP, the valid values of this parameter are 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>If you set IpProtocol to ICMP, the port range is -1/-1.</li>
         * <li>ICMPv6:-1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port range is -1/-1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static CreateSecurityGroupPermissionsRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityGroupPermissionsRequestPermissions self = new CreateSecurityGroupPermissionsRequestPermissions();
            return TeaModel.build(map, self);
        }

        public CreateSecurityGroupPermissionsRequestPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public CreateSecurityGroupPermissionsRequestPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
