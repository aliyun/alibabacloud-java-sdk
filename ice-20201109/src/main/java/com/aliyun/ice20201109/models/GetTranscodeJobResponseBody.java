// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTranscodeJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>TranscodeParentJobWithSubJobDTO</p>
     */
    @NameInMap("TranscodeParentJob")
    public GetTranscodeJobResponseBodyTranscodeParentJob transcodeParentJob;

    public static GetTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeJobResponseBody self = new GetTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTranscodeJobResponseBody setTranscodeParentJob(GetTranscodeJobResponseBodyTranscodeParentJob transcodeParentJob) {
        this.transcodeParentJob = transcodeParentJob;
        return this;
    }
    public GetTranscodeJobResponseBodyTranscodeParentJob getTranscodeParentJob() {
        return this.transcodeParentJob;
    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobInputGroup extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetTranscodeJobResponseBodyTranscodeParentJobInputGroup build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobInputGroup self = new GetTranscodeJobResponseBodyTranscodeParentJobInputGroup();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobInputGroup setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobInputGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("OutputUrl")
        public String outputUrl;

        @NameInMap("Type")
        public String type;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs extends TeaModel {
        @NameInMap("AudioIndex")
        public String audioIndex;

        @NameInMap("Duration")
        public Double duration;

        @NameInMap("Start")
        public Double start;

        @NameInMap("VideoIndex")
        public String videoIndex;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs setAudioIndex(String audioIndex) {
            this.audioIndex = audioIndex;
            return this;
        }
        public String getAudioIndex() {
            return this.audioIndex;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs setStart(Double start) {
            this.start = start;
            return this;
        }
        public Double getStart() {
            return this.start;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs setVideoIndex(String videoIndex) {
            this.videoIndex = videoIndex;
            return this;
        }
        public String getVideoIndex() {
            return this.videoIndex;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption extends TeaModel {
        @NameInMap("CipherText")
        public String cipherText;

        @NameInMap("DecryptKeyUri")
        public String decryptKeyUri;

        @NameInMap("EncryptType")
        public String encryptType;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption setCipherText(String cipherText) {
            this.cipherText = cipherText;
            return this;
        }
        public String getCipherText() {
            return this.cipherText;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption setDecryptKeyUri(String decryptKeyUri) {
            this.decryptKeyUri = decryptKeyUri;
            return this;
        }
        public String getDecryptKeyUri() {
            return this.decryptKeyUri;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Start")
        public String start;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams extends TeaModel {
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("File")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file;

        @NameInMap("Height")
        public String height;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Timeline")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        @NameInMap("Width")
        public String width;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setFile(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsFile getFile() {
            return this.file;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setTimeline(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline getTimeline() {
            return this.timeline;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks extends TeaModel {
        @NameInMap("OverwriteParams")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks setOverwriteParams(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("File")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile file;

        @NameInMap("Format")
        public String format;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams setFile(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParamsFile getFile() {
            return this.file;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles extends TeaModel {
        @NameInMap("OverwriteParams")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles setOverwriteParams(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitlesOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams extends TeaModel {
        @NameInMap("Adaptive")
        public String adaptive;

        @NameInMap("BorderColor")
        public String borderColor;

        @NameInMap("BorderWidth")
        public Integer borderWidth;

        @NameInMap("Content")
        public String content;

        @NameInMap("FontAlpha")
        public String fontAlpha;

        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("Left")
        public String left;

        @NameInMap("Top")
        public String top;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setAdaptive(String adaptive) {
            this.adaptive = adaptive;
            return this;
        }
        public String getAdaptive() {
            return this.adaptive;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setFontAlpha(String fontAlpha) {
            this.fontAlpha = fontAlpha;
            return this;
        }
        public String getFontAlpha() {
            return this.fontAlpha;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks extends TeaModel {
        @NameInMap("OverwriteParams")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks setOverwriteParams(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume extends TeaModel {
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        @NameInMap("Method")
        public String method;

        @NameInMap("TruePeak")
        public String truePeak;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Remove")
        public String remove;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Volume")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume volume;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio setVolume(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("ForceSegTime")
        public String forceSegTime;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment setForceSegTime(String forceSegTime) {
            this.forceSegTime = forceSegTime;
            return this;
        }
        public String getForceSegTime() {
            return this.forceSegTime;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig extends TeaModel {
        @NameInMap("Segment")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig setSegment(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo extends TeaModel {
        @NameInMap("AbrMax")
        public String abrMax;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("LongShortMode")
        public String longShortMode;

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

        @NameInMap("Remove")
        public String remove;

        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("Width")
        public String width;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setAbrMax(String abrMax) {
            this.abrMax = abrMax;
            return this;
        }
        public String getAbrMax() {
            return this.abrMax;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams extends TeaModel {
        @NameInMap("Audio")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio;

        @NameInMap("Container")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer container;

        @NameInMap("MuxConfig")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        @NameInMap("Video")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo video;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams setAudio(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio) {
            this.audio = audio;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsAudio getAudio() {
            return this.audio;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams setContainer(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer container) {
            this.container = container;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsContainer getContainer() {
            return this.container;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams setMuxConfig(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams setVideo(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo video) {
            this.video = video;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParamsVideo getVideo() {
            return this.video;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode extends TeaModel {
        @NameInMap("OverwriteParams")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode setOverwriteParams(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscodeOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig extends TeaModel {
        @NameInMap("CombineConfigs")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs> combineConfigs;

        @NameInMap("Encryption")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption encryption;

        @NameInMap("ImageWatermarks")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks> imageWatermarks;

        @NameInMap("Subtitles")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles> subtitles;

        @NameInMap("TextWatermarks")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks> textWatermarks;

        @NameInMap("Transcode")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode transcode;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setCombineConfigs(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs> combineConfigs) {
            this.combineConfigs = combineConfigs;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigCombineConfigs> getCombineConfigs() {
            return this.combineConfigs;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setEncryption(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigEncryption getEncryption() {
            return this.encryption;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setImageWatermarks(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks> imageWatermarks) {
            this.imageWatermarks = imageWatermarks;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setSubtitles(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigSubtitles> getSubtitles() {
            return this.subtitles;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setTextWatermarks(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks> textWatermarks) {
            this.textWatermarks = textWatermarks;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig setTranscode(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode transcode) {
            this.transcode = transcode;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfigTranscode getTranscode() {
            return this.transcode;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup extends TeaModel {
        @NameInMap("Output")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput output;

        @NameInMap("ProcessConfig")
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig processConfig;

        public static GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup self = new GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup setOutput(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput output) {
            this.output = output;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupOutput getOutput() {
            return this.output;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup setProcessConfig(GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig processConfig) {
            this.processConfig = processConfig;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobOutputGroupProcessConfig getProcessConfig() {
            return this.processConfig;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig self = new GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup extends TeaModel {
        @NameInMap("InputUrl")
        public String inputUrl;

        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList extends TeaModel {
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

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo extends TeaModel {
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

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList extends TeaModel {
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

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setAvgFps(String avgFps) {
            this.avgFps = avgFps;
            return this;
        }
        public String getAvgFps() {
            return this.avgFps;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setTimeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }
        public String getTimeBase() {
            return this.timeBase;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta extends TeaModel {
        @NameInMap("AudioStreamInfoList")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList> audioStreamInfoList;

        @NameInMap("FileBasicInfo")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo fileBasicInfo;

        @NameInMap("VideoStreamInfoList")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList> videoStreamInfoList;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta setAudioStreamInfoList(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta setFileBasicInfo(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta setVideoStreamInfoList(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMetaVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("OutputUrl")
        public String outputUrl;

        @NameInMap("Type")
        public String type;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs extends TeaModel {
        @NameInMap("AudioIndex")
        public String audioIndex;

        @NameInMap("Duration")
        public Double duration;

        @NameInMap("Start")
        public Double start;

        @NameInMap("VideoIndex")
        public String videoIndex;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs setAudioIndex(String audioIndex) {
            this.audioIndex = audioIndex;
            return this;
        }
        public String getAudioIndex() {
            return this.audioIndex;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs setStart(Double start) {
            this.start = start;
            return this;
        }
        public Double getStart() {
            return this.start;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs setVideoIndex(String videoIndex) {
            this.videoIndex = videoIndex;
            return this;
        }
        public String getVideoIndex() {
            return this.videoIndex;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption extends TeaModel {
        @NameInMap("CipherText")
        public String cipherText;

        @NameInMap("DecryptKeyUri")
        public String decryptKeyUri;

        @NameInMap("EncryptType")
        public String encryptType;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption setCipherText(String cipherText) {
            this.cipherText = cipherText;
            return this;
        }
        public String getCipherText() {
            return this.cipherText;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption setDecryptKeyUri(String decryptKeyUri) {
            this.decryptKeyUri = decryptKeyUri;
            return this;
        }
        public String getDecryptKeyUri() {
            return this.decryptKeyUri;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Start")
        public String start;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams extends TeaModel {
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("File")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile file;

        @NameInMap("Height")
        public String height;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Timeline")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        @NameInMap("Width")
        public String width;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setFile(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsFile getFile() {
            return this.file;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setTimeline(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParamsTimeline getTimeline() {
            return this.timeline;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks extends TeaModel {
        @NameInMap("OverwriteParams")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks setOverwriteParams(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("File")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile file;

        @NameInMap("Format")
        public String format;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams setFile(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile file) {
            this.file = file;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParamsFile getFile() {
            return this.file;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles extends TeaModel {
        @NameInMap("OverwriteParams")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles setOverwriteParams(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitlesOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams extends TeaModel {
        @NameInMap("Adaptive")
        public String adaptive;

        @NameInMap("BorderColor")
        public String borderColor;

        @NameInMap("BorderWidth")
        public Integer borderWidth;

        @NameInMap("Content")
        public String content;

        @NameInMap("FontAlpha")
        public String fontAlpha;

        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("Left")
        public String left;

        @NameInMap("Top")
        public String top;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setAdaptive(String adaptive) {
            this.adaptive = adaptive;
            return this;
        }
        public String getAdaptive() {
            return this.adaptive;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setFontAlpha(String fontAlpha) {
            this.fontAlpha = fontAlpha;
            return this;
        }
        public String getFontAlpha() {
            return this.fontAlpha;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks extends TeaModel {
        @NameInMap("OverwriteParams")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks setOverwriteParams(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume extends TeaModel {
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        @NameInMap("Method")
        public String method;

        @NameInMap("TruePeak")
        public String truePeak;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Remove")
        public String remove;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Volume")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume volume;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio setVolume(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("ForceSegTime")
        public String forceSegTime;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment setForceSegTime(String forceSegTime) {
            this.forceSegTime = forceSegTime;
            return this;
        }
        public String getForceSegTime() {
            return this.forceSegTime;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig extends TeaModel {
        @NameInMap("Segment")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig setSegment(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo extends TeaModel {
        @NameInMap("AbrMax")
        public String abrMax;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("LongShortMode")
        public String longShortMode;

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

        @NameInMap("Remove")
        public String remove;

        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("Width")
        public String width;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setAbrMax(String abrMax) {
            this.abrMax = abrMax;
            return this;
        }
        public String getAbrMax() {
            return this.abrMax;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams extends TeaModel {
        @NameInMap("Audio")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio audio;

        @NameInMap("Container")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer container;

        @NameInMap("MuxConfig")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        @NameInMap("Video")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo video;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setAudio(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio audio) {
            this.audio = audio;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsAudio getAudio() {
            return this.audio;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setContainer(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer container) {
            this.container = container;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsContainer getContainer() {
            return this.container;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setMuxConfig(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams setVideo(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo video) {
            this.video = video;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParamsVideo getVideo() {
            return this.video;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode extends TeaModel {
        @NameInMap("OverwriteParams")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode setOverwriteParams(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscodeOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig extends TeaModel {
        @NameInMap("CombineConfigs")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs> combineConfigs;

        @NameInMap("Encryption")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption encryption;

        @NameInMap("ImageWatermarks")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks> imageWatermarks;

        @NameInMap("IsInheritTags")
        public Boolean isInheritTags;

        @NameInMap("Subtitles")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles> subtitles;

        @NameInMap("TextWatermarks")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks> textWatermarks;

        @NameInMap("Transcode")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode transcode;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setCombineConfigs(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs> combineConfigs) {
            this.combineConfigs = combineConfigs;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigCombineConfigs> getCombineConfigs() {
            return this.combineConfigs;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setEncryption(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigEncryption getEncryption() {
            return this.encryption;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setImageWatermarks(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks> imageWatermarks) {
            this.imageWatermarks = imageWatermarks;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setIsInheritTags(Boolean isInheritTags) {
            this.isInheritTags = isInheritTags;
            return this;
        }
        public Boolean getIsInheritTags() {
            return this.isInheritTags;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setSubtitles(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigSubtitles> getSubtitles() {
            return this.subtitles;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setTextWatermarks(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks> textWatermarks) {
            this.textWatermarks = textWatermarks;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig setTranscode(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode transcode) {
            this.transcode = transcode;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfigTranscode getTranscode() {
            return this.transcode;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("InputGroup")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup> inputGroup;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobIndex")
        public Integer jobIndex;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutFileMeta")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta outFileMeta;

        @NameInMap("Output")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput output;

        @NameInMap("ParentJobId")
        public String parentJobId;

        @NameInMap("ProcessConfig")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig processConfig;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ScheduleConfig")
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig scheduleConfig;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitResultJson")
        public java.util.Map<String, ?> submitResultJson;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("UserData")
        public String userData;

        public static GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList self = new GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setInputGroup(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup> inputGroup) {
            this.inputGroup = inputGroup;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListInputGroup> getInputGroup() {
            return this.inputGroup;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setJobIndex(Integer jobIndex) {
            this.jobIndex = jobIndex;
            return this;
        }
        public Integer getJobIndex() {
            return this.jobIndex;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setOutFileMeta(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta outFileMeta) {
            this.outFileMeta = outFileMeta;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutFileMeta getOutFileMeta() {
            return this.outFileMeta;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setOutput(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput output) {
            this.output = output;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListOutput getOutput() {
            return this.output;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setParentJobId(String parentJobId) {
            this.parentJobId = parentJobId;
            return this;
        }
        public String getParentJobId() {
            return this.parentJobId;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setProcessConfig(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig processConfig) {
            this.processConfig = processConfig;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListProcessConfig getProcessConfig() {
            return this.processConfig;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setScheduleConfig(GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobListScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setSubmitResultJson(java.util.Map<String, ?> submitResultJson) {
            this.submitResultJson = submitResultJson;
            return this;
        }
        public java.util.Map<String, ?> getSubmitResultJson() {
            return this.submitResultJson;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class GetTranscodeJobResponseBodyTranscodeParentJob extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("InputGroup")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobInputGroup> inputGroup;

        @NameInMap("JobCount")
        public Integer jobCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputGroup")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup> outputGroup;

        @NameInMap("ParentJobId")
        public String parentJobId;

        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ScheduleConfig")
        public GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig scheduleConfig;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TranscodeJobList")
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList> transcodeJobList;

        @NameInMap("TriggerSource")
        public String triggerSource;

        @NameInMap("UserData")
        public String userData;

        public static GetTranscodeJobResponseBodyTranscodeParentJob build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeJobResponseBodyTranscodeParentJob self = new GetTranscodeJobResponseBodyTranscodeParentJob();
            return TeaModel.build(map, self);
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setInputGroup(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobInputGroup> inputGroup) {
            this.inputGroup = inputGroup;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobInputGroup> getInputGroup() {
            return this.inputGroup;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setJobCount(Integer jobCount) {
            this.jobCount = jobCount;
            return this;
        }
        public Integer getJobCount() {
            return this.jobCount;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setOutputGroup(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup> outputGroup) {
            this.outputGroup = outputGroup;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobOutputGroup> getOutputGroup() {
            return this.outputGroup;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setParentJobId(String parentJobId) {
            this.parentJobId = parentJobId;
            return this;
        }
        public String getParentJobId() {
            return this.parentJobId;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setScheduleConfig(GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public GetTranscodeJobResponseBodyTranscodeParentJobScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setTranscodeJobList(java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList> transcodeJobList) {
            this.transcodeJobList = transcodeJobList;
            return this;
        }
        public java.util.List<GetTranscodeJobResponseBodyTranscodeParentJobTranscodeJobList> getTranscodeJobList() {
            return this.transcodeJobList;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public GetTranscodeJobResponseBodyTranscodeParentJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
