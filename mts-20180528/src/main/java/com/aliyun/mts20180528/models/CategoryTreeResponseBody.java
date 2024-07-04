// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class CategoryTreeResponseBody extends TeaModel {
    @NameInMap("CategoryTree")
    public String categoryTree;

    @NameInMap("RequestId")
    public String requestId;

    public static CategoryTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CategoryTreeResponseBody self = new CategoryTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public CategoryTreeResponseBody setCategoryTree(String categoryTree) {
        this.categoryTree = categoryTree;
        return this;
    }
    public String getCategoryTree() {
        return this.categoryTree;
    }

    public CategoryTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
