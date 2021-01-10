// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CategoryTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CategoryTree")
    public String categoryTree;

    public static CategoryTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CategoryTreeResponseBody self = new CategoryTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public CategoryTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CategoryTreeResponseBody setCategoryTree(String categoryTree) {
        this.categoryTree = categoryTree;
        return this;
    }
    public String getCategoryTree() {
        return this.categoryTree;
    }

}
