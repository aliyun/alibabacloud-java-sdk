// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class Children extends TeaModel {
    // 分类Id
    @NameInMap("CategoryId")
    public Long categoryId;

    // 父分类Id
    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    // 地区代号
    @NameInMap("AreaCode")
    public String areaCode;

    // 名称
    @NameInMap("Name")
    public String name;

    // 子元素
    @NameInMap("Childrens")
    public java.util.List<Children> childrens;

    public static Children build(java.util.Map<String, ?> map) throws Exception {
        Children self = new Children();
        return TeaModel.build(map, self);
    }

    public Children setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public Children setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public Children setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public Children setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Children setChildrens(java.util.List<Children> childrens) {
        this.childrens = childrens;
        return this;
    }
    public java.util.List<Children> getChildrens() {
        return this.childrens;
    }

}
