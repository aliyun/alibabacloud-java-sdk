// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetResourceCategoryRequest extends TeaModel {
    /**
     * <p>Resource category ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-123****7890</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    public static GetResourceCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceCategoryRequest self = new GetResourceCategoryRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceCategoryRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

}
