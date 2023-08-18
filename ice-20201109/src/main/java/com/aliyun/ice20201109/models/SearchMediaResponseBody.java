// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("MediaInfoList")
    public java.util.List<SearchMediaResponseBodyMediaInfoList> mediaInfoList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScrollToken")
    public String scrollToken;

    @NameInMap("Success")
    public String success;

    @NameInMap("Total")
    public Long total;

    public static SearchMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponseBody self = new SearchMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMediaResponseBody setMediaInfoList(java.util.List<SearchMediaResponseBodyMediaInfoList> mediaInfoList) {
        this.mediaInfoList = mediaInfoList;
        return this;
    }
    public java.util.List<SearchMediaResponseBodyMediaInfoList> getMediaInfoList() {
        return this.mediaInfoList;
    }

    public SearchMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaResponseBody setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public SearchMediaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SearchMediaResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks extends TeaModel {
        @NameInMap("Position")
        public String position;

        @NameInMap("Size")
        public Double size;

        @NameInMap("Timestamp")
        public Double timestamp;

        public static SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks self = new SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks setSize(Double size) {
            this.size = size;
            return this;
        }
        public Double getSize() {
            return this.size;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks setTimestamp(Double timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Double getTimestamp() {
            return this.timestamp;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences extends TeaModel {
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
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks> tracks;

        @NameInMap("clipId")
        public String clipId;

        public static SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences self = new SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setFinegrainId(String finegrainId) {
            this.finegrainId = finegrainId;
            return this;
        }
        public String getFinegrainId() {
            return this.finegrainId;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setFinegrainName(String finegrainName) {
            this.finegrainName = finegrainName;
            return this;
        }
        public String getFinegrainName() {
            return this.finegrainName;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setTableBatchSeqId(String tableBatchSeqId) {
            this.tableBatchSeqId = tableBatchSeqId;
            return this;
        }
        public String getTableBatchSeqId() {
            return this.tableBatchSeqId;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setTracks(java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks> tracks) {
            this.tracks = tracks;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks> getTracks() {
            return this.tracks;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences setClipId(String clipId) {
            this.clipId = clipId;
            return this;
        }
        public String getClipId() {
            return this.clipId;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo extends TeaModel {
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
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences> occurrences;

        @NameInMap("Source")
        public String source;

        public static SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo self = new SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo setLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
        public String getLabelId() {
            return this.labelId;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo setOccurrences(java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences> occurrences) {
            this.occurrences = occurrences;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences> getOccurrences() {
            return this.occurrences;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListAiDataAsrInfo extends TeaModel {
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

        public static SearchMediaResponseBodyMediaInfoListAiDataAsrInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListAiDataAsrInfo self = new SearchMediaResponseBodyMediaInfoListAiDataAsrInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAsrInfo setClipId(String clipId) {
            this.clipId = clipId;
            return this;
        }
        public String getClipId() {
            return this.clipId;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAsrInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAsrInfo setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAsrInfo setTimestamp(Double timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Double getTimestamp() {
            return this.timestamp;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataAsrInfo setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListAiDataOcrInfo extends TeaModel {
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

        public static SearchMediaResponseBodyMediaInfoListAiDataOcrInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListAiDataOcrInfo self = new SearchMediaResponseBodyMediaInfoListAiDataOcrInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListAiDataOcrInfo setClipId(String clipId) {
            this.clipId = clipId;
            return this;
        }
        public String getClipId() {
            return this.clipId;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataOcrInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataOcrInfo setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataOcrInfo setTimestamp(Double timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Double getTimestamp() {
            return this.timestamp;
        }

        public SearchMediaResponseBodyMediaInfoListAiDataOcrInfo setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListAiData extends TeaModel {
        @NameInMap("AiLabelInfo")
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo> aiLabelInfo;

        @NameInMap("AsrInfo")
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAsrInfo> asrInfo;

        @NameInMap("OcrInfo")
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataOcrInfo> ocrInfo;

        public static SearchMediaResponseBodyMediaInfoListAiData build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListAiData self = new SearchMediaResponseBodyMediaInfoListAiData();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListAiData setAiLabelInfo(java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo> aiLabelInfo) {
            this.aiLabelInfo = aiLabelInfo;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo> getAiLabelInfo() {
            return this.aiLabelInfo;
        }

        public SearchMediaResponseBodyMediaInfoListAiData setAsrInfo(java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAsrInfo> asrInfo) {
            this.asrInfo = asrInfo;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAsrInfo> getAsrInfo() {
            return this.asrInfo;
        }

        public SearchMediaResponseBodyMediaInfoListAiData setOcrInfo(java.util.List<SearchMediaResponseBodyMediaInfoListAiDataOcrInfo> ocrInfo) {
            this.ocrInfo = ocrInfo;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataOcrInfo> getOcrInfo() {
            return this.ocrInfo;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListAiRoughData extends TeaModel {
        /**
         * <p>电视剧</p>
         */
        @NameInMap("AiCategory")
        public String aiCategory;

        @NameInMap("AiJobId")
        public String aiJobId;

        @NameInMap("Result")
        public String result;

        @NameInMap("SaveType")
        public String saveType;

        @NameInMap("Status")
        public String status;

        public static SearchMediaResponseBodyMediaInfoListAiRoughData build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListAiRoughData self = new SearchMediaResponseBodyMediaInfoListAiRoughData();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListAiRoughData setAiCategory(String aiCategory) {
            this.aiCategory = aiCategory;
            return this;
        }
        public String getAiCategory() {
            return this.aiCategory;
        }

        public SearchMediaResponseBodyMediaInfoListAiRoughData setAiJobId(String aiJobId) {
            this.aiJobId = aiJobId;
            return this;
        }
        public String getAiJobId() {
            return this.aiJobId;
        }

        public SearchMediaResponseBodyMediaInfoListAiRoughData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public SearchMediaResponseBodyMediaInfoListAiRoughData setSaveType(String saveType) {
            this.saveType = saveType;
            return this;
        }
        public String getSaveType() {
            return this.saveType;
        }

        public SearchMediaResponseBodyMediaInfoListAiRoughData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("FileStatus")
        public String fileStatus;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("FormatName")
        public String formatName;

        @NameInMap("Height")
        public String height;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Region")
        public String region;

        @NameInMap("Width")
        public String width;

        public static SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo self = new SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListFileInfoList extends TeaModel {
        @NameInMap("FileBasicInfo")
        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo fileBasicInfo;

        public static SearchMediaResponseBodyMediaInfoListFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListFileInfoList self = new SearchMediaResponseBodyMediaInfoListFileInfoList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoList setFileBasicInfo(SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListMediaBasicInfo extends TeaModel {
        @NameInMap("Biz")
        public String biz;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Category")
        public String category;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeletedTime")
        public String deletedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InputURL")
        public String inputURL;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaTags")
        public String mediaTags;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("Snapshots")
        public String snapshots;

        @NameInMap("Source")
        public String source;

        @NameInMap("SpriteImages")
        public String spriteImages;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        @NameInMap("UploadSource")
        public String uploadSource;

        @NameInMap("UserData")
        public String userData;

        public static SearchMediaResponseBodyMediaInfoListMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListMediaBasicInfo self = new SearchMediaResponseBodyMediaInfoListMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setUploadSource(String uploadSource) {
            this.uploadSource = uploadSource;
            return this;
        }
        public String getUploadSource() {
            return this.uploadSource;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoList extends TeaModel {
        @NameInMap("AiData")
        public SearchMediaResponseBodyMediaInfoListAiData aiData;

        @NameInMap("AiRoughData")
        public SearchMediaResponseBodyMediaInfoListAiRoughData aiRoughData;

        /**
         * <p>FileInfos。</p>
         */
        @NameInMap("FileInfoList")
        public java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> fileInfoList;

        @NameInMap("MediaBasicInfo")
        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo mediaBasicInfo;

        @NameInMap("MediaId")
        public String mediaId;

        public static SearchMediaResponseBodyMediaInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoList self = new SearchMediaResponseBodyMediaInfoList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoList setAiData(SearchMediaResponseBodyMediaInfoListAiData aiData) {
            this.aiData = aiData;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListAiData getAiData() {
            return this.aiData;
        }

        public SearchMediaResponseBodyMediaInfoList setAiRoughData(SearchMediaResponseBodyMediaInfoListAiRoughData aiRoughData) {
            this.aiRoughData = aiRoughData;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListAiRoughData getAiRoughData() {
            return this.aiRoughData;
        }

        public SearchMediaResponseBodyMediaInfoList setFileInfoList(java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public SearchMediaResponseBodyMediaInfoList setMediaBasicInfo(SearchMediaResponseBodyMediaInfoListMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public SearchMediaResponseBodyMediaInfoList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
