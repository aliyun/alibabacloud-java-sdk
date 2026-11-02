// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTranscodeJobsResponseBody extends TeaModel {
    /**
     * <p>The list of jobs.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListTranscodeJobsResponseBodyJobs> jobs;

    /**
     * <p>The token for the next page. Leave this parameter empty for the first request. The token is returned after the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>019daf5780f74831b0e1a767c9f1****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
     */
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
        /**
         * <p>The URL of the media asset stream. Specify this parameter only when you transcode a media asset stream.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>The media value.</p>
         * <ul>
         * <li>If Type is set to OSS, the value is a URL that supports the OSS and HTTP protocols.</li>
         * <li>If Type is set to Media, the value is a media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media object type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS file.</li>
         * <li>Media: Media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
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
        /**
         * <p>The media value.</p>
         * <ul>
         * <li>If Type is set to OSS, the value is a URL that supports the OSS and HTTP protocols.</li>
         * <li>If Type is set to Media, the value is a media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The URL of the transcoded output stream. Specify this parameter only when the output is a media asset stream.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/{MediaId}/{JobId}.mp4</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The media object type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS file.</li>
         * <li>Media: Media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
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
         * <p>The index of the audio stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 or exclude</p>
         */
        @NameInMap("AudioIndex")
        public String audioIndex;

        /**
         * <p>The duration of the input stream. Default value: the duration of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>20.0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The start time of the input stream. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("Start")
        public Double start;

        /**
         * <p>The index of the video stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 or exclude</p>
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
        /**
         * <p>The ciphertext of the standard encryption key.</p>
         * 
         * <strong>example:</strong>
         * <p>MTYi00NDU0LTg5O****</p>
         */
        @NameInMap("CipherText")
        public String cipherText;

        /**
         * <p>The URL of the decryption service for standard encryption.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sample.com/path?CipherText=MTYi00NDU0LTg5O">https://sample.com/path?CipherText=MTYi00NDU0LTg5O</a>****</p>
         */
        @NameInMap("DecryptKeyUri")
        public String decryptKeyUri;

        /**
         * <p>The encryption type.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateEncryption</p>
         */
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
        /**
         * <p>The media value:</p>
         * <ul>
         * <li>If the type is OSS, the value is a URL that supports the OSS and HTTP protocols.</li>
         * <li>If the type is Media, the value is a media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media object type. Valid values: </p>
         * <ul>
         * <li>OSS: OSS file.</li>
         * <li>Media: Media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
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
        /**
         * <p>The display duration. The value can be a number of seconds or ToEND.</p>
         * 
         * <strong>example:</strong>
         * <p>ToEND</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:05</p>
         */
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
        /**
         * <p>The x-coordinate of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The y-coordinate of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The watermark image file.</p>
         */
        @NameInMap("File")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The reference position. Valid values: TopLeft, TopRight, BottomLeft, and BottomRight. Default value: TopLeft.</p>
         * 
         * <strong>example:</strong>
         * <p>TopLeft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The display time settings.</p>
         */
        @NameInMap("Timeline")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
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
        /**
         * <p>The overwrite parameters. If specified, these parameters overwrite the corresponding parameters in the template.</p>
         */
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>9547c6ad97cb4f2aaa29683ebd18****</p>
         */
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
        /**
         * <p>The media value. If the type is OSS, the value is a URL that supports the OSS and HTTP protocols. If the type is Media, the value is a media asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The object type of the media. Valid values:</p>
         * <ul>
         * <li>OSS: OSS file.</li>
         * <li>Media: Media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
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
        /**
         * <p>The encoding format of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        @NameInMap("CharEnc")
        public String charEnc;

        /**
         * <p>The subtitle file.</p>
         */
        @NameInMap("File")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParamsFile file;

        /**
         * <p>The format of the subtitle file.</p>
         * 
         * <strong>example:</strong>
         * <p>vtt</p>
         */
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
        /**
         * <p>The overwrite parameters. If specified, these parameters overwrite the corresponding parameters in the template.</p>
         */
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>9547c6ad97cb4f2aaa29683ebd18****</p>
         */
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
        /**
         * <p>Specifies whether to adjust the font size based on the output video size. Valid values:</p>
         * <ul>
         * <li>true: The system automatically adjusts the font size of the text based on the output video size.</li>
         * <li>false: The font size remains fixed and is not affected by the output video size.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Adaptive")
        public String adaptive;

        /**
         * <p>The border color.</p>
         * 
         * <strong>example:</strong>
         * <p>#006400</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The border width.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <p>The watermark text. Base64 encoding is not required. The string must be UTF-8 encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Watermark</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The font transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("FontAlpha")
        public String fontAlpha;

        /**
         * <p>The font color.</p>
         * 
         * <strong>example:</strong>
         * <p>#006400</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font name.</p>
         * 
         * <strong>example:</strong>
         * <p>SimSun</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The distance from the left edge for the watermark position.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Left")
        public String left;

        /**
         * <p>The distance from the top edge for the watermark position.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The overwrite parameters. If specified, these parameters overwrite the corresponding parameters in the template.</p>
         */
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>9547c6ad97cb4f2aaa29683ebd18****</p>
         */
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
        /**
         * <p>The target integrated loudness.</p>
         * 
         * <strong>example:</strong>
         * <p>-6</p>
         */
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        /**
         * <p>The target loudness range.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        /**
         * <p>The volume adjustment method.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The peak volume.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
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
        /**
         * <p>The audio bitrate of the output file.</p>
         * <ul>
         * <li>Valid values: 8 to 1000.</li>
         * <li>Unit: Kbps.</li>
         * <li>Default value: 128.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of audio channels. Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec. Valid values: AAC, MP3, VORBIS, and FLAC. Default value: AAC.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The audio encoding profile. When the codec is AAC, valid values are aac_low, aac_he, aac_he_v2, aac_ld, and aac_eld.</p>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>Specifies whether to remove the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The sample rate.</p>
         * <ul>
         * <li>Default value: 44100.</li>
         * <li>Valid values: 22050, 32000, 44100, 48000, and 96000.</li>
         * <li>Unit: Hz.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The volume control settings.</p>
         */
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
        /**
         * <p>The container format.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
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
        /**
         * <p>The segment duration.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The forced segmentation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2,3</p>
         */
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
        /**
         * <p>The segmentation settings.</p>
         */
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
        /**
         * <p>The maximum adaptive bitrate (ABR). This parameter takes effect only when Narrowband HD 1.0 is enabled. Valid values: 10 to 50000. Unit: Kbps.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("AbrMax")
        public String abrMax;

        /**
         * <p>The average video bitrate.</p>
         * <ul>
         * <li>Valid values: 10 to 50000.</li>
         * <li>Unit: Kbit/s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The buffer size.</p>
         * <ul>
         * <li>Valid values: 1000 to 128000.</li>
         * <li>Default value: 6000.</li>
         * <li>Unit: Kb.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The Constant Rate Factor (CRF) for bitrate-quality control.</p>
         * <ul>
         * <li>Valid values: 0 to 51.</li>
         * <li>Default value: 23 for H.264 and 26 for H.265.</li>
         * </ul>
         * <p>If Crf is specified, the Bitrate setting becomes invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The video cropping settings. Two methods are supported:</p>
         * <ul>
         * <li>Automatically detect and crop black borders. Set the value to border.</li>
         * <li>Custom cropping. Format: width:height:left:top. Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The frame rate.</p>
         * <ul>
         * <li>Valid values: 0 (exclusive) to 60 (inclusive).</li>
         * <li>If the frame rate of the input file exceeds 60, the value 60 is used.</li>
         * <li>Default value: the frame rate of the input file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum number of frames between keyframes.</p>
         * <ul>
         * <li>Valid values: 1 to 1080000.</li>
         * <li>Default value: 250.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>250</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the video.</p>
         * <ul>
         * <li>Valid values: 128 to 4096.</li>
         * <li>Unit: pixels.</li>
         * <li>Default value: the original height of the video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>Specifies whether to enable adaptive orientation mode (long and short side mode).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LongShortMode")
        public String longShortMode;

        /**
         * <p>The peak video bitrate. Valid values: 10 to 50000. Unit: Kbps.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The video padding settings used to add black borders.</p>
         * <ul>
         * <li>Format: width:height:left:top.</li>
         * <li>Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The video algorithm preset. This parameter is supported only for H.264. Valid values: veryfast, fast, medium, slow, and slower.
         * Default value: medium.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The encoding profile. Valid values:</p>
         * <ul>
         * <li>baseline: For mobile devices.</li>
         * <li>main: For standard-resolution devices.</li>
         * <li>high: For high-resolution devices.</li>
         * </ul>
         * <p>Default value: high.</p>
         * 
         * <strong>example:</strong>
         * <p>Main</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>Specifies whether to remove the video.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The scan mode. Valid values: interlaced and progressive.</p>
         * 
         * <strong>example:</strong>
         * <p>progressive</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The width of the video.</p>
         * <ul>
         * <li>Valid values: 128 to 4096.</li>
         * <li>Unit: pixels.</li>
         * <li>Default value: the original width of the video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
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
        /**
         * <p>The audio settings.</p>
         */
        @NameInMap("Audio")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio;

        /**
         * <p>The container format settings.</p>
         */
        @NameInMap("Container")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsContainer container;

        /**
         * <p>The multiplexing settings.</p>
         */
        @NameInMap("MuxConfig")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        /**
         * <p>The tags to add to the media stream.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        /**
         * <p>The video settings.</p>
         */
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
        /**
         * <p>The overwrite parameters. If specified, these parameters overwrite the corresponding parameters in the template.</p>
         */
        @NameInMap("OverwriteParams")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>9547c6ad97cb4f2aaa29683ebd18****</p>
         */
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
        /**
         * <p>The multi-input mixing configuration.</p>
         */
        @NameInMap("CombineConfigs")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigCombineConfigs> combineConfigs;

        /**
         * <p>The encryption configuration.</p>
         */
        @NameInMap("Encryption")
        public ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigEncryption encryption;

        /**
         * <p>The image watermark settings.</p>
         */
        @NameInMap("ImageWatermarks")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigImageWatermarks> imageWatermarks;

        /**
         * <p>Specifies whether to inherit the tags of the input stream. This parameter does not take effect if the input is not a media asset. Default value: false.</p>
         */
        @NameInMap("IsInheritTags")
        public Boolean isInheritTags;

        /**
         * <p>The subtitle configuration.</p>
         */
        @NameInMap("Subtitles")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigSubtitles> subtitles;

        /**
         * <p>The text watermark settings.</p>
         */
        @NameInMap("TextWatermarks")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroupProcessConfigTextWatermarks> textWatermarks;

        /**
         * <p>The transcoding configuration.</p>
         */
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
        /**
         * <p>The output media configuration.</p>
         */
        @NameInMap("Output")
        public ListTranscodeJobsResponseBodyJobsOutputGroupOutput output;

        /**
         * <p>The processing configuration of the job.</p>
         */
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
        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e37ebee5d98b4781897f6086e89f****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. A larger value indicates a higher priority. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>The time when the job was created. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-12T08:49:41Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job was completed. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-12T08:49:41Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The input group of the job. A single input indicates a transcoding job. Multiple inputs indicate an audio and video merging job.</p>
         */
        @NameInMap("InputGroup")
        public java.util.List<ListTranscodeJobsResponseBodyJobsInputGroup> inputGroup;

        /**
         * <p>The number of sub-jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("JobCount")
        public Integer jobCount;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>transcode-job</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output group of the job.</p>
         */
        @NameInMap("OutputGroup")
        public java.util.List<ListTranscodeJobsResponseBodyJobsOutputGroup> outputGroup;

        /**
         * <p>The ID of the parent job.</p>
         * 
         * <strong>example:</strong>
         * <p>8b2198504dd340b7b3c9842a74fc****</p>
         */
        @NameInMap("ParentJobId")
        public String parentJobId;

        /**
         * <p>The completion percentage of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The request ID used to submit the job.</p>
         * 
         * <strong>example:</strong>
         * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The job scheduling configuration.</p>
         */
        @NameInMap("ScheduleConfig")
        public ListTranscodeJobsResponseBodyJobsScheduleConfig scheduleConfig;

        /**
         * <p>The status of the job. Valid values: </p>
         * <ul>
         * <li>Success: The job is successful if at least one sub-job succeeds after all sub-jobs are completed. </li>
         * <li>Fail: The job fails if all sub-jobs fail.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was submitted. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-12T08:49:41Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The source that triggered the job. Valid values:</p>
         * <ul>
         * <li>API: API.</li>
         * <li>WorkFlow: Workflow.</li>
         * <li>Console: Console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("TriggerSource")
        public String triggerSource;

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>user-data</p>
         */
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
