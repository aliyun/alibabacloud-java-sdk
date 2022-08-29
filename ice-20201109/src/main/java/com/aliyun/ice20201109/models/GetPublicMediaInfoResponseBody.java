// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPublicMediaInfoResponseBody extends TeaModel {
    @NameInMap("MediaInfo")
    public GetPublicMediaInfoResponseBodyMediaInfo mediaInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPublicMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublicMediaInfoResponseBody self = new GetPublicMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublicMediaInfoResponseBody setMediaInfo(GetPublicMediaInfoResponseBodyMediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
        return this;
    }
    public GetPublicMediaInfoResponseBodyMediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public GetPublicMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Type")
        public String type;

        public static GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData build(java.util.Map<String, ?> map) throws Exception {
            GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData self = new GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData();
            return TeaModel.build(map, self);
        }

        public GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("SampleRate")
        public String sampleRate;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        public static GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList self = new GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

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

        @NameInMap("Region")
        public String region;

        @NameInMap("Width")
        public String width;

        public static GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo self = new GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList extends TeaModel {
        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        public static GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList self = new GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList extends TeaModel {
        @NameInMap("AvgFPS")
        public String avgFPS;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("HasBFrames")
        public String hasBFrames;

        @NameInMap("Height")
        public String height;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Level")
        public String level;

        @NameInMap("Nb_frames")
        public String nbFrames;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("Sar")
        public String sar;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("Width")
        public String width;

        public static GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList self = new GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setNbFrames(String nbFrames) {
            this.nbFrames = nbFrames;
            return this;
        }
        public String getNbFrames() {
            return this.nbFrames;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetPublicMediaInfoResponseBodyMediaInfoFileInfoList extends TeaModel {
        @NameInMap("AudioStreamInfoList")
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList;

        @NameInMap("FileBasicInfo")
        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo;

        @NameInMap("SubtitleStreamInfoList")
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList;

        @NameInMap("VideoStreamInfoList")
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> videoStreamInfoList;

        public static GetPublicMediaInfoResponseBodyMediaInfoFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPublicMediaInfoResponseBodyMediaInfoFileInfoList self = new GetPublicMediaInfoResponseBodyMediaInfoFileInfoList();
            return TeaModel.build(map, self);
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoList setAudioStreamInfoList(java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoList setFileBasicInfo(GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoList setSubtitleStreamInfoList(java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList) {
            this.subtitleStreamInfoList = subtitleStreamInfoList;
            return this;
        }
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> getSubtitleStreamInfoList() {
            return this.subtitleStreamInfoList;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoList setVideoStreamInfoList(java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

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

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaTags")
        public String mediaTags;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("SpriteImages")
        public String spriteImages;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserData")
        public String userData;

        public static GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo self = new GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class GetPublicMediaInfoResponseBodyMediaInfo extends TeaModel {
        @NameInMap("DynamicMetaData")
        public GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData dynamicMetaData;

        @NameInMap("FileInfoList")
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoList> fileInfoList;

        @NameInMap("MediaBasicInfo")
        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo;

        @NameInMap("MediaId")
        public String mediaId;

        public static GetPublicMediaInfoResponseBodyMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPublicMediaInfoResponseBodyMediaInfo self = new GetPublicMediaInfoResponseBodyMediaInfo();
            return TeaModel.build(map, self);
        }

        public GetPublicMediaInfoResponseBodyMediaInfo setDynamicMetaData(GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData dynamicMetaData) {
            this.dynamicMetaData = dynamicMetaData;
            return this;
        }
        public GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData getDynamicMetaData() {
            return this.dynamicMetaData;
        }

        public GetPublicMediaInfoResponseBodyMediaInfo setFileInfoList(java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public GetPublicMediaInfoResponseBodyMediaInfo setMediaBasicInfo(GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public GetPublicMediaInfoResponseBodyMediaInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
