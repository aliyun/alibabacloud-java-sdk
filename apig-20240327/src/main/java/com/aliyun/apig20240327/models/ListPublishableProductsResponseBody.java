// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPublishableProductsResponseBody extends TeaModel {
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
    public ListPublishableProductsResponseBodyData data;

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

    public static ListPublishableProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishableProductsResponseBody self = new ListPublishableProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishableProductsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPublishableProductsResponseBody setData(ListPublishableProductsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPublishableProductsResponseBodyData getData() {
        return this.data;
    }

    public ListPublishableProductsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPublishableProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPublishableProductsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The description of the API product. This corresponds to the Description property of the Product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>An API product that provides weather query capabilities</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the API product. This corresponds to the Name property of the Product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>weather-query-api</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the API product. This is the primary ID of the Product resource. You can use this ID in the PublishProduct operation at /himarket/v1/products/{productId}/publications to publish the product to the portal. You can also use it to locate the product in operations such as GetProduct and ListProductPublications.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        @NameInMap("productId")
        public String productId;

        public static ListPublishableProductsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListPublishableProductsResponseBodyDataContent self = new ListPublishableProductsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListPublishableProductsResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublishableProductsResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPublishableProductsResponseBodyDataContent setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

    }

    public static class ListPublishableProductsResponseBodyData extends TeaModel {
        /**
         * <p>The list of API products that can be published to the portal. Each element in the list is named productInfo and contains the information about an API product.</p>
         */
        @NameInMap("content")
        public java.util.List<ListPublishableProductsResponseBodyDataContent> content;

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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListPublishableProductsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPublishableProductsResponseBodyData self = new ListPublishableProductsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPublishableProductsResponseBodyData setContent(java.util.List<ListPublishableProductsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListPublishableProductsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListPublishableProductsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPublishableProductsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPublishableProductsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
