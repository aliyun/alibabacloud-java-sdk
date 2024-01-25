// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20190325.models;

import com.aliyun.tea.*;

public class SearchImageResponseBody extends TeaModel {
    @NameInMap("Auctions")
    public java.util.List<SearchImageResponseBodyAuctions> auctions;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Head")
    public SearchImageResponseBodyHead head;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("PicInfo")
    public SearchImageResponseBodyPicInfo picInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageResponseBody self = new SearchImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageResponseBody setAuctions(java.util.List<SearchImageResponseBodyAuctions> auctions) {
        this.auctions = auctions;
        return this;
    }
    public java.util.List<SearchImageResponseBodyAuctions> getAuctions() {
        return this.auctions;
    }

    public SearchImageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchImageResponseBody setHead(SearchImageResponseBodyHead head) {
        this.head = head;
        return this;
    }
    public SearchImageResponseBodyHead getHead() {
        return this.head;
    }

    public SearchImageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageResponseBody setPicInfo(SearchImageResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchImageResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public SearchImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchImageResponseBodyAuctions extends TeaModel {
        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("CustomContent")
        public String customContent;

        @NameInMap("IntAttr")
        public Integer intAttr;

        @NameInMap("PicName")
        public String picName;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("Score")
        public Float score;

        @NameInMap("SortExprValues")
        public String sortExprValues;

        @NameInMap("StrAttr")
        public String strAttr;

        public static SearchImageResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyAuctions self = new SearchImageResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageResponseBodyAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageResponseBodyAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageResponseBodyAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageResponseBodyAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageResponseBodyAuctions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchImageResponseBodyAuctions setSortExprValues(String sortExprValues) {
            this.sortExprValues = sortExprValues;
            return this;
        }
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        public SearchImageResponseBodyAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

    }

    public static class SearchImageResponseBodyHead extends TeaModel {
        @NameInMap("DocsFound")
        public Integer docsFound;

        @NameInMap("DocsReturn")
        public Integer docsReturn;

        @NameInMap("SearchTime")
        public Integer searchTime;

        public static SearchImageResponseBodyHead build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyHead self = new SearchImageResponseBodyHead();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyHead setDocsFound(Integer docsFound) {
            this.docsFound = docsFound;
            return this;
        }
        public Integer getDocsFound() {
            return this.docsFound;
        }

        public SearchImageResponseBodyHead setDocsReturn(Integer docsReturn) {
            this.docsReturn = docsReturn;
            return this;
        }
        public Integer getDocsReturn() {
            return this.docsReturn;
        }

        public SearchImageResponseBodyHead setSearchTime(Integer searchTime) {
            this.searchTime = searchTime;
            return this;
        }
        public Integer getSearchTime() {
            return this.searchTime;
        }

    }

    public static class SearchImageResponseBodyPicInfoAllCategories extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        public static SearchImageResponseBodyPicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyPicInfoAllCategories self = new SearchImageResponseBodyPicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyPicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public SearchImageResponseBodyPicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SearchImageResponseBodyPicInfoMultiRegion extends TeaModel {
        @NameInMap("Region")
        public String region;

        public static SearchImageResponseBodyPicInfoMultiRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyPicInfoMultiRegion self = new SearchImageResponseBodyPicInfoMultiRegion();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyPicInfoMultiRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class SearchImageResponseBodyPicInfo extends TeaModel {
        @NameInMap("AllCategories")
        public java.util.List<SearchImageResponseBodyPicInfoAllCategories> allCategories;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("MultiRegion")
        public java.util.List<SearchImageResponseBodyPicInfoMultiRegion> multiRegion;

        @NameInMap("Region")
        public String region;

        public static SearchImageResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyPicInfo self = new SearchImageResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyPicInfo setAllCategories(java.util.List<SearchImageResponseBodyPicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<SearchImageResponseBodyPicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

        public SearchImageResponseBodyPicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageResponseBodyPicInfo setMultiRegion(java.util.List<SearchImageResponseBodyPicInfoMultiRegion> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public java.util.List<SearchImageResponseBodyPicInfoMultiRegion> getMultiRegion() {
            return this.multiRegion;
        }

        public SearchImageResponseBodyPicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
