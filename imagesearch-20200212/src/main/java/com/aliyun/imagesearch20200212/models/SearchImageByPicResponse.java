// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class SearchImageByPicResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Msg")
    @Validation(required = true)
    public String msg;

    @NameInMap("Auctions")
    @Validation(required = true)
    public java.util.List<SearchImageByPicResponseAuctions> auctions;

    @NameInMap("Head")
    @Validation(required = true)
    public SearchImageByPicResponseHead head;

    @NameInMap("PicInfo")
    @Validation(required = true)
    public SearchImageByPicResponsePicInfo picInfo;

    public static SearchImageByPicResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicResponse self = new SearchImageByPicResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageByPicResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchImageByPicResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchImageByPicResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageByPicResponse setAuctions(java.util.List<SearchImageByPicResponseAuctions> auctions) {
        this.auctions = auctions;
        return this;
    }
    public java.util.List<SearchImageByPicResponseAuctions> getAuctions() {
        return this.auctions;
    }

    public SearchImageByPicResponse setHead(SearchImageByPicResponseHead head) {
        this.head = head;
        return this;
    }
    public SearchImageByPicResponseHead getHead() {
        return this.head;
    }

    public SearchImageByPicResponse setPicInfo(SearchImageByPicResponsePicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchImageByPicResponsePicInfo getPicInfo() {
        return this.picInfo;
    }

    public static class SearchImageByPicResponseAuctions extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Integer categoryId;

        @NameInMap("ProductId")
        @Validation(required = true)
        public String productId;

        @NameInMap("PicName")
        @Validation(required = true)
        public String picName;

        @NameInMap("CustomContent")
        @Validation(required = true)
        public String customContent;

        @NameInMap("SortExprValues")
        @Validation(required = true)
        public String sortExprValues;

        @NameInMap("IntAttr")
        @Validation(required = true)
        public Integer intAttr;

        @NameInMap("StrAttr")
        @Validation(required = true)
        public String strAttr;

        public static SearchImageByPicResponseAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseAuctions self = new SearchImageByPicResponseAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByPicResponseAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByPicResponseAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByPicResponseAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByPicResponseAuctions setSortExprValues(String sortExprValues) {
            this.sortExprValues = sortExprValues;
            return this;
        }
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        public SearchImageByPicResponseAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByPicResponseAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

    }

    public static class SearchImageByPicResponseHead extends TeaModel {
        @NameInMap("DocsReturn")
        @Validation(required = true)
        public Integer docsReturn;

        @NameInMap("DocsFound")
        @Validation(required = true)
        public Integer docsFound;

        @NameInMap("SearchTime")
        @Validation(required = true)
        public Integer searchTime;

        public static SearchImageByPicResponseHead build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseHead self = new SearchImageByPicResponseHead();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseHead setDocsReturn(Integer docsReturn) {
            this.docsReturn = docsReturn;
            return this;
        }
        public Integer getDocsReturn() {
            return this.docsReturn;
        }

        public SearchImageByPicResponseHead setDocsFound(Integer docsFound) {
            this.docsFound = docsFound;
            return this;
        }
        public Integer getDocsFound() {
            return this.docsFound;
        }

        public SearchImageByPicResponseHead setSearchTime(Integer searchTime) {
            this.searchTime = searchTime;
            return this;
        }
        public Integer getSearchTime() {
            return this.searchTime;
        }

    }

    public static class SearchImageByPicResponsePicInfoAllCategories extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static SearchImageByPicResponsePicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponsePicInfoAllCategories self = new SearchImageByPicResponsePicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponsePicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public SearchImageByPicResponsePicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SearchImageByPicResponsePicInfo extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Integer categoryId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("AllCategories")
        @Validation(required = true)
        public java.util.List<SearchImageByPicResponsePicInfoAllCategories> allCategories;

        public static SearchImageByPicResponsePicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponsePicInfo self = new SearchImageByPicResponsePicInfo();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponsePicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByPicResponsePicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchImageByPicResponsePicInfo setAllCategories(java.util.List<SearchImageByPicResponsePicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<SearchImageByPicResponsePicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

    }

}
