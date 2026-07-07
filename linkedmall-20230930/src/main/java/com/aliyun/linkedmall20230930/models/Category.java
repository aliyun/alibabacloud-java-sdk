// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Category extends TeaModel {
    /**
     * <p>The ID of the category.</p>
     * 
     * <strong>example:</strong>
     * <p>201792301</p>
     */
    @NameInMap("categoryId")
    public Long categoryId;

    /**
     * <p>Indicates whether the category is a leaf category.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isLeaf")
    public Boolean isLeaf;

    /**
     * <p>The level of the category.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("level")
    public Integer level;

    /**
     * <p>The name of the category.</p>
     * 
     * <strong>example:</strong>
     * <p>名称测试</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the parent category.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
