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
     * <p>The security group ID.</p>
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
         * <p>The description. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block. Both CIDR format and IPv4 format IP address range are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.XX.XX.14/32</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The authorization direction. Valid values:</p>
         * <ul>
         * <li>egress: outbound.</li>
         * <li>ingress: inbound.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The protocol type. Valid values: </p>
         * <ul>
         * <li>TCP: TCP protocol.</li>
         * <li>UDP: UDP protocol.</li>
         * <li>ICMP: ICMP protocol.</li>
         * <li>ICMPv6: ICMPv6 protocol.</li>
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
         * <p>The destination IPv6 CIDR block. Both CIDR format and IPv6 format IP address range are supported. </p>
         * <blockquote>
         * <p>This parameter and the <code>DestCidrIp</code> parameter cannot be set at the same time. Settings for these two parameters are mutually exclusive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>::/0</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block. Both CIDR format and IPv6 format IP address range are supported.</p>
         * <blockquote>
         * <p>This parameter and the <code>DestCidrIp</code> parameter cannot be set at the same time. Settings for these two parameters are mutually exclusive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>::/0</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The access permissions. Valid values: </p>
         * <ul>
         * <li>Accept: Allows access.</li>
         * <li>Drop: Deny access.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports that correspond to the protocols for the security group. Valid values:</p>
         * <ul>
         * <li>TCP/UDP protocol: Valid values are 1 to 65535. Separate the start port and end port with a forward slash (/). Example: 1/200.</li>
         * <li>ICMP protocol: -1/-1.</li>
         * <li>ICMPv6: -1/-1.</li>
         * <li>ALL: -1/-1.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The source IPv4 CIDR block. Both CIDR format and IPv4 format IP address range are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of source ports that correspond to the protocols for the security group. Valid values:</p>
         * <ul>
         * <li>TCP/UDP protocol: Valid values are 1 to 65535. Separate the start port and end port with a forward slash (/). Example: 1/200.</li>
         * <li>ICMP protocol: -1/-1.</li>
         * <li>ICMPv6: -1/-1.</li>
         * <li>ALL: -1/-1.</li>
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
