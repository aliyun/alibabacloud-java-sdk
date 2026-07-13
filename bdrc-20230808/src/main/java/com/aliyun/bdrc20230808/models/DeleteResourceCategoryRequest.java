// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DeleteResourceCategoryRequest extends TeaModel {
    /**
     * <p>Resource category ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-123****7890</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    public static DeleteResourceCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceCategoryRequest self = new DeleteResourceCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceCategoryRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

}
