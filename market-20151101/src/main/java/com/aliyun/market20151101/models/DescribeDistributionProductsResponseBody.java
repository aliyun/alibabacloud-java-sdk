// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>5BD09171-MB74-18D8-890E-C70C067527BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DescribeDistributionProductsResponseBodyResults> results;

    /**
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
         * <strong>example:</strong>
         * <p>cmap*****</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("FirstCategoryName")
        public String firstCategoryName;

        /**
         * <strong>example:</strong>
         * <p>//photogallery.oss-cn-hangzhou.aliyuncs.com/photo/1744526877246715/09605255-87fd-44d1-8143-96ebc8019d46.jpeg</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Price")
        public String price;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public String score;

        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        @NameInMap("ShortDescription")
        public String shortDescription;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SubmissionRadio")
        public String submissionRadio;

        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <strong>example:</strong>
         * <p>1911534921******</p>
         */
        @NameInMap("SupplierUId")
        public String supplierUId;

        /**
         * <strong>example:</strong>
         * <p>109</p>
         */
        @NameInMap("TradeCount")
        public String tradeCount;

        @NameInMap("Type")
        public String type;

        /**
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
