// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CategoryListResult extends TeaModel {
    /**
     * <p>The category collection.</p>
     */
    @NameInMap("categories")
    public java.util.List<Category> categories;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4D1FC14F-CE54-1A1F-A322-D6DC87D49AFE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CategoryListResult build(java.util.Map<String, ?> map) throws Exception {
        CategoryListResult self = new CategoryListResult();
        return TeaModel.build(map, self);
    }

    public CategoryListResult setCategories(java.util.List<Category> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<Category> getCategories() {
        return this.categories;
    }

    public CategoryListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
