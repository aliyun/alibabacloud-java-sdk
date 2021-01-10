// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class SearchFaceResponseBody extends TeaModel {
    @NameInMap("Rect")
    public SearchFaceResponseBodyRect rect;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FaceResults")
    public java.util.List<SearchFaceResponseBodyFaceResults> faceResults;

    @NameInMap("GroupId")
    public String groupId;

    public static SearchFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponseBody self = new SearchFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFaceResponseBody setRect(SearchFaceResponseBodyRect rect) {
        this.rect = rect;
        return this;
    }
    public SearchFaceResponseBodyRect getRect() {
        return this.rect;
    }

    public SearchFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFaceResponseBody setFaceResults(java.util.List<SearchFaceResponseBodyFaceResults> faceResults) {
        this.faceResults = faceResults;
        return this;
    }
    public java.util.List<SearchFaceResponseBodyFaceResults> getFaceResults() {
        return this.faceResults;
    }

    public SearchFaceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public static class SearchFaceResponseBodyRect extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static SearchFaceResponseBodyRect build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyRect self = new SearchFaceResponseBodyRect();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public SearchFaceResponseBodyRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SearchFaceResponseBodyRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SearchFaceResponseBodyRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class SearchFaceResponseBodyFaceResults extends TeaModel {
        @NameInMap("FaceToken")
        public String faceToken;

        @NameInMap("Probability")
        public Float probability;

        public static SearchFaceResponseBodyFaceResults build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyFaceResults self = new SearchFaceResponseBodyFaceResults();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyFaceResults setFaceToken(String faceToken) {
            this.faceToken = faceToken;
            return this;
        }
        public String getFaceToken() {
            return this.faceToken;
        }

        public SearchFaceResponseBodyFaceResults setProbability(Float probability) {
            this.probability = probability;
            return this;
        }
        public Float getProbability() {
            return this.probability;
        }

    }

}
