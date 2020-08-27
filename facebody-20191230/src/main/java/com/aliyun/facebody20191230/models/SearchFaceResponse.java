// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SearchFaceResponseData data;

    public static SearchFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponse self = new SearchFaceResponse();
        return TeaModel.build(map, self);
    }

    public SearchFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFaceResponse setData(SearchFaceResponseData data) {
        this.data = data;
        return this;
    }
    public SearchFaceResponseData getData() {
        return this.data;
    }

    public static class SearchFaceResponseDataMatchListFaceItems extends TeaModel {
        @NameInMap("FaceId")
        @Validation(required = true)
        public String faceId;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("ExtraData")
        @Validation(required = true)
        public String extraData;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        public static SearchFaceResponseDataMatchListFaceItems build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseDataMatchListFaceItems self = new SearchFaceResponseDataMatchListFaceItems();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseDataMatchListFaceItems setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public SearchFaceResponseDataMatchListFaceItems setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchFaceResponseDataMatchListFaceItems setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public SearchFaceResponseDataMatchListFaceItems setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

    }

    public static class SearchFaceResponseDataMatchListLocation extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Integer x;

        @NameInMap("Y")
        @Validation(required = true)
        public Integer y;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        public static SearchFaceResponseDataMatchListLocation build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseDataMatchListLocation self = new SearchFaceResponseDataMatchListLocation();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseDataMatchListLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public SearchFaceResponseDataMatchListLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public SearchFaceResponseDataMatchListLocation setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SearchFaceResponseDataMatchListLocation setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class SearchFaceResponseDataMatchList extends TeaModel {
        @NameInMap("FaceItems")
        @Validation(required = true)
        public java.util.List<SearchFaceResponseDataMatchListFaceItems> faceItems;

        @NameInMap("Location")
        @Validation(required = true)
        public SearchFaceResponseDataMatchListLocation location;

        public static SearchFaceResponseDataMatchList build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseDataMatchList self = new SearchFaceResponseDataMatchList();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseDataMatchList setFaceItems(java.util.List<SearchFaceResponseDataMatchListFaceItems> faceItems) {
            this.faceItems = faceItems;
            return this;
        }
        public java.util.List<SearchFaceResponseDataMatchListFaceItems> getFaceItems() {
            return this.faceItems;
        }

        public SearchFaceResponseDataMatchList setLocation(SearchFaceResponseDataMatchListLocation location) {
            this.location = location;
            return this;
        }
        public SearchFaceResponseDataMatchListLocation getLocation() {
            return this.location;
        }

    }

    public static class SearchFaceResponseData extends TeaModel {
        @NameInMap("MatchList")
        @Validation(required = true)
        public java.util.List<SearchFaceResponseDataMatchList> matchList;

        public static SearchFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseData self = new SearchFaceResponseData();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseData setMatchList(java.util.List<SearchFaceResponseDataMatchList> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<SearchFaceResponseDataMatchList> getMatchList() {
            return this.matchList;
        }

    }

}
