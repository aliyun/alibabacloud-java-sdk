// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Category extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>201792301</p>
     */
    @NameInMap("categoryId")
    public Long categoryId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isLeaf")
    public Boolean isLeaf;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("level")
    public Integer level;

    /**
     * <strong>example:</strong>
     * <p>方便面/拉面/挂面/轻食面速食</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>50016422</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    public static Category build(java.util.Map<String, ?> map) throws Exception {
        Category self = new Category();
        return TeaModel.build(map, self);
    }

    public Category setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public Category setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
        return this;
    }
    public Boolean getIsLeaf() {
        return this.isLeaf;
    }

    public Category setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Category setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
