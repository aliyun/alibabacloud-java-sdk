// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListCategoriesRequest extends TeaModel {
    @NameInMap("body")
    public CategoryListQuery body;

    public static ListCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesRequest self = new ListCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListCategoriesRequest setBody(CategoryListQuery body) {
        this.body = body;
        return this;
    }
    public CategoryListQuery getBody() {
        return this.body;
    }

}
