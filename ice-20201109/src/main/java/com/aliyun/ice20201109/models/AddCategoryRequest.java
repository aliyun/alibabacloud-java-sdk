// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddCategoryRequest extends TeaModel {
    @NameInMap("CateName")
    public String cateName;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("Type")
    public String type;

    public static AddCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryRequest self = new AddCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddCategoryRequest setCateName(String cateName) {
        this.cateName = cateName;
        return this;
    }
    public String getCateName() {
        return this.cateName;
    }

    public AddCategoryRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public AddCategoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
