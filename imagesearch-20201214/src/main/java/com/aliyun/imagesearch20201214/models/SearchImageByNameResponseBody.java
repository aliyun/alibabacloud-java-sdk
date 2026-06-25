// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByNameResponseBody extends TeaModel {
    /**
     * <p>The descriptions of all returned products.</p>
     */
    @NameInMap("Auctions")
    public java.util.List<SearchImageByNameResponseBodyAuctions> auctions;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>0: success.</li>
     * <li>Non-zero: failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The overview of the search results.</p>
     */
    @NameInMap("Head")
    public SearchImageByNameResponseBodyHead head;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The information such as category prediction and subject identification results.</p>
     */
    @NameInMap("PicInfo")
    public SearchImageByNameResponseBodyPicInfo picInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36C43E96-8F68-44AA-B1AF-B1F7AB94A6C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchImageByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByNameResponseBody self = new SearchImageByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageByNameResponseBody setAuctions(java.util.List<SearchImageByNameResponseBodyAuctions> auctions) {
        this.auctions = auctions;
        return this;
    }
    public java.util.List<SearchImageByNameResponseBodyAuctions> getAuctions() {
        return this.auctions;
    }

    public SearchImageByNameResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchImageByNameResponseBody setHead(SearchImageByNameResponseBodyHead head) {
        this.head = head;
        return this;
    }
    public SearchImageByNameResponseBodyHead getHead() {
        return this.head;
    }

    public SearchImageByNameResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageByNameResponseBody setPicInfo(SearchImageByNameResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchImageByNameResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public SearchImageByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchImageByNameResponseBodyAuctions extends TeaModel {
        /**
         * <p>The image category.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The custom content defined by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>zidingyi</p>
         */
        @NameInMap("CustomContent")
        public String customContent;

        /**
         * <p>The integer attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr")
        public Integer intAttr;

        /**
         * <p>The integer attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IntAttr2")
        public Integer intAttr2;

        /**
         * <p>The integer attribute. This field can be used for filtering during queries and is returned in query results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IntAttr3")
        public Integer intAttr3;

        /**
         * <p>The integer attribute. This field can be used for filtering during queries and is returned in query results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IntAttr4")
        public Integer intAttr4;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1.jpg</p>
         */
        @NameInMap("PicName")
        public String picName;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The image similarity score. Valid values: 0 to 1.</p>
         * <blockquote>
         * <p>You must upgrade to V3.1.1 or later to use this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The system scoring information.</p>
         * <blockquote>
         * <ul>
         * <li>This field is deprecated. Use Score instead.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>SortExprValues is a semicolon-separated pair. The first value indicates the relevance score of the image. A higher value indicates higher relevance to the query image. The scoring varies depending on the algorithm model.</li>
         * <li>When the category is 0 to 2, the value range of SortExprValues is 0 to 7.33136443711219e+24.</li>
         * <li>For other category values, the value range of SortExprValues is 0 to 5.37633353624177e+24. This score reaches its maximum when two images are identical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5.37633353624177e+24;0</p>
         */
        @NameInMap("SortExprValues")
        public String sortExprValues;

        /**
         * <p>The string attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>ss</p>
         */
        @NameInMap("StrAttr")
        public String strAttr;

        /**
         * <p>The string attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr2")
        public String strAttr2;

        /**
         * <p>The string attribute. The maximum length is 128 characters. This field can be used for filtering during queries and is returned in query results.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr3")
        public String strAttr3;

        /**
         * <p>The string attribute. The maximum length is 128 characters. This field can be used for filtering during queries and is returned in query results.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr4")
        public String strAttr4;

        public static SearchImageByNameResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyAuctions self = new SearchImageByNameResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByNameResponseBodyAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByNameResponseBodyAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByNameResponseBodyAuctions setIntAttr2(Integer intAttr2) {
            this.intAttr2 = intAttr2;
            return this;
        }
        public Integer getIntAttr2() {
            return this.intAttr2;
        }

        public SearchImageByNameResponseBodyAuctions setIntAttr3(Integer intAttr3) {
            this.intAttr3 = intAttr3;
            return this;
        }
        public Integer getIntAttr3() {
            return this.intAttr3;
        }

        public SearchImageByNameResponseBodyAuctions setIntAttr4(Integer intAttr4) {
            this.intAttr4 = intAttr4;
            return this;
        }
        public Integer getIntAttr4() {
            return this.intAttr4;
        }

        public SearchImageByNameResponseBodyAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByNameResponseBodyAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByNameResponseBodyAuctions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchImageByNameResponseBodyAuctions setSortExprValues(String sortExprValues) {
            this.sortExprValues = sortExprValues;
            return this;
        }
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        public SearchImageByNameResponseBodyAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

        public SearchImageByNameResponseBodyAuctions setStrAttr2(String strAttr2) {
            this.strAttr2 = strAttr2;
            return this;
        }
        public String getStrAttr2() {
            return this.strAttr2;
        }

        public SearchImageByNameResponseBodyAuctions setStrAttr3(String strAttr3) {
            this.strAttr3 = strAttr3;
            return this;
        }
        public String getStrAttr3() {
            return this.strAttr3;
        }

        public SearchImageByNameResponseBodyAuctions setStrAttr4(String strAttr4) {
            this.strAttr4 = strAttr4;
            return this;
        }
        public String getStrAttr4() {
            return this.strAttr4;
        }

    }

    public static class SearchImageByNameResponseBodyHead extends TeaModel {
        /**
         * <p>The number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DocsFound")
        public Integer docsFound;

        /**
         * <p>The number of matched results in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("DocsReturn")
        public Integer docsReturn;

        /**
         * <p>The search duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("SearchTime")
        public Integer searchTime;

        public static SearchImageByNameResponseBodyHead build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyHead self = new SearchImageByNameResponseBodyHead();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyHead setDocsFound(Integer docsFound) {
            this.docsFound = docsFound;
            return this;
        }
        public Integer getDocsFound() {
            return this.docsFound;
        }

        public SearchImageByNameResponseBodyHead setDocsReturn(Integer docsReturn) {
            this.docsReturn = docsReturn;
            return this;
        }
        public Integer getDocsReturn() {
            return this.docsReturn;
        }

        public SearchImageByNameResponseBodyHead setSearchTime(Integer searchTime) {
            this.searchTime = searchTime;
            return this;
        }
        public Integer getSearchTime() {
            return this.searchTime;
        }

    }

    public static class SearchImageByNameResponseBodyPicInfoAllCategories extends TeaModel {
        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>88888888</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The category name.</p>
         * 
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("Name")
        public String name;

        public static SearchImageByNameResponseBodyPicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyPicInfoAllCategories self = new SearchImageByNameResponseBodyPicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyPicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public SearchImageByNameResponseBodyPicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SearchImageByNameResponseBodyPicInfoMultiRegion extends TeaModel {
        /**
         * <p>The subject identification result.
         * The subject region of the image, in the format of x1,x2,y1,y2, where x1,y1 is the upper-left point and x2,y2 is the lower-right point. If the user specifies a subject region in the request, the specified region is used.</p>
         * 
         * <strong>example:</strong>
         * <p>280,486,232,351</p>
         */
        @NameInMap("Region")
        public String region;

        public static SearchImageByNameResponseBodyPicInfoMultiRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyPicInfoMultiRegion self = new SearchImageByNameResponseBodyPicInfoMultiRegion();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyPicInfoMultiRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class SearchImageByNameResponseBodyPicInfo extends TeaModel {
        /**
         * <p>The information about all categories supported by the system.</p>
         */
        @NameInMap("AllCategories")
        public java.util.List<SearchImageByNameResponseBodyPicInfoAllCategories> allCategories;

        /**
         * <p>The category prediction result.
         * If the user specifies a category in the request, the specified category is used.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The subject identification collection.</p>
         */
        @NameInMap("MultiRegion")
        public java.util.List<SearchImageByNameResponseBodyPicInfoMultiRegion> multiRegion;

        /**
         * <p>The subject identification result.
         * The subject region of the image, in the format of x1,x2,y1,y2, where x1,y1 is the upper-left point and x2,y2 is the lower-right point. If the user specifies a subject region in the request, the specified region is used.</p>
         * 
         * <strong>example:</strong>
         * <p>280,486,232,351</p>
         */
        @NameInMap("Region")
        public String region;

        public static SearchImageByNameResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyPicInfo self = new SearchImageByNameResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyPicInfo setAllCategories(java.util.List<SearchImageByNameResponseBodyPicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<SearchImageByNameResponseBodyPicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

        public SearchImageByNameResponseBodyPicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByNameResponseBodyPicInfo setMultiRegion(java.util.List<SearchImageByNameResponseBodyPicInfoMultiRegion> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public java.util.List<SearchImageByNameResponseBodyPicInfoMultiRegion> getMultiRegion() {
            return this.multiRegion;
        }

        public SearchImageByNameResponseBodyPicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
