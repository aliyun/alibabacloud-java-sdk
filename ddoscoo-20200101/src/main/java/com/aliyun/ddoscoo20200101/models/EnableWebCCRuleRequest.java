// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebCCRuleRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static EnableWebCCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableWebCCRuleRequest self = new EnableWebCCRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableWebCCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public EnableWebCCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
