// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Category extends TeaModel {
    @NameInMap("categoryId")
    public Long categoryId;

    @NameInMap("leaf")
    public Boolean leaf;

    @NameInMap("level")
    public Integer level;

    @NameInMap("name")
    public String name;

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

    public Category setLeaf(Boolean leaf) {
        this.leaf = leaf;
        return this;
    }
    public Boolean getLeaf() {
        return this.leaf;
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
