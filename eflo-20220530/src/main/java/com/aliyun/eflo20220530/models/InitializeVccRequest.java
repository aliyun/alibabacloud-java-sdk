// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class InitializeVccRequest extends TeaModel {
    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxhucx5ewuwy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static InitializeVccRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeVccRequest self = new InitializeVccRequest();
        return TeaModel.build(map, self);
    }

    public InitializeVccRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
