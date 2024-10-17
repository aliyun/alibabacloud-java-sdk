// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByAILabelResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The media assets that contain the specified content.</p>
     */
    @NameInMap("MediaList")
    public java.util.List<SearchMediaByAILabelResponseBodyMediaList> mediaList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of audio and video files that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Total")
    public Long total;

    public static SearchMediaByAILabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByAILabelResponseBody self = new SearchMediaByAILabelResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaByAILabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMediaByAILabelResponseBody setMediaList(java.util.List<SearchMediaByAILabelResponseBodyMediaList> mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public java.util.List<SearchMediaByAILabelResponseBodyMediaList> getMediaList() {
        return this.mediaList;
    }

    public SearchMediaByAILabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaByAILabelResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SearchMediaByAILabelResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks extends TeaModel {
        /**
         * <p>The coordinates of the bounding box.</p>
         * 
         * <strong>example:</strong>
         * <p>468.0;67.0;615.0;267.0</p>
         */
        @NameInMap("Position")
        public String position;

        /**
         * <p>The size of the bounding box.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Size")
        public Double size;

        /**
         * <p>The timestamp of the track.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("Timestamp")
        public Double timestamp;

        public static SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks self = new SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks();
            return TeaModel.build(map, self);
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks setSize(Double size) {
            this.size = size;
            return this;
        }
        public Double getSize() {
            return this.size;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks setTimestamp(Double timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Double getTimestamp() {
            return this.timestamp;
        }

    }

    public static class SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences extends TeaModel {
        /**
         * <p>The ID of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>158730355E4B82257D8AA1583A58****</p>
         */
        @NameInMap("ClipId")
        public String clipId;

        /**
         * <p>The content of the text.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The fine-grained ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>103102503**</p>
         */
        @NameInMap("FinegrainId")
        public String finegrainId;

        /**
         * <p>The fine-grained name of the entity.</p>
         */
        @NameInMap("FinegrainName")
        public String finegrainName;

        /**
         * <p>The start time of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <p>The image that contains the most face information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-****-public.oss-cn-hangzhou.aliyuncs.com/1563457****438522/service-image/f788974f-9595-43b2-a478-7c7a1afb****.jpg">https://service-****-public.oss-cn-hangzhou.aliyuncs.com/1563457****438522/service-image/f788974f-9595-43b2-a478-7c7a1afb****.jpg</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.75287705</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The sequence ID of the vector table.</p>
         * 
         * <strong>example:</strong>
         * <p>85010D1**</p>
         */
        @NameInMap("TableBatchSeqId")
        public String tableBatchSeqId;

        /**
         * <p>The end time of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("To")
        public Double to;

        /**
         * <p>The tracks.</p>
         */
        @NameInMap("Tracks")
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks> tracks;

        public static SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences self = new SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences();
            return TeaModel.build(map, self);
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setClipId(String clipId) {
            this.clipId = clipId;
            return this;
        }
        public String getClipId() {
            return this.clipId;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setFinegrainId(String finegrainId) {
            this.finegrainId = finegrainId;
            return this;
        }
        public String getFinegrainId() {
            return this.finegrainId;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setFinegrainName(String finegrainName) {
            this.finegrainName = finegrainName;
            return this;
        }
        public String getFinegrainName() {
            return this.finegrainName;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setTableBatchSeqId(String tableBatchSeqId) {
            this.tableBatchSeqId = tableBatchSeqId;
            return this;
        }
        public String getTableBatchSeqId() {
            return this.tableBatchSeqId;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences setTracks(java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks> tracks) {
            this.tracks = tracks;
            return this;
        }
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrencesTracks> getTracks() {
            return this.tracks;
        }

    }

    public static class SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo extends TeaModel {
        /**
         * <p>The category.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the face.</p>
         * 
         * <strong>example:</strong>
         * <p>5FE19530C7A422197535FE74F5DB****</p>
         */
        @NameInMap("FaceId")
        public String faceId;

        /**
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>103102503**</p>
         */
        @NameInMap("LabelId")
        public String labelId;

        /**
         * <p>The name of the entity.</p>
         */
        @NameInMap("LabelName")
        public String labelName;

        /**
         * <p>The type of the tag.</p>
         */
        @NameInMap("LabelType")
        public String labelType;

        /**
         * <p>The information about the clips.</p>
         */
        @NameInMap("Occurrences")
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences> occurrences;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>vision</p>
         */
        @NameInMap("Source")
        public String source;

        public static SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo self = new SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo setLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
        public String getLabelId() {
            return this.labelId;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo setOccurrences(java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences> occurrences) {
            this.occurrences = occurrences;
            return this;
        }
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences> getOccurrences() {
            return this.occurrences;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo extends TeaModel {
        /**
         * <p>The ID of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>5FE19530C7A422197535FE74F5DB****</p>
         */
        @NameInMap("ClipId")
        public String clipId;

        /**
         * <p>The content of the audio.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The start time of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <p>The timestamp of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("Timestamp")
        public Double timestamp;

        /**
         * <p>The end time of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("To")
        public Double to;

        public static SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo self = new SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo setClipId(String clipId) {
            this.clipId = clipId;
            return this;
        }
        public String getClipId() {
            return this.clipId;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo setTimestamp(Double timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Double getTimestamp() {
            return this.timestamp;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo extends TeaModel {
        /**
         * <p>The ID of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>5FE19530C7A422197535FE74F5DB****</p>
         */
        @NameInMap("ClipId")
        public String clipId;

        /**
         * <p>The content of the text.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The start time of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <p>The timestamp of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("Timestamp")
        public Double timestamp;

        /**
         * <p>The end time of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("To")
        public Double to;

        public static SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo self = new SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo setClipId(String clipId) {
            this.clipId = clipId;
            return this;
        }
        public String getClipId() {
            return this.clipId;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo setTimestamp(Double timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Double getTimestamp() {
            return this.timestamp;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class SearchMediaByAILabelResponseBodyMediaListAiData extends TeaModel {
        /**
         * <p>The tags of the AI job.</p>
         */
        @NameInMap("AiLabelInfo")
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo> aiLabelInfo;

        /**
         * <p>The information about audio files.</p>
         */
        @NameInMap("AsrInfo")
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo> asrInfo;

        /**
         * <p>The information about subtitle files.</p>
         */
        @NameInMap("OcrInfo")
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo> ocrInfo;

        public static SearchMediaByAILabelResponseBodyMediaListAiData build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByAILabelResponseBodyMediaListAiData self = new SearchMediaByAILabelResponseBodyMediaListAiData();
            return TeaModel.build(map, self);
        }

        public SearchMediaByAILabelResponseBodyMediaListAiData setAiLabelInfo(java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo> aiLabelInfo) {
            this.aiLabelInfo = aiLabelInfo;
            return this;
        }
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo> getAiLabelInfo() {
            return this.aiLabelInfo;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiData setAsrInfo(java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo> asrInfo) {
            this.asrInfo = asrInfo;
            return this;
        }
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo> getAsrInfo() {
            return this.asrInfo;
        }

        public SearchMediaByAILabelResponseBodyMediaListAiData setOcrInfo(java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo> ocrInfo) {
            this.ocrInfo = ocrInfo;
            return this;
        }
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataOcrInfo> getOcrInfo() {
            return this.ocrInfo;
        }

    }

    public static class SearchMediaByAILabelResponseBodyMediaList extends TeaModel {
        /**
         * <p>The details of the AI job.</p>
         */
        @NameInMap("AiData")
        public SearchMediaByAILabelResponseBodyMediaListAiData aiData;

        /**
         * <p>The ID of the application. Default value: app-1000000.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/snapshot/****.jpg?auth_key=1498476426-0-0-f00b9455c49a423ce69cf4e27333">http://example.aliyundoc.com/snapshot/****.jpg?auth_key=1498476426-0-0-f00b9455c49a423ce69cf4e27333</a>****</p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <p>The time when the media asset was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the media asset.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12.2</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1c6ce34007d571ed94667630a6bc****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The time when the media asset was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The size of the source file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10897890</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The array of video snapshot URLs.</p>
         */
        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <p>The status of the video.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PrepareFail</li>
         * <li>UploadFail</li>
         * <li>Init</li>
         * <li>UploadSucc</li>
         * <li>Transcoding</li>
         * <li>TranscodeFail</li>
         * <li>Deleted</li>
         * <li>Normal</li>
         * <li>Uploading</li>
         * <li>Preparing</li>
         * <li>Blocked</li>
         * <li>Checking</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage address.</p>
         * 
         * <strong>example:</strong>
         * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the media asset.</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the media asset.</p>
         */
        @NameInMap("Title")
        public String title;

        public static SearchMediaByAILabelResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByAILabelResponseBodyMediaList self = new SearchMediaByAILabelResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public SearchMediaByAILabelResponseBodyMediaList setAiData(SearchMediaByAILabelResponseBodyMediaListAiData aiData) {
            this.aiData = aiData;
            return this;
        }
        public SearchMediaByAILabelResponseBodyMediaListAiData getAiData() {
            return this.aiData;
        }

        public SearchMediaByAILabelResponseBodyMediaList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaByAILabelResponseBodyMediaList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public SearchMediaByAILabelResponseBodyMediaList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaByAILabelResponseBodyMediaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaByAILabelResponseBodyMediaList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public SearchMediaByAILabelResponseBodyMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchMediaByAILabelResponseBodyMediaList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaByAILabelResponseBodyMediaList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public SearchMediaByAILabelResponseBodyMediaList setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public SearchMediaByAILabelResponseBodyMediaList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaByAILabelResponseBodyMediaList setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaByAILabelResponseBodyMediaList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaByAILabelResponseBodyMediaList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
