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

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerIds")
    public java.util.List<Long> ownerIds;

    @NameInMap("OwnerNickNames")
    public java.util.List<String> ownerNickNames;

    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    @NameInMap("Remark")
    public String remark;

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

    public MetaCategory setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MetaCategory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MetaCategory setOwnerIds(java.util.List<Long> ownerIds) {
        this.ownerIds = ownerIds;
        return this;
    }
    public java.util.List<Long> getOwnerIds() {
        return this.ownerIds;
    }

    public MetaCategory setOwnerNickNames(java.util.List<String> ownerNickNames) {
        this.ownerNickNames = ownerNickNames;
        return this;
    }
    public java.util.List<String> getOwnerNickNames() {
        return this.ownerNickNames;
    }

    public MetaCategory setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public MetaCategory setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
