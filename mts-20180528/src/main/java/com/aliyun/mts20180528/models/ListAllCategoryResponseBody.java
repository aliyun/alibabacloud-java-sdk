// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class ListAllCategoryResponseBody extends TeaModel {
    @NameInMap("CategoryList")
    public ListAllCategoryResponseBodyCategoryList categoryList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAllCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllCategoryResponseBody self = new ListAllCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllCategoryResponseBody setCategoryList(ListAllCategoryResponseBodyCategoryList categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public ListAllCategoryResponseBodyCategoryList getCategoryList() {
        return this.categoryList;
    }

    public ListAllCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAllCategoryResponseBodyCategoryListCategory extends TeaModel {
        @NameInMap("CateId")
        public String cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Level")
        public String level;

        @NameInMap("ParentId")
        public String parentId;

        public static ListAllCategoryResponseBodyCategoryListCategory build(java.util.Map<String, ?> map) throws Exception {
            ListAllCategoryResponseBodyCategoryListCategory self = new ListAllCategoryResponseBodyCategoryListCategory();
            return TeaModel.build(map, self);
        }

        public ListAllCategoryResponseBodyCategoryListCategory setCateId(String cateId) {
            this.cateId = cateId;
            return this;
        }
        public String getCateId() {
            return this.cateId;
        }

        public ListAllCategoryResponseBodyCategoryListCategory setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListAllCategoryResponseBodyCategoryListCategory setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAllCategoryResponseBodyCategoryListCategory setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

    public static class ListAllCategoryResponseBodyCategoryList extends TeaModel {
        @NameInMap("Category")
        public java.util.List<ListAllCategoryResponseBodyCategoryListCategory> category;

        public static ListAllCategoryResponseBodyCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListAllCategoryResponseBodyCategoryList self = new ListAllCategoryResponseBodyCategoryList();
            return TeaModel.build(map, self);
        }

        public ListAllCategoryResponseBodyCategoryList setCategory(java.util.List<ListAllCategoryResponseBodyCategoryListCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<ListAllCategoryResponseBodyCategoryListCategory> getCategory() {
            return this.category;
        }

    }

}
