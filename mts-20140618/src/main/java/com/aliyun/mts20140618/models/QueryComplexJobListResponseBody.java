// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryComplexJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryComplexJobListResponseBodyJobList jobList;

    @NameInMap("NonExistJobIds")
    public QueryComplexJobListResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryComplexJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryComplexJobListResponseBody self = new QueryComplexJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryComplexJobListResponseBody setJobList(QueryComplexJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryComplexJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryComplexJobListResponseBody setNonExistJobIds(QueryComplexJobListResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public QueryComplexJobListResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public QueryComplexJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("EffectConfig")
        public String effectConfig;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect setEffectConfig(String effectConfig) {
            this.effectConfig = effectConfig;
            return this;
        }
        public String getEffectConfig() {
            return this.effectConfig;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects extends TeaModel {
        @NameInMap("Effect")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect> effect;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects setEffect(java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect> effect) {
            this.effect = effect;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect> getEffect() {
            return this.effect;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip extends TeaModel {
        @NameInMap("Effects")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects effects;

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

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setEffects(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects effects) {
            this.effects = effects;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects getEffects() {
            return this.effects;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setSourceID(String sourceID) {
            this.sourceID = sourceID;
            return this;
        }
        public String getSourceID() {
            return this.sourceID;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setSourceStrmMap(String sourceStrmMap) {
            this.sourceStrmMap = sourceStrmMap;
            return this;
        }
        public String getSourceStrmMap() {
            return this.sourceStrmMap;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipList extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip> clip;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipList self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipList setClip(java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip> getClip() {
            return this.clip;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio extends TeaModel {
        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Samplerate")
        public String samplerate;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo extends TeaModel {
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

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setIsGpuData(String isGpuData) {
            this.isGpuData = isGpuData;
            return this;
        }
        public String getIsGpuData() {
            return this.isGpuData;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setIsOneTrackData(String isOneTrackData) {
            this.isOneTrackData = isOneTrackData;
            return this;
        }
        public String getIsOneTrackData() {
            return this.isOneTrackData;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setReclosePrec(String reclosePrec) {
            this.reclosePrec = reclosePrec;
            return this;
        }
        public String getReclosePrec() {
            return this.reclosePrec;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setRenderRatio(String renderRatio) {
            this.renderRatio = renderRatio;
            return this;
        }
        public String getRenderRatio() {
            return this.renderRatio;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig extends TeaModel {
        @NameInMap("TimelineConfigAudio")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio;

        @NameInMap("TimelineConfigVideo")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig setTimelineConfigAudio(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio) {
            this.timelineConfigAudio = timelineConfigAudio;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio getTimelineConfigAudio() {
            return this.timelineConfigAudio;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig setTimelineConfigVideo(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo) {
            this.timelineConfigVideo = timelineConfigVideo;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo getTimelineConfigVideo() {
            return this.timelineConfigVideo;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo extends TeaModel {
        @NameInMap("L")
        public String l;

        @NameInMap("T")
        public String t;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setL(String l) {
            this.l = l;
            return this;
        }
        public String getL() {
            return this.l;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setT(String t) {
            this.t = t;
            return this;
        }
        public String getT() {
            return this.t;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig extends TeaModel {
        @NameInMap("ClipsConfigVideo")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig setClipsConfigVideo(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo) {
            this.clipsConfigVideo = clipsConfigVideo;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo getClipsConfigVideo() {
            return this.clipsConfigVideo;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip extends TeaModel {
        @NameInMap("ClipsConfig")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig;

        @NameInMap("In")
        public String in;

        @NameInMap("Out")
        public String out;

        @NameInMap("clipID")
        public String clipID;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip setClipsConfig(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig) {
            this.clipsConfig = clipsConfig;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig getClipsConfig() {
            return this.clipsConfig;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip setClipID(String clipID) {
            this.clipID = clipID;
            return this;
        }
        public String getClipID() {
            return this.clipID;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip> clip;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips setClip(java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip> getClip() {
            return this.clip;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack extends TeaModel {
        @NameInMap("Clips")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips clips;

        @NameInMap("Id")
        public String id;

        @NameInMap("Order")
        public String order;

        @NameInMap("Type")
        public String type;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack setClips(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips clips) {
            this.clips = clips;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips getClips() {
            return this.clips;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList extends TeaModel {
        @NameInMap("Track")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack> track;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList setTrack(java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack> track) {
            this.track = track;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack> getTrack() {
            return this.track;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline extends TeaModel {
        @NameInMap("TimelineConfig")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig timelineConfig;

        @NameInMap("TrackList")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList trackList;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline setTimelineConfig(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig timelineConfig) {
            this.timelineConfig = timelineConfig;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig getTimelineConfig() {
            return this.timelineConfig;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline setTrackList(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList trackList) {
            this.trackList = trackList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList getTrackList() {
            return this.trackList;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing extends TeaModel {
        @NameInMap("ClipList")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipList clipList;

        @NameInMap("Timeline")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline timeline;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing setClipList(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipList clipList) {
            this.clipList = clipList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingClipList getClipList() {
            return this.clipList;
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing setTimeline(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditingTimeline getTimeline() {
            return this.timeline;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigs extends TeaModel {
        @NameInMap("Editing")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing editing;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigs self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigs();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigs setEditing(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing editing) {
            this.editing = editing;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigsEditing getEditing() {
            return this.editing;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobComplexEditingConfigs extends TeaModel {
        @NameInMap("ComplexEditingConfigs")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigs> complexEditingConfigs;

        public static QueryComplexJobListResponseBodyJobListJobComplexEditingConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobComplexEditingConfigs self = new QueryComplexJobListResponseBodyJobListJobComplexEditingConfigs();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigs setComplexEditingConfigs(java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigs> complexEditingConfigs) {
            this.complexEditingConfigs = complexEditingConfigs;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobComplexEditingConfigsComplexEditingConfigs> getComplexEditingConfigs() {
            return this.complexEditingConfigs;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig extends TeaModel {
        @NameInMap("DeinterlaceMethod")
        public String deinterlaceMethod;

        @NameInMap("IsNormalSar")
        public String isNormalSar;

        public static QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig self = new QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig setDeinterlaceMethod(String deinterlaceMethod) {
            this.deinterlaceMethod = deinterlaceMethod;
            return this;
        }
        public String getDeinterlaceMethod() {
            return this.deinterlaceMethod;
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig setIsNormalSar(String isNormalSar) {
            this.isNormalSar = isNormalSar;
            return this;
        }
        public String getIsNormalSar() {
            return this.isNormalSar;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile self = new QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("InputConfig")
        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig inputConfig;

        @NameInMap("InputFile")
        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile inputFile;

        public static QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput self = new QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput setInputConfig(QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput setInputFile(QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInputInputFile getInputFile() {
            return this.inputFile;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputs extends TeaModel {
        @NameInMap("EditingInput")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput> editingInput;

        public static QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputs build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputs self = new QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputs();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputs setEditingInput(java.util.List<QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput> editingInput) {
            this.editingInput = editingInput;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputsEditingInput> getEditingInput() {
            return this.editingInput;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobInputsInputs extends TeaModel {
        @NameInMap("EditingInputs")
        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputs editingInputs;

        public static QueryComplexJobListResponseBodyJobListJobInputsInputs build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobInputsInputs self = new QueryComplexJobListResponseBodyJobListJobInputsInputs();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobInputsInputs setEditingInputs(QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputs editingInputs) {
            this.editingInputs = editingInputs;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobInputsInputsEditingInputs getEditingInputs() {
            return this.editingInputs;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobInputs extends TeaModel {
        @NameInMap("Inputs")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobInputsInputs> inputs;

        public static QueryComplexJobListResponseBodyJobListJobInputs build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobInputs self = new QueryComplexJobListResponseBodyJobListJobInputs();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobInputs setInputs(java.util.List<QueryComplexJobListResponseBodyJobListJobInputsInputs> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobInputsInputs> getInputs() {
            return this.inputs;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobMNSMessageResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("MessageId")
        public String messageId;

        public static QueryComplexJobListResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobMNSMessageResult self = new QueryComplexJobListResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryComplexJobListResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryComplexJobListResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume extends TeaModel {
        @NameInMap("Level")
        public String level;

        @NameInMap("Method")
        public String method;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio extends TeaModel {
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
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume volume;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio setVolume(QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Seek")
        public String seek;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputClip extends TeaModel {
        @NameInMap("TimeSpan")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan timeSpan;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputClip build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputClip self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputClip();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputClip setTimeSpan(QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputContainer self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputContainer();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark extends TeaModel {
        @NameInMap("Alpha")
        public String alpha;

        @NameInMap("InputFile")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile inputFile;

        @NameInMap("Type")
        public String type;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark setAlpha(String alpha) {
            this.alpha = alpha;
            return this;
        }
        public String getAlpha() {
            return this.alpha;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark setInputFile(QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption extends TeaModel {
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

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption setKeyUri(String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public String getKeyUri() {
            return this.keyUri;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption setSkipCnt(String skipCnt) {
            this.skipCnt = skipCnt;
            return this;
        }
        public String getSkipCnt() {
            return this.skipCnt;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS extends TeaModel {
        @NameInMap("Md5Support")
        public Boolean md5Support;

        @NameInMap("SizeSupport")
        public Boolean sizeSupport;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupport extends TeaModel {
        @NameInMap("TS")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS TS;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupport build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupport self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupport();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupport setTS(QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS TS) {
            this.TS = TS;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupportTS getTS() {
            return this.TS;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("MergeURL")
        public String mergeURL;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Start")
        public String start;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeList extends TeaModel {
        @NameInMap("Merge")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge> merge;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeList self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeList setMerge(java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge> merge) {
            this.merge = merge;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeListMerge> getMerge() {
            return this.merge;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif extends TeaModel {
        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        @NameInMap("Loop")
        public String loop;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigSegment self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif gif;

        @NameInMap("Segment")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigSegment segment;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig setGif(QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigGif getGif() {
            return this.gif;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig setSegment(QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat extends TeaModel {
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

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
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

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamList self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamList setAudioStream(java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamList self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        @NameInMap("PreloadTime")
        public String preloadTime;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
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
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

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

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setNetworkCost(QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamList self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamList setVideoStream(java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams extends TeaModel {
        @NameInMap("AudioStreamList")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        @NameInMap("VideoStreamList")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamList videoStreamList;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams setAudioStreamList(QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams setSubtitleStreamList(QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams setVideoStreamList(QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("Format")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("Streams")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams streams;

        @NameInMap("Width")
        public String width;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setFormat(QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesFormat getFormat() {
            return this.format;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setStreams(QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputPropertiesStreams getStreams() {
            return this.streams;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("Input")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput input;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle setInput(QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput input) {
            this.input = input;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput getInput() {
            return this.input;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleList self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleList setExtSubtitle(java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle) {
            this.extSubtitle = extSubtitle;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleListSubtitle extends TeaModel {
        @NameInMap("Map")
        public String map;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleListSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleListSubtitle self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleListSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleListSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleListSubtitle> subtitle;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleList self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleList setSubtitle(java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleListSubtitle> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleListSubtitle> getSubtitle() {
            return this.subtitle;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig extends TeaModel {
        @NameInMap("ExtSubtitleList")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleList extSubtitleList;

        @NameInMap("SubtitleList")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleList subtitleList;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig setExtSubtitleList(QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleList extSubtitleList) {
            this.extSubtitleList = extSubtitleList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig setSubtitleList(QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleList subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfigSubtitleList getSubtitleList() {
            return this.subtitleList;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputSuperReso extends TeaModel {
        @NameInMap("IsHalfSample")
        public String isHalfSample;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputSuperReso build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputSuperReso self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputSuperReso();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSuperReso setIsHalfSample(String isHalfSample) {
            this.isHalfSample = isHalfSample;
            return this;
        }
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig extends TeaModel {
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

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("BitrateBnd")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd bitrateBnd;

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

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setBitrateBnd(QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark extends TeaModel {
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("Height")
        public String height;

        @NameInMap("InputFile")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile inputFile;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Type")
        public String type;

        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        @NameInMap("Width")
        public String width;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark setInputFile(QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark> waterMark;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkList self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkList setWaterMark(java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark> waterMark) {
            this.waterMark = waterMark;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkListWaterMark> getWaterMark() {
            return this.waterMark;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJobTranscodeOutput extends TeaModel {
        @NameInMap("Audio")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio audio;

        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        @NameInMap("Clip")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputClip clip;

        @NameInMap("Container")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputContainer container;

        @NameInMap("DeWatermark")
        public String deWatermark;

        @NameInMap("DigiWaterMark")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark digiWaterMark;

        @NameInMap("Encryption")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption encryption;

        @NameInMap("M3U8NonStandardSupport")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        @NameInMap("MergeList")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeList mergeList;

        @NameInMap("MuxConfig")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig muxConfig;

        @NameInMap("OutputFile")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile outputFile;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Properties")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties properties;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("SubtitleConfig")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig subtitleConfig;

        @NameInMap("SuperReso")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSuperReso superReso;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TransConfig")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig transConfig;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Video")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo video;

        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        @NameInMap("WaterMarkList")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkList waterMarkList;

        public static QueryComplexJobListResponseBodyJobListJobTranscodeOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJobTranscodeOutput self = new QueryComplexJobListResponseBodyJobListJobTranscodeOutput();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setAudio(QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio audio) {
            this.audio = audio;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputAudio getAudio() {
            return this.audio;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setAudioStreamMap(String audioStreamMap) {
            this.audioStreamMap = audioStreamMap;
            return this;
        }
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setClip(QueryComplexJobListResponseBodyJobListJobTranscodeOutputClip clip) {
            this.clip = clip;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputClip getClip() {
            return this.clip;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setContainer(QueryComplexJobListResponseBodyJobListJobTranscodeOutputContainer container) {
            this.container = container;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputContainer getContainer() {
            return this.container;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setDigiWaterMark(QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark digiWaterMark) {
            this.digiWaterMark = digiWaterMark;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputDigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setEncryption(QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputEncryption getEncryption() {
            return this.encryption;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setM3U8NonStandardSupport(QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setMergeList(QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMergeList getMergeList() {
            return this.mergeList;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setMuxConfig(QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setOutputFile(QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setProperties(QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties properties) {
            this.properties = properties;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputProperties getProperties() {
            return this.properties;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setSubtitleConfig(QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setSuperReso(QueryComplexJobListResponseBodyJobListJobTranscodeOutputSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputSuperReso getSuperReso() {
            return this.superReso;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setTransConfig(QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputTransConfig getTransConfig() {
            return this.transConfig;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setVideo(QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo video) {
            this.video = video;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputVideo getVideo() {
            return this.video;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput setWaterMarkList(QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutputWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

    }

    public static class QueryComplexJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ComplexEditingConfigs")
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigs complexEditingConfigs;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Inputs")
        public QueryComplexJobListResponseBodyJobListJobInputs inputs;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MNSMessageResult")
        public QueryComplexJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("Percent")
        public Long percent;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("transcodeOutput")
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput transcodeOutput;

        public static QueryComplexJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobListJob self = new QueryComplexJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryComplexJobListResponseBodyJobListJob setComplexEditingConfigs(QueryComplexJobListResponseBodyJobListJobComplexEditingConfigs complexEditingConfigs) {
            this.complexEditingConfigs = complexEditingConfigs;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobComplexEditingConfigs getComplexEditingConfigs() {
            return this.complexEditingConfigs;
        }

        public QueryComplexJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryComplexJobListResponseBodyJobListJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryComplexJobListResponseBodyJobListJob setInputs(QueryComplexJobListResponseBodyJobListJobInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobInputs getInputs() {
            return this.inputs;
        }

        public QueryComplexJobListResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryComplexJobListResponseBodyJobListJob setMNSMessageResult(QueryComplexJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QueryComplexJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryComplexJobListResponseBodyJobListJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public QueryComplexJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryComplexJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryComplexJobListResponseBodyJobListJob setTranscodeOutput(QueryComplexJobListResponseBodyJobListJobTranscodeOutput transcodeOutput) {
            this.transcodeOutput = transcodeOutput;
            return this;
        }
        public QueryComplexJobListResponseBodyJobListJobTranscodeOutput getTranscodeOutput() {
            return this.transcodeOutput;
        }

    }

    public static class QueryComplexJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryComplexJobListResponseBodyJobListJob> job;

        public static QueryComplexJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyJobList self = new QueryComplexJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyJobList setJob(java.util.List<QueryComplexJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryComplexJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryComplexJobListResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryComplexJobListResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryComplexJobListResponseBodyNonExistJobIds self = new QueryComplexJobListResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public QueryComplexJobListResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
