// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupRequest extends TeaModel {
    /**
     * <p>The description. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Schema of Response</p>
     */
    @NameInMap("Permissions")
    public java.util.List<CreateSecurityGroupRequestPermissions> permissions;

    /**
     * <p>The name of the security group. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (<em>), and hyphens (-). It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (</em>), and hyphens (-). By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Dcdn1:2_3-4</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    public static CreateSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupRequest self = new CreateSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecurityGroupRequest setPermissions(java.util.List<CreateSecurityGroupRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<CreateSecurityGroupRequestPermissions> getPermissions() {
        return this.permissions;
    }

    public CreateSecurityGroupRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public static class CreateSecurityGroupRequestPermissions extends TeaModel {
        /**
         * <p>The description of the SDG.</p>
         * <blockquote>
         * <p> We recommend that you specify this parameter in details for subsequent queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block. IPv4 CIDR blocks and IPv4 addresses are supported.</p>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The direction in which the security group rule is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The protocol. The values of this parameter are case-insensitive. Valid values:</p>
         * <ul>
         * <li>TCP.</li>
         * <li>UDP.</li>
         * <li>ICMP.</li>
         * <li>ICMPv6.</li>
         * <li>GRE.</li>
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
         * <p>The action of the security group rule. Valid values:</p>
         * <ul>
         * <li>accept: allows inbound access.</li>
         * <li>drop: denies inbound access and returns no responses. In this case, the request times out or the connection cannot be established.</li>
         * </ul>
         * <p>Default value: accept.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination port numbers for the protocols specified in the security group rule. Valid values:</p>
         * <ul>
         * <li>If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>If you set IpProtocol to ICMP, the port number range is -1/-1.</li>
         * <li>If you set IpProtocol to GRE, the port number range is -1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port number range is -1/-1, which indicates all port numbers.</li>
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
         * <p>Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The source IPv4 CIDR block. IPv4 CIDR blocks and IPv4 addresses are supported.</p>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of source port numbers for the protocols specified in the security group rule. Valid values:</p>
         * <ul>
         * <li>If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port number range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>If you set IpProtocol to ICMP, the port number range is -1/-1.</li>
         * <li>If you set IpProtocol to GRE, the port number range is -1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port number range is -1/-1, which indicates all port numbers.</li>
         * </ul>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static CreateSecurityGroupRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityGroupRequestPermissions self = new CreateSecurityGroupRequestPermissions();
            return TeaModel.build(map, self);
        }

        public CreateSecurityGroupRequestPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSecurityGroupRequestPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public CreateSecurityGroupRequestPermissions setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public CreateSecurityGroupRequestPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public CreateSecurityGroupRequestPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateSecurityGroupRequestPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public CreateSecurityGroupRequestPermissions setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateSecurityGroupRequestPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public CreateSecurityGroupRequestPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
