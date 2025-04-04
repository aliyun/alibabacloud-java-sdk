// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCategoryListResponseBody extends TeaModel {
    @NameInMap("CategoryList")
    public GetCategoryListResponseBodyCategoryList categoryList;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>96B4141C-A3CD-5162-B435-4780A75E3D97</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCategoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryListResponseBody self = new GetCategoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCategoryListResponseBody setCategoryList(GetCategoryListResponseBodyCategoryList categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public GetCategoryListResponseBodyCategoryList getCategoryList() {
        return this.categoryList;
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

    public static class GetCategoryListResponseBodyCategoryListCategory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12312312</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Name")
        public String name;

        public static GetCategoryListResponseBodyCategoryListCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryListResponseBodyCategoryListCategory self = new GetCategoryListResponseBodyCategoryListCategory();
            return TeaModel.build(map, self);
        }

        public GetCategoryListResponseBodyCategoryListCategory setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetCategoryListResponseBodyCategoryListCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
