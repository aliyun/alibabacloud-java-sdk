// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobResponseBody extends TeaModel {
    // MediaInfoJobDTO
    @NameInMap("MediaInfoJob")
    public SubmitMediaInfoJobResponseBodyMediaInfoJob mediaInfoJob;

    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitMediaInfoJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaInfoJobResponseBody self = new SubmitMediaInfoJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaInfoJobResponseBody setMediaInfoJob(SubmitMediaInfoJobResponseBodyMediaInfoJob mediaInfoJob) {
        this.mediaInfoJob = mediaInfoJob;
        return this;
    }
    public SubmitMediaInfoJobResponseBodyMediaInfoJob getMediaInfoJob() {
        return this.mediaInfoJob;
    }

    public SubmitMediaInfoJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobInput extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobInput self = new SubmitMediaInfoJobResponseBodyMediaInfoJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList extends TeaModel {
        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 声道布局
        @NameInMap("ChannelLayout")
        public String channelLayout;

        // 声道数
        @NameInMap("Channels")
        public String channels;

        // 编码格式名
        @NameInMap("CodecLongName")
        public String codecLongName;

        // 编码格式
        @NameInMap("CodecName")
        public String codecName;

        // 编码器标签
        @NameInMap("CodecTag")
        public String codecTag;

        // 编码器标签名
        @NameInMap("CodecTagString")
        public String codecTagString;

        // 编码器时间基
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 流序号
        @NameInMap("Index")
        public String index;

        // 语言
        @NameInMap("Lang")
        public String lang;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        // 采样率
        @NameInMap("SampleRate")
        public String sampleRate;

        // 开始时间
        @NameInMap("StartTime")
        public String startTime;

        // 时间基
        @NameInMap("Timebase")
        public String timebase;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList self = new SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo extends TeaModel {
        // 视频码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 视频时长
        @NameInMap("Duration")
        public String duration;

        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件大小
        @NameInMap("FileSize")
        public String fileSize;

        // 文件状态
        @NameInMap("FileStatus")
        public String fileStatus;

        // 文件类型
        @NameInMap("FileType")
        public String fileType;

        // 文件url
        @NameInMap("FileUrl")
        public String fileUrl;

        // 视频格式名称
        @NameInMap("FormatName")
        public String formatName;

        // 高
        @NameInMap("Height")
        public String height;

        // 媒资ID
        @NameInMap("MediaId")
        public String mediaId;

        // 文件所在区域
        @NameInMap("Region")
        public String region;

        // 宽
        @NameInMap("Width")
        public String width;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo self = new SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList extends TeaModel {
        @NameInMap("Avg_fps")
        public String avgFps;

        @NameInMap("Bit_rate")
        public String bitRate;

        // 编码格式名
        @NameInMap("Codec_long_name")
        public String codecLongName;

        // 编码格式
        @NameInMap("Codec_name")
        public String codecName;

        // 编码格式标记
        @NameInMap("Codec_tag")
        public String codecTag;

        // 编码格式标记文本
        @NameInMap("Codec_tag_string")
        public String codecTagString;

        @NameInMap("Codec_time_base")
        public String codecTimeBase;

        // 图像显示宽高比
        @NameInMap("Dar")
        public String dar;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 帧率
        @NameInMap("Fps")
        public String fps;

        @NameInMap("Has_b_frames")
        public String hasBFrames;

        // 高
        @NameInMap("Height")
        public String height;

        // 流序号
        @NameInMap("Index")
        public String index;

        // 语言
        @NameInMap("Lang")
        public String lang;

        // 编码等级
        @NameInMap("Level")
        public String level;

        // 总帧数
        @NameInMap("NumFrames")
        public String numFrames;

        // 颜色存储格式
        @NameInMap("PixFmt")
        public String pixFmt;

        // 编码器预设
        @NameInMap("Profile")
        public String profile;

        // 视频画面旋转角度
        @NameInMap("Rotate")
        public String rotate;

        // 采集点数宽高比
        @NameInMap("Sar")
        public String sar;

        // 起始时间
        @NameInMap("Start_time")
        public String startTime;

        @NameInMap("Time_base")
        public String timeBase;

        // 宽
        @NameInMap("Width")
        public String width;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList self = new SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setAvgFps(String avgFps) {
            this.avgFps = avgFps;
            return this;
        }
        public String getAvgFps() {
            return this.avgFps;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setTimeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }
        public String getTimeBase() {
            return this.timeBase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty extends TeaModel {
        // 音频流信息
        @NameInMap("AudioStreamInfoList")
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList> audioStreamInfoList;

        // 基础文件信息
        @NameInMap("FileBasicInfo")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo fileBasicInfo;

        // 视频流信息
        @NameInMap("VideoStreamInfoList")
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList> videoStreamInfoList;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty self = new SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty setAudioStreamInfoList(java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty setFileBasicInfo(SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty setVideoStreamInfoList(java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig extends TeaModel {
        // 管道 id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 任务优先级，取值范围：1~10
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig self = new SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJob extends TeaModel {
        // 是否异步处理
        @NameInMap("Async")
        public Boolean async;

        // 任务完成时间
        @NameInMap("FinishTime")
        public String finishTime;

        // 任务输入
        @NameInMap("Input")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput input;

        // 任务 id
        @NameInMap("JobId")
        public String jobId;

        // 媒体信息详情
        @NameInMap("MediaInfoProperty")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty mediaInfoProperty;

        // 任务名字
        @NameInMap("Name")
        public String name;

        // 请求 id
        @NameInMap("RequestId")
        public String requestId;

        // 调度信息
        @NameInMap("ScheduleConfig")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig scheduleConfig;

        // 任务状态 - Init: 已提交, Success: 成功, Fail: 失败
        @NameInMap("Status")
        public String status;

        // 任务提交信息
        @NameInMap("SubmitResultJson")
        public java.util.Map<String, ?> submitResultJson;

        // 任务提交时间
        @NameInMap("SubmitTime")
        public String submitTime;

        // 任务来源 - API, WorkFlow, Console
        @NameInMap("TriggerSource")
        public String triggerSource;

        // 用户数据
        @NameInMap("UserData")
        public String userData;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJob self = new SubmitMediaInfoJobResponseBodyMediaInfoJob();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setInput(SubmitMediaInfoJobResponseBodyMediaInfoJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput getInput() {
            return this.input;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setMediaInfoProperty(SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty mediaInfoProperty) {
            this.mediaInfoProperty = mediaInfoProperty;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty getMediaInfoProperty() {
            return this.mediaInfoProperty;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setScheduleConfig(SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setSubmitResultJson(java.util.Map<String, ?> submitResultJson) {
            this.submitResultJson = submitResultJson;
            return this;
        }
        public java.util.Map<String, ?> getSubmitResultJson() {
            return this.submitResultJson;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
