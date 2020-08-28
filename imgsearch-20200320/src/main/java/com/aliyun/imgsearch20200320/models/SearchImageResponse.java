// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class SearchImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SearchImageResponseData data;

    public static SearchImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageResponse self = new SearchImageResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchImageResponseDataMatchList extends TeaModel {
        @NameInMap("DataId")
        @Validation(required = true)
        public String dataId;

        @NameInMap("ExtraData")
        @Validation(required = true)
        public String extraData;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("ImageUrl")
        @Validation(required = true)
        public String imageUrl;

        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        public static SearchImageResponseDataMatchList build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseDataMatchList self = new SearchImageResponseDataMatchList();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchImageResponseData extends TeaModel {
        @NameInMap("MatchList")
        @Validation(required = true)
        public java.util.List<SearchImageResponseDataMatchList> matchList;

        public static SearchImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseData self = new SearchImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
