// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCategoryRequest extends TeaModel {
    /**
     * <p>The ID of the category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    public static DeleteMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCategoryRequest self = new DeleteMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
