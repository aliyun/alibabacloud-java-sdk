// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoJobResponseBody extends TeaModel {
    // MediaInfoJobDTO
    @NameInMap("MediaInfoJob")
    public GetMediaInfoJobResponseBodyMediaInfoJob mediaInfoJob;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaInfoJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoJobResponseBody self = new GetMediaInfoJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoJobResponseBody setMediaInfoJob(GetMediaInfoJobResponseBodyMediaInfoJob mediaInfoJob) {
        this.mediaInfoJob = mediaInfoJob;
        return this;
    }
    public GetMediaInfoJobResponseBodyMediaInfoJob getMediaInfoJob() {
        return this.mediaInfoJob;
    }

    public GetMediaInfoJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaInfoJobResponseBodyMediaInfoJobInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetMediaInfoJobResponseBodyMediaInfoJobInput build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoJobResponseBodyMediaInfoJobInput self = new GetMediaInfoJobResponseBodyMediaInfoJobInput();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList extends TeaModel {
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

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("SampleRate")
        public String sampleRate;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        public static GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList self = new GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo extends TeaModel {
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

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Width")
        public String width;

        public static GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo self = new GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList extends TeaModel {
        @NameInMap("Avg_fps")
        public String avgFps;

        @NameInMap("Bit_rate")
        public String bitRate;

        @NameInMap("Codec_long_name")
        public String codecLongName;

        @NameInMap("Codec_name")
        public String codecName;

        @NameInMap("Codec_tag")
        public String codecTag;

        @NameInMap("Codec_tag_string")
        public String codecTagString;

        @NameInMap("Codec_time_base")
        public String codecTimeBase;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Has_b_frames")
        public String hasBFrames;

        @NameInMap("Height")
        public String height;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Level")
        public String level;

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

        @NameInMap("Start_time")
        public String startTime;

        @NameInMap("Time_base")
        public String timeBase;

        @NameInMap("Width")
        public String width;

        public static GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList self = new GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setAvgFps(String avgFps) {
            this.avgFps = avgFps;
            return this;
        }
        public String getAvgFps() {
            return this.avgFps;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setTimeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }
        public String getTimeBase() {
            return this.timeBase;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty extends TeaModel {
        @NameInMap("AudioStreamInfoList")
        public java.util.List<GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList> audioStreamInfoList;

        @NameInMap("FileBasicInfo")
        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo fileBasicInfo;

        @NameInMap("VideoStreamInfoList")
        public java.util.List<GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList> videoStreamInfoList;

        public static GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty self = new GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty setAudioStreamInfoList(java.util.List<GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty setFileBasicInfo(GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty setVideoStreamInfoList(java.util.List<GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoPropertyVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig self = new GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class GetMediaInfoJobResponseBodyMediaInfoJob extends TeaModel {
        @NameInMap("Async")
        public Boolean async;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public GetMediaInfoJobResponseBodyMediaInfoJobInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaInfoProperty")
        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty mediaInfoProperty;

        @NameInMap("Name")
        public String name;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ScheduleConfig")
        public GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig scheduleConfig;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitResultJson")
        public java.util.Map<String, ?> submitResultJson;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TriggerSource")
        public String triggerSource;

        @NameInMap("UserData")
        public String userData;

        public static GetMediaInfoJobResponseBodyMediaInfoJob build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoJobResponseBodyMediaInfoJob self = new GetMediaInfoJobResponseBodyMediaInfoJob();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setInput(GetMediaInfoJobResponseBodyMediaInfoJobInput input) {
            this.input = input;
            return this;
        }
        public GetMediaInfoJobResponseBodyMediaInfoJobInput getInput() {
            return this.input;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setMediaInfoProperty(GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty mediaInfoProperty) {
            this.mediaInfoProperty = mediaInfoProperty;
            return this;
        }
        public GetMediaInfoJobResponseBodyMediaInfoJobMediaInfoProperty getMediaInfoProperty() {
            return this.mediaInfoProperty;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setScheduleConfig(GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public GetMediaInfoJobResponseBodyMediaInfoJobScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setSubmitResultJson(java.util.Map<String, ?> submitResultJson) {
            this.submitResultJson = submitResultJson;
            return this;
        }
        public java.util.Map<String, ?> getSubmitResultJson() {
            return this.submitResultJson;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public GetMediaInfoJobResponseBodyMediaInfoJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
