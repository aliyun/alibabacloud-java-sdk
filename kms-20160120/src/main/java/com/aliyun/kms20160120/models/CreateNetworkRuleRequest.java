// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateNetworkRuleRequest extends TeaModel {
    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the access control rule.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The private IP address or private CIDR block. Separate multiple items with commas (,).</p>
     */
    @NameInMap("SourcePrivateIp")
    public String sourcePrivateIp;

    /**
     * <p>The network type.</p>
     * <br>
     * <p>Only private IP addresses are supported. Set the value to Private.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateNetworkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRuleRequest self = new CreateNetworkRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNetworkRuleRequest setSourcePrivateIp(String sourcePrivateIp) {
        this.sourcePrivateIp = sourcePrivateIp;
        return this;
    }
    public String getSourcePrivateIp() {
        return this.sourcePrivateIp;
    }

    public CreateNetworkRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
