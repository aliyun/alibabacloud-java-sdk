// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateCategoryRequest extends TeaModel {
    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    @NameInMap("Name")
    public String name;

    public static CreateCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCategoryRequest self = new CreateCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateCategoryRequest setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public CreateCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
