// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListSupportedProductsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 500.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The cloud services that are supported by Cloud Config.</p>
     */
    @NameInMap("Products")
    public java.util.List<ListSupportedProductsResponseBodyProducts> products;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSupportedProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupportedProductsResponseBody self = new ListSupportedProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupportedProductsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListSupportedProductsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupportedProductsResponseBody setProducts(java.util.List<ListSupportedProductsResponseBodyProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<ListSupportedProductsResponseBodyProducts> getProducts() {
        return this.products;
    }

    public ListSupportedProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSupportedProductsResponseBodyProductsResourceTypeList extends TeaModel {
        /**
         * <p>The identifier of the resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The English name of the resource type.</p>
         */
        @NameInMap("TypeNameEn")
        public String typeNameEn;

        /**
         * <p>The Chinese name of the resource type.</p>
         */
        @NameInMap("TypeNameZh")
        public String typeNameZh;

        /**
         * <p>The URL of the resource type in the console.</p>
         */
        @NameInMap("TypePageLink")
        public String typePageLink;

        public static ListSupportedProductsResponseBodyProductsResourceTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListSupportedProductsResponseBodyProductsResourceTypeList self = new ListSupportedProductsResponseBodyProductsResourceTypeList();
            return TeaModel.build(map, self);
        }

        public ListSupportedProductsResponseBodyProductsResourceTypeList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListSupportedProductsResponseBodyProductsResourceTypeList setTypeNameEn(String typeNameEn) {
            this.typeNameEn = typeNameEn;
            return this;
        }
        public String getTypeNameEn() {
            return this.typeNameEn;
        }

        public ListSupportedProductsResponseBodyProductsResourceTypeList setTypeNameZh(String typeNameZh) {
            this.typeNameZh = typeNameZh;
            return this;
        }
        public String getTypeNameZh() {
            return this.typeNameZh;
        }

        public ListSupportedProductsResponseBodyProductsResourceTypeList setTypePageLink(String typePageLink) {
            this.typePageLink = typePageLink;
            return this;
        }
        public String getTypePageLink() {
            return this.typePageLink;
        }

    }

    public static class ListSupportedProductsResponseBodyProducts extends TeaModel {
        /**
         * <p>The English name of the Alibaba Cloud service.</p>
         */
        @NameInMap("ProductNameEn")
        public String productNameEn;

        /**
         * <p>The Chinese name of the Alibaba Cloud service.</p>
         */
        @NameInMap("ProductNameZh")
        public String productNameZh;

        /**
         * <p>The resource types that are supported by Cloud Config.</p>
         */
        @NameInMap("ResourceTypeList")
        public java.util.List<ListSupportedProductsResponseBodyProductsResourceTypeList> resourceTypeList;

        public static ListSupportedProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            ListSupportedProductsResponseBodyProducts self = new ListSupportedProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public ListSupportedProductsResponseBodyProducts setProductNameEn(String productNameEn) {
            this.productNameEn = productNameEn;
            return this;
        }
        public String getProductNameEn() {
            return this.productNameEn;
        }

        public ListSupportedProductsResponseBodyProducts setProductNameZh(String productNameZh) {
            this.productNameZh = productNameZh;
            return this;
        }
        public String getProductNameZh() {
            return this.productNameZh;
        }

        public ListSupportedProductsResponseBodyProducts setResourceTypeList(java.util.List<ListSupportedProductsResponseBodyProductsResourceTypeList> resourceTypeList) {
            this.resourceTypeList = resourceTypeList;
            return this;
        }
        public java.util.List<ListSupportedProductsResponseBodyProductsResourceTypeList> getResourceTypeList() {
            return this.resourceTypeList;
        }

    }

}
