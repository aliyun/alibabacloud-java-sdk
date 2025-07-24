// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAutoClipsTaskInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAutoClipsTaskInfoResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAutoClipsTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoClipsTaskInfoResponseBody self = new GetAutoClipsTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoClipsTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutoClipsTaskInfoResponseBody setData(GetAutoClipsTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoClipsTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public GetAutoClipsTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAutoClipsTaskInfoResponseBodyDataColorWords extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>CS0002-000008</p>
         */
        @NameInMap("EffectColorStyle")
        public String effectColorStyle;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TimelineIn")
        public Integer timelineIn;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimelineOut")
        public Integer timelineOut;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Y")
        public Float y;

        public static GetAutoClipsTaskInfoResponseBodyDataColorWords build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataColorWords self = new GetAutoClipsTaskInfoResponseBodyDataColorWords();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataColorWords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAutoClipsTaskInfoResponseBodyDataColorWords setEffectColorStyle(String effectColorStyle) {
            this.effectColorStyle = effectColorStyle;
            return this;
        }
        public String getEffectColorStyle() {
            return this.effectColorStyle;
        }

        public GetAutoClipsTaskInfoResponseBodyDataColorWords setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public GetAutoClipsTaskInfoResponseBodyDataColorWords setTimelineIn(Integer timelineIn) {
            this.timelineIn = timelineIn;
            return this;
        }
        public Integer getTimelineIn() {
            return this.timelineIn;
        }

        public GetAutoClipsTaskInfoResponseBodyDataColorWords setTimelineOut(Integer timelineOut) {
            this.timelineOut = timelineOut;
            return this;
        }
        public Integer getTimelineOut() {
            return this.timelineOut;
        }

        public GetAutoClipsTaskInfoResponseBodyDataColorWords setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public GetAutoClipsTaskInfoResponseBodyDataColorWords setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class GetAutoClipsTaskInfoResponseBodyDataTimelinesClips extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20774ebd9abc71ef80486632b68f0102</p>
         */
        @NameInMap("ClipId")
        public String clipId;

        @NameInMap("ContentInner")
        public String contentInner;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("In")
        public Integer in;

        @NameInMap("InEx")
        public Float inEx;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Out")
        public Integer out;

        @NameInMap("OutEx")
        public Float outEx;

        /**
         * <strong>example:</strong>
         * <p>20774ebd9abc71ef80486632b68f0102</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        /**
         * <strong>example:</strong>
         * <p>123.mp4</p>
         */
        @NameInMap("VideoName")
        public String videoName;

        public static GetAutoClipsTaskInfoResponseBodyDataTimelinesClips build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataTimelinesClips self = new GetAutoClipsTaskInfoResponseBodyDataTimelinesClips();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelinesClips setClipId(String clipId) {
            this.clipId = clipId;
            return this;
        }
        public String getClipId() {
            return this.clipId;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelinesClips setContentInner(String contentInner) {
            this.contentInner = contentInner;
            return this;
        }
        public String getContentInner() {
            return this.contentInner;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelinesClips setIn(Integer in) {
            this.in = in;
            return this;
        }
        public Integer getIn() {
            return this.in;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelinesClips setInEx(Float inEx) {
            this.inEx = inEx;
            return this;
        }
        public Float getInEx() {
            return this.inEx;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelinesClips setOut(Integer out) {
            this.out = out;
            return this;
        }
        public Integer getOut() {
            return this.out;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelinesClips setOutEx(Float outEx) {
            this.outEx = outEx;
            return this;
        }
        public Float getOutEx() {
            return this.outEx;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelinesClips setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelinesClips setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

    }

    public static class GetAutoClipsTaskInfoResponseBodyDataTimelines extends TeaModel {
        @NameInMap("Clips")
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataTimelinesClips> clips;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>20774ebd9abc71ef80486632b68f0102</p>
         */
        @NameInMap("TimelineId")
        public String timelineId;

        public static GetAutoClipsTaskInfoResponseBodyDataTimelines build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataTimelines self = new GetAutoClipsTaskInfoResponseBodyDataTimelines();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelines setClips(java.util.List<GetAutoClipsTaskInfoResponseBodyDataTimelinesClips> clips) {
            this.clips = clips;
            return this;
        }
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataTimelinesClips> getClips() {
            return this.clips;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelines setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAutoClipsTaskInfoResponseBodyDataTimelines setTimelineId(String timelineId) {
            this.timelineId = timelineId;
            return this;
        }
        public String getTimelineId() {
            return this.timelineId;
        }

    }

    public static class GetAutoClipsTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("ColorWords")
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataColorWords> colorWords;

        @NameInMap("Content")
        public String content;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("MediaCloudTimeline")
        public String mediaCloudTimeline;

        @NameInMap("MusicStyle")
        public String musicStyle;

        /**
         * <strong>example:</strong>
         * <p><a href="http://music.mp4">http://music.mp4</a></p>
         */
        @NameInMap("MusicUrl")
        public String musicUrl;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MusicVolume")
        public Integer musicVolume;

        /**
         * <strong>example:</strong>
         * <p><a href="http://output.mp4">http://output.mp4</a></p>
         */
        @NameInMap("OutputVideoUrl")
        public String outputVideoUrl;

        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>clips</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SubtitleFontSize")
        public Integer subtitleFontSize;

        /**
         * <strong>example:</strong>
         * <p>e5a1a59c82d0454fad6454e8a04d0093</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Timelines")
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataTimelines> timelines;

        @NameInMap("VoiceStyle")
        public String voiceStyle;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("VoiceVolume")
        public Integer voiceVolume;

        public static GetAutoClipsTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyData self = new GetAutoClipsTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyData setColorWords(java.util.List<GetAutoClipsTaskInfoResponseBodyDataColorWords> colorWords) {
            this.colorWords = colorWords;
            return this;
        }
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataColorWords> getColorWords() {
            return this.colorWords;
        }

        public GetAutoClipsTaskInfoResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAutoClipsTaskInfoResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetAutoClipsTaskInfoResponseBodyData setMediaCloudTimeline(String mediaCloudTimeline) {
            this.mediaCloudTimeline = mediaCloudTimeline;
            return this;
        }
        public String getMediaCloudTimeline() {
            return this.mediaCloudTimeline;
        }

        public GetAutoClipsTaskInfoResponseBodyData setMusicStyle(String musicStyle) {
            this.musicStyle = musicStyle;
            return this;
        }
        public String getMusicStyle() {
            return this.musicStyle;
        }

        public GetAutoClipsTaskInfoResponseBodyData setMusicUrl(String musicUrl) {
            this.musicUrl = musicUrl;
            return this;
        }
        public String getMusicUrl() {
            return this.musicUrl;
        }

        public GetAutoClipsTaskInfoResponseBodyData setMusicVolume(Integer musicVolume) {
            this.musicVolume = musicVolume;
            return this;
        }
        public Integer getMusicVolume() {
            return this.musicVolume;
        }

        public GetAutoClipsTaskInfoResponseBodyData setOutputVideoUrl(String outputVideoUrl) {
            this.outputVideoUrl = outputVideoUrl;
            return this;
        }
        public String getOutputVideoUrl() {
            return this.outputVideoUrl;
        }

        public GetAutoClipsTaskInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAutoClipsTaskInfoResponseBodyData setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public GetAutoClipsTaskInfoResponseBodyData setSubtitleFontSize(Integer subtitleFontSize) {
            this.subtitleFontSize = subtitleFontSize;
            return this;
        }
        public Integer getSubtitleFontSize() {
            return this.subtitleFontSize;
        }

        public GetAutoClipsTaskInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAutoClipsTaskInfoResponseBodyData setTimelines(java.util.List<GetAutoClipsTaskInfoResponseBodyDataTimelines> timelines) {
            this.timelines = timelines;
            return this;
        }
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataTimelines> getTimelines() {
            return this.timelines;
        }

        public GetAutoClipsTaskInfoResponseBodyData setVoiceStyle(String voiceStyle) {
            this.voiceStyle = voiceStyle;
            return this;
        }
        public String getVoiceStyle() {
            return this.voiceStyle;
        }

        public GetAutoClipsTaskInfoResponseBodyData setVoiceVolume(Integer voiceVolume) {
            this.voiceVolume = voiceVolume;
            return this;
        }
        public Integer getVoiceVolume() {
            return this.voiceVolume;
        }

    }

}
