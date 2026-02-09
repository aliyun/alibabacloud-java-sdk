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

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public GetAutoClipsTaskInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAutoClipsTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoClipsTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoClipsTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime extends TeaModel {
        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("MillSecond")
        public Integer millSecond;

        @NameInMap("Minute")
        public Integer minute;

        @NameInMap("Second")
        public Integer second;

        public static GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime self = new GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime setMillSecond(Integer millSecond) {
            this.millSecond = millSecond;
            return this;
        }
        public Integer getMillSecond() {
            return this.millSecond;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime setSecond(Integer second) {
            this.second = second;
            return this;
        }
        public Integer getSecond() {
            return this.second;
        }

    }

    public static class GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime extends TeaModel {
        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("MillSecond")
        public Integer millSecond;

        @NameInMap("Minute")
        public Integer minute;

        @NameInMap("Second")
        public Integer second;

        public static GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime self = new GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime setMillSecond(Integer millSecond) {
            this.millSecond = millSecond;
            return this;
        }
        public Integer getMillSecond() {
            return this.millSecond;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime setSecond(Integer second) {
            this.second = second;
            return this;
        }
        public Integer getSecond() {
            return this.second;
        }

    }

    public static class GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos extends TeaModel {
        @NameInMap("AnalysisContent")
        public String analysisContent;

        @NameInMap("EndTime")
        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime endTime;

        @NameInMap("StartTime")
        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime startTime;

        public static GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos self = new GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos setAnalysisContent(String analysisContent) {
            this.analysisContent = analysisContent;
            return this;
        }
        public String getAnalysisContent() {
            return this.analysisContent;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos setEndTime(GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime endTime) {
            this.endTime = endTime;
            return this;
        }
        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosEndTime getEndTime() {
            return this.endTime;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos setStartTime(GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime startTime) {
            this.startTime = startTime;
            return this;
        }
        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfosStartTime getStartTime() {
            return this.startTime;
        }

    }

    public static class GetAutoClipsTaskInfoResponseBodyDataAnalysisResults extends TeaModel {
        @NameInMap("LensInfos")
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos> lensInfos;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("MediaUrl")
        public String mediaUrl;

        public static GetAutoClipsTaskInfoResponseBodyDataAnalysisResults build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataAnalysisResults self = new GetAutoClipsTaskInfoResponseBodyDataAnalysisResults();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResults setLensInfos(java.util.List<GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos> lensInfos) {
            this.lensInfos = lensInfos;
            return this;
        }
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataAnalysisResultsLensInfos> getLensInfos() {
            return this.lensInfos;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResults setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResults setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public GetAutoClipsTaskInfoResponseBodyDataAnalysisResults setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }
        public String getMediaUrl() {
            return this.mediaUrl;
        }

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

    public static class GetAutoClipsTaskInfoResponseBodyDataReferenceVideo extends TeaModel {
        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("VideoName")
        public String videoName;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetAutoClipsTaskInfoResponseBodyDataReferenceVideo build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataReferenceVideo self = new GetAutoClipsTaskInfoResponseBodyDataReferenceVideo();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataReferenceVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetAutoClipsTaskInfoResponseBodyDataReferenceVideo setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public GetAutoClipsTaskInfoResponseBodyDataReferenceVideo setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class GetAutoClipsTaskInfoResponseBodyDataSourceVideos extends TeaModel {
        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("VideoName")
        public String videoName;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetAutoClipsTaskInfoResponseBodyDataSourceVideos build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataSourceVideos self = new GetAutoClipsTaskInfoResponseBodyDataSourceVideos();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataSourceVideos setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetAutoClipsTaskInfoResponseBodyDataSourceVideos setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public GetAutoClipsTaskInfoResponseBodyDataSourceVideos setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class GetAutoClipsTaskInfoResponseBodyDataStickers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DyncFrames")
        public Integer dyncFrames;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimelineIn")
        public Integer timelineIn;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.gif">http://xxx/xxx.gif</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Width")
        public Integer width;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Y")
        public Float y;

        public static GetAutoClipsTaskInfoResponseBodyDataStickers build(java.util.Map<String, ?> map) throws Exception {
            GetAutoClipsTaskInfoResponseBodyDataStickers self = new GetAutoClipsTaskInfoResponseBodyDataStickers();
            return TeaModel.build(map, self);
        }

        public GetAutoClipsTaskInfoResponseBodyDataStickers setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetAutoClipsTaskInfoResponseBodyDataStickers setDyncFrames(Integer dyncFrames) {
            this.dyncFrames = dyncFrames;
            return this;
        }
        public Integer getDyncFrames() {
            return this.dyncFrames;
        }

        public GetAutoClipsTaskInfoResponseBodyDataStickers setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetAutoClipsTaskInfoResponseBodyDataStickers setTimelineIn(Integer timelineIn) {
            this.timelineIn = timelineIn;
            return this;
        }
        public Integer getTimelineIn() {
            return this.timelineIn;
        }

        public GetAutoClipsTaskInfoResponseBodyDataStickers setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetAutoClipsTaskInfoResponseBodyDataStickers setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public GetAutoClipsTaskInfoResponseBodyDataStickers setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public GetAutoClipsTaskInfoResponseBodyDataStickers setY(Float y) {
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
        @NameInMap("AnalysisResults")
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataAnalysisResults> analysisResults;

        @NameInMap("CloseMusic")
        public Boolean closeMusic;

        @NameInMap("CloseSubtitle")
        public Boolean closeSubtitle;

        @NameInMap("CloseVoice")
        public Boolean closeVoice;

        @NameInMap("ClosingCreditsUrl")
        public String closingCreditsUrl;

        @NameInMap("ColorWords")
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataColorWords> colorWords;

        @NameInMap("Content")
        public String content;

        @NameInMap("CustomVoiceStyle")
        public String customVoiceStyle;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.mp4">http://xxx/xxx.mp4</a></p>
         */
        @NameInMap("CustomVoiceUrl")
        public String customVoiceUrl;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CustomVoiceVolume")
        public Integer customVoiceVolume;

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

        @NameInMap("OpeningCreditsUrl")
        public String openingCreditsUrl;

        @NameInMap("OutputVideoFileKey")
        public String outputVideoFileKey;

        /**
         * <strong>example:</strong>
         * <p><a href="http://output.mp4">http://output.mp4</a></p>
         */
        @NameInMap("OutputVideoUrl")
        public String outputVideoUrl;

        @NameInMap("ReferenceVideo")
        public GetAutoClipsTaskInfoResponseBodyDataReferenceVideo referenceVideo;

        @NameInMap("SourceVideos")
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataSourceVideos> sourceVideos;

        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>clips</p>
         */
        @NameInMap("Step")
        public String step;

        @NameInMap("Stickers")
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataStickers> stickers;

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

        public GetAutoClipsTaskInfoResponseBodyData setAnalysisResults(java.util.List<GetAutoClipsTaskInfoResponseBodyDataAnalysisResults> analysisResults) {
            this.analysisResults = analysisResults;
            return this;
        }
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataAnalysisResults> getAnalysisResults() {
            return this.analysisResults;
        }

        public GetAutoClipsTaskInfoResponseBodyData setCloseMusic(Boolean closeMusic) {
            this.closeMusic = closeMusic;
            return this;
        }
        public Boolean getCloseMusic() {
            return this.closeMusic;
        }

        public GetAutoClipsTaskInfoResponseBodyData setCloseSubtitle(Boolean closeSubtitle) {
            this.closeSubtitle = closeSubtitle;
            return this;
        }
        public Boolean getCloseSubtitle() {
            return this.closeSubtitle;
        }

        public GetAutoClipsTaskInfoResponseBodyData setCloseVoice(Boolean closeVoice) {
            this.closeVoice = closeVoice;
            return this;
        }
        public Boolean getCloseVoice() {
            return this.closeVoice;
        }

        public GetAutoClipsTaskInfoResponseBodyData setClosingCreditsUrl(String closingCreditsUrl) {
            this.closingCreditsUrl = closingCreditsUrl;
            return this;
        }
        public String getClosingCreditsUrl() {
            return this.closingCreditsUrl;
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

        public GetAutoClipsTaskInfoResponseBodyData setCustomVoiceStyle(String customVoiceStyle) {
            this.customVoiceStyle = customVoiceStyle;
            return this;
        }
        public String getCustomVoiceStyle() {
            return this.customVoiceStyle;
        }

        public GetAutoClipsTaskInfoResponseBodyData setCustomVoiceUrl(String customVoiceUrl) {
            this.customVoiceUrl = customVoiceUrl;
            return this;
        }
        public String getCustomVoiceUrl() {
            return this.customVoiceUrl;
        }

        public GetAutoClipsTaskInfoResponseBodyData setCustomVoiceVolume(Integer customVoiceVolume) {
            this.customVoiceVolume = customVoiceVolume;
            return this;
        }
        public Integer getCustomVoiceVolume() {
            return this.customVoiceVolume;
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

        public GetAutoClipsTaskInfoResponseBodyData setOpeningCreditsUrl(String openingCreditsUrl) {
            this.openingCreditsUrl = openingCreditsUrl;
            return this;
        }
        public String getOpeningCreditsUrl() {
            return this.openingCreditsUrl;
        }

        public GetAutoClipsTaskInfoResponseBodyData setOutputVideoFileKey(String outputVideoFileKey) {
            this.outputVideoFileKey = outputVideoFileKey;
            return this;
        }
        public String getOutputVideoFileKey() {
            return this.outputVideoFileKey;
        }

        public GetAutoClipsTaskInfoResponseBodyData setOutputVideoUrl(String outputVideoUrl) {
            this.outputVideoUrl = outputVideoUrl;
            return this;
        }
        public String getOutputVideoUrl() {
            return this.outputVideoUrl;
        }

        public GetAutoClipsTaskInfoResponseBodyData setReferenceVideo(GetAutoClipsTaskInfoResponseBodyDataReferenceVideo referenceVideo) {
            this.referenceVideo = referenceVideo;
            return this;
        }
        public GetAutoClipsTaskInfoResponseBodyDataReferenceVideo getReferenceVideo() {
            return this.referenceVideo;
        }

        public GetAutoClipsTaskInfoResponseBodyData setSourceVideos(java.util.List<GetAutoClipsTaskInfoResponseBodyDataSourceVideos> sourceVideos) {
            this.sourceVideos = sourceVideos;
            return this;
        }
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataSourceVideos> getSourceVideos() {
            return this.sourceVideos;
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

        public GetAutoClipsTaskInfoResponseBodyData setStickers(java.util.List<GetAutoClipsTaskInfoResponseBodyDataStickers> stickers) {
            this.stickers = stickers;
            return this;
        }
        public java.util.List<GetAutoClipsTaskInfoResponseBodyDataStickers> getStickers() {
            return this.stickers;
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
