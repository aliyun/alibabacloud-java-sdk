// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch.models;

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

    }

}
