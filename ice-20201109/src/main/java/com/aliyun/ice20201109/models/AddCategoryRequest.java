// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddCategoryRequest extends TeaModel {
    /**
     * <p>The category name.</p>
     * <ul>
     * <li>The value can be up to 64 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CateName")
    public String cateName;

    /**
     * <p>The ID of the parent category.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The type of the category. Valid values:</p>
     * <ul>
     * <li>default: audio, video, and image files. This is the default value.</li>
     * <li>material: short video materials.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
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
