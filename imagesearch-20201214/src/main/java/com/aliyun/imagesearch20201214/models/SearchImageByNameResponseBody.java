// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByNameResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("Head")
    public SearchImageByNameResponseBodyHead head;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Auctions")
    public java.util.List<SearchImageByNameResponseBodyAuctions> auctions;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("PicInfo")
    public SearchImageByNameResponseBodyPicInfo picInfo;

    @NameInMap("Success")
    public Boolean success;

    public static SearchImageByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByNameResponseBody self = new SearchImageByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageByNameResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageByNameResponseBody setHead(SearchImageByNameResponseBodyHead head) {
        this.head = head;
        return this;
    }
    public SearchImageByNameResponseBodyHead getHead() {
        return this.head;
    }

    public SearchImageByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public SearchImageByNameResponseBody setPicInfo(SearchImageByNameResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchImageByNameResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public SearchImageByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public static class SearchImageByNameResponseBodyAuctions extends TeaModel {
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

        public static SearchImageByNameResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyAuctions self = new SearchImageByNameResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByNameResponseBodyAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByNameResponseBodyAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByNameResponseBodyAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByNameResponseBodyAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

        public SearchImageByNameResponseBodyAuctions setSortExprValues(String sortExprValues) {
            this.sortExprValues = sortExprValues;
            return this;
        }
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        public SearchImageByNameResponseBodyAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByNameResponseBodyAuctions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
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

    public static class SearchImageByNameResponseBodyPicInfoAllCategories extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        public static SearchImageByNameResponseBodyPicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyPicInfoAllCategories self = new SearchImageByNameResponseBodyPicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyPicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchImageByNameResponseBodyPicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class SearchImageByNameResponseBodyPicInfo extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("MultiRegion")
        public java.util.List<SearchImageByNameResponseBodyPicInfoMultiRegion> multiRegion;

        @NameInMap("AllCategories")
        public java.util.List<SearchImageByNameResponseBodyPicInfoAllCategories> allCategories;

        public static SearchImageByNameResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyPicInfo self = new SearchImageByNameResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyPicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
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

        public SearchImageByNameResponseBodyPicInfo setAllCategories(java.util.List<SearchImageByNameResponseBodyPicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<SearchImageByNameResponseBodyPicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

    }

}
