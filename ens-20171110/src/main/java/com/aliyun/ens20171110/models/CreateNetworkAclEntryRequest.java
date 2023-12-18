// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkAclEntryRequest extends TeaModel {
    /**
     * <p>The source CIDR block.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the network ACL.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length. The description cannot start with \*\*http:// **or** https://\*\*.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the ACL rule controls inbound or outbound access requests. Valid values:</p>
     * <br>
     * <p>*   **ingress**</p>
     * <p>*   **egress**</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The name of the rule.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length. The name cannot start with \*\*http:// **or** https://\*\*.</p>
     */
    @NameInMap("NetworkAclEntryName")
    public String networkAclEntryName;

    /**
     * <p>The ID of the network ACL.</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>The action that is performed on network traffic that matches the rule. Valid values:</p>
     * <br>
     * <p>*   **accept**: allows network traffic.</p>
     * <p>*   **drop**: blocks network traffic.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The port range.</p>
     * <br>
     * <p>*   If you set **Protocol** to **all** or **icmp**, set this parameter to \*\*-1/-1\*\*. \*\*-1/-1\*\* specifies all ports.</p>
     * <p>*   If you set **Protocol** to **tcp** or **udp**, the port range must be in the following format: **1/200** or **80/80**. 1/200 specifies port 1 to port 200 and 80/80 specifies port 80. Valid values for a port: **1 to 65535**.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The priority of the rule. Valid values: **1 to 100**. Default value: **1**.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The protocol. Valid values:</p>
     * <br>
     * <p>*   **icmp**: ICMP</p>
     * <p>*   **tcp**: TCP</p>
     * <p>*   **udp**: UDP</p>
     * <p>*   **all**: all protocols</p>
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
