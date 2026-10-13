// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetProductCategoryResponseBody extends TeaModel {
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
    public GetProductCategoryResponseBodyData data;

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

    public static GetProductCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductCategoryResponseBody self = new GetProductCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductCategoryResponseBody setData(GetProductCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductCategoryResponseBodyData getData() {
        return this.data;
    }

    public GetProductCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProductCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductCategoryResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the product category. This ID can be used as the categoryId path parameter for GetProductCategory, UpdateProductCategory, and DeleteProductCategory, or as an element in the categories array for SetProductCategories and CreateProduct.</p>
         * 
         * <strong>example:</strong>
         * <p>category-xxxxxxxx</p>
         */
        @NameInMap("categoryId")
        public String categoryId;

        /**
         * <p>The description of the product category.</p>
         * 
         * <strong>example:</strong>
         * <p>Product category containing AI-related capabilities</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The icon of the product category. It consists of two fields: icon type (type) and icon value (value).</p>
         */
        @NameInMap("icon")
        public HiMarketIcon icon;

        /**
         * <p>The name of the product category.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-capabilities</p>
         */
        @NameInMap("name")
        public String name;

        public static GetProductCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductCategoryResponseBodyData self = new GetProductCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductCategoryResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public GetProductCategoryResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductCategoryResponseBodyData setIcon(HiMarketIcon icon) {
            this.icon = icon;
            return this;
        }
        public HiMarketIcon getIcon() {
            return this.icon;
        }

        public GetProductCategoryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
