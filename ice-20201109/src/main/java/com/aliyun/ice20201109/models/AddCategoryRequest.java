// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddCategoryRequest extends TeaModel {
    /**
     * <p>The category name.</p>
     * <ul>
     * <li>The maximum length is 64 bytes.</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Third-level subcategory</p>
     */
    @NameInMap("CateName")
    public String cateName;

    /**
     * <p>The parent category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The category type. Valid values:</p>
     * <ul>
     * <li>default (default): audio, video, and image category.                                 </li>
     * <li>material: short video material category.</li>
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
