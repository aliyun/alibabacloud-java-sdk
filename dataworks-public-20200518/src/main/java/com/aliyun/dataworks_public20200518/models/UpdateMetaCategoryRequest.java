// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaCategoryRequest extends TeaModel {
    /**
     * <p>The ID of the category.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The remarks of the category.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the category.</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCategoryRequest self = new UpdateMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateMetaCategoryRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateMetaCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
