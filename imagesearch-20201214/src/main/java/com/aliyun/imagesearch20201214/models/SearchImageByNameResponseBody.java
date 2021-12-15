// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByNameResponseBody extends TeaModel {
    @NameInMap("Auctions")
    public java.util.List<SearchImageByNameResponseBodyAuctions> auctions;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Head")
    public SearchImageByNameResponseBodyHead head;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("PicInfo")
    public SearchImageByNameResponseBodyPicInfo picInfo;

    @NameInMap("RequestId")
    public String requestId;

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

    }

    public static class SearchImageByNameResponseBodyHead extends TeaModel {
        @NameInMap("DocsFound")
        public Integer docsFound;

        @NameInMap("DocsReturn")
        public Integer docsReturn;

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
        @NameInMap("Id")
        public Integer id;

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
        @NameInMap("AllCategories")
        public java.util.List<SearchImageByNameResponseBodyPicInfoAllCategories> allCategories;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("MultiRegion")
        public java.util.List<SearchImageByNameResponseBodyPicInfoMultiRegion> multiRegion;

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
