// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer7RuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DeleteLayer7RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer7RuleRequest self = new DeleteLayer7RuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLayer7RuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteLayer7RuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
