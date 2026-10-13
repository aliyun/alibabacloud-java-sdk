// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductCategoriesResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListProductCategoriesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProductCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductCategoriesResponseBody self = new ListProductCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductCategoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductCategoriesResponseBody setData(ListProductCategoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductCategoriesResponseBodyData getData() {
        return this.data;
    }

    public ListProductCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductCategoriesResponseBodyDataContent extends TeaModel {
        /**
         * <p>The product category ID. You can use this ID as the categoryId path parameter for GetProductCategory, UpdateProductCategory, and DeleteProductCategory. You can also use it as an element in the categories parameter, which is a set of category IDs, for SetProductCategories and CreateProduct.</p>
         * 
         * <strong>example:</strong>
         * <p>category-xxxxxxxx</p>
         */
        @NameInMap("categoryId")
        public String categoryId;

        /**
         * <p>The product category description.</p>
         * 
         * <strong>example:</strong>
         * <p>Product category for AI-related capabilities</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The product category icon, which consists of the icon type (type) and icon information (value) fields.</p>
         */
        @NameInMap("icon")
        public HiMarketIcon icon;

        /**
         * <p>The product category name.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-capabilities</p>
         */
        @NameInMap("name")
        public String name;

        public static ListProductCategoriesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListProductCategoriesResponseBodyDataContent self = new ListProductCategoriesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListProductCategoriesResponseBodyDataContent setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListProductCategoriesResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductCategoriesResponseBodyDataContent setIcon(HiMarketIcon icon) {
            this.icon = icon;
            return this;
        }
        public HiMarketIcon getIcon() {
            return this.icon;
        }

        public ListProductCategoriesResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListProductCategoriesResponseBodyData extends TeaModel {
        /**
         * <p>The list of product categories. Each element in the list is named category and contains the information about a product category.</p>
         */
        @NameInMap("content")
        public java.util.List<ListProductCategoriesResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListProductCategoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductCategoriesResponseBodyData self = new ListProductCategoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductCategoriesResponseBodyData setContent(java.util.List<ListProductCategoriesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListProductCategoriesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListProductCategoriesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProductCategoriesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductCategoriesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
