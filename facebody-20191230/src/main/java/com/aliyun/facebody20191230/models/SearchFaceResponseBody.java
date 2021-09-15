// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SearchFaceResponseBodyData data;

    public static SearchFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponseBody self = new SearchFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFaceResponseBody setData(SearchFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchFaceResponseBodyData getData() {
        return this.data;
    }

    public static class SearchFaceResponseBodyDataMatchListFaceItems extends TeaModel {
        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("Score")
        public Float score;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Confidence")
        public Float confidence;

        public static SearchFaceResponseBodyDataMatchListFaceItems build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyDataMatchListFaceItems self = new SearchFaceResponseBodyDataMatchListFaceItems();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class SearchFaceResponseBodyDataMatchListLocation extends TeaModel {
        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Y")
        public Integer y;

        @NameInMap("X")
        public Integer x;

        public static SearchFaceResponseBodyDataMatchListLocation build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyDataMatchListLocation self = new SearchFaceResponseBodyDataMatchListLocation();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyDataMatchListLocation setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SearchFaceResponseBodyDataMatchListLocation setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SearchFaceResponseBodyDataMatchListLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public SearchFaceResponseBodyDataMatchListLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

    }

    public static class SearchFaceResponseBodyDataMatchList extends TeaModel {
        @NameInMap("FaceItems")
        public java.util.List<SearchFaceResponseBodyDataMatchListFaceItems> faceItems;

        @NameInMap("Location")
        public SearchFaceResponseBodyDataMatchListLocation location;

        public static SearchFaceResponseBodyDataMatchList build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyDataMatchList self = new SearchFaceResponseBodyDataMatchList();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyDataMatchList setFaceItems(java.util.List<SearchFaceResponseBodyDataMatchListFaceItems> faceItems) {
            this.faceItems = faceItems;
            return this;
        }
        public java.util.List<SearchFaceResponseBodyDataMatchListFaceItems> getFaceItems() {
            return this.faceItems;
        }

        public SearchFaceResponseBodyDataMatchList setLocation(SearchFaceResponseBodyDataMatchListLocation location) {
            this.location = location;
            return this;
        }
        public SearchFaceResponseBodyDataMatchListLocation getLocation() {
            return this.location;
        }

    }

    public static class SearchFaceResponseBodyData extends TeaModel {
        @NameInMap("MatchList")
        public java.util.List<SearchFaceResponseBodyDataMatchList> matchList;

        public static SearchFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyData self = new SearchFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyData setMatchList(java.util.List<SearchFaceResponseBodyDataMatchList> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<SearchFaceResponseBodyDataMatchList> getMatchList() {
            return this.matchList;
        }

    }

}
