// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaInfo")
    public GetMediaInfoResponseBodyMediaInfo mediaInfo;

    public static GetMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoResponseBody self = new GetMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaInfoResponseBody setMediaInfo(GetMediaInfoResponseBodyMediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
        return this;
    }
    public GetMediaInfoResponseBodyMediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public static class GetMediaInfoResponseBodyMediaInfoMediaBasicInfo extends TeaModel {
        // MediaId
        @NameInMap("MediaId")
        public String mediaId;

        // 待注册的媒资在相应系统中的地址
        @NameInMap("InputURL")
        public String inputURL;

        // 媒资媒体类型
        @NameInMap("MediaType")
        public String mediaType;

        // 媒资业务类型
        @NameInMap("BusinessType")
        public String businessType;

        // 来源
        @NameInMap("Source")
        public String source;

        // 标题
        @NameInMap("Title")
        public String title;

        // 内容描述
        @NameInMap("Description")
        public String description;

        // 分类
        @NameInMap("Category")
        public String category;

        // 标签
        @NameInMap("MediaTags")
        public String mediaTags;

        // 封面地址
        @NameInMap("CoverURL")
        public String coverURL;

        // 用户数据
        @NameInMap("UserData")
        public String userData;

        // 资源状态
        @NameInMap("Status")
        public String status;

        // 媒资创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 媒资修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 媒资删除时间
        @NameInMap("DeletedTime")
        public String deletedTime;

        // 雪碧图
        @NameInMap("SpriteImages")
        public String spriteImages;

        public static GetMediaInfoResponseBodyMediaInfoMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoMediaBasicInfo self = new GetMediaInfoResponseBodyMediaInfoMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList extends TeaModel {
        // 开始时间
        @NameInMap("In")
        public Float in;

        // 结束时间
        @NameInMap("Out")
        public Float out;

        // 类型
        @NameInMap("Type")
        public String type;

        // 元数据json string
        @NameInMap("Data")
        public String data;

        public static GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList self = new GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList setIn(Float in) {
            this.in = in;
            return this;
        }
        public Float getIn() {
            return this.in;
        }

        public GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList setOut(Float out) {
            this.out = out;
            return this;
        }
        public Float getOut() {
            return this.out;
        }

        public GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoAiRoughDataList extends TeaModel {
        // AI类型
        @NameInMap("Type")
        public String type;

        // AI原始结果
        @NameInMap("Result")
        public String result;

        public static GetMediaInfoResponseBodyMediaInfoAiRoughDataList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoAiRoughDataList self = new GetMediaInfoResponseBodyMediaInfoAiRoughDataList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughDataList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo extends TeaModel {
        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件状态
        @NameInMap("FileStatus")
        public String fileStatus;

        // 文件类型
        @NameInMap("FileType")
        public String fileType;

        // 文件大小（字节）
        @NameInMap("FileSize")
        public String fileSize;

        // 文件oss地址
        @NameInMap("FileUrl")
        public String fileUrl;

        // 文件存储区域
        @NameInMap("Region")
        public String region;

        // 封装格式
        @NameInMap("FormatName")
        public String formatName;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 宽
        @NameInMap("Width")
        public String width;

        // 高
        @NameInMap("Height")
        public String height;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo self = new GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList extends TeaModel {
        // 音频流序号
        @NameInMap("Index")
        public String index;

        // 编码格式简述名
        @NameInMap("CodecName")
        public String codecName;

        // 编码格式长述名
        @NameInMap("CodecLongName")
        public String codecLongName;

        // 编码时基
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        // 编码格式标记文本
        @NameInMap("CodecTagString")
        public String codecTagString;

        // 编码格式标记
        @NameInMap("CodecTag")
        public String codecTag;

        // 编码预置
        @NameInMap("Profile")
        public String profile;

        // 采样格式
        @NameInMap("SampleFmt")
        public String sampleFmt;

        // 采样率
        @NameInMap("SampleRate")
        public String sampleRate;

        // 声道数
        @NameInMap("Channels")
        public String channels;

        // 声道输出样式
        @NameInMap("ChannelLayout")
        public String channelLayout;

        // 时基
        @NameInMap("Timebase")
        public String timebase;

        // 起始时间
        @NameInMap("StartTime")
        public String startTime;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 音频帧率
        @NameInMap("Fps")
        public String fps;

        // 总帧数
        @NameInMap("NumFrames")
        public String numFrames;

        // 语言
        @NameInMap("Lang")
        public String lang;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList self = new GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList extends TeaModel {
        // 视频流序号
        @NameInMap("Index")
        public String index;

        // 编码格式简述名
        @NameInMap("CodecName")
        public String codecName;

        // 编码格式长述名
        @NameInMap("CodecLongName")
        public String codecLongName;

        // 编码预置
        @NameInMap("Profile")
        public String profile;

        // 编码时基
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        // 编码格式标记文本
        @NameInMap("CodecTagString")
        public String codecTagString;

        // 编码格式标记
        @NameInMap("CodecTag")
        public String codecTag;

        // 宽
        @NameInMap("Width")
        public String width;

        // 高
        @NameInMap("Height")
        public String height;

        // 是否有B帧
        @NameInMap("HasBFrames")
        public String hasBFrames;

        // 编码信号分辨率比
        @NameInMap("Sar")
        public String sar;

        // 编码显示分辨率比
        @NameInMap("Dar")
        public String dar;

        // 像素格式
        @NameInMap("PixFmt")
        public String pixFmt;

        // 编码等级
        @NameInMap("Level")
        public String level;

        // 视频帧率
        @NameInMap("Fps")
        public String fps;

        // 平均帧率
        @NameInMap("AvgFPS")
        public String avgFPS;

        // 时基
        @NameInMap("Timebase")
        public String timebase;

        // 起始时间
        @NameInMap("StartTime")
        public String startTime;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 总帧数
        @NameInMap("NumFrames")
        public String numFrames;

        // 语言
        @NameInMap("Lang")
        public String lang;

        // 旋转
        @NameInMap("Rotate")
        public String rotate;

        // 总帧数
        @NameInMap("Nb_frames")
        public String nbFrames;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList self = new GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setNbFrames(String nbFrames) {
            this.nbFrames = nbFrames;
            return this;
        }
        public String getNbFrames() {
            return this.nbFrames;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList extends TeaModel {
        // 音频流序号
        @NameInMap("Index")
        public String index;

        // 编码格式简述名
        @NameInMap("CodecName")
        public String codecName;

        // 编码格式长述名
        @NameInMap("CodecLongName")
        public String codecLongName;

        // 编码时基
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        // 编码格式标记文本
        @NameInMap("CodecTagString")
        public String codecTagString;

        // 编码格式标记
        @NameInMap("CodecTag")
        public String codecTag;

        // 时基
        @NameInMap("Timebase")
        public String timebase;

        // 起始时间
        @NameInMap("StartTime")
        public String startTime;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 语言
        @NameInMap("Lang")
        public String lang;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList self = new GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoList extends TeaModel {
        // 文件基础信息，包含时长，大小等
        @NameInMap("FileBasicInfo")
        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo;

        // 音频流信息，一个媒资可能有多条音频流
        @NameInMap("AudioStreamInfoList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList;

        // 视频流信息，一个媒资可能有多条视频流
        @NameInMap("VideoStreamInfoList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> videoStreamInfoList;

        // 字幕流信息，一个媒资可能有多条字幕流
        @NameInMap("SubtitleStreamInfoList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoList self = new GetMediaInfoResponseBodyMediaInfoFileInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoList setFileBasicInfo(GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoList setAudioStreamInfoList(java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoList setVideoStreamInfoList(java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoList setSubtitleStreamInfoList(java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList) {
            this.subtitleStreamInfoList = subtitleStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> getSubtitleStreamInfoList() {
            return this.subtitleStreamInfoList;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfo extends TeaModel {
        // 媒资ID
        @NameInMap("MediaId")
        public String mediaId;

        // BasicInfo
        @NameInMap("MediaBasicInfo")
        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo;

        // 其他元数据
        @NameInMap("DynamicMetaDataList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList> dynamicMetaDataList;

        // AIMetadata
        @NameInMap("AiRoughDataList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoAiRoughDataList> aiRoughDataList;

        // FileInfos
        @NameInMap("FileInfoList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoList> fileInfoList;

        public static GetMediaInfoResponseBodyMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfo self = new GetMediaInfoResponseBodyMediaInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaInfoResponseBodyMediaInfo setMediaBasicInfo(GetMediaInfoResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public GetMediaInfoResponseBodyMediaInfo setDynamicMetaDataList(java.util.List<GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList> dynamicMetaDataList) {
            this.dynamicMetaDataList = dynamicMetaDataList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoDynamicMetaDataList> getDynamicMetaDataList() {
            return this.dynamicMetaDataList;
        }

        public GetMediaInfoResponseBodyMediaInfo setAiRoughDataList(java.util.List<GetMediaInfoResponseBodyMediaInfoAiRoughDataList> aiRoughDataList) {
            this.aiRoughDataList = aiRoughDataList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoAiRoughDataList> getAiRoughDataList() {
            return this.aiRoughDataList;
        }

        public GetMediaInfoResponseBodyMediaInfo setFileInfoList(java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

    }

}
