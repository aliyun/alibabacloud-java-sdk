// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByPicResponseBody extends TeaModel {
    /**
     * <p>The descriptions of all returned products.</p>
     */
    @NameInMap("Auctions")
    public java.util.List<SearchImageByPicResponseBodyAuctions> auctions;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li>0: successful.</li>
     * <li>Non-zero: failed.</li>
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
    public SearchImageByPicResponseBodyHead head;

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
    public SearchImageByPicResponseBodyPicInfo picInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B3137727-7D6E-488C-BA21-0E034C38A879</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The image category.</p>
         * 
         * <strong>example:</strong>
         * <p>8888888</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The user-defined content.</p>
         * 
         * <strong>example:</strong>
         * <p>zidingyi</p>
         */
        @NameInMap("CustomContent")
        public String customContent;

        /**
         * <p>The integer type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr")
        public Integer intAttr;

        /**
         * <p>The integer type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IntAttr2")
        public Integer intAttr2;

        /**
         * <p>The integer type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr3")
        public Integer intAttr3;

        /**
         * <p>The integer type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>You must upgrade to V3.1.1 to use this feature.</p>
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
         * <li>SortExprValues is a semicolon-separated tuple. The first value indicates the relevance score of the image. A higher value indicates higher relevance to the query image. The scoring varies depending on the algorithm model.</li>
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
         * <p>The string type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr")
        public String strAttr;

        /**
         * <p>The string type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr2")
        public String strAttr2;

        /**
         * <p>The string type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr3")
        public String strAttr3;

        /**
         * <p>The string type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr4")
        public String strAttr4;

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

        public SearchImageByPicResponseBodyAuctions setIntAttr3(Integer intAttr3) {
            this.intAttr3 = intAttr3;
            return this;
        }
        public Integer getIntAttr3() {
            return this.intAttr3;
        }

        public SearchImageByPicResponseBodyAuctions setIntAttr4(Integer intAttr4) {
            this.intAttr4 = intAttr4;
            return this;
        }
        public Integer getIntAttr4() {
            return this.intAttr4;
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

        public SearchImageByPicResponseBodyAuctions setStrAttr3(String strAttr3) {
            this.strAttr3 = strAttr3;
            return this;
        }
        public String getStrAttr3() {
            return this.strAttr3;
        }

        public SearchImageByPicResponseBodyAuctions setStrAttr4(String strAttr4) {
            this.strAttr4 = strAttr4;
            return this;
        }
        public String getStrAttr4() {
            return this.strAttr4;
        }

    }

    public static class SearchImageByPicResponseBodyHead extends TeaModel {
        /**
         * <p>The number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DocsFound")
        public Integer docsFound;

        /**
         * <p>The number of results matched in the instance.</p>
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
         * <p>The subject identification result. The subject region of the image, in the format of x1,x2,y1,y2, where x1,y1 is the upper-left point and x2,y2 is the lower-right point. If the subject region is specified in the request, the value specified in the request is used.</p>
         * 
         * <strong>example:</strong>
         * <p>280,486,232,351</p>
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
         * <p>The information about all categories supported by the system.</p>
         */
        @NameInMap("AllCategories")
        public java.util.List<SearchImageByPicResponseBodyPicInfoAllCategories> allCategories;

        /**
         * <p>The category prediction result. If the category is specified in the request, the value specified in the request is used.</p>
         * 
         * <strong>example:</strong>
         * <p>88888888</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The collection of subject identification results.</p>
         * <blockquote>
         * <p>You must upgrade to V3.1.1 to use this feature.</p>
         * </blockquote>
         */
        @NameInMap("MultiRegion")
        public java.util.List<SearchImageByPicResponseBodyPicInfoMultiRegion> multiRegion;

        /**
         * <p>The subject identification result. The subject region of the image, in the format of x1,x2,y1,y2, where x1,y1 is the upper-left point and x2,y2 is the lower-right point. If the subject region is specified in the request, the value specified in the request is used.</p>
         * 
         * <strong>example:</strong>
         * <p>280,486,232,351</p>
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
