// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The media assets that meet the requirements.</p>
     */
    @NameInMap("MediaInfoList")
    public java.util.List<SearchMediaResponseBodyMediaInfoList> mediaInfoList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6F61C357-ACC0-57FB-876E-D58795335E59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The pagination identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>F8C4F642184DBDA5D93907A70AAE****</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of media assets that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>163</p>
     */
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
         * <p>50.2</p>
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
        /**
         * <p>The text content.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The fine-grained ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>10310250338</p>
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
         * <p>The optimal face image encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>99C64F6287</p>
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
         * <p>85010D1</p>
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
         * <p>The track sequence.</p>
         */
        @NameInMap("Tracks")
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrencesTracks> tracks;

        /**
         * <p>The ID of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>5FE19530C7A422197535FE74F5DB2B9F</p>
         */
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
        /**
         * <p>The category.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The face ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FE19530C7A422197535FE74F5DB2B9F</p>
         */
        @NameInMap("FaceId")
        public String faceId;

        /**
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>10310250338</p>
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
         * <p>The clips.</p>
         */
        @NameInMap("Occurrences")
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfoOccurrences> occurrences;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>vision</p>
         */
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
        /**
         * <p>The ID of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>5FE19530C7A422197535FE74F5DB2B9F</p>
         */
        @NameInMap("ClipId")
        public String clipId;

        /**
         * <p>The text content.</p>
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
        /**
         * <p>The ID of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>5FE19530C7A422197535FE74F5DB2B9F</p>
         */
        @NameInMap("ClipId")
        public String clipId;

        /**
         * <p>The text content.</p>
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
        /**
         * <p>The tags of the intelligent AI job.</p>
         */
        @NameInMap("AiLabelInfo")
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAiLabelInfo> aiLabelInfo;

        /**
         * <p>The information about audio files.</p>
         */
        @NameInMap("AsrInfo")
        public java.util.List<SearchMediaResponseBodyMediaInfoListAiDataAsrInfo> asrInfo;

        /**
         * <p>The subtitles.</p>
         */
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
         * <p>TV Series</p>
         * 
         * <strong>example:</strong>
         * <p>TV series</p>
         */
        @NameInMap("AiCategory")
        public String aiCategory;

        /**
         * <p>The ID of the AI job.</p>
         * 
         * <strong>example:</strong>
         * <p>cd35b0b0025f71edbfcb472190a9xxxx</p>
         */
        @NameInMap("AiJobId")
        public String aiJobId;

        /**
         * <p>The results of the AI job.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.json">http://xxxx.json</a></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The save type.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("SaveType")
        public String saveType;

        /**
         * <p>The data status.</p>
         * 
         * <strong>example:</strong>
         * <p>SaveSuccess</p>
         */
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
        /**
         * <p>The bitrate of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1912.13</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The time when the file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-30T02:02:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The duration of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>60.00000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>164265080291300080527050.wav</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The size of the file in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>324784</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The status of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("FileStatus")
        public String fileStatus;

        /**
         * <p>The type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>source_file</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The Object Storage Service (OSS) URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://outin-d3f4681ddfd911ec99a600163e1403e7.oss-cn-shanghai.aliyuncs.com/sv/23d5cdd1-18180984899/23d5cdd1-18180984899.mp4">https://outin-d3f4681ddfd911ec99a600163e1403e7.oss-cn-shanghai.aliyuncs.com/sv/23d5cdd1-18180984899/23d5cdd1-18180984899.mp4</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The encapsulation format of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <p>The height of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The time when the file was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T12:19Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The region in which the file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The width of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
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
        /**
         * <p>The basic information about the file, such as the duration and size.</p>
         */
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

    public static class SearchMediaResponseBodyMediaInfoListIndexStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("IndexStatus")
        public String indexStatus;

        /**
         * <strong>example:</strong>
         * <p>mm</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        public static SearchMediaResponseBodyMediaInfoListIndexStatusList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListIndexStatusList self = new SearchMediaResponseBodyMediaInfoListIndexStatusList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListIndexStatusList setIndexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }
        public String getIndexStatus() {
            return this.indexStatus;
        }

        public SearchMediaResponseBodyMediaInfoListIndexStatusList setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListMediaBasicInfo extends TeaModel {
        /**
         * <p>The business to which the media asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>IMS</p>
         */
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>The business type of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>opening</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The ID of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The category of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The thumbnail URL of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/e694372e-4f5b-4821-ae09-efd064f27b63_large_cover_url.jpg">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/e694372e-4f5b-4821-ae09-efd064f27b63_large_cover_url.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media asset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01T19:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the media asset was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01T19:48Z</p>
         */
        @NameInMap("DeletedTime")
        public String deletedTime;

        /**
         * <p>The description of the media asset.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The address of the media asset that is waiting to be registered.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://clipres/longvideo/material/voice/prod/20220418/07d7c799f6054dc3bbef250854cf84981650248140427</p>
         */
        @NameInMap("InputURL")
        public String inputURL;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>132bd600fc3c71ec99476732a78f6402</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The tags of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>tags,tags2</p>
         */
        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <p>The type of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The time when the media asset was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01T19:48Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The custom ID of the media asset. The ID is a string that contains 6 to 64 characters. Only letters, digits, hyphens (-), and underscores (_) are supported. Each custom ID is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p>The snapshots of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;bucket&quot;:&quot;example-bucket&quot;,&quot;count&quot;:&quot;3&quot;,&quot;iceJobId&quot;:&quot;<strong><strong><strong>f48f0e4154976b2b8c45</strong></strong></strong>&quot;,&quot;location&quot;:&quot;oss-cn-beijing&quot;,&quot;snapshotRegular&quot;:&quot;example.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e6a6440b29eb60bd7c</strong></strong></strong>&quot;}]</p>
         */
        @NameInMap("Snapshots")
        public String snapshots;

        /**
         * <p>The source of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The image sprite of the media asset</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;bucket&quot;:&quot;example-bucket&quot;,&quot;count&quot;:&quot;32&quot;,&quot;iceJobId&quot;:&quot;<strong><strong><strong>83ec44d58b2069def2e</strong></strong></strong>&quot;,&quot;location&quot;:&quot;oss-cn-shanghai&quot;,&quot;snapshotRegular&quot;:&quot;example/example-{Count}.jpg&quot;,&quot;spriteRegular&quot;:&quot;example/example-{TileCount}.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e438b14ff39293eaec25</strong></strong></strong>&quot;,&quot;tileCount&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("SpriteImages")
        public String spriteImages;

        /**
         * <p>The state of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The title of the media asset.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The transcoding status of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        /**
         * <p>The upload source of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("UploadSource")
        public String uploadSource;

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>userData</p>
         */
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
        /**
         * <p>The details of the intelligent AI job.</p>
         */
        @NameInMap("AiData")
        public SearchMediaResponseBodyMediaInfoListAiData aiData;

        /**
         * <p>The description of the AI job.</p>
         */
        @NameInMap("AiRoughData")
        public SearchMediaResponseBodyMediaInfoListAiRoughData aiRoughData;

        /**
         * <p>The information about the files.</p>
         */
        @NameInMap("FileInfoList")
        public java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> fileInfoList;

        @NameInMap("IndexStatusList")
        public java.util.List<SearchMediaResponseBodyMediaInfoListIndexStatusList> indexStatusList;

        /**
         * <p>The basic information about the media asset.</p>
         */
        @NameInMap("MediaBasicInfo")
        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo mediaBasicInfo;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>3b187b3620c8490886cfc2a9578c3ce6</p>
         */
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

        public SearchMediaResponseBodyMediaInfoList setIndexStatusList(java.util.List<SearchMediaResponseBodyMediaInfoListIndexStatusList> indexStatusList) {
            this.indexStatusList = indexStatusList;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListIndexStatusList> getIndexStatusList() {
            return this.indexStatusList;
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
