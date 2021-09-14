// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class SearchImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SearchImageResponseBodyData data;

    public static SearchImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageResponseBody self = new SearchImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageResponseBody setData(SearchImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchImageResponseBodyData getData() {
        return this.data;
    }

    public static class SearchImageResponseBodyDataMatchList extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("Score")
        public Float score;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("ExtraData")
        public String extraData;

        public static SearchImageResponseBodyDataMatchList build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyDataMatchList self = new SearchImageResponseBodyDataMatchList();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyDataMatchList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public SearchImageResponseBodyDataMatchList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SearchImageResponseBodyDataMatchList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchImageResponseBodyDataMatchList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public SearchImageResponseBodyDataMatchList setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

    }

    public static class SearchImageResponseBodyData extends TeaModel {
        @NameInMap("MatchList")
        public java.util.List<SearchImageResponseBodyDataMatchList> matchList;

        public static SearchImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyData self = new SearchImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyData setMatchList(java.util.List<SearchImageResponseBodyDataMatchList> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<SearchImageResponseBodyDataMatchList> getMatchList() {
            return this.matchList;
        }

    }

}
