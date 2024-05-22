// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTranscodeJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListTranscodeJobsResponseBodyJobs> jobs;

    @NameInMap("NextPageToken")
    public String nextPageToken;

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
        @NameInMap("InputUrl")
        public String inputUrl;

        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListTranscodeJobsResponseBodyJobsInputGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsInputGroup self = new ListTranscodeJobsResponseBodyJobsInputGroup();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsInputGroup setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
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
        @NameInMap("Media")
        public String media;

        @NameInMap("OutputUrl")
        public String outputUrl;

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

        public ListTranscodeJobsResponseBodyJobsOutputGroupOutput setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AudioIndex")
        public String audioIndex;

        @NameInMap("Duration")
        public Double duration;

        @NameInMap("Start")
        public Double start;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("VideoIndex")
        public String videoIndex;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs setAudioIndex(String audioIndex) {
            this.audioIndex = audioIndex;
            return this;
        }
        public String getAudioIndex() {
            return this.audioIndex;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs setStart(Double start) {
            this.start = start;
            return this;
        }
        public Double getStart() {
            return this.start;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs setVideoIndex(String videoIndex) {
            this.videoIndex = videoIndex;
            return this;
        }
        public String getVideoIndex() {
            return this.videoIndex;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption extends TeaModel {
        @NameInMap("CipherText")
        public String cipherText;

        @NameInMap("DecryptKeyUri")
        public String decryptKeyUri;

        @NameInMap("EncryptType")
        public String encryptType;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption setCipherText(String cipherText) {
            this.cipherText = cipherText;
            return this;
        }
        public String getCipherText() {
            return this.cipherText;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption setDecryptKeyUri(String decryptKeyUri) {
            this.decryptKeyUri = decryptKeyUri;
            return this;
        }
        public String getDecryptKeyUri() {
            return this.decryptKeyUri;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

    }

    public static class ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile extends TeaModel {
        @NameInMap("Media")
        public String media;

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
        @NameInMap("Duration")
        public String duration;

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
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("File")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file;

        @NameInMap("Height")
        public String height;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Timeline")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

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
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams;

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
        @NameInMap("Media")
        public String media;

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
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("File")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile file;

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
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams;

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
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams;

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
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        @NameInMap("Method")
        public String method;

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
        @NameInMap("Duration")
        public String duration;

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
        @NameInMap("Audio")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio;

        @NameInMap("Container")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer container;

        @NameInMap("MuxConfig")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

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

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
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
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams;

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
        @NameInMap("CombineConfigs")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs> combineConfigs;

        @NameInMap("Encryption")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption encryption;

        @NameInMap("ImageWatermarks")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks> imageWatermarks;

        @NameInMap("IsInheritTags")
        public Boolean isInheritTags;

        @NameInMap("Subtitles")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles> subtitles;

        @NameInMap("TextWatermarks")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks> textWatermarks;

        @NameInMap("Transcode")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscode transcode;

        public static ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig self = new ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig();
            return TeaModel.build(map, self);
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig setCombineConfigs(java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs> combineConfigs) {
            this.combineConfigs = combineConfigs;
            return this;
        }
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs> getCombineConfigs() {
            return this.combineConfigs;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig setEncryption(ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption getEncryption() {
            return this.encryption;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig setImageWatermarks(java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks> imageWatermarks) {
            this.imageWatermarks = imageWatermarks;
            return this;
        }
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfig setIsInheritTags(Boolean isInheritTags) {
            this.isInheritTags = isInheritTags;
            return this;
        }
        public Boolean getIsInheritTags() {
            return this.isInheritTags;
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
        @NameInMap("Output")
        public ListTranscodeJobsResponseBodyJobsOutputGroupOutput output;

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
        @NameInMap("PipelineId")
        public String pipelineId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("InputGroup")
        public java.util.List<ListTranscodeJobsResponseBodyJobsInputGroup> inputGroup;

        @NameInMap("JobCount")
        public Integer jobCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputGroup")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroup> outputGroup;

        @NameInMap("ParentJobId")
        public String parentJobId;

        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ScheduleConfig")
        public ListTranscodeJobsResponseBodyJobsScheduleConfig scheduleConfig;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TriggerSource")
        public String triggerSource;

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
