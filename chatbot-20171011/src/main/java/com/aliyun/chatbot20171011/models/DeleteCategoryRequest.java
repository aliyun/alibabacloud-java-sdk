// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteCategoryRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    public static DeleteCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCategoryRequest self = new DeleteCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
