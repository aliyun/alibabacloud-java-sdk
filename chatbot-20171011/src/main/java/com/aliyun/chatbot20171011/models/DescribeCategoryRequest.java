// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeCategoryRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    public static DescribeCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryRequest self = new DescribeCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
