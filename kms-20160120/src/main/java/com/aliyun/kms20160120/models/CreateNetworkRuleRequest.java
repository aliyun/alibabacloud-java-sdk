// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateNetworkRuleRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>networkrule description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the network control rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>networkrule_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The private IP addresses or private CIDR blocks. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;192.10.XX.XX&quot;,&quot;192.168.XX.XX/24&quot;]</p>
     */
    @NameInMap("SourcePrivateIp")
    public String sourcePrivateIp;

    /**
     * <p>The network type. Valid values: Private. This value indicates that only private IP addresses are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
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
