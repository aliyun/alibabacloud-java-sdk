// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkAclEntryRequest extends TeaModel {
    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("Description")
    public String description;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("NetworkAclEntryName")
    public String networkAclEntryName;

    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("PortRange")
    public String portRange;

    @NameInMap("Priority")
    public Integer priority;

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
