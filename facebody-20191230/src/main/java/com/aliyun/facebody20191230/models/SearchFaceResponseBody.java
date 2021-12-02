// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponseBody self = new SearchFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFaceResponseBody setData(SearchFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchFaceResponseBodyData getData() {
        return this.data;
    }

    public SearchFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchFaceResponseBodyDataMatchListFaceItems extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("Score")
        public Float score;

        public static SearchFaceResponseBodyDataMatchListFaceItems build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyDataMatchListFaceItems self = new SearchFaceResponseBodyDataMatchListFaceItems();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SearchFaceResponseBodyDataMatchListFaceItems setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
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

    }

    public static class SearchFaceResponseBodyDataMatchListLocation extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static SearchFaceResponseBodyDataMatchListLocation build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyDataMatchListLocation self = new SearchFaceResponseBodyDataMatchListLocation();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyDataMatchListLocation setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SearchFaceResponseBodyDataMatchListLocation setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SearchFaceResponseBodyDataMatchListLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public SearchFaceResponseBodyDataMatchListLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class SearchFaceResponseBodyDataMatchList extends TeaModel {
        @NameInMap("FaceItems")
        public java.util.List<SearchFaceResponseBodyDataMatchListFaceItems> faceItems;

        @NameInMap("Location")
        public SearchFaceResponseBodyDataMatchListLocation location;

        @NameInMap("QualitieScore")
        public Float qualitieScore;

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

        public SearchFaceResponseBodyDataMatchList setQualitieScore(Float qualitieScore) {
            this.qualitieScore = qualitieScore;
            return this;
        }
        public Float getQualitieScore() {
            return this.qualitieScore;
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
