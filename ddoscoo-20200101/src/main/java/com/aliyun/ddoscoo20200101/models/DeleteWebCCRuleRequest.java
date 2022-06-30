// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCCRuleRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DeleteWebCCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCCRuleRequest self = new DeleteWebCCRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebCCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteWebCCRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteWebCCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
