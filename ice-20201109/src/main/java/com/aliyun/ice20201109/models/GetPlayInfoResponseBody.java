// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponseBody extends TeaModel {
    @NameInMap("MediaBase")
    public GetPlayInfoResponseBodyMediaBase mediaBase;

    @NameInMap("PlayInfoList")
    public java.util.List<GetPlayInfoResponseBodyPlayInfoList> playInfoList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoResponseBody self = new GetPlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPlayInfoResponseBody setMediaBase(GetPlayInfoResponseBodyMediaBase mediaBase) {
        this.mediaBase = mediaBase;
        return this;
    }
    public GetPlayInfoResponseBodyMediaBase getMediaBase() {
        return this.mediaBase;
    }

    public GetPlayInfoResponseBody setPlayInfoList(java.util.List<GetPlayInfoResponseBodyPlayInfoList> playInfoList) {
        this.playInfoList = playInfoList;
        return this;
    }
    public java.util.List<GetPlayInfoResponseBodyPlayInfoList> getPlayInfoList() {
        return this.playInfoList;
    }

    public GetPlayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPlayInfoResponseBodyMediaBase extends TeaModel {
        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaTags")
        public String mediaTags;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        public static GetPlayInfoResponseBodyMediaBase build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseBodyMediaBase self = new GetPlayInfoResponseBodyMediaBase();
            return TeaModel.build(map, self);
        }

        public GetPlayInfoResponseBodyMediaBase setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetPlayInfoResponseBodyMediaBase setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetPlayInfoResponseBodyMediaBase setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetPlayInfoResponseBodyMediaBase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPlayInfoResponseBodyMediaBase setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetPlayInfoResponseBodyMediaBase setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public GetPlayInfoResponseBodyMediaBase setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetPlayInfoResponseBodyMediaBase setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPlayInfoResponseBodyMediaBase setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetPlayInfoResponseBodyPlayInfoList extends TeaModel {
        @NameInMap("BitDepth")
        public Integer bitDepth;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Definition")
        public String definition;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Encrypt")
        public Long encrypt;

        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("Format")
        public String format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("HDRType")
        public String HDRType;

        @NameInMap("Height")
        public Long height;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("NarrowBandType")
        public String narrowBandType;

        @NameInMap("PlayURL")
        public String playURL;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public String status;

        @NameInMap("StreamTags")
        public String streamTags;

        @NameInMap("StreamType")
        public String streamType;

        @NameInMap("TransTemplateType")
        public String transTemplateType;

        @NameInMap("WatermarkId")
        public String watermarkId;

        @NameInMap("Width")
        public Long width;

        public static GetPlayInfoResponseBodyPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseBodyPlayInfoList self = new GetPlayInfoResponseBodyPlayInfoList();
            return TeaModel.build(map, self);
        }

        public GetPlayInfoResponseBodyPlayInfoList setBitDepth(Integer bitDepth) {
            this.bitDepth = bitDepth;
            return this;
        }
        public Integer getBitDepth() {
            return this.bitDepth;
        }

        public GetPlayInfoResponseBodyPlayInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetPlayInfoResponseBodyPlayInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetPlayInfoResponseBodyPlayInfoList setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetPlayInfoResponseBodyPlayInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPlayInfoResponseBodyPlayInfoList setEncrypt(Long encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public Long getEncrypt() {
            return this.encrypt;
        }

        public GetPlayInfoResponseBodyPlayInfoList setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetPlayInfoResponseBodyPlayInfoList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetPlayInfoResponseBodyPlayInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetPlayInfoResponseBodyPlayInfoList setHDRType(String HDRType) {
            this.HDRType = HDRType;
            return this;
        }
        public String getHDRType() {
            return this.HDRType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public GetPlayInfoResponseBodyPlayInfoList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPlayInfoResponseBodyPlayInfoList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetPlayInfoResponseBodyPlayInfoList setNarrowBandType(String narrowBandType) {
            this.narrowBandType = narrowBandType;
            return this;
        }
        public String getNarrowBandType() {
            return this.narrowBandType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setPlayURL(String playURL) {
            this.playURL = playURL;
            return this;
        }
        public String getPlayURL() {
            return this.playURL;
        }

        public GetPlayInfoResponseBodyPlayInfoList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetPlayInfoResponseBodyPlayInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPlayInfoResponseBodyPlayInfoList setStreamTags(String streamTags) {
            this.streamTags = streamTags;
            return this;
        }
        public String getStreamTags() {
            return this.streamTags;
        }

        public GetPlayInfoResponseBodyPlayInfoList setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setTransTemplateType(String transTemplateType) {
            this.transTemplateType = transTemplateType;
            return this;
        }
        public String getTransTemplateType() {
            return this.transTemplateType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public GetPlayInfoResponseBodyPlayInfoList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
