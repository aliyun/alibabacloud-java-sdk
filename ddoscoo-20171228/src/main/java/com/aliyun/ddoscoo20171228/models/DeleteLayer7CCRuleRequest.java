// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer7CCRuleRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static DeleteLayer7CCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer7CCRuleRequest self = new DeleteLayer7CCRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLayer7CCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteLayer7CCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteLayer7CCRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
