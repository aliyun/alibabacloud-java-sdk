// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPublicMediaInfoResponseBody extends TeaModel {
    @NameInMap("MediaInfo")
    public GetPublicMediaInfoResponseBodyMediaInfo mediaInfo;

    // RequestId
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
        // 元数据json
        @NameInMap("Data")
        public String data;

        // 类型
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
        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 声道输出样式
        @NameInMap("ChannelLayout")
        public String channelLayout;

        // 声道数
        @NameInMap("Channels")
        public String channels;

        // 编码格式长述名
        @NameInMap("CodecLongName")
        public String codecLongName;

        // 编码格式简述名
        @NameInMap("CodecName")
        public String codecName;

        // 编码格式标记
        @NameInMap("CodecTag")
        public String codecTag;

        // 编码格式标记文本
        @NameInMap("CodecTagString")
        public String codecTagString;

        // 编码时基
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 音频帧率
        @NameInMap("Fps")
        public String fps;

        // 音频流序号
        @NameInMap("Index")
        public String index;

        // 语言
        @NameInMap("Lang")
        public String lang;

        // 总帧数
        @NameInMap("NumFrames")
        public String numFrames;

        // 编码预置
        @NameInMap("Profile")
        public String profile;

        // 采样格式
        @NameInMap("SampleFmt")
        public String sampleFmt;

        // 采样率
        @NameInMap("SampleRate")
        public String sampleRate;

        // 起始时间
        @NameInMap("StartTime")
        public String startTime;

        // 时基
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
        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件大小（字节）
        @NameInMap("FileSize")
        public String fileSize;

        // 文件状态
        @NameInMap("FileStatus")
        public String fileStatus;

        // 文件类型
        @NameInMap("FileType")
        public String fileType;

        // 文件oss地址
        @NameInMap("FileUrl")
        public String fileUrl;

        // 封装格式
        @NameInMap("FormatName")
        public String formatName;

        // 高
        @NameInMap("Height")
        public String height;

        // 文件存储区域
        @NameInMap("Region")
        public String region;

        // 宽
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
        // 编码格式长述名
        @NameInMap("CodecLongName")
        public String codecLongName;

        // 编码格式简述名
        @NameInMap("CodecName")
        public String codecName;

        // 编码格式标记
        @NameInMap("CodecTag")
        public String codecTag;

        // 编码格式标记文本
        @NameInMap("CodecTagString")
        public String codecTagString;

        // 编码时基
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 音频流序号
        @NameInMap("Index")
        public String index;

        // 语言
        @NameInMap("Lang")
        public String lang;

        // 起始时间
        @NameInMap("StartTime")
        public String startTime;

        // 时基
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
        // 平均帧率
        @NameInMap("AvgFPS")
        public String avgFPS;

        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 编码格式长述名
        @NameInMap("CodecLongName")
        public String codecLongName;

        // 编码格式简述名
        @NameInMap("CodecName")
        public String codecName;

        // 编码格式标记
        @NameInMap("CodecTag")
        public String codecTag;

        // 编码格式标记文本
        @NameInMap("CodecTagString")
        public String codecTagString;

        // 编码时基
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        // 编码显示分辨率比
        @NameInMap("Dar")
        public String dar;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 视频帧率
        @NameInMap("Fps")
        public String fps;

        // 是否有B帧
        @NameInMap("HasBFrames")
        public String hasBFrames;

        // 高
        @NameInMap("Height")
        public String height;

        // 视频流序号
        @NameInMap("Index")
        public String index;

        // 语言
        @NameInMap("Lang")
        public String lang;

        // 编码等级
        @NameInMap("Level")
        public String level;

        // 总帧数
        @NameInMap("Nb_frames")
        public String nbFrames;

        // 总帧数
        @NameInMap("NumFrames")
        public String numFrames;

        // 像素格式
        @NameInMap("PixFmt")
        public String pixFmt;

        // 编码预置
        @NameInMap("Profile")
        public String profile;

        // 旋转
        @NameInMap("Rotate")
        public String rotate;

        // 编码信号分辨率比
        @NameInMap("Sar")
        public String sar;

        // 起始时间
        @NameInMap("StartTime")
        public String startTime;

        // 时基
        @NameInMap("Timebase")
        public String timebase;

        // 宽
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
        // 音频流信息，一个媒资可能有多条音频流
        @NameInMap("AudioStreamInfoList")
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList;

        // 文件基础信息，包含时长，大小等
        @NameInMap("FileBasicInfo")
        public GetPublicMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo;

        // 字幕流信息，一个媒资可能有多条字幕流
        @NameInMap("SubtitleStreamInfoList")
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList;

        // 视频流信息，一个媒资可能有多条视频流
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
        // 媒资业务类型
        @NameInMap("BusinessType")
        public String businessType;

        // 分类
        @NameInMap("Category")
        public String category;

        // 封面地址
        @NameInMap("CoverURL")
        public String coverURL;

        // 媒资创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 媒资删除时间
        @NameInMap("DeletedTime")
        public String deletedTime;

        // 内容描述
        @NameInMap("Description")
        public String description;

        // MediaId
        @NameInMap("MediaId")
        public String mediaId;

        // 标签
        @NameInMap("MediaTags")
        public String mediaTags;

        // 媒资媒体类型
        @NameInMap("MediaType")
        public String mediaType;

        // 媒资修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 来源
        @NameInMap("Source")
        public String source;

        // 雪碧图
        @NameInMap("SpriteImages")
        public String spriteImages;

        // 资源状态
        @NameInMap("Status")
        public String status;

        // 标题
        @NameInMap("Title")
        public String title;

        // 用户数据
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
        // 公共媒资动态元数据
        @NameInMap("DynamicMetaData")
        public GetPublicMediaInfoResponseBodyMediaInfoDynamicMetaData dynamicMetaData;

        // FileInfos
        @NameInMap("FileInfoList")
        public java.util.List<GetPublicMediaInfoResponseBodyMediaInfoFileInfoList> fileInfoList;

        // BasicInfo
        @NameInMap("MediaBasicInfo")
        public GetPublicMediaInfoResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo;

        // 媒资ID
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
