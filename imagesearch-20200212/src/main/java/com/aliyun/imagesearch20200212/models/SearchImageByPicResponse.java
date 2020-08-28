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

    }

}
