// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryEditingJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryEditingJobListResponseBodyJobList jobList;

    @NameInMap("NonExistJobIds")
    public QueryEditingJobListResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryEditingJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEditingJobListResponseBody self = new QueryEditingJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEditingJobListResponseBody setJobList(QueryEditingJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryEditingJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryEditingJobListResponseBody setNonExistJobIds(QueryEditingJobListResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public QueryEditingJobListResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public QueryEditingJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume extends TeaModel {
        @NameInMap("Level")
        public String level;

        @NameInMap("Method")
        public String method;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume self = new QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigAudio extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Volume")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume volume;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigAudio self = new QueryEditingJobListResponseBodyJobListJobEditingConfigAudio();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setVolume(QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Seek")
        public String seek;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan self = new QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigClip extends TeaModel {
        @NameInMap("TimeSpan")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan timeSpan;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigClip build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigClip self = new QueryEditingJobListResponseBodyJobListJobEditingConfigClip();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigClip setTimeSpan(QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigContainer self = new QueryEditingJobListResponseBodyJobListJobEditingConfigContainer();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile self = new QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark extends TeaModel {
        @NameInMap("Alpha")
        public String alpha;

        @NameInMap("InputFile")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile inputFile;

        @NameInMap("Type")
        public String type;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark self = new QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark setAlpha(String alpha) {
            this.alpha = alpha;
            return this;
        }
        public String getAlpha() {
            return this.alpha;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark setInputFile(QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("EffectConfig")
        public String effectConfig;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect setEffectConfig(String effectConfig) {
            this.effectConfig = effectConfig;
            return this;
        }
        public String getEffectConfig() {
            return this.effectConfig;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects extends TeaModel {
        @NameInMap("Effect")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect> effect;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects setEffect(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect> effect) {
            this.effect = effect;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect> getEffect() {
            return this.effect;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip extends TeaModel {
        @NameInMap("Effects")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects effects;

        @NameInMap("Id")
        public String id;

        @NameInMap("In")
        public String in;

        @NameInMap("Out")
        public String out;

        @NameInMap("SourceID")
        public String sourceID;

        @NameInMap("SourceStrmMap")
        public String sourceStrmMap;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Type")
        public String type;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setEffects(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects effects) {
            this.effects = effects;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects getEffects() {
            return this.effects;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setSourceID(String sourceID) {
            this.sourceID = sourceID;
            return this;
        }
        public String getSourceID() {
            return this.sourceID;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setSourceStrmMap(String sourceStrmMap) {
            this.sourceStrmMap = sourceStrmMap;
            return this;
        }
        public String getSourceStrmMap() {
            return this.sourceStrmMap;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip> clip;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList setClip(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip> getClip() {
            return this.clip;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio extends TeaModel {
        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Samplerate")
        public String samplerate;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo extends TeaModel {
        @NameInMap("BgColor")
        public String bgColor;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("IsGpuData")
        public String isGpuData;

        @NameInMap("IsOneTrackData")
        public String isOneTrackData;

        @NameInMap("ReclosePrec")
        public String reclosePrec;

        @NameInMap("RenderRatio")
        public String renderRatio;

        @NameInMap("Width")
        public String width;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setIsGpuData(String isGpuData) {
            this.isGpuData = isGpuData;
            return this;
        }
        public String getIsGpuData() {
            return this.isGpuData;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setIsOneTrackData(String isOneTrackData) {
            this.isOneTrackData = isOneTrackData;
            return this;
        }
        public String getIsOneTrackData() {
            return this.isOneTrackData;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setReclosePrec(String reclosePrec) {
            this.reclosePrec = reclosePrec;
            return this;
        }
        public String getReclosePrec() {
            return this.reclosePrec;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setRenderRatio(String renderRatio) {
            this.renderRatio = renderRatio;
            return this;
        }
        public String getRenderRatio() {
            return this.renderRatio;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig extends TeaModel {
        @NameInMap("TimelineConfigAudio")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio;

        @NameInMap("TimelineConfigVideo")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig setTimelineConfigAudio(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio) {
            this.timelineConfigAudio = timelineConfigAudio;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio getTimelineConfigAudio() {
            return this.timelineConfigAudio;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig setTimelineConfigVideo(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo) {
            this.timelineConfigVideo = timelineConfigVideo;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo getTimelineConfigVideo() {
            return this.timelineConfigVideo;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo extends TeaModel {
        @NameInMap("L")
        public String l;

        @NameInMap("T")
        public String t;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setL(String l) {
            this.l = l;
            return this;
        }
        public String getL() {
            return this.l;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setT(String t) {
            this.t = t;
            return this;
        }
        public String getT() {
            return this.t;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig extends TeaModel {
        @NameInMap("ClipsConfigVideo")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig setClipsConfigVideo(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo) {
            this.clipsConfigVideo = clipsConfigVideo;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo getClipsConfigVideo() {
            return this.clipsConfigVideo;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip extends TeaModel {
        @NameInMap("ClipsConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig;

        @NameInMap("In")
        public String in;

        @NameInMap("Out")
        public String out;

        @NameInMap("clipID")
        public String clipID;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip setClipsConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig) {
            this.clipsConfig = clipsConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig getClipsConfig() {
            return this.clipsConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip setClipID(String clipID) {
            this.clipID = clipID;
            return this;
        }
        public String getClipID() {
            return this.clipID;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip> clip;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips setClip(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip> getClip() {
            return this.clip;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack extends TeaModel {
        @NameInMap("Clips")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips clips;

        @NameInMap("Id")
        public String id;

        @NameInMap("Order")
        public String order;

        @NameInMap("Type")
        public String type;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack setClips(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips clips) {
            this.clips = clips;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips getClips() {
            return this.clips;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList extends TeaModel {
        @NameInMap("Track")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack> track;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList setTrack(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack> track) {
            this.track = track;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack> getTrack() {
            return this.track;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline extends TeaModel {
        @NameInMap("TimelineConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig timelineConfig;

        @NameInMap("TrackList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList trackList;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline setTimelineConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig timelineConfig) {
            this.timelineConfig = timelineConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig getTimelineConfig() {
            return this.timelineConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline setTrackList(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList trackList) {
            this.trackList = trackList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList getTrackList() {
            return this.trackList;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditing extends TeaModel {
        @NameInMap("ClipList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList clipList;

        @NameInMap("Timeline")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline timeline;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditing build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditing self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditing();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditing setClipList(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList clipList) {
            this.clipList = clipList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList getClipList() {
            return this.clipList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditing setTimeline(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline getTimeline() {
            return this.timeline;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("KeyUri")
        public String keyUri;

        @NameInMap("SkipCnt")
        public String skipCnt;

        @NameInMap("Type")
        public String type;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setKeyUri(String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public String getKeyUri() {
            return this.keyUri;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setSkipCnt(String skipCnt) {
            this.skipCnt = skipCnt;
            return this;
        }
        public String getSkipCnt() {
            return this.skipCnt;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS extends TeaModel {
        @NameInMap("Md5Support")
        public Boolean md5Support;

        @NameInMap("SizeSupport")
        public Boolean sizeSupport;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS self = new QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport extends TeaModel {
        @NameInMap("TS")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS TS;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport self = new QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport setTS(QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS TS) {
            this.TS = TS;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS getTS() {
            return this.TS;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("MergeURL")
        public String mergeURL;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Start")
        public String start;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList extends TeaModel {
        @NameInMap("Merge")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge> merge;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList setMerge(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge> merge) {
            this.merge = merge;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge> getMerge() {
            return this.merge;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif extends TeaModel {
        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        @NameInMap("Loop")
        public String loop;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif gif;

        @NameInMap("Segment")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment segment;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig setGif(QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif getGif() {
            return this.gif;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig setSegment(QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile self = new QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FormatLongName")
        public String formatLongName;

        @NameInMap("FormatName")
        public String formatName;

        @NameInMap("NumPrograms")
        public String numPrograms;

        @NameInMap("NumStreams")
        public String numStreams;

        @NameInMap("Size")
        public String size;

        @NameInMap("StartTime")
        public String startTime;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
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

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList setAudioStream(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        @NameInMap("PreloadTime")
        public String preloadTime;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
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

        @NameInMap("NetworkCost")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Sar")
        public String sar;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("Width")
        public String width;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setNetworkCost(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList setVideoStream(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams extends TeaModel {
        @NameInMap("AudioStreamList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList subtitleStreamList;

        @NameInMap("VideoStreamList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList videoStreamList;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams setAudioStreamList(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams setSubtitleStreamList(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams setVideoStreamList(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigProperties extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("Format")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("Streams")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams streams;

        @NameInMap("Width")
        public String width;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigProperties self = new QueryEditingJobListResponseBodyJobListJobEditingConfigProperties();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setFormat(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat getFormat() {
            return this.format;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setStreams(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams getStreams() {
            return this.streams;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("Input")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput input;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setInput(QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput input) {
            this.input = input;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput getInput() {
            return this.input;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList setExtSubtitle(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle) {
            this.extSubtitle = extSubtitle;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle extends TeaModel {
        @NameInMap("Map")
        public String map;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle> subtitle;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList setSubtitle(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle> getSubtitle() {
            return this.subtitle;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig extends TeaModel {
        @NameInMap("ExtSubtitleList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList extSubtitleList;

        @NameInMap("SubtitleList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList subtitleList;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig setExtSubtitleList(QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList extSubtitleList) {
            this.extSubtitleList = extSubtitleList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig setSubtitleList(QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList getSubtitleList() {
            return this.subtitleList;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso extends TeaModel {
        @NameInMap("IsHalfSample")
        public String isHalfSample;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso setIsHalfSample(String isHalfSample) {
            this.isHalfSample = isHalfSample;
            return this;
        }
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig extends TeaModel {
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        @NameInMap("IsCheckReso")
        public String isCheckReso;

        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        @NameInMap("TransMode")
        public String transMode;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd self = new QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigVideo extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("BitrateBnd")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd bitrateBnd;

        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("MaxFps")
        public String maxFps;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("Pad")
        public String pad;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("Width")
        public String width;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigVideo self = new QueryEditingJobListResponseBodyJobListJobEditingConfigVideo();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setBitrateBnd(QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile self = new QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark extends TeaModel {
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("Height")
        public String height;

        @NameInMap("InputFile")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile inputFile;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Type")
        public String type;

        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        @NameInMap("Width")
        public String width;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark self = new QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setInputFile(QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark> waterMark;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList setWaterMark(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark> waterMark) {
            this.waterMark = waterMark;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark> getWaterMark() {
            return this.waterMark;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfig extends TeaModel {
        @NameInMap("Audio")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio audio;

        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        @NameInMap("Clip")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigClip clip;

        @NameInMap("Container")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigContainer container;

        @NameInMap("DeWatermark")
        public String deWatermark;

        @NameInMap("DigiWaterMark")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark digiWaterMark;

        @NameInMap("Editing")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditing editing;

        @NameInMap("Encryption")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption encryption;

        @NameInMap("M3U8NonStandardSupport")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        @NameInMap("MergeList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList mergeList;

        @NameInMap("MuxConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig muxConfig;

        @NameInMap("OutputFile")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile outputFile;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Properties")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties properties;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("SubtitleConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig subtitleConfig;

        @NameInMap("SuperReso")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso superReso;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TransConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig transConfig;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Video")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo video;

        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        @NameInMap("WaterMarkList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList waterMarkList;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setAudio(QueryEditingJobListResponseBodyJobListJobEditingConfigAudio audio) {
            this.audio = audio;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio getAudio() {
            return this.audio;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setAudioStreamMap(String audioStreamMap) {
            this.audioStreamMap = audioStreamMap;
            return this;
        }
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setClip(QueryEditingJobListResponseBodyJobListJobEditingConfigClip clip) {
            this.clip = clip;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigClip getClip() {
            return this.clip;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setContainer(QueryEditingJobListResponseBodyJobListJobEditingConfigContainer container) {
            this.container = container;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigContainer getContainer() {
            return this.container;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setDigiWaterMark(QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark digiWaterMark) {
            this.digiWaterMark = digiWaterMark;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setEditing(QueryEditingJobListResponseBodyJobListJobEditingConfigEditing editing) {
            this.editing = editing;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditing getEditing() {
            return this.editing;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setEncryption(QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption getEncryption() {
            return this.encryption;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setM3U8NonStandardSupport(QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setMergeList(QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList getMergeList() {
            return this.mergeList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setMuxConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setOutputFile(QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setProperties(QueryEditingJobListResponseBodyJobListJobEditingConfigProperties properties) {
            this.properties = properties;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties getProperties() {
            return this.properties;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setSubtitleConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setSuperReso(QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso getSuperReso() {
            return this.superReso;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setTransConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig getTransConfig() {
            return this.transConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setVideo(QueryEditingJobListResponseBodyJobListJobEditingConfigVideo video) {
            this.video = video;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo getVideo() {
            return this.video;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setWaterMarkList(QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig extends TeaModel {
        @NameInMap("DeinterlaceMethod")
        public String deinterlaceMethod;

        @NameInMap("IsNormalSar")
        public String isNormalSar;

        public static QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig self = new QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig setDeinterlaceMethod(String deinterlaceMethod) {
            this.deinterlaceMethod = deinterlaceMethod;
            return this;
        }
        public String getDeinterlaceMethod() {
            return this.deinterlaceMethod;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig setIsNormalSar(String isNormalSar) {
            this.isNormalSar = isNormalSar;
            return this;
        }
        public String getIsNormalSar() {
            return this.isNormalSar;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile self = new QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("InputConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig inputConfig;

        @NameInMap("InputFile")
        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile inputFile;

        public static QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput self = new QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput setInputConfig(QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput setInputFile(QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile getInputFile() {
            return this.inputFile;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingInputs extends TeaModel {
        @NameInMap("EditingInput")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput> editingInput;

        public static QueryEditingJobListResponseBodyJobListJobEditingInputs build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingInputs self = new QueryEditingJobListResponseBodyJobListJobEditingInputs();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputs setEditingInput(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput> editingInput) {
            this.editingInput = editingInput;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput> getEditingInput() {
            return this.editingInput;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobMNSMessageResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("MessageId")
        public String messageId;

        public static QueryEditingJobListResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobMNSMessageResult self = new QueryEditingJobListResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("EditingConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfig editingConfig;

        @NameInMap("EditingInputs")
        public QueryEditingJobListResponseBodyJobListJobEditingInputs editingInputs;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MNSMessageResult")
        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("Percent")
        public Long percent;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        public static QueryEditingJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJob self = new QueryEditingJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryEditingJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryEditingJobListResponseBodyJobListJob setEditingConfig(QueryEditingJobListResponseBodyJobListJobEditingConfig editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfig getEditingConfig() {
            return this.editingConfig;
        }

        public QueryEditingJobListResponseBodyJobListJob setEditingInputs(QueryEditingJobListResponseBodyJobListJobEditingInputs editingInputs) {
            this.editingInputs = editingInputs;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingInputs getEditingInputs() {
            return this.editingInputs;
        }

        public QueryEditingJobListResponseBodyJobListJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryEditingJobListResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryEditingJobListResponseBodyJobListJob setMNSMessageResult(QueryEditingJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QueryEditingJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryEditingJobListResponseBodyJobListJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public QueryEditingJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryEditingJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryEditingJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryEditingJobListResponseBodyJobListJob> job;

        public static QueryEditingJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobList self = new QueryEditingJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobList setJob(java.util.List<QueryEditingJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryEditingJobListResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryEditingJobListResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyNonExistJobIds self = new QueryEditingJobListResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
