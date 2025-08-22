// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>30BaZ9ekYWXJdqshYecA++coNg7qT1Zbm3RfLyFIZeY=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("products")
    public java.util.List<ListProductsResponseBodyProducts> products;

    /**
     * <strong>example:</strong>
     * <p>9bcaac3c-420d-4303-87ab-7638c07b0a0b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>134</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsResponseBody setProducts(java.util.List<ListProductsResponseBodyProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<ListProductsResponseBodyProducts> getProducts() {
        return this.products;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductsResponseBodyProducts extends TeaModel {
        @NameInMap("firstCategoryName")
        public String firstCategoryName;

        /**
         * <strong>example:</strong>
         * <p>Enterprise application</p>
         */
        @NameInMap("firstCategoryNameEn")
        public String firstCategoryNameEn;

        /**
         * <strong>example:</strong>
         * <p>MSE</p>
         */
        @NameInMap("product")
        public String product;

        @NameInMap("productName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>Microservices Engine</p>
         */
        @NameInMap("productNameEn")
        public String productNameEn;

        @NameInMap("secondCategoryName")
        public String secondCategoryName;

        /**
         * <strong>example:</strong>
         * <p>Application service</p>
         */
        @NameInMap("secondCategoryNameEn")
        public String secondCategoryNameEn;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Microservice_Engine(MSE)</p>
         */
        @NameInMap("subcategory")
        public String subcategory;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportTerraformer")
        public Boolean supportTerraformer;

        /**
         * <strong>example:</strong>
         * <p>1.229.0</p>
         */
        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        public static ListProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProducts self = new ListProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProducts setFirstCategoryName(String firstCategoryName) {
            this.firstCategoryName = firstCategoryName;
            return this;
        }
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        public ListProductsResponseBodyProducts setFirstCategoryNameEn(String firstCategoryNameEn) {
            this.firstCategoryNameEn = firstCategoryNameEn;
            return this;
        }
        public String getFirstCategoryNameEn() {
            return this.firstCategoryNameEn;
        }

        public ListProductsResponseBodyProducts setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListProductsResponseBodyProducts setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductsResponseBodyProducts setProductNameEn(String productNameEn) {
            this.productNameEn = productNameEn;
            return this;
        }
        public String getProductNameEn() {
            return this.productNameEn;
        }

        public ListProductsResponseBodyProducts setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public ListProductsResponseBodyProducts setSecondCategoryNameEn(String secondCategoryNameEn) {
            this.secondCategoryNameEn = secondCategoryNameEn;
            return this;
        }
        public String getSecondCategoryNameEn() {
            return this.secondCategoryNameEn;
        }

        public ListProductsResponseBodyProducts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProductsResponseBodyProducts setSubcategory(String subcategory) {
            this.subcategory = subcategory;
            return this;
        }
        public String getSubcategory() {
            return this.subcategory;
        }

        public ListProductsResponseBodyProducts setSupportTerraformer(Boolean supportTerraformer) {
            this.supportTerraformer = supportTerraformer;
            return this;
        }
        public Boolean getSupportTerraformer() {
            return this.supportTerraformer;
        }

        public ListProductsResponseBodyProducts setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

    }

}
