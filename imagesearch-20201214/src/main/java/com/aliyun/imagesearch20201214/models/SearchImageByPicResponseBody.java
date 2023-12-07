// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByPicResponseBody extends TeaModel {
    /**
     * <p>The product descriptions returned.</p>
     */
    @NameInMap("Auctions")
    public java.util.List<SearchImageByPicResponseBodyAuctions> auctions;

    /**
     * <p>The error code returned.</p>
     * <br>
     * <p>*   A value of 0 indicates that the operation is successful.</p>
     * <p>*   Values other than 0 indicate errors.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The summary of the search result.</p>
     */
    @NameInMap("Head")
    public SearchImageByPicResponseBodyHead head;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The information such as the system-selected category and result of subject recognition.</p>
     */
    @NameInMap("PicInfo")
    public SearchImageByPicResponseBodyPicInfo picInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchImageByPicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicResponseBody self = new SearchImageByPicResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicResponseBody setAuctions(java.util.List<SearchImageByPicResponseBodyAuctions> auctions) {
        this.auctions = auctions;
        return this;
    }
    public java.util.List<SearchImageByPicResponseBodyAuctions> getAuctions() {
        return this.auctions;
    }

    public SearchImageByPicResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchImageByPicResponseBody setHead(SearchImageByPicResponseBodyHead head) {
        this.head = head;
        return this;
    }
    public SearchImageByPicResponseBodyHead getHead() {
        return this.head;
    }

    public SearchImageByPicResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageByPicResponseBody setPicInfo(SearchImageByPicResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchImageByPicResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public SearchImageByPicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageByPicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchImageByPicResponseBodyAuctions extends TeaModel {
        /**
         * <p>The category of the image.</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The user-defined content.</p>
         */
        @NameInMap("CustomContent")
        public String customContent;

        /**
         * <p>The attribute, which is an integer.</p>
         */
        @NameInMap("IntAttr")
        public Integer intAttr;

        @NameInMap("IntAttr2")
        public Integer intAttr2;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("PicName")
        public String picName;

        /**
         * <p>The ID of the product.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The similarity score of the searched image. Valid values: 0 to 1.</p>
         * <br>
         * <p>>  To use this feature, you must upgrade the SDK to version 3.1.1.</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The score information about the image.</p>
         * <br>
         * <p>> *   This parameter is not supported. We recommend that you use the Score parameter.</p>
         * <p>>*   The SortExprValues parameter indicates a 2-tuple in which values are separated by a semicolon (;). The first value indicates the correlation score of the returned image. A greater value indicates a higher correlation with the sample image. Different algorithms are used.</p>
         * <p>>*   If the value of CategoryId is within the value range from 0 to 2, the value range of SortExprValues is from 0 to 7.33136443711219e+24.</p>
         * <p>>*   If the value of CategoryId is not within the value range from 0 to 2, the value range of SortExprValues is from 0 to 5.37633353624177e+24. If the returned image is identical with the sample image, the highest correlation score is generated.</p>
         */
        @NameInMap("SortExprValues")
        public String sortExprValues;

        /**
         * <p>The attribute, which is a string.</p>
         */
        @NameInMap("StrAttr")
        public String strAttr;

        @NameInMap("StrAttr2")
        public String strAttr2;

        public static SearchImageByPicResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyAuctions self = new SearchImageByPicResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByPicResponseBodyAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByPicResponseBodyAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByPicResponseBodyAuctions setIntAttr2(Integer intAttr2) {
            this.intAttr2 = intAttr2;
            return this;
        }
        public Integer getIntAttr2() {
            return this.intAttr2;
        }

        public SearchImageByPicResponseBodyAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByPicResponseBodyAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByPicResponseBodyAuctions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchImageByPicResponseBodyAuctions setSortExprValues(String sortExprValues) {
            this.sortExprValues = sortExprValues;
            return this;
        }
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        public SearchImageByPicResponseBodyAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

        public SearchImageByPicResponseBodyAuctions setStrAttr2(String strAttr2) {
            this.strAttr2 = strAttr2;
            return this;
        }
        public String getStrAttr2() {
            return this.strAttr2;
        }

    }

    public static class SearchImageByPicResponseBodyHead extends TeaModel {
        /**
         * <p>The number of images returned.</p>
         */
        @NameInMap("DocsFound")
        public Integer docsFound;

        /**
         * <p>The number of images that match the search conditions on the Image Search instance.</p>
         */
        @NameInMap("DocsReturn")
        public Integer docsReturn;

        /**
         * <p>The time it takes to complete the search process. Unit: milliseconds.</p>
         */
        @NameInMap("SearchTime")
        public Integer searchTime;

        public static SearchImageByPicResponseBodyHead build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyHead self = new SearchImageByPicResponseBodyHead();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyHead setDocsFound(Integer docsFound) {
            this.docsFound = docsFound;
            return this;
        }
        public Integer getDocsFound() {
            return this.docsFound;
        }

        public SearchImageByPicResponseBodyHead setDocsReturn(Integer docsReturn) {
            this.docsReturn = docsReturn;
            return this;
        }
        public Integer getDocsReturn() {
            return this.docsReturn;
        }

        public SearchImageByPicResponseBodyHead setSearchTime(Integer searchTime) {
            this.searchTime = searchTime;
            return this;
        }
        public Integer getSearchTime() {
            return this.searchTime;
        }

    }

    public static class SearchImageByPicResponseBodyPicInfoAllCategories extends TeaModel {
        /**
         * <p>The ID of the category.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The name of the category.</p>
         */
        @NameInMap("Name")
        public String name;

        public static SearchImageByPicResponseBodyPicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyPicInfoAllCategories self = new SearchImageByPicResponseBodyPicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyPicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public SearchImageByPicResponseBodyPicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SearchImageByPicResponseBodyPicInfoMultiRegion extends TeaModel {
        /**
         * <p>The result of subject recognition. The subject area of the image, in the format of x1,x2,y1,y2. Specifically, x1 and y1 specify the upper-left pixel, and x2 and y2 specify the lower-right pixel. If a subject area is specified in the request, the specified subject area prevails.</p>
         */
        @NameInMap("Region")
        public String region;

        public static SearchImageByPicResponseBodyPicInfoMultiRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyPicInfoMultiRegion self = new SearchImageByPicResponseBodyPicInfoMultiRegion();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyPicInfoMultiRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class SearchImageByPicResponseBodyPicInfo extends TeaModel {
        /**
         * <p>The categories that are supported by the system.</p>
         */
        @NameInMap("AllCategories")
        public java.util.List<SearchImageByPicResponseBodyPicInfoAllCategories> allCategories;

        /**
         * <p>The category selected by the system. If a category is specified in the request, the specified category prevails.</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The recognized subjects.</p>
         * <br>
         * <p>>  To use this feature, you must upgrade the SDK to version 3.1.1.</p>
         */
        @NameInMap("MultiRegion")
        public java.util.List<SearchImageByPicResponseBodyPicInfoMultiRegion> multiRegion;

        /**
         * <p>The result of subject recognition. The subject area of the image, in the format of x1,x2,y1,y2. Specifically, x1 and y1 specify the upper-left pixel, and x2 and y2 specify the lower-right pixel. If a subject area is specified in the request, the specified subject area prevails.</p>
         */
        @NameInMap("Region")
        public String region;

        public static SearchImageByPicResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyPicInfo self = new SearchImageByPicResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyPicInfo setAllCategories(java.util.List<SearchImageByPicResponseBodyPicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<SearchImageByPicResponseBodyPicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

        public SearchImageByPicResponseBodyPicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByPicResponseBodyPicInfo setMultiRegion(java.util.List<SearchImageByPicResponseBodyPicInfoMultiRegion> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public java.util.List<SearchImageByPicResponseBodyPicInfoMultiRegion> getMultiRegion() {
            return this.multiRegion;
        }

        public SearchImageByPicResponseBodyPicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
