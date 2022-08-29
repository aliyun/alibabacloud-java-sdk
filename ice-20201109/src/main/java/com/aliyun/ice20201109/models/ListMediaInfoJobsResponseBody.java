// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaInfoJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListMediaInfoJobsResponseBodyJobs> jobs;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListMediaInfoJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaInfoJobsResponseBody self = new ListMediaInfoJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaInfoJobsResponseBody setJobs(java.util.List<ListMediaInfoJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListMediaInfoJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListMediaInfoJobsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListMediaInfoJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMediaInfoJobsResponseBodyJobsInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListMediaInfoJobsResponseBodyJobsInput build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsInput self = new ListMediaInfoJobsResponseBodyJobsInput();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListMediaInfoJobsResponseBodyJobsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList extends TeaModel {
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

        public static ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList self = new ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo extends TeaModel {
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

        public static ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo self = new ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList extends TeaModel {
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

        public static ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList self = new ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setAvgFps(String avgFps) {
            this.avgFps = avgFps;
            return this;
        }
        public String getAvgFps() {
            return this.avgFps;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setTimeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }
        public String getTimeBase() {
            return this.timeBase;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsMediaInfoProperty extends TeaModel {
        @NameInMap("AudioStreamInfoList")
        public java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList> audioStreamInfoList;

        @NameInMap("FileBasicInfo")
        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo fileBasicInfo;

        @NameInMap("VideoStreamInfoList")
        public java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList> videoStreamInfoList;

        public static ListMediaInfoJobsResponseBodyJobsMediaInfoProperty build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsMediaInfoProperty self = new ListMediaInfoJobsResponseBodyJobsMediaInfoProperty();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty setAudioStreamInfoList(java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty setFileBasicInfo(ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty setVideoStreamInfoList(java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static ListMediaInfoJobsResponseBodyJobsScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsScheduleConfig self = new ListMediaInfoJobsResponseBodyJobsScheduleConfig();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListMediaInfoJobsResponseBodyJobsScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobs extends TeaModel {
        @NameInMap("Async")
        public Boolean async;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public ListMediaInfoJobsResponseBodyJobsInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaInfoProperty")
        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty mediaInfoProperty;

        @NameInMap("Name")
        public String name;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ScheduleConfig")
        public ListMediaInfoJobsResponseBodyJobsScheduleConfig scheduleConfig;

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

        public static ListMediaInfoJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobs self = new ListMediaInfoJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobs setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public ListMediaInfoJobsResponseBodyJobs setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListMediaInfoJobsResponseBodyJobs setInput(ListMediaInfoJobsResponseBodyJobsInput input) {
            this.input = input;
            return this;
        }
        public ListMediaInfoJobsResponseBodyJobsInput getInput() {
            return this.input;
        }

        public ListMediaInfoJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListMediaInfoJobsResponseBodyJobs setMediaInfoProperty(ListMediaInfoJobsResponseBodyJobsMediaInfoProperty mediaInfoProperty) {
            this.mediaInfoProperty = mediaInfoProperty;
            return this;
        }
        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty getMediaInfoProperty() {
            return this.mediaInfoProperty;
        }

        public ListMediaInfoJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaInfoJobsResponseBodyJobs setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMediaInfoJobsResponseBodyJobs setScheduleConfig(ListMediaInfoJobsResponseBodyJobsScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public ListMediaInfoJobsResponseBodyJobsScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public ListMediaInfoJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMediaInfoJobsResponseBodyJobs setSubmitResultJson(java.util.Map<String, ?> submitResultJson) {
            this.submitResultJson = submitResultJson;
            return this;
        }
        public java.util.Map<String, ?> getSubmitResultJson() {
            return this.submitResultJson;
        }

        public ListMediaInfoJobsResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListMediaInfoJobsResponseBodyJobs setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public ListMediaInfoJobsResponseBodyJobs setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
