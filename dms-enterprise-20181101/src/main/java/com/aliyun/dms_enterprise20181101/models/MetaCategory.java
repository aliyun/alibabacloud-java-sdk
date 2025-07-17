// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MetaCategory extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Depth")
    public Integer depth;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    public static MetaCategory build(java.util.Map<String, ?> map) throws Exception {
        MetaCategory self = new MetaCategory();
        return TeaModel.build(map, self);
    }

    public MetaCategory setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public MetaCategory setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MetaCategory setDepth(Integer depth) {
        this.depth = depth;
        return this;
    }
    public Integer getDepth() {
        return this.depth;
    }

    public MetaCategory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MetaCategory setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

}
