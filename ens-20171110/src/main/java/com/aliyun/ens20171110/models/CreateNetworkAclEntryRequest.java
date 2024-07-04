// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkAclEntryRequest extends TeaModel {
    /**
     * <p>The source CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the network ACL.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my NetworkAcl.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the ACL rule controls inbound or outbound access requests. Valid values:</p>
     * <ul>
     * <li><strong>ingress</strong></li>
     * <li><strong>egress</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingress</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The name of the rule.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-1</p>
     */
    @NameInMap("NetworkAclEntryName")
    public String networkAclEntryName;

    /**
     * <p>The ID of the network ACL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nacl-bp1lhl0taikrbgnh****</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>The action that is performed on network traffic that matches the rule. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows network traffic.</li>
     * <li><strong>drop</strong>: blocks network traffic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The port range.</p>
     * <ul>
     * <li>If you set <strong>Protocol</strong> to <strong>all</strong> or <strong>icmp</strong>, set this parameter to -1/-1, which specifies all ports.</li>
     * <li>If you set <strong>Protocol</strong> to <strong>tcp</strong> or <strong>udp</strong>, the port can be <strong>1 to 65535</strong>. You can set this parameter to <strong>1/200</strong> or <strong>80/80</strong>, which specifies ports 1 to 200 or port 80.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-1/-1</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The priority of the rule. Valid values: <strong>1 to 100</strong>. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><strong>icmp</strong>: ICMP</li>
     * <li><strong>tcp</strong>: TCP</li>
     * <li><strong>udp</strong>: UDP</li>
     * <li><strong>all</strong>: all protocols</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    public static CreateNetworkAclEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclEntryRequest self = new CreateNetworkAclEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAclEntryRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateNetworkAclEntryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkAclEntryRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateNetworkAclEntryRequest setNetworkAclEntryName(String networkAclEntryName) {
        this.networkAclEntryName = networkAclEntryName;
        return this;
    }
    public String getNetworkAclEntryName() {
        return this.networkAclEntryName;
    }

    public CreateNetworkAclEntryRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public CreateNetworkAclEntryRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateNetworkAclEntryRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public CreateNetworkAclEntryRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateNetworkAclEntryRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
