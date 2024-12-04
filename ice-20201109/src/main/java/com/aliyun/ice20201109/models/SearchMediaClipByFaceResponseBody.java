// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaClipByFaceResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The media asset clips that meet the requirements.</p>
     */
    @NameInMap("MediaClipList")
    public java.util.List<SearchMediaClipByFaceResponseBodyMediaClipList> mediaClipList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E44FFACD-9E90-555A-A09A-6FD3B7335E39</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of media asset clips that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Total")
    public Long total;

    public static SearchMediaClipByFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaClipByFaceResponseBody self = new SearchMediaClipByFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaClipByFaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMediaClipByFaceResponseBody setMediaClipList(java.util.List<SearchMediaClipByFaceResponseBodyMediaClipList> mediaClipList) {
        this.mediaClipList = mediaClipList;
        return this;
    }
    public java.util.List<SearchMediaClipByFaceResponseBodyMediaClipList> getMediaClipList() {
        return this.mediaClipList;
    }

    public SearchMediaClipByFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaClipByFaceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SearchMediaClipByFaceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition extends TeaModel {
        /**
         * <p>The height of the rectangle frame. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>168</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The width of the rectangle frame. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The x-axis coordinate of the upper-left corner. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>517</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The y-axis coordinate of the upper-left corner. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>409</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition self = new SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition();
            return TeaModel.build(map, self);
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData extends TeaModel {
        /**
         * <p>The coordinates of the face.</p>
         */
        @NameInMap("BoxPosition")
        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition boxPosition;

        /**
         * <p>The timestamp when the face appears in the clip. Unit: seconds. The value is of the Float type.</p>
         * 
         * <strong>example:</strong>
         * <p>62.03302</p>
         */
        @NameInMap("Timestamp")
        public Float timestamp;

        public static SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData self = new SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData();
            return TeaModel.build(map, self);
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData setBoxPosition(SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition boxPosition) {
            this.boxPosition = boxPosition;
            return this;
        }
        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackDataBoxPosition getBoxPosition() {
            return this.boxPosition;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData setTimestamp(Float timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Float getTimestamp() {
            return this.timestamp;
        }

    }

    public static class SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos extends TeaModel {
        /**
         * <p>The end time of the clip. Unit: seconds. The value is of the Float type.</p>
         * 
         * <strong>example:</strong>
         * <p>69.06635</p>
         */
        @NameInMap("EndTime")
        public Float endTime;

        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The start time of the clip. Unit: seconds. The value is of the Float type.</p>
         * 
         * <strong>example:</strong>
         * <p>61.066353</p>
         */
        @NameInMap("StartTime")
        public Float startTime;

        /**
         * <p>The information about the face in the clip.</p>
         */
        @NameInMap("TrackData")
        public java.util.List<SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData> trackData;

        public static SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos self = new SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos();
            return TeaModel.build(map, self);
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos setTrackData(java.util.List<SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData> trackData) {
            this.trackData = trackData;
            return this;
        }
        public java.util.List<SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfosTrackData> getTrackData() {
            return this.trackData;
        }

    }

    public static class SearchMediaClipByFaceResponseBodyMediaClipList extends TeaModel {
        /**
         * <p>The type of the character. Valid values: celebrity sensitive politician custom unknown</p>
         * 
         * <strong>example:</strong>
         * <p>celebrity</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the entity, which is the same as the entity ID returned in tag analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>1031025****</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The name of the entity.</p>
         */
        @NameInMap("LabelName")
        public String labelName;

        /**
         * <p>The information about clips related to the face.</p>
         */
        @NameInMap("OccurrencesInfos")
        public java.util.List<SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos> occurrencesInfos;

        /**
         * <p>The score of the clip. The value is of the Float type. The value is in the range of [0,1].</p>
         * 
         * <strong>example:</strong>
         * <p>0.99041677</p>
         */
        @NameInMap("Score")
        public Float score;

        public static SearchMediaClipByFaceResponseBodyMediaClipList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaClipByFaceResponseBodyMediaClipList self = new SearchMediaClipByFaceResponseBodyMediaClipList();
            return TeaModel.build(map, self);
        }

        public SearchMediaClipByFaceResponseBodyMediaClipList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipList setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipList setOccurrencesInfos(java.util.List<SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos> occurrencesInfos) {
            this.occurrencesInfos = occurrencesInfos;
            return this;
        }
        public java.util.List<SearchMediaClipByFaceResponseBodyMediaClipListOccurrencesInfos> getOccurrencesInfos() {
            return this.occurrencesInfos;
        }

        public SearchMediaClipByFaceResponseBodyMediaClipList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

}
