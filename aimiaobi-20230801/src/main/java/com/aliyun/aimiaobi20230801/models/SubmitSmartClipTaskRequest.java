// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartClipTaskRequest extends TeaModel {
    /**
     * <p>Video editing configuration.</p>
     */
    @NameInMap("EditingConfig")
    public SubmitSmartClipTaskRequestEditingConfig editingConfig;

    /**
     * <p>Additional extended parameters. These parameters merge with InputConfig, OutputConfig, and EditingConfig.</p>
     */
    @NameInMap("ExtendParam")
    public String extendParam;

    /**
     * <p>Input configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputConfig")
    public SubmitSmartClipTaskRequestInputConfig inputConfig;

    /**
     * <p>Output configuration.</p>
     */
    @NameInMap("OutputConfig")
    public SubmitSmartClipTaskRequestOutputConfig outputConfig;

    /**
     * <p>Alibaba Cloud Model Studio workspace ID. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>业务空间ID</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitSmartClipTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartClipTaskRequest self = new SubmitSmartClipTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmartClipTaskRequest setEditingConfig(SubmitSmartClipTaskRequestEditingConfig editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public SubmitSmartClipTaskRequestEditingConfig getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitSmartClipTaskRequest setExtendParam(String extendParam) {
        this.extendParam = extendParam;
        return this;
    }
    public String getExtendParam() {
        return this.extendParam;
    }

    public SubmitSmartClipTaskRequest setInputConfig(SubmitSmartClipTaskRequestInputConfig inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public SubmitSmartClipTaskRequestInputConfig getInputConfig() {
        return this.inputConfig;
    }

    public SubmitSmartClipTaskRequest setOutputConfig(SubmitSmartClipTaskRequestOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public SubmitSmartClipTaskRequestOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSmartClipTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig extends TeaModel {
        /**
         * <p>Background music style. Default value: empty. If background music is already configured in InputConfig, this field does not take effect.
         * Valid values:
         * bgm-beauty: Fashion
         * bgm-chinese-style: Chinese style
         * bgm-cuisine: Food
         * bgm-dynamic: Dynamic
         * bgm-quirky: Quirky
         * bgm-relaxing: Relaxing
         * bgm-romantic: Romantic
         * bgm-upbeat: Upbeat</p>
         */
        @NameInMap("Style")
        public String style;

        /**
         * <p>Volume of the background music. Valid values: 0 to 10.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Volume")
        public Double volume;

        public static SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig self = new SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig setVolume(Double volume) {
            this.volume = volume;
            return this;
        }
        public Double getVolume() {
            return this.volume;
        }

    }

    public static class SubmitSmartClipTaskRequestEditingConfigMediaConfig extends TeaModel {
        /**
         * <p>Volume of the video material. 0 means mute.</p>
         */
        @NameInMap("Volume")
        public Double volume;

        public static SubmitSmartClipTaskRequestEditingConfigMediaConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestEditingConfigMediaConfig self = new SubmitSmartClipTaskRequestEditingConfigMediaConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestEditingConfigMediaConfig setVolume(Double volume) {
            this.volume = volume;
            return this;
        }
        public Double getVolume() {
            return this.volume;
        }

    }

    public static class SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig extends TeaModel {
        /**
         * <p>Caption alignment.
         * TopLeft: Top-left corner of the video.
         * TopCenter: Top center of the vertical axis of the video.
         * TopRight: Top-right corner of the video.
         * CenterLeft: Left side of the horizontal center line of the video.
         * CenterCenter: Center of the video.
         * CenterRight: Right side of the horizontal center line of the video.
         * BottomLeft: Bottom-left corner of the video.
         * BottomCenter: Bottom center of the vertical axis of the video.
         * BottomRight: Bottom-right corner of the video.</p>
         */
        @NameInMap("Alignment")
        public String alignment;

        /**
         * <p>Font of the caption text. For supported fonts, see the font list. Default font: SimSun.</p>
         * 
         * <strong>example:</strong>
         * <p>SimSun</p>
         */
        @NameInMap("Font")
        public String font;

        /**
         * <p>Color of the caption text. Format: # followed by a hexadecimal value. Example: #ffffff.</p>
         * 
         * <strong>example:</strong>
         * <p>#ffffff</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>Font size of the caption text. This size scales based on the source material size and the final output size. Default value: 0. Maximum value: 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontSize")
        public String fontSize;

        /**
         * <p>Letter spacing of the caption text, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Spacing")
        public String spacing;

        /**
         * <p>Horizontal distance from the top-left corner of the caption text to the top-left corner of the output video. You can specify this value as a percentage or in pixels. If the value is between 0 and 0.9999, it represents a percentage of the output video width. If the value is an integer greater than or equal to 2, it represents an absolute pixel value. Default value: 0. This coordinate scales based on the source material size and the final output size.</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>Vertical distance from the top-left corner of the caption text to the top-left corner of the output video. You can specify this value as a percentage or in pixels. If the value is between 0 and 0.9999, it represents a percentage of the output video height. If the value is an integer greater than or equal to 2, it represents an absolute pixel value. Default value: 0. This coordinate scales based on the source material size and the final output size.</p>
         */
        @NameInMap("Y")
        public Float y;

        public static SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig self = new SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig setAlignment(String alignment) {
            this.alignment = alignment;
            return this;
        }
        public String getAlignment() {
            return this.alignment;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig setFont(String font) {
            this.font = font;
            return this;
        }
        public String getFont() {
            return this.font;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig setFontSize(String fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public String getFontSize() {
            return this.fontSize;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig setSpacing(String spacing) {
            this.spacing = spacing;
            return this;
        }
        public String getSpacing() {
            return this.spacing;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class SubmitSmartClipTaskRequestEditingConfigSpeechConfig extends TeaModel {
        /**
         * <p>Caption parameter configuration.</p>
         */
        @NameInMap("AsrConfig")
        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig asrConfig;

        /**
         * <p>Speech rate of the voiceover script.
         * Valid values: -500 to 500. Default value: 0.
         * The corresponding playback speed multipliers for [-500, 0, 500] are [0.5, 1.0, 2.0].
         * Calculation method:
         * For 0.8× speed: (1 - 1/0.8) / 0.002 = -125
         * For 1.2× speed: (1 - 1/1.2) / 0.001 = 166
         * Use coefficient 0.002 for speeds less than 1×.
         * Use coefficient 0.001 for speeds greater than 1×.
         * Round the result to the nearest integer.</p>
         * <p>The calculation method is as follows:<br>
         * 0.8× speed: (1 − 1/0.8)/0.002 = −125<br>
         * 1.2× speed: (1 − 1/1.2)/0.001 = 166<br>
         * When the speed is less than 1×, use a coefficient of 0.002.<br>
         * When the speed is greater than 1×, use a coefficient of 0.001.<br>
         * The actual algorithm result is approximated.<br><br><br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechRate")
        public Double speechRate;

        /**
         * <p>Voiceover style. Default value: empty. If both Voice and Style are specified, Voice takes precedence.
         * Gentle: Gentle
         * Serious: Serious
         * Entertainment: Entertainment</p>
         */
        @NameInMap("Style")
        public String style;

        /**
         * <p>Specify one or more voice styles for the voiceover, separated by commas. When multiple voices are specified, one is randomly selected for synthesis. For available voice styles, see <a href="https://help.aliyun.com/zh/ims/developer-reference/smart-voice-effect-example?spm=a2c4g.11186623.0.0.13091ee6Pw4Jqz">Smart Voice Effect Examples</a>. Example: &quot;zhimiao_emo,zhilun&quot;.</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>Volume of the voiceover audio. Default value: 1. Valid values: 0 to 10.0. Decimal values are supported. Example: 0.5.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Volume")
        public Double volume;

        public static SubmitSmartClipTaskRequestEditingConfigSpeechConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestEditingConfigSpeechConfig self = new SubmitSmartClipTaskRequestEditingConfigSpeechConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfig setAsrConfig(SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig asrConfig) {
            this.asrConfig = asrConfig;
            return this;
        }
        public SubmitSmartClipTaskRequestEditingConfigSpeechConfigAsrConfig getAsrConfig() {
            return this.asrConfig;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfig setSpeechRate(Double speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Double getSpeechRate() {
            return this.speechRate;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfig setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public SubmitSmartClipTaskRequestEditingConfigSpeechConfig setVolume(Double volume) {
            this.volume = volume;
            return this;
        }
        public Double getVolume() {
            return this.volume;
        }

    }

    public static class SubmitSmartClipTaskRequestEditingConfigTitleConfig extends TeaModel {
        /**
         * <p>TopLeft: Top-left corner of the video.
         * TopCenter: Top center of the vertical axis of the video.
         * TopRight: Top-right corner of the video.
         * CenterLeft: Left side of the horizontal center line of the video.
         * CenterCenter: Center of the video.
         * CenterRight: Right side of the horizontal center line of the video.
         * BottomLeft: Bottom-left corner of the video.
         * BottomCenter: Bottom center of the vertical axis of the video.
         * BottomRight: Bottom-right corner of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>TopLeft</p>
         */
        @NameInMap("Alignment")
        public String alignment;

        /**
         * <p>Time when the title appears.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TimelineIn")
        public Float timelineIn;

        /**
         * <p>Time when the title disappears.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TimelineOut")
        public Float timelineOut;

        /**
         * <p>Horizontal distance from the top-left corner of the banner text to the top-left corner of the output video. You can specify this value as a percentage or in pixels. If the value is between 0 and 0.9999, it represents a percentage of the output video width. If the value is an integer greater than or equal to 2, it represents an absolute pixel value. Default value: 0. This coordinate scales based on the source material size and the final output size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>Vertical distance from the top-left corner of the banner text to the top-left corner of the output video. You can specify this value as a percentage or in pixels. If the value is between 0 and 0.9999, it represents a percentage of the output video height. If the value is an integer greater than or equal to 2, it represents an absolute pixel value. Default value: 0. This coordinate scales based on the source material size and the final output size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Y")
        public Float y;

        public static SubmitSmartClipTaskRequestEditingConfigTitleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestEditingConfigTitleConfig self = new SubmitSmartClipTaskRequestEditingConfigTitleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setAlignment(String alignment) {
            this.alignment = alignment;
            return this;
        }
        public String getAlignment() {
            return this.alignment;
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setTimelineIn(Float timelineIn) {
            this.timelineIn = timelineIn;
            return this;
        }
        public Float getTimelineIn() {
            return this.timelineIn;
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setTimelineOut(Float timelineOut) {
            this.timelineOut = timelineOut;
            return this;
        }
        public Float getTimelineOut() {
            return this.timelineOut;
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class SubmitSmartClipTaskRequestEditingConfig extends TeaModel {
        /**
         * <p>Background music configuration.</p>
         */
        @NameInMap("BackgroundMusicConfig")
        public SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig backgroundMusicConfig;

        /**
         * <p>Media configuration.</p>
         */
        @NameInMap("MediaConfig")
        public SubmitSmartClipTaskRequestEditingConfigMediaConfig mediaConfig;

        /**
         * <p>Voiceover configuration.</p>
         */
        @NameInMap("SpeechConfig")
        public SubmitSmartClipTaskRequestEditingConfigSpeechConfig speechConfig;

        /**
         * <p>Title configuration.</p>
         */
        @NameInMap("TitleConfig")
        public SubmitSmartClipTaskRequestEditingConfigTitleConfig titleConfig;

        public static SubmitSmartClipTaskRequestEditingConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestEditingConfig self = new SubmitSmartClipTaskRequestEditingConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestEditingConfig setBackgroundMusicConfig(SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig backgroundMusicConfig) {
            this.backgroundMusicConfig = backgroundMusicConfig;
            return this;
        }
        public SubmitSmartClipTaskRequestEditingConfigBackgroundMusicConfig getBackgroundMusicConfig() {
            return this.backgroundMusicConfig;
        }

        public SubmitSmartClipTaskRequestEditingConfig setMediaConfig(SubmitSmartClipTaskRequestEditingConfigMediaConfig mediaConfig) {
            this.mediaConfig = mediaConfig;
            return this;
        }
        public SubmitSmartClipTaskRequestEditingConfigMediaConfig getMediaConfig() {
            return this.mediaConfig;
        }

        public SubmitSmartClipTaskRequestEditingConfig setSpeechConfig(SubmitSmartClipTaskRequestEditingConfigSpeechConfig speechConfig) {
            this.speechConfig = speechConfig;
            return this;
        }
        public SubmitSmartClipTaskRequestEditingConfigSpeechConfig getSpeechConfig() {
            return this.speechConfig;
        }

        public SubmitSmartClipTaskRequestEditingConfig setTitleConfig(SubmitSmartClipTaskRequestEditingConfigTitleConfig titleConfig) {
            this.titleConfig = titleConfig;
            return this;
        }
        public SubmitSmartClipTaskRequestEditingConfigTitleConfig getTitleConfig() {
            return this.titleConfig;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfigBackgroundMusics extends TeaModel {
        /**
         * <p>Background music ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/bucket-name/filepath/video.mp3</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>ID type:
         * materialId: Material Library reference ID
         * fileKey: FileKey in Alibaba Cloud Model Studio
         * url: Publicly accessible URL</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileKey</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSmartClipTaskRequestInputConfigBackgroundMusics build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfigBackgroundMusics self = new SubmitSmartClipTaskRequestInputConfigBackgroundMusics();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfigBackgroundMusics setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSmartClipTaskRequestInputConfigBackgroundMusics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfigStickersStickerId extends TeaModel {
        /**
         * <p>Sticker ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/bucket-name/filepath/sticker.png</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>ID type:
         * materialId: Material Library reference ID
         * fileKey: FileKey in Alibaba Cloud Model Studio
         * url: Publicly accessible URL</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileKey</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSmartClipTaskRequestInputConfigStickersStickerId build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfigStickersStickerId self = new SubmitSmartClipTaskRequestInputConfigStickersStickerId();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfigStickersStickerId setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSmartClipTaskRequestInputConfigStickersStickerId setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfigStickers extends TeaModel {
        /**
         * <p>Height of the sticker.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>Sticker ID.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StickerId")
        public SubmitSmartClipTaskRequestInputConfigStickersStickerId stickerId;

        /**
         * <p>Width of the sticker.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>X coordinate of the top-left corner of the sticker.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>Y coordinate of the top-left corner of the sticker.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Y")
        public Double y;

        public static SubmitSmartClipTaskRequestInputConfigStickers build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfigStickers self = new SubmitSmartClipTaskRequestInputConfigStickers();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setStickerId(SubmitSmartClipTaskRequestInputConfigStickersStickerId stickerId) {
            this.stickerId = stickerId;
            return this;
        }
        public SubmitSmartClipTaskRequestInputConfigStickersStickerId getStickerId() {
            return this.stickerId;
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfigVideoIds extends TeaModel {
        /**
         * <p>Material ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/bucket-name/filepath/video.mp4</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>ID type:
         * materialId: Material Library reference ID
         * fileKey: FileKey in Alibaba Cloud Model Studio
         * url: Publicly accessible URL</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileKey</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSmartClipTaskRequestInputConfigVideoIds build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfigVideoIds self = new SubmitSmartClipTaskRequestInputConfigVideoIds();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfigVideoIds setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSmartClipTaskRequestInputConfigVideoIds setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfig extends TeaModel {
        /**
         * <p>List of background music IDs.</p>
         */
        @NameInMap("BackgroundMusics")
        public java.util.List<SubmitSmartClipTaskRequestInputConfigBackgroundMusics> backgroundMusics;

        /**
         * <p>List of voiceover script texts.</p>
         */
        @NameInMap("SpeechTexts")
        public java.util.List<String> speechTexts;

        /**
         * <p>List of stickers.</p>
         */
        @NameInMap("Stickers")
        public java.util.List<SubmitSmartClipTaskRequestInputConfigStickers> stickers;

        /**
         * <p>List of titles.</p>
         */
        @NameInMap("Titles")
        public java.util.List<String> titles;

        /**
         * <p>List of video material ID objects.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("VideoIds")
        public java.util.List<SubmitSmartClipTaskRequestInputConfigVideoIds> videoIds;

        public static SubmitSmartClipTaskRequestInputConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfig self = new SubmitSmartClipTaskRequestInputConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfig setBackgroundMusics(java.util.List<SubmitSmartClipTaskRequestInputConfigBackgroundMusics> backgroundMusics) {
            this.backgroundMusics = backgroundMusics;
            return this;
        }
        public java.util.List<SubmitSmartClipTaskRequestInputConfigBackgroundMusics> getBackgroundMusics() {
            return this.backgroundMusics;
        }

        public SubmitSmartClipTaskRequestInputConfig setSpeechTexts(java.util.List<String> speechTexts) {
            this.speechTexts = speechTexts;
            return this;
        }
        public java.util.List<String> getSpeechTexts() {
            return this.speechTexts;
        }

        public SubmitSmartClipTaskRequestInputConfig setStickers(java.util.List<SubmitSmartClipTaskRequestInputConfigStickers> stickers) {
            this.stickers = stickers;
            return this;
        }
        public java.util.List<SubmitSmartClipTaskRequestInputConfigStickers> getStickers() {
            return this.stickers;
        }

        public SubmitSmartClipTaskRequestInputConfig setTitles(java.util.List<String> titles) {
            this.titles = titles;
            return this;
        }
        public java.util.List<String> getTitles() {
            return this.titles;
        }

        public SubmitSmartClipTaskRequestInputConfig setVideoIds(java.util.List<SubmitSmartClipTaskRequestInputConfigVideoIds> videoIds) {
            this.videoIds = videoIds;
            return this;
        }
        public java.util.List<SubmitSmartClipTaskRequestInputConfigVideoIds> getVideoIds() {
            return this.videoIds;
        }

    }

    public static class SubmitSmartClipTaskRequestOutputConfig extends TeaModel {
        /**
         * <p>Number of output videos.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Output file name. Must include {index}.</p>
         * 
         * <strong>example:</strong>
         * <p>test_{index}.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Output video height.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>Maximum duration of the output video, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxDuration")
        public Integer maxDuration;

        /**
         * <p>Save to Content Management.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SaveToGeneratedContent")
        public Boolean saveToGeneratedContent;

        /**
         * <p>Output video width.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static SubmitSmartClipTaskRequestOutputConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestOutputConfig self = new SubmitSmartClipTaskRequestOutputConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestOutputConfig setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SubmitSmartClipTaskRequestOutputConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SubmitSmartClipTaskRequestOutputConfig setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SubmitSmartClipTaskRequestOutputConfig setMaxDuration(Integer maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }
        public Integer getMaxDuration() {
            return this.maxDuration;
        }

        public SubmitSmartClipTaskRequestOutputConfig setSaveToGeneratedContent(Boolean saveToGeneratedContent) {
            this.saveToGeneratedContent = saveToGeneratedContent;
            return this;
        }
        public Boolean getSaveToGeneratedContent() {
            return this.saveToGeneratedContent;
        }

        public SubmitSmartClipTaskRequestOutputConfig setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
