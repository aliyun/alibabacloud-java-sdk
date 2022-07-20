// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // TranscodeParentJobWithSubJobDTO
    @NameInMap("TranscodeParentJob")
    public SubmitTranscodeJobResponseBodyTranscodeParentJob transcodeParentJob;

    public static SubmitTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobResponseBody self = new SubmitTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTranscodeJobResponseBody setTranscodeParentJob(SubmitTranscodeJobResponseBodyTranscodeParentJob transcodeParentJob) {
        this.transcodeParentJob = transcodeParentJob;
        return this;
    }
    public SubmitTranscodeJobResponseBodyTranscodeParentJob getTranscodeParentJob() {
        return this.transcodeParentJob;
    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup self = new SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline extends TeaModel {
        // 显示时长，秒数 或者 "ToEND"
        @NameInMap("Duration")
        public String duration;

        // 开始时间
        @NameInMap("Start")
        public String start;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams extends TeaModel {
        // 水印位置，x
        @NameInMap("Dx")
        public String dx;

        // 水印位置，y
        @NameInMap("Dy")
        public String dy;

        // 水印文件oss路径
        @NameInMap("File")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file;

        // 高
        @NameInMap("Height")
        public String height;

        // 参考位置: TopLeft, TopRight, BottomLeft, BottomRight  default: TopLeft
        @NameInMap("ReferPos")
        public String referPos;

        // 显示时间设置
        @NameInMap("Timeline")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        // 宽
        @NameInMap("Width")
        public String width;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setFile(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile getFile() {
            return this.file;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setTimeline(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline getTimeline() {
            return this.timeline;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks setOverwriteParams(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams extends TeaModel {
        // 文件 encoding 格式
        @NameInMap("CharEnc")
        public String charEnc;

        // 字幕文件
        @NameInMap("File")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile file;

        // 字幕文件格式
        @NameInMap("Format")
        public String format;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams setFile(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile getFile() {
            return this.file;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles setOverwriteParams(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setAdaptive(String adaptive) {
            this.adaptive = adaptive;
            return this;
        }
        public String getAdaptive() {
            return this.adaptive;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setFontAlpha(String fontAlpha) {
            this.fontAlpha = fontAlpha;
            return this;
        }
        public String getFontAlpha() {
            return this.fontAlpha;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks setOverwriteParams(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio extends TeaModel {
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
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume volume;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setVolume(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer extends TeaModel {
        // 容器格式
        @NameInMap("Format")
        public String format;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment extends TeaModel {
        // 切片时长
        @NameInMap("Duration")
        public String duration;

        // 强制切片时间点
        @NameInMap("ForceSegTime")
        public String forceSegTime;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment setForceSegTime(String forceSegTime) {
            this.forceSegTime = forceSegTime;
            return this;
        }
        public String getForceSegTime() {
            return this.forceSegTime;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig extends TeaModel {
        // 切片设置
        @NameInMap("Segment")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig setSegment(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setAbrMax(String abrMax) {
            this.abrMax = abrMax;
            return this;
        }
        public String getAbrMax() {
            return this.abrMax;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams extends TeaModel {
        // audio 设置
        @NameInMap("Audio")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio;

        // 封装格式设置
        @NameInMap("Container")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer container;

        // 封装设置
        @NameInMap("MuxConfig")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        // video 设置
        @NameInMap("Video")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo video;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams setAudio(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio) {
            this.audio = audio;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio getAudio() {
            return this.audio;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams setContainer(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer container) {
            this.container = container;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer getContainer() {
            return this.container;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams setMuxConfig(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams setVideo(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo video) {
            this.video = video;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo getVideo() {
            return this.video;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode setOverwriteParams(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig extends TeaModel {
        // 图片水印配置
        @NameInMap("ImageWatermarks")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks> imageWatermarks;

        // 字幕压制配置
        @NameInMap("Subtitles")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles> subtitles;

        // 文字水印配置
        @NameInMap("TextWatermarks")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks> textWatermarks;

        // 转码配置
        @NameInMap("Transcode")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode transcode;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setImageWatermarks(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks> imageWatermarks) {
            this.imageWatermarks = imageWatermarks;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setSubtitles(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles> getSubtitles() {
            return this.subtitles;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setTextWatermarks(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks> textWatermarks) {
            this.textWatermarks = textWatermarks;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setTranscode(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode transcode) {
            this.transcode = transcode;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode getTranscode() {
            return this.transcode;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup extends TeaModel {
        // 输出媒体配置
        @NameInMap("Output")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput output;

        // 任务处理配置
        @NameInMap("ProcessConfig")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig processConfig;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup self = new SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup setOutput(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput output) {
            this.output = output;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput getOutput() {
            return this.output;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup setProcessConfig(SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig processConfig) {
            this.processConfig = processConfig;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig getProcessConfig() {
            return this.processConfig;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig extends TeaModel {
        // 管道 id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 任务优先级，取值范围：1~10
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig self = new SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setAvgFps(String avgFps) {
            this.avgFps = avgFps;
            return this;
        }
        public String getAvgFps() {
            return this.avgFps;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setTimeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }
        public String getTimeBase() {
            return this.timeBase;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta extends TeaModel {
        // 音频流信息
        @NameInMap("AudioStreamInfoList")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList> audioStreamInfoList;

        // 基础文件信息
        @NameInMap("FileBasicInfo")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo fileBasicInfo;

        // 视频流信息
        @NameInMap("VideoStreamInfoList")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList> videoStreamInfoList;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta setAudioStreamInfoList(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta setFileBasicInfo(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta setVideoStreamInfoList(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline extends TeaModel {
        // 显示时长，秒数 或者 "ToEND"
        @NameInMap("Duration")
        public String duration;

        // 开始时间
        @NameInMap("Start")
        public String start;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams extends TeaModel {
        // 水印位置，x
        @NameInMap("Dx")
        public String dx;

        // 水印位置，y
        @NameInMap("Dy")
        public String dy;

        // 水印文件oss路径
        @NameInMap("File")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile file;

        // 高
        @NameInMap("Height")
        public String height;

        // 参考位置: TopLeft, TopRight, BottomLeft, BottomRight  default: TopLeft
        @NameInMap("ReferPos")
        public String referPos;

        // 显示时间设置
        @NameInMap("Timeline")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        // 宽
        @NameInMap("Width")
        public String width;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setFile(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile getFile() {
            return this.file;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setTimeline(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline getTimeline() {
            return this.timeline;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks setOverwriteParams(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams extends TeaModel {
        // 文件 encoding 格式
        @NameInMap("CharEnc")
        public String charEnc;

        // 字幕文件
        @NameInMap("File")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile file;

        // 字幕文件格式
        @NameInMap("Format")
        public String format;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams setFile(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile getFile() {
            return this.file;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles setOverwriteParams(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setAdaptive(String adaptive) {
            this.adaptive = adaptive;
            return this;
        }
        public String getAdaptive() {
            return this.adaptive;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setFontAlpha(String fontAlpha) {
            this.fontAlpha = fontAlpha;
            return this;
        }
        public String getFontAlpha() {
            return this.fontAlpha;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks setOverwriteParams(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio extends TeaModel {
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
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume volume;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setVolume(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer extends TeaModel {
        // 容器格式
        @NameInMap("Format")
        public String format;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment extends TeaModel {
        // 切片时长
        @NameInMap("Duration")
        public String duration;

        // 强制切片时间点
        @NameInMap("ForceSegTime")
        public String forceSegTime;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment setForceSegTime(String forceSegTime) {
            this.forceSegTime = forceSegTime;
            return this;
        }
        public String getForceSegTime() {
            return this.forceSegTime;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig extends TeaModel {
        // 切片设置
        @NameInMap("Segment")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig setSegment(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo extends TeaModel {
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

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setAbrMax(String abrMax) {
            this.abrMax = abrMax;
            return this;
        }
        public String getAbrMax() {
            return this.abrMax;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams extends TeaModel {
        // audio 设置
        @NameInMap("Audio")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio audio;

        // 封装格式设置
        @NameInMap("Container")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer container;

        // 封装设置
        @NameInMap("MuxConfig")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        // video 设置
        @NameInMap("Video")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo video;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setAudio(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio audio) {
            this.audio = audio;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio getAudio() {
            return this.audio;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setContainer(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer container) {
            this.container = container;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer getContainer() {
            return this.container;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setMuxConfig(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setVideo(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo video) {
            this.video = video;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo getVideo() {
            return this.video;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode setOverwriteParams(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig extends TeaModel {
        // 图片水印配置
        @NameInMap("ImageWatermarks")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks> imageWatermarks;

        // 字幕压制配置
        @NameInMap("Subtitles")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles> subtitles;

        // 文字水印配置
        @NameInMap("TextWatermarks")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks> textWatermarks;

        // 转码配置
        @NameInMap("Transcode")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode transcode;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setImageWatermarks(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks> imageWatermarks) {
            this.imageWatermarks = imageWatermarks;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setSubtitles(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles> getSubtitles() {
            return this.subtitles;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setTextWatermarks(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks> textWatermarks) {
            this.textWatermarks = textWatermarks;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setTranscode(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode transcode) {
            this.transcode = transcode;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode getTranscode() {
            return this.transcode;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig extends TeaModel {
        // 管道 id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 任务优先级，取值范围：1~10
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList extends TeaModel {
        // 任务创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 任务结束时间
        @NameInMap("FinishTime")
        public String finishTime;

        // 任务输入组 (目前只支持单个输入)
        @NameInMap("InputGroup")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup> inputGroup;

        // 子任务 id
        @NameInMap("JobId")
        public String jobId;

        // 子任务在整个任务中的索引号
        @NameInMap("JobIndex")
        public Integer jobIndex;

        // 任务名
        @NameInMap("Name")
        public String name;

        // 任务生成视频 media 信息
        @NameInMap("OutFileMeta")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta outFileMeta;

        // 输出媒体配置
        @NameInMap("Output")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput output;

        // 主任务 id
        @NameInMap("ParentJobId")
        public String parentJobId;

        // 转码处理配置
        @NameInMap("ProcessConfig")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig processConfig;

        // 请求 id
        @NameInMap("RequestId")
        public String requestId;

        // 任务调度信息
        @NameInMap("ScheduleConfig")
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig scheduleConfig;

        // 转码任务任务状态 - Init: 已提交, Processing: 转码中, Success: 转码成功, Fail: 转码失败, Deleted: 已删除
        @NameInMap("Status")
        public String status;

        // 任务提交结果
        @NameInMap("SubmitResultJson")
        public java.util.Map<String, ?> submitResultJson;

        // 任务提交时间
        @NameInMap("SubmitTime")
        public String submitTime;

        // 用户数据
        @NameInMap("UserData")
        public String userData;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList self = new SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setInputGroup(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup> inputGroup) {
            this.inputGroup = inputGroup;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup> getInputGroup() {
            return this.inputGroup;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setJobIndex(Integer jobIndex) {
            this.jobIndex = jobIndex;
            return this;
        }
        public Integer getJobIndex() {
            return this.jobIndex;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setOutFileMeta(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta outFileMeta) {
            this.outFileMeta = outFileMeta;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta getOutFileMeta() {
            return this.outFileMeta;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setOutput(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput output) {
            this.output = output;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput getOutput() {
            return this.output;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setParentJobId(String parentJobId) {
            this.parentJobId = parentJobId;
            return this;
        }
        public String getParentJobId() {
            return this.parentJobId;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setProcessConfig(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig processConfig) {
            this.processConfig = processConfig;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig getProcessConfig() {
            return this.processConfig;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setScheduleConfig(SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setSubmitResultJson(java.util.Map<String, ?> submitResultJson) {
            this.submitResultJson = submitResultJson;
            return this;
        }
        public java.util.Map<String, ?> getSubmitResultJson() {
            return this.submitResultJson;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class SubmitTranscodeJobResponseBodyTranscodeParentJob extends TeaModel {
        // 任务创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 任务结束时间
        @NameInMap("FinishTime")
        public String finishTime;

        // 任务输入组 (目前只支持单个输入)
        @NameInMap("InputGroup")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup> inputGroup;

        // 子任务数量
        @NameInMap("JobCount")
        public Integer jobCount;

        // 任务名
        @NameInMap("Name")
        public String name;

        // 任务输出组
        @NameInMap("OutputGroup")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup> outputGroup;

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
        public SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig scheduleConfig;

        // 任务状态 Success: 有子任务成功, Fail: 所有子任务失败
        @NameInMap("Status")
        public String status;

        // 任务提交时间
        @NameInMap("SubmitTime")
        public String submitTime;

        // 子任务列表
        @NameInMap("TranscodeJobList")
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList> transcodeJobList;

        // 任务来源 - API, WorkFlow, Console
        @NameInMap("TriggerSource")
        public String triggerSource;

        // 用户数据
        @NameInMap("UserData")
        public String userData;

        public static SubmitTranscodeJobResponseBodyTranscodeParentJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobResponseBodyTranscodeParentJob self = new SubmitTranscodeJobResponseBodyTranscodeParentJob();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setInputGroup(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup> inputGroup) {
            this.inputGroup = inputGroup;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobInputGroup> getInputGroup() {
            return this.inputGroup;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setJobCount(Integer jobCount) {
            this.jobCount = jobCount;
            return this;
        }
        public Integer getJobCount() {
            return this.jobCount;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setOutputGroup(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup> outputGroup) {
            this.outputGroup = outputGroup;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobOutputGroup> getOutputGroup() {
            return this.outputGroup;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setParentJobId(String parentJobId) {
            this.parentJobId = parentJobId;
            return this;
        }
        public String getParentJobId() {
            return this.parentJobId;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setScheduleConfig(SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public SubmitTranscodeJobResponseBodyTranscodeParentJobScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setTranscodeJobList(java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList> transcodeJobList) {
            this.transcodeJobList = transcodeJobList;
            return this;
        }
        public java.util.List<SubmitTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList> getTranscodeJobList() {
            return this.transcodeJobList;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public SubmitTranscodeJobResponseBodyTranscodeParentJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
