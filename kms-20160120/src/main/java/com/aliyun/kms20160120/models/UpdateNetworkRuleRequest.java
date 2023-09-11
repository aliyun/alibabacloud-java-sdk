// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateNetworkRuleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("SourcePrivateIp")
    public String sourcePrivateIp;

    public static UpdateNetworkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkRuleRequest self = new UpdateNetworkRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateNetworkRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateNetworkRuleRequest setSourcePrivateIp(String sourcePrivateIp) {
        this.sourcePrivateIp = sourcePrivateIp;
        return this;
    }
    public String getSourcePrivateIp() {
        return this.sourcePrivateIp;
    }

}
