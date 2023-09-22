// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CategoryListQuery extends TeaModel {
    @NameInMap("categoryIds")
    public java.util.List<Long> categoryIds;

    @NameInMap("parentCategoryId")
    public Long parentCategoryId;

    public static CategoryListQuery build(java.util.Map<String, ?> map) throws Exception {
        CategoryListQuery self = new CategoryListQuery();
        return TeaModel.build(map, self);
    }

    public CategoryListQuery setCategoryIds(java.util.List<Long> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public java.util.List<Long> getCategoryIds() {
        return this.categoryIds;
    }

    public CategoryListQuery setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

}
