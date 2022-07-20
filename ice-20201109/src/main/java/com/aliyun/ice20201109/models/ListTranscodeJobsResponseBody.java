// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTranscodeJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListTranscodeJobsResponseBodyJobs> jobs;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static ListTranscodeJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeJobsResponseBody self = new ListTranscodeJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTranscodeJobsResponseBody setJobs(java.util.List<ListTranscodeJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListTranscodeJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListTranscodeJobsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListTranscodeJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTranscodeJobsResponseBodyJobsInputGroup extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static ListTranscodeJobsResponseBodyJobsInputGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsInputGroup self = new ListTranscodeJobsResponseBodyJobsInputGroup();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsInputGroup setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListTranscodeJobsResponseBodyJobsInputGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupOutput extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupOutput build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupOutput self = new ListTranscodeJobsResponseBodyJobsOutputGroupOutput();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline extends TeaModel {
        // 显示时长，秒数 或者 "ToEND"
        @NameInMap("Duration")
        public String duration;

        // 开始时间
        @NameInMap("Start")
        public String start;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams extends TeaModel {
        // 水印位置，x
        @NameInMap("Dx")
        public String dx;

        // 水印位置，y
        @NameInMap("Dy")
        public String dy;

        // 水印文件oss路径
        @NameInMap("File")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file;

        // 高
        @NameInMap("Height")
        public String height;

        // 参考位置: TopLeft, TopRight, BottomLeft, BottomRight  default: TopLeft
        @NameInMap("ReferPos")
        public String referPos;

        // 显示时间设置
        @NameInMap("Timeline")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        // 宽
        @NameInMap("Width")
        public String width;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams setFile(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile getFile() {
            return this.file;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams setTimeline(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline getTimeline() {
            return this.timeline;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks setOverwriteParams(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams extends TeaModel {
        // 文件 encoding 格式
        @NameInMap("CharEnc")
        public String charEnc;

        // 字幕文件
        @NameInMap("File")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile file;

        // 字幕文件格式
        @NameInMap("Format")
        public String format;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams setFile(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile getFile() {
            return this.file;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles setOverwriteParams(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams extends TeaModel {
        // 根据输出视频大小调整字体 size。 true / false, default: false
        @NameInMap("Adaptive")
        public String adaptive;

        // 边框颜色
        @NameInMap("BorderColor")
        public String borderColor;

        // 边框宽度
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        // 水印文本，不需要 base64 encode，字符串需要 utf-8 编码
        @NameInMap("Content")
        public String content;

        // 透明度
        @NameInMap("FontAlpha")
        public String fontAlpha;

        // 颜色
        @NameInMap("FontColor")
        public String fontColor;

        // 字体
        @NameInMap("FontName")
        public String fontName;

        // 字体大小
        @NameInMap("FontSize")
        public Integer fontSize;

        // 水印位置，距离左边距离
        @NameInMap("Left")
        public String left;

        // 水印位置，距离上边距离
        @NameInMap("Top")
        public String top;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setAdaptive(String adaptive) {
            this.adaptive = adaptive;
            return this;
        }
        public String getAdaptive() {
            return this.adaptive;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setFontAlpha(String fontAlpha) {
            this.fontAlpha = fontAlpha;
            return this;
        }
        public String getFontAlpha() {
            return this.fontAlpha;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks setOverwriteParams(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume extends TeaModel {
        // 目标音量
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        // 音量范围
        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        // 音量调整方式
        @NameInMap("Method")
        public String method;

        // 最大峰值
        @NameInMap("TruePeak")
        public String truePeak;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio extends TeaModel {
        // 输出文件的音频码率。
        @NameInMap("Bitrate")
        public String bitrate;

        // 声道数。
        @NameInMap("Channels")
        public String channels;

        // 音频编解码格式，AAC、MP3、VORBIS、FLAC。
        @NameInMap("Codec")
        public String codec;

        // 音频编码预置。
        @NameInMap("Profile")
        public String profile;

        // 是否删除音频流。
        @NameInMap("Remove")
        public String remove;

        // 采样率。
        @NameInMap("Samplerate")
        public String samplerate;

        // 音量控制
        @NameInMap("Volume")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume volume;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio setVolume(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer extends TeaModel {
        // 容器格式
        @NameInMap("Format")
        public String format;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment extends TeaModel {
        // 切片时长
        @NameInMap("Duration")
        public String duration;

        // 强制切片时间点
        @NameInMap("ForceSegTime")
        public String forceSegTime;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment setForceSegTime(String forceSegTime) {
            this.forceSegTime = forceSegTime;
            return this;
        }
        public String getForceSegTime() {
            return this.forceSegTime;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig extends TeaModel {
        // 切片设置
        @NameInMap("Segment")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig setSegment(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo extends TeaModel {
        @NameInMap("AbrMax")
        public String abrMax;

        // 视频平均码率。
        @NameInMap("Bitrate")
        public String bitrate;

        // 缓冲区大小
        @NameInMap("Bufsize")
        public String bufsize;

        // 编码格式
        @NameInMap("Codec")
        public String codec;

        // 码率-质量控制因子。
        @NameInMap("Crf")
        public String crf;

        // 视频画面裁切
        @NameInMap("Crop")
        public String crop;

        // 帧率。
        @NameInMap("Fps")
        public String fps;

        // 关键帧间最大帧数。
        @NameInMap("Gop")
        public String gop;

        // 高。
        @NameInMap("Height")
        public String height;

        // 是否开启横竖屏自适应（即：长短边模式）
        @NameInMap("LongShortMode")
        public String longShortMode;

        // 视频码率峰值
        @NameInMap("Maxrate")
        public String maxrate;

        // 视频贴黑边
        @NameInMap("Pad")
        public String pad;

        // 视频颜色格式。
        @NameInMap("PixFmt")
        public String pixFmt;

        // 只有H264支持该参数
        @NameInMap("Preset")
        public String preset;

        // 编码级别。
        @NameInMap("Profile")
        public String profile;

        // 是否去掉视频
        @NameInMap("Remove")
        public String remove;

        // 扫描模式。
        @NameInMap("ScanMode")
        public String scanMode;

        // 宽。
        @NameInMap("Width")
        public String width;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setAbrMax(String abrMax) {
            this.abrMax = abrMax;
            return this;
        }
        public String getAbrMax() {
            return this.abrMax;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams extends TeaModel {
        // audio 设置
        @NameInMap("Audio")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio;

        // 封装格式设置
        @NameInMap("Container")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer container;

        // 封装设置
        @NameInMap("MuxConfig")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        // video 设置
        @NameInMap("Video")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo video;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams setAudio(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio) {
            this.audio = audio;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio getAudio() {
            return this.audio;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams setContainer(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer container) {
            this.container = container;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer getContainer() {
            return this.container;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams setMuxConfig(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams setVideo(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo video) {
            this.video = video;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsVideo getVideo() {
            return this.video;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode setOverwriteParams(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig extends TeaModel {
        // 图片水印配置
        @NameInMap("ImageWatermarks")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks> imageWatermarks;

        // 字幕压制配置
        @NameInMap("Subtitles")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles> subtitles;

        // 文字水印配置
        @NameInMap("TextWatermarks")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks> textWatermarks;

        // 转码配置
        @NameInMap("Transcode")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode transcode;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig setImageWatermarks(java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks> imageWatermarks) {
            this.imageWatermarks = imageWatermarks;
            return this;
        }
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig setSubtitles(java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles> getSubtitles() {
            return this.subtitles;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig setTextWatermarks(java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks> textWatermarks) {
            this.textWatermarks = textWatermarks;
            return this;
        }
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig setTranscode(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode transcode) {
            this.transcode = transcode;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode getTranscode() {
            return this.transcode;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroup extends TeaModel {
        // 输出媒体配置
        @NameInMap("Output")
        public ListTranscodeJobsResponseBodyJobsOutputGroupOutput output;

        // 任务处理配置
        @NameInMap("ProcessConfig")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig processConfig;

        public static ListTranscodeJobsResponseBodyJobsOutputGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroup self = new ListTranscodeJobsResponseBodyJobsOutputGroup();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroup setOutput(ListTranscodeJobsResponseBodyJobsOutputGroupOutput output) {
            this.output = output;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupOutput getOutput() {
            return this.output;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroup setProcessConfig(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig processConfig) {
            this.processConfig = processConfig;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig getProcessConfig() {
            return this.processConfig;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsScheduleConfig extends TeaModel {
        // 管道 id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 任务优先级，取值范围：1~10
        @NameInMap("Priority")
        public Integer priority;

        public static ListTranscodeJobsResponseBodyJobsScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsScheduleConfig self = new ListTranscodeJobsResponseBodyJobsScheduleConfig();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListTranscodeJobsResponseBodyJobsScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobs extends TeaModel {
        // 任务创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 任务结束时间
        @NameInMap("FinishTime")
        public String finishTime;

        // 任务输入组 (目前只支持单个输入)
        @NameInMap("InputGroup")
        public java.util.List<ListTranscodeJobsResponseBodyJobsInputGroup> inputGroup;

        // 子任务数量
        @NameInMap("JobCount")
        public Integer jobCount;

        // 任务名
        @NameInMap("Name")
        public String name;

        // 任务输出组
        @NameInMap("OutputGroup")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroup> outputGroup;

        // 主任务 id
        @NameInMap("ParentJobId")
        public String parentJobId;

        // 任务完成百分比
        @NameInMap("Percent")
        public Integer percent;

        // 提交任务时请求 id
        @NameInMap("RequestId")
        public String requestId;

        // 任务调度配置
        @NameInMap("ScheduleConfig")
        public ListTranscodeJobsResponseBodyJobsScheduleConfig scheduleConfig;

        // 任务状态 Success: 有子任务成功, Fail: 所有子任务失败
        @NameInMap("Status")
        public String status;

        // 任务提交时间
        @NameInMap("SubmitTime")
        public String submitTime;

        // 任务来源 - API, WorkFlow, Console
        @NameInMap("TriggerSource")
        public String triggerSource;

        // 用户数据
        @NameInMap("UserData")
        public String userData;

        public static ListTranscodeJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobs self = new ListTranscodeJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTranscodeJobsResponseBodyJobs setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListTranscodeJobsResponseBodyJobs setInputGroup(java.util.List<ListTranscodeJobsResponseBodyJobsInputGroup> inputGroup) {
            this.inputGroup = inputGroup;
            return this;
        }
        public java.util.List<ListTranscodeJobsResponseBodyJobsInputGroup> getInputGroup() {
            return this.inputGroup;
        }

        public ListTranscodeJobsResponseBodyJobs setJobCount(Integer jobCount) {
            this.jobCount = jobCount;
            return this;
        }
        public Integer getJobCount() {
            return this.jobCount;
        }

        public ListTranscodeJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTranscodeJobsResponseBodyJobs setOutputGroup(java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroup> outputGroup) {
            this.outputGroup = outputGroup;
            return this;
        }
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroup> getOutputGroup() {
            return this.outputGroup;
        }

        public ListTranscodeJobsResponseBodyJobs setParentJobId(String parentJobId) {
            this.parentJobId = parentJobId;
            return this;
        }
        public String getParentJobId() {
            return this.parentJobId;
        }

        public ListTranscodeJobsResponseBodyJobs setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListTranscodeJobsResponseBodyJobs setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListTranscodeJobsResponseBodyJobs setScheduleConfig(ListTranscodeJobsResponseBodyJobsScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public ListTranscodeJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTranscodeJobsResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListTranscodeJobsResponseBodyJobs setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public ListTranscodeJobsResponseBodyJobs setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
