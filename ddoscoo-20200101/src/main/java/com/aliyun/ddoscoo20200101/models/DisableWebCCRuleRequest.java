// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableWebCCRuleRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DisableWebCCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableWebCCRuleRequest self = new DisableWebCCRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableWebCCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DisableWebCCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
