// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeCategoryResponseBody extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    @NameInMap("Name")
    public String name;

    public static DescribeCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryResponseBody self = new DescribeCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryResponseBody setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public DescribeCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCategoryResponseBody setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public DescribeCategoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
