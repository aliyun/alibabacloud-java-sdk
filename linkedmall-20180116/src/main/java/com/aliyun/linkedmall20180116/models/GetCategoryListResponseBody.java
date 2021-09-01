// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCategoryListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CategoryList")
    public GetCategoryListResponseBodyCategoryList categoryList;

    public static GetCategoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryListResponseBody self = new GetCategoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCategoryListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCategoryListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCategoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCategoryListResponseBody setCategoryList(GetCategoryListResponseBodyCategoryList categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public GetCategoryListResponseBodyCategoryList getCategoryList() {
        return this.categoryList;
    }

    public static class GetCategoryListResponseBodyCategoryListCategory extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("CategoryId")
        public Long categoryId;

        public static GetCategoryListResponseBodyCategoryListCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryListResponseBodyCategoryListCategory self = new GetCategoryListResponseBodyCategoryListCategory();
            return TeaModel.build(map, self);
        }

        public GetCategoryListResponseBodyCategoryListCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCategoryListResponseBodyCategoryListCategory setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

    }

    public static class GetCategoryListResponseBodyCategoryList extends TeaModel {
        @NameInMap("Category")
        public java.util.List<GetCategoryListResponseBodyCategoryListCategory> category;

        public static GetCategoryListResponseBodyCategoryList build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryListResponseBodyCategoryList self = new GetCategoryListResponseBodyCategoryList();
            return TeaModel.build(map, self);
        }

        public GetCategoryListResponseBodyCategoryList setCategory(java.util.List<GetCategoryListResponseBodyCategoryListCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<GetCategoryListResponseBodyCategoryListCategory> getCategory() {
            return this.category;
        }

    }

}
