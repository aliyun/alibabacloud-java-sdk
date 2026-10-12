// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateProductCategoryResponseBody extends TeaModel {
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
    public CreateProductCategoryResponseBodyData data;

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

    public static CreateProductCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductCategoryResponseBody self = new CreateProductCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductCategoryResponseBody setData(CreateProductCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProductCategoryResponseBodyData getData() {
        return this.data;
    }

    public CreateProductCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateProductCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateProductCategoryResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the newly created product category. It can be used as the categoryId path parameter in GetProductCategory, UpdateProductCategory, and DeleteProductCategory, or as an element in the category ID array for SetProductCategories.</p>
         * 
         * <strong>example:</strong>
         * <p>category-xxxxxxxx</p>
         */
        @NameInMap("categoryId")
        public String categoryId;

        /**
         * <p>The name of the product category.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-capabilities</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateProductCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProductCategoryResponseBodyData self = new CreateProductCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProductCategoryResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public CreateProductCategoryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
