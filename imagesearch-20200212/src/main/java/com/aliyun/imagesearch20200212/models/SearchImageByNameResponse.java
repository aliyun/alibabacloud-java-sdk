// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class SearchImageByNameResponse extends TeaModel {
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
    public java.util.List<SearchImageByNameResponseAuctions> auctions;

    @NameInMap("Head")
    @Validation(required = true)
    public SearchImageByNameResponseHead head;

    @NameInMap("PicInfo")
    @Validation(required = true)
    public SearchImageByNameResponsePicInfo picInfo;

    public static SearchImageByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByNameResponse self = new SearchImageByNameResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageByNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageByNameResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchImageByNameResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchImageByNameResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageByNameResponse setAuctions(java.util.List<SearchImageByNameResponseAuctions> auctions) {
        this.auctions = auctions;
        return this;
    }
    public java.util.List<SearchImageByNameResponseAuctions> getAuctions() {
        return this.auctions;
    }

    public SearchImageByNameResponse setHead(SearchImageByNameResponseHead head) {
        this.head = head;
        return this;
    }
    public SearchImageByNameResponseHead getHead() {
        return this.head;
    }

    public SearchImageByNameResponse setPicInfo(SearchImageByNameResponsePicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchImageByNameResponsePicInfo getPicInfo() {
        return this.picInfo;
    }

    public static class SearchImageByNameResponseAuctions extends TeaModel {
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

        public static SearchImageByNameResponseAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseAuctions self = new SearchImageByNameResponseAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByNameResponseAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByNameResponseAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByNameResponseAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByNameResponseAuctions setSortExprValues(String sortExprValues) {
            this.sortExprValues = sortExprValues;
            return this;
        }
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        public SearchImageByNameResponseAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByNameResponseAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

    }

    public static class SearchImageByNameResponseHead extends TeaModel {
        @NameInMap("DocsReturn")
        @Validation(required = true)
        public Integer docsReturn;

        @NameInMap("DocsFound")
        @Validation(required = true)
        public Integer docsFound;

        @NameInMap("SearchTime")
        @Validation(required = true)
        public Integer searchTime;

        public static SearchImageByNameResponseHead build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseHead self = new SearchImageByNameResponseHead();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseHead setDocsReturn(Integer docsReturn) {
            this.docsReturn = docsReturn;
            return this;
        }
        public Integer getDocsReturn() {
            return this.docsReturn;
        }

        public SearchImageByNameResponseHead setDocsFound(Integer docsFound) {
            this.docsFound = docsFound;
            return this;
        }
        public Integer getDocsFound() {
            return this.docsFound;
        }

        public SearchImageByNameResponseHead setSearchTime(Integer searchTime) {
            this.searchTime = searchTime;
            return this;
        }
        public Integer getSearchTime() {
            return this.searchTime;
        }

    }

    public static class SearchImageByNameResponsePicInfoAllCategories extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static SearchImageByNameResponsePicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponsePicInfoAllCategories self = new SearchImageByNameResponsePicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponsePicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public SearchImageByNameResponsePicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SearchImageByNameResponsePicInfo extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Integer categoryId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("AllCategories")
        @Validation(required = true)
        public java.util.List<SearchImageByNameResponsePicInfoAllCategories> allCategories;

        public static SearchImageByNameResponsePicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponsePicInfo self = new SearchImageByNameResponsePicInfo();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponsePicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByNameResponsePicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchImageByNameResponsePicInfo setAllCategories(java.util.List<SearchImageByNameResponsePicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<SearchImageByNameResponsePicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

    }

}
