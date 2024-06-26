// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputGroup")
    public java.util.List<SubmitTranscodeJobRequestInputGroup> inputGroup;

    /**
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputGroup")
    public java.util.List<SubmitTranscodeJobRequestOutputGroup> outputGroup;

    /**
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitTranscodeJobRequestScheduleConfig scheduleConfig;

    /**
     * <strong>example:</strong>
     * <p>user-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobRequest self = new SubmitTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
        /**
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitTranscodeJobRequestInputGroup build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestInputGroup self = new SubmitTranscodeJobRequestInputGroup();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestInputGroup setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/{MediaId}/{JobId}.mp4</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
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

        public SubmitTranscodeJobRequestOutputGroupOutput setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public SubmitTranscodeJobRequestOutputGroupOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 或 exclude</p>
         */
        @NameInMap("AudioIndex")
        public String audioIndex;

        /**
         * <strong>example:</strong>
         * <p>20.0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("Start")
        public Double start;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 或 exclude</p>
         */
        @NameInMap("VideoIndex")
        public String videoIndex;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs self = new SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs setAudioIndex(String audioIndex) {
            this.audioIndex = audioIndex;
            return this;
        }
        public String getAudioIndex() {
            return this.audioIndex;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs setStart(Double start) {
            this.start = start;
            return this;
        }
        public Double getStart() {
            return this.start;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs setVideoIndex(String videoIndex) {
            this.videoIndex = videoIndex;
            return this;
        }
        public String getVideoIndex() {
            return this.videoIndex;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MTYi00NDU0LTg5O****</p>
         */
        @NameInMap("CipherText")
        public String cipherText;

        /**
         * <strong>example:</strong>
         * <p><a href="https://sample.com/path?CipherText=MTYi00NDU0LTg5O">https://sample.com/path?CipherText=MTYi00NDU0LTg5O</a>****</p>
         */
        @NameInMap("DecryptKeyUri")
        public String decryptKeyUri;

        /**
         * <strong>example:</strong>
         * <p>PrivateEncryption</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <strong>example:</strong>
         * <p>KMS</p>
         */
        @NameInMap("KeyServiceType")
        public String keyServiceType;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption self = new SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption setCipherText(String cipherText) {
            this.cipherText = cipherText;
            return this;
        }
        public String getCipherText() {
            return this.cipherText;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption setDecryptKeyUri(String decryptKeyUri) {
            this.decryptKeyUri = decryptKeyUri;
            return this;
        }
        public String getDecryptKeyUri() {
            return this.decryptKeyUri;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption setKeyServiceType(String keyServiceType) {
            this.keyServiceType = keyServiceType;
            return this;
        }
        public String getKeyServiceType() {
            return this.keyServiceType;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>ToEND</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>00:00:05</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Dy")
        public String dy;

        @NameInMap("File")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>TopLeft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Timeline")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
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
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9547c6ad97cb4f2aaa29683ebd18d410</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("File")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile file;

        /**
         * <strong>example:</strong>
         * <p>vtt</p>
         */
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
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9547c6ad97cb4f2aaa29683ebd18d410</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Adaptive")
        public String adaptive;

        /**
         * <strong>example:</strong>
         * <p>#006400</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <strong>example:</strong>
         * <p>测试水印</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("FontAlpha")
        public String fontAlpha;

        /**
         * <strong>example:</strong>
         * <p>#006400</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <strong>example:</strong>
         * <p>SimSun</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Left")
        public String left;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9547c6ad97cb4f2aaa29683ebd18d410</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>-6</p>
         */
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <strong>example:</strong>
         * <p>AAC</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

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
        /**
         * <strong>example:</strong>
         * <p>mp4</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>2,3</p>
         */
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

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig extends TeaModel {
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

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

        public static SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig self = new SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsVideo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("AbrMax")
        public String abrMax;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <strong>example:</strong>
         * <p>250</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LongShortMode")
        public String longShortMode;

        /**
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <strong>example:</strong>
         * <p>Main</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <strong>example:</strong>
         * <p>progressive</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
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
        @NameInMap("Audio")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio;

        @NameInMap("Container")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer container;

        @NameInMap("MuxConfig")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        @NameInMap("TransConfig")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig transConfig;

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

        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams setTransConfig(SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig getTransConfig() {
            return this.transConfig;
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
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9547c6ad97cb4f2aaa29683ebd18d410</p>
         */
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
        @NameInMap("CombineConfigs")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs> combineConfigs;

        @NameInMap("Encryption")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption encryption;

        @NameInMap("ImageWatermarks")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks> imageWatermarks;

        @NameInMap("Subtitles")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles> subtitles;

        @NameInMap("TextWatermarks")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks> textWatermarks;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Transcode")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscode transcode;

        public static SubmitTranscodeJobRequestOutputGroupProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobRequestOutputGroupProcessConfig self = new SubmitTranscodeJobRequestOutputGroupProcessConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfig setCombineConfigs(java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs> combineConfigs) {
            this.combineConfigs = combineConfigs;
            return this;
        }
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs> getCombineConfigs() {
            return this.combineConfigs;
        }

        public SubmitTranscodeJobRequestOutputGroupProcessConfig setEncryption(SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption getEncryption() {
            return this.encryption;
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
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Output")
        public SubmitTranscodeJobRequestOutputGroupOutput output;

        /**
         * <p>This parameter is required.</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>e37ebee5d98b4781897f6086e89f9c56</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
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
