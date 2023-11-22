// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByAILabelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("MediaList")
    public java.util.List<SearchMediaByAILabelResponseBodyMediaList> mediaList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

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
        @NameInMap("Position")
        public String position;

        @NameInMap("Size")
        public Double size;

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
        @NameInMap("ClipId")
        public String clipId;

        @NameInMap("Content")
        public String content;

        @NameInMap("FinegrainId")
        public String finegrainId;

        @NameInMap("FinegrainName")
        public String finegrainName;

        @NameInMap("From")
        public Double from;

        @NameInMap("Image")
        public String image;

        @NameInMap("Score")
        public Double score;

        @NameInMap("TableBatchSeqId")
        public String tableBatchSeqId;

        @NameInMap("To")
        public Double to;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("LabelId")
        public String labelId;

        @NameInMap("LabelName")
        public String labelName;

        @NameInMap("LabelType")
        public String labelType;

        @NameInMap("Occurrences")
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfoOccurrences> occurrences;

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
        @NameInMap("ClipId")
        public String clipId;

        @NameInMap("Content")
        public String content;

        @NameInMap("From")
        public Double from;

        @NameInMap("Timestamp")
        public Double timestamp;

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
        @NameInMap("ClipId")
        public String clipId;

        @NameInMap("Content")
        public String content;

        @NameInMap("From")
        public Double from;

        @NameInMap("Timestamp")
        public Double timestamp;

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
        @NameInMap("AiLabelInfo")
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAiLabelInfo> aiLabelInfo;

        @NameInMap("AsrInfo")
        public java.util.List<SearchMediaByAILabelResponseBodyMediaListAiDataAsrInfo> asrInfo;

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
        @NameInMap("AiData")
        public SearchMediaByAILabelResponseBodyMediaListAiData aiData;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("Tags")
        public String tags;

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
