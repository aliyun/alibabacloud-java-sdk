// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCategoryListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CategoryList")
    @Validation(required = true)
    public GetCategoryListResponseCategoryList categoryList;

    public static GetCategoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryListResponse self = new GetCategoryListResponse();
        return TeaModel.build(map, self);
    }

    public GetCategoryListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCategoryListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCategoryListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCategoryListResponse setCategoryList(GetCategoryListResponseCategoryList categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public GetCategoryListResponseCategoryList getCategoryList() {
        return this.categoryList;
    }

    public static class GetCategoryListResponseCategoryListCategory extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetCategoryListResponseCategoryListCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryListResponseCategoryListCategory self = new GetCategoryListResponseCategoryListCategory();
            return TeaModel.build(map, self);
        }

        public GetCategoryListResponseCategoryListCategory setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetCategoryListResponseCategoryListCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetCategoryListResponseCategoryList extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public java.util.List<GetCategoryListResponseCategoryListCategory> category;

        public static GetCategoryListResponseCategoryList build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryListResponseCategoryList self = new GetCategoryListResponseCategoryList();
            return TeaModel.build(map, self);
        }

        public GetCategoryListResponseCategoryList setCategory(java.util.List<GetCategoryListResponseCategoryListCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<GetCategoryListResponseCategoryListCategory> getCategory() {
            return this.category;
        }

    }

}
