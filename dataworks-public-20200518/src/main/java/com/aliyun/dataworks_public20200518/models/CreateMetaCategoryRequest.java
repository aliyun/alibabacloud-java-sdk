// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCategoryRequest extends TeaModel {
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

    /**
     * <p>The ID of the parent category.</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    public static CreateMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCategoryRequest self = new CreateMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetaCategoryRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateMetaCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetaCategoryRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
