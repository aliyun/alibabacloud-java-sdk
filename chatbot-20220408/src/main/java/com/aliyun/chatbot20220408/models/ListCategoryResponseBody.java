// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListCategoryResponseBody extends TeaModel {
    @NameInMap("Categories")
    public java.util.List<ListCategoryResponseBodyCategories> categories;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCategoryResponseBody self = new ListCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCategoryResponseBody setCategories(java.util.List<ListCategoryResponseBodyCategories> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<ListCategoryResponseBodyCategories> getCategories() {
        return this.categories;
    }

    public ListCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCategoryResponseBodyCategories extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        @NameInMap("Status")
        public Integer status;

        public static ListCategoryResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            ListCategoryResponseBodyCategories self = new ListCategoryResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public ListCategoryResponseBodyCategories setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public ListCategoryResponseBodyCategories setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListCategoryResponseBodyCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCategoryResponseBodyCategories setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public ListCategoryResponseBodyCategories setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
