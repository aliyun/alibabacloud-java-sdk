// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateNetworkRuleRequest extends TeaModel {
    /**
     * <p>The description after the update.</p>
     * 
     * <strong>example:</strong>
     * <p>Creat by kst-hzz62ee817bvyyr5****</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the access control rule that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>networkrule_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The private IP address or CIDR block after the update. Separate multiple items with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;192.10.XX.XX&quot;,&quot;192.168.XX.XX/24&quot;]</p>
     */
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
