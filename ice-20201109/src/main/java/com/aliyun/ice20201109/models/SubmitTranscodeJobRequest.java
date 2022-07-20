// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobRequest extends TeaModel {
    // 任务输入组 (目前只支持一个)
    @NameInMap("InputGroup")
    public java.util.List<SubmitTranscodeJobRequestInputGroup> inputGroup;

    // 任务名字
    @NameInMap("Name")
    public String name;

    // 任务输出组
    @NameInMap("OutputGroup")
    public java.util.List<SubmitTranscodeJobRequestOutputGroup> outputGroup;

    // 任务调度信息
    @NameInMap("ScheduleConfig")
    public SubmitTranscodeJobRequestScheduleConfig scheduleConfig;

    // 用户数据
    @NameInMap("UserData")
    public String userData;

    public static SubmitTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobRequest self = new SubmitTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobRequest setInputGroup(java.util.List<SubmitTranscodeJobRequestInputGroup> inputGroup) {
        this.inputGroup = inputGroup;
        return this;
    }
    public java.util.List<SubmitTranscodeJobRequestInputGroup> getInputGroup() {
        return this.inputGroup;
    }

    public SubmitTranscodeJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitTranscodeJobRequest setOutputGroup(java.util.List<SubmitTranscodeJobRequestOutputGroup> outputGroup) {
        this.outputGroup = outputGroup;
        return this;
    }
    public java.util.List<SubmitTranscodeJobRequestOutputGroup> getOutputGroup() {
        return this.outputGroup;
    }

    public SubmitTranscodeJobRequest setScheduleConfig(SubmitTranscodeJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitTranscodeJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitTranscodeJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitTranscodeJobRequestInputGroup extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobRequestInputGroup build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestInputGroup self = new SubmitTranscodeJobRequestInputGroup();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestInputGroup setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobRequestInputGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupOutput extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobRequestOutputGroupOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupOutput self = new SubmitTranscodeJobRequestOutputGroupOutput();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobRequestOutputGroupOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile self = new SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline extends TeaModel {
        // 显示时长，秒数 或者 "ToEND"
        @NameInMap("Duration")
        public String duration;

        // 开始时间
        @NameInMap("Start")
        public String start;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline self = new SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams extends TeaModel {
        // 水印位置，x
        @NameInMap("Dx")
        public String dx;

        // 水印位置，y
        @NameInMap("Dy")
        public String dy;

        // 水印文件oss路径
        @NameInMap("File")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file;

        // 高
        @NameInMap("Height")
        public String height;

        // 参考位置: TopLeft, TopRight, BottomLeft, BottomRight  default: TopLeft
        @NameInMap("ReferPos")
        public String referPos;

        // 显示时间设置
        @NameInMap("Timeline")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        // 宽
        @NameInMap("Width")
        public String width;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams self = new SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams setFile(SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile getFile() {
            return this.file;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams setTimeline(SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline getTimeline() {
            return this.timeline;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks self = new SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks setOverwriteParams(SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile extends TeaModel {
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile self = new SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams extends TeaModel {
        // 文件 encoding 格式
        @NameInMap("CharEnc")
        public String charEnc;

        // 字幕文件
        @NameInMap("File")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile file;

        // 字幕文件格式
        @NameInMap("Format")
        public String format;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams self = new SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams setFile(SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile getFile() {
            return this.file;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles self = new SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles setOverwriteParams(SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams extends TeaModel {
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

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setAdaptive(String adaptive) {
            this.adaptive = adaptive;
            return this;
        }
        public String getAdaptive() {
            return this.adaptive;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setFontAlpha(String fontAlpha) {
            this.fontAlpha = fontAlpha;
            return this;
        }
        public String getFontAlpha() {
            return this.fontAlpha;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks setOverwriteParams(SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume extends TeaModel {
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

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio extends TeaModel {
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
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume volume;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio setVolume(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer extends TeaModel {
        // 容器格式
        @NameInMap("Format")
        public String format;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment extends TeaModel {
        // 切片时长
        @NameInMap("Duration")
        public String duration;

        // 强制切片时间点
        @NameInMap("ForceSegTime")
        public String forceSegTime;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment setForceSegTime(String forceSegTime) {
            this.forceSegTime = forceSegTime;
            return this;
        }
        public String getForceSegTime() {
            return this.forceSegTime;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig extends TeaModel {
        // 切片设置
        @NameInMap("Segment")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig setSegment(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo extends TeaModel {
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

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setAbrMax(String abrMax) {
            this.abrMax = abrMax;
            return this;
        }
        public String getAbrMax() {
            return this.abrMax;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams extends TeaModel {
        // audio 设置
        @NameInMap("Audio")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio;

        // 封装格式设置
        @NameInMap("Container")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer container;

        // 封装设置
        @NameInMap("MuxConfig")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        // video 设置
        @NameInMap("Video")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo video;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams setAudio(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio) {
            this.audio = audio;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio getAudio() {
            return this.audio;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams setContainer(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer container) {
            this.container = container;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer getContainer() {
            return this.container;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams setMuxConfig(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams setVideo(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo video) {
            this.video = video;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo getVideo() {
            return this.video;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode extends TeaModel {
        // 覆盖参数, 若填写会覆盖模板对应参数
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams;

        // 模板 id
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode setOverwriteParams(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfig extends TeaModel {
        // 图片水印配置
        @NameInMap("ImageWatermarks")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks> imageWatermarks;

        // 字幕压制配置
        @NameInMap("Subtitles")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles> subtitles;

        // 文字水印配置
        @NameInMap("TextWatermarks")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks> textWatermarks;

        // 转码配置
        @NameInMap("Transcode")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode transcode;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfig self = new SubmitTranscodeJobRequestOutputGroupProcessConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfig setImageWatermarks(java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks> imageWatermarks) {
            this.imageWatermarks = imageWatermarks;
            return this;
        }
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfig setSubtitles(java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles> getSubtitles() {
            return this.subtitles;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfig setTextWatermarks(java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks> textWatermarks) {
            this.textWatermarks = textWatermarks;
            return this;
        }
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfig setTranscode(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode transcode) {
            this.transcode = transcode;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode getTranscode() {
            return this.transcode;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroup extends TeaModel {
        // 输出媒体配置
        @NameInMap("Output")
        public SubmitTranscodeJobRequestOutputGroupOutput output;

        // 任务处理配置
        @NameInMap("ProcessConfig")
        public SubmitTranscodeJobRequestOutputGroupProcessConfig processConfig;

        public static SubmitTranscodeJobRequestOutputGroup build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroup self = new SubmitTranscodeJobRequestOutputGroup();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroup setOutput(SubmitTranscodeJobRequestOutputGroupOutput output) {
            this.output = output;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupOutput getOutput() {
            return this.output;
        }

        public SubmitTranscodeJobRequestOutputGroup setProcessConfig(SubmitTranscodeJobRequestOutputGroupProcessConfig processConfig) {
            this.processConfig = processConfig;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfig getProcessConfig() {
            return this.processConfig;
        }

    }

    public static class SubmitTranscodeJobRequestScheduleConfig extends TeaModel {
        // 管道 id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 任务优先级，取值范围：1~10
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitTranscodeJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestScheduleConfig self = new SubmitTranscodeJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitTranscodeJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
