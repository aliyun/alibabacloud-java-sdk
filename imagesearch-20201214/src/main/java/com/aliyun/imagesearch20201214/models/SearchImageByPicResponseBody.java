// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByPicResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("Head")
    public SearchImageByPicResponseBodyHead head;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Auctions")
    public java.util.List<SearchImageByPicResponseBodyAuctions> auctions;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("PicInfo")
    public SearchImageByPicResponseBodyPicInfo picInfo;

    @NameInMap("Success")
    public Boolean success;

    public static SearchImageByPicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicResponseBody self = new SearchImageByPicResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageByPicResponseBody setHead(SearchImageByPicResponseBodyHead head) {
        this.head = head;
        return this;
    }
    public SearchImageByPicResponseBodyHead getHead() {
        return this.head;
    }

    public SearchImageByPicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public SearchImageByPicResponseBody setPicInfo(SearchImageByPicResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchImageByPicResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public SearchImageByPicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchImageByPicResponseBodyHead extends TeaModel {
        @NameInMap("DocsFound")
        public Integer docsFound;

        @NameInMap("DocsReturn")
        public Integer docsReturn;

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

    public static class SearchImageByPicResponseBodyAuctions extends TeaModel {
        @NameInMap("PicName")
        public String picName;

        @NameInMap("IntAttr")
        public Integer intAttr;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("StrAttr")
        public String strAttr;

        @NameInMap("SortExprValues")
        public String sortExprValues;

        @NameInMap("CustomContent")
        public String customContent;

        @NameInMap("Score")
        public Float score;

        public static SearchImageByPicResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyAuctions self = new SearchImageByPicResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByPicResponseBodyAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByPicResponseBodyAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByPicResponseBodyAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByPicResponseBodyAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

        public SearchImageByPicResponseBodyAuctions setSortExprValues(String sortExprValues) {
            this.sortExprValues = sortExprValues;
            return this;
        }
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        public SearchImageByPicResponseBodyAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByPicResponseBodyAuctions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class SearchImageByPicResponseBodyPicInfoMultiRegion extends TeaModel {
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

    public static class SearchImageByPicResponseBodyPicInfoAllCategories extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        public static SearchImageByPicResponseBodyPicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyPicInfoAllCategories self = new SearchImageByPicResponseBodyPicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyPicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchImageByPicResponseBodyPicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class SearchImageByPicResponseBodyPicInfo extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("MultiRegion")
        public java.util.List<SearchImageByPicResponseBodyPicInfoMultiRegion> multiRegion;

        @NameInMap("AllCategories")
        public java.util.List<SearchImageByPicResponseBodyPicInfoAllCategories> allCategories;

        public static SearchImageByPicResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyPicInfo self = new SearchImageByPicResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyPicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
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

        public SearchImageByPicResponseBodyPicInfo setAllCategories(java.util.List<SearchImageByPicResponseBodyPicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<SearchImageByPicResponseBodyPicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

    }

}
