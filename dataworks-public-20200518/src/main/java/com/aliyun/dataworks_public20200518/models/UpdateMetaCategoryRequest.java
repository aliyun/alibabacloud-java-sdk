// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaCategoryRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("CategoryId")
    @Validation(required = true)
    public Long categoryId;

    public static UpdateMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCategoryRequest self = new UpdateMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMetaCategoryRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateMetaCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
