// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of promotional products per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5BD09171-MB74-18D8-890E-C70C067527BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The promotional product information.</p>
     */
    @NameInMap("Results")
    public java.util.List<DescribeDistributionProductsResponseBodyResults> results;

    /**
     * <p>The total number of promotional products that match the search conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDistributionProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributionProductsResponseBody self = new DescribeDistributionProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDistributionProductsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDistributionProductsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDistributionProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDistributionProductsResponseBody setResults(java.util.List<DescribeDistributionProductsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DescribeDistributionProductsResponseBodyResults> getResults() {
        return this.results;
    }

    public DescribeDistributionProductsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDistributionProductsResponseBodyResults extends TeaModel {
        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmap*****</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The first-level category name of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>API市场</p>
         */
        @NameInMap("FirstCategoryName")
        public String firstCategoryName;

        /**
         * <p>The URL of the product main image.</p>
         * 
         * <strong>example:</strong>
         * <p>//photogallery.oss-cn-hangzhou.aliyuncs.com/photo/1744526877246715/09605255-87fd-44d1-8143-96ebc8019d46.jpeg</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>手机号码在网状态查询</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The price of the default product specification. For example, 100 indicates CNY 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Price")
        public String price;

        /**
         * <p>The user rating of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The second-level category name of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>生活服务</p>
         */
        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        /**
         * <p>The brief description of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>运营商号码状态查询】精准实时空号检测，手机号在网状态查询，返回正常、空号、通话中、在网但不可用、关机、呼叫转移、疑似关机、携号转网、号码错误、停机等多种状态。</p>
         */
        @NameInMap("ShortDescription")
        public String shortDescription;

        /**
         * <p>The commission rebate ratio for the product. For example, 30 indicates 30%.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SubmissionRadio")
        public String submissionRadio;

        /**
         * <p>The name of the promotion service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>深圳市****有限公司</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The Alibaba Cloud UID of the promotion service provider (product supplier).</p>
         * 
         * <strong>example:</strong>
         * <p>1911534921******</p>
         */
        @NameInMap("SupplierUId")
        public String supplierUId;

        /**
         * <p>The number of transactions for the product in the last 180 days.</p>
         * 
         * <strong>example:</strong>
         * <p>109</p>
         */
        @NameInMap("TradeCount")
        public String tradeCount;

        /**
         * <p>The product type. Valid values:
         *         APP: application
         *         SERVICE: service
         *         CHENGPIN_SITE: ready-made website
         *         SITE_CUSTOM_SERVICE: custom website
         *         SITE_PROMOTION_RUN: website promotion and operations
         *         ENT_APP_SOFT: application software
         *         CLOUD_SERVICE: cloud service
         *         EIF: enterprise information
         *         BASIC_TOOLS: basic tools
         *         BASIC_SERVICES: basic services
         *         JIANZHAN_XITONG: website building system
         *         APP_COUPLES: application companion
         *         MIRRORS_MARKET: image marketplace
         *         MIRRORS_MARKET_BASIC_ENVIRONMENT: basic environment
         *         MIRRORS_MARKET_APPLICATION_SOFTWARE: application software
         *         MIRROR: image
         *         DINGDING: DingTalk
         *         DOWNLOAD: download
         *         EXTENDED: unknown
         *         API_SERVICE: API
         *         ROS: resource orchestration
         *         DOCKER: container
         *         LICENSE: license key
         *         SAAS_WUYING: application software - Wuying application.</p>
         * 
         * <strong>example:</strong>
         * <p>API类</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The number of buyer comments for the product.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("UserCommentCount")
        public String userCommentCount;

        public static DescribeDistributionProductsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDistributionProductsResponseBodyResults self = new DescribeDistributionProductsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DescribeDistributionProductsResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDistributionProductsResponseBodyResults setFirstCategoryName(String firstCategoryName) {
            this.firstCategoryName = firstCategoryName;
            return this;
        }
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        public DescribeDistributionProductsResponseBodyResults setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeDistributionProductsResponseBodyResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDistributionProductsResponseBodyResults setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public DescribeDistributionProductsResponseBodyResults setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public DescribeDistributionProductsResponseBodyResults setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public DescribeDistributionProductsResponseBodyResults setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public DescribeDistributionProductsResponseBodyResults setSubmissionRadio(String submissionRadio) {
            this.submissionRadio = submissionRadio;
            return this;
        }
        public String getSubmissionRadio() {
            return this.submissionRadio;
        }

        public DescribeDistributionProductsResponseBodyResults setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public DescribeDistributionProductsResponseBodyResults setSupplierUId(String supplierUId) {
            this.supplierUId = supplierUId;
            return this;
        }
        public String getSupplierUId() {
            return this.supplierUId;
        }

        public DescribeDistributionProductsResponseBodyResults setTradeCount(String tradeCount) {
            this.tradeCount = tradeCount;
            return this;
        }
        public String getTradeCount() {
            return this.tradeCount;
        }

        public DescribeDistributionProductsResponseBodyResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDistributionProductsResponseBodyResults setUserCommentCount(String userCommentCount) {
            this.userCommentCount = userCommentCount;
            return this;
        }
        public String getUserCommentCount() {
            return this.userCommentCount;
        }

    }

}
