// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The input group of the job. An input of a single file indicates a transcoding job. An input of multiple files indicates an audio and video stream merge job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("InputGroup")
    public java.util.List<SubmitTranscodeJobRequestInputGroup> inputGroup;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output group of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user-data</p>
     */
    @NameInMap("OutputGroup")
    public java.util.List<SubmitTranscodeJobRequestOutputGroup> outputGroup;

    /**
     * <p>The scheduling information about the job.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitTranscodeJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>The custom settings. The value must be in the JSON format and can be up to 512 bytes in length. You can specify a <a href="https://help.aliyun.com/document_detail/451631.html">custom callback URL</a>.</p>
     * 
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
         * <p>The URL of the input stream.</p>
         * <ul>
         * <li>This parameter takes effect only when Type is set to Media. You can select a specific file within the media asset as an input.</li>
         * <li>The system checks whether the input URL exists within the media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, set this parameter to the URL of an OSS object. Both the OSS and HTTP protocols are supported.</li>
         * </ul>
         * <blockquote>
         * <p> Before you use the OSS bucket in the URL, you must add the bucket on the <a href="https://help.aliyun.com/document_detail/440592.html">Storage Management</a> page of the Intelligent Media Services (IMS) console.</p>
         * </blockquote>
         * <ul>
         * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an Object Storage Service (OSS) object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
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
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, set this parameter to the URL of an OSS object. Both the OSS and HTTP protocols are supported.</li>
         * </ul>
         * <blockquote>
         * <p> Before you use the OSS bucket in the URL, you must add the bucket on the <a href="https://help.aliyun.com/document_detail/440592.html">Storage Management</a> page of the IMS console.</p>
         * </blockquote>
         * <ul>
         * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The URL of the output stream.\
         * This parameter takes effect only when Type is set to Media. You can select a specific file within the media asset as an output.\
         * Supported placeholders:</p>
         * <ul>
         * <li>{MediaId}: the ID of the media asset.</li>
         * <li>{JobId}: the ID of the transcoding subjob.</li>
         * <li>{MediaBucket}: the bucket to which the media asset belongs.</li>
         * <li>{ExtName}: the file suffix, which uses the output format of the transcoding template.</li>
         * <li>{DestMd5}: the MD5 value of the transcoded output file.\
         * Notes:</li>
         * </ul>
         * <ol>
         * <li>This parameter must contain the {MediaId} and {JobId} placeholders.</li>
         * <li>The output bucket is the same as the bucket to which the media asset belongs.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/{MediaId}/{JobId}.mp4</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
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
         * <p>The audio stream index.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 或 exclude</p>
         */
        @NameInMap("AudioIndex")
        public String audioIndex;

        /**
         * <p>The duration of the input stream. The default value is the duration of the video.</p>
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
         * <p>The video stream index.</p>
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
         * <p>The ciphertext of HTTP Live Streaming (HLS) encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>MTYi00NDU0LTg5O****</p>
         */
        @NameInMap("CipherText")
        public String cipherText;

        /**
         * <p>The address of the decryption service for HLS encryption.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sample.com/path?CipherText=MTYi00NDU0LTg5O">https://sample.com/path?CipherText=MTYi00NDU0LTg5O</a>****</p>
         */
        @NameInMap("DecryptKeyUri")
        public String decryptKeyUri;

        /**
         * <p>Specifies the encryption type. Valid values:</p>
         * <ul>
         * <li>PrivateEncryption: Alibaba Cloud proprietary cryptography</li>
         * <li>HLSEncryption: HTTP Live Streaming (HLS) encryption</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivateEncryption</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>The key service type for HLS encryption. Valid values:</p>
         * <ul>
         * <li>KMS</li>
         * <li>Base64</li>
         * </ul>
         * 
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
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, set this parameter to the URL of an OSS object. Both the OSS and HTTP protocols are supported.</li>
         * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * 
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
         * <p>The time range in which the watermark is displayed.</p>
         * <ul>
         * <li>Valid values: integers and ToEND.</li>
         * <li>Default value: ToEND.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ToEND</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The beginning of the time range in which the watermark is displayed.</p>
         * <ul>
         * <li>Unit: seconds.</li>
         * <li>Value values: integers.</li>
         * <li>Default value: 0.</li>
         * </ul>
         * 
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
         * <p>The horizontal offset of the watermark relative to the output video. Default value: 0.</p>
         * <p>The following value types are supported:</p>
         * <ul>
         * <li><p>Integer: the pixel value of the horizontal offset.</p>
         * <ul>
         * <li>Valid values: [8,4096].</li>
         * <li>Unit: pixels.</li>
         * </ul>
         * </li>
         * <li><p>Decimal: the ratio of the horizontal offset to the width of the output video.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The vertical offset of the watermark relative to the output video. Default value: 0.</p>
         * <p>The following value types are supported:</p>
         * <ul>
         * <li><p>Integer: the pixel value of the horizontal offset.</p>
         * <ul>
         * <li>Valid values: [8,4096].</li>
         * <li>Unit: pixels.</li>
         * </ul>
         * </li>
         * <li><p>Decimal: the ratio of the vertical offset to the height of the output video.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
         * </ul>
         * </li>
         * </ul>
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
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsFile file;

        /**
         * <p>The height of the watermark image in the output video. The following value types are supported:</p>
         * <ul>
         * <li><p>Integer: the pixel value of the watermark height.</p>
         * <ul>
         * <li>Valid values: [8,4096].</li>
         * <li>Unit: pixels.</li>
         * </ul>
         * </li>
         * <li><p>Decimal: the ratio of the watermark height to the height of the output video.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The position of the watermark.</p>
         * <ul>
         * <li>Valid values: TopRight, TopLeft, BottomRight, and BottomLeft.</li>
         * <li>Default value: TopRight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TopLeft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The time settings of the dynamic watermark.</p>
         */
        @NameInMap("Timeline")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParamsTimeline timeline;

        /**
         * <p>The width of the watermark in the output video. The following value types are supported:</p>
         * <ul>
         * <li><p>Integer: the pixel value of the watermark width.</p>
         * <ul>
         * <li>Valid values: [8,4096].</li>
         * <li>Unit: pixels.</li>
         * </ul>
         * </li>
         * <li><p>Decimal: the ratio of the watermark width to the width of the output video.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
         * </ul>
         * </li>
         * </ul>
         * 
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
        /**
         * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
         */
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarksOverwriteParams overwriteParams;

        /**
         * <p>The template ID.</p>
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
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, set this parameter to the URL of an OSS object. Both the OSS and HTTP protocols are supported.</li>
         * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * 
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
         * <p>The file encoding format.</p>
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
        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParamsFile file;

        /**
         * <p>The format of the subtitle file.</p>
         * 
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
        /**
         * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
         */
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitlesOverwriteParams overwriteParams;

        /**
         * <p>The template ID.</p>
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
         * <p>Specifies whether to the font size based on the output video dimensions. true / false, default: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Adaptive")
        public String adaptive;

        /**
         * <p>The outline color of the text watermark. Default value: black. For more information, see BorderColor.</p>
         * 
         * <strong>example:</strong>
         * <p>#006400</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The outline width of the text watermark.</p>
         * <ul>
         * <li>Default value: 0.</li>
         * <li>Valid values: (0,4096].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <p>The watermark text. Base64 encoding is not required. The string must be encoded in UTF-8.</p>
         * 
         * <strong>example:</strong>
         * <p>测试水印</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The transparency of the text.</p>
         * <ul>
         * <li>Valid values: (0,1].</li>
         * <li>Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("FontAlpha")
        public String fontAlpha;

        /**
         * <p>The color of the text.</p>
         * 
         * <strong>example:</strong>
         * <p>#006400</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font of the text. Default value: SimSun.</p>
         * 
         * <strong>example:</strong>
         * <p>SimSun</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The size of the text.</p>
         * <ul>
         * <li>Default value: 16.</li>
         * <li>Valid values: (4,120).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The left margin of the text watermark.</p>
         * <ul>
         * <li>Default value: 0.</li>
         * <li>Valid values: [0,4096].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Left")
        public String left;

        /**
         * <p>The top margin of the text.</p>
         * <ul>
         * <li>Default value: 0.</li>
         * <li>Valid values: [0,4096].</li>
         * </ul>
         * 
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
        /**
         * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
         */
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarksOverwriteParams overwriteParams;

        /**
         * <p>The template ID.</p>
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
         * <p>The output volume.</p>
         * 
         * <strong>example:</strong>
         * <p>-6</p>
         */
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        /**
         * <p>The volume range.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        /**
         * <p>The volume adjustment method. Valid values:</p>
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
         * <p>The audio bitrate of the output file. Valid values: [8,1000]. Unit: Kbit/s. Default value: 128.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels. Default value: 2.</p>
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
         * <p>The audio codec profile. If the Codec parameter is set to AAC, the valid values are aac_low, aac_he, aac_he_v2, aac_ld, and aac_eld.</p>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>Specifies whether to delete the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The sampling rate. Valid values: 22050, 32000, 44100, 48000, and 96000. Default value: 44100. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The volume configurations.</p>
         */
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
         * <p>The container format.</p>
         * 
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
         * <p>The segment length.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The forced segmentation point in time.</p>
         * 
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
        /**
         * <p>The segment settings.</p>
         */
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
        /**
         * <p>The method that is used to adjust the resolution. This parameter takes effect only if both the Width and Height parameters are specified. You can use this parameter together with the LongShortMode parameter.</p>
         * <p>Valid values: rescale, crop, pad, and none.</p>
         * <p>Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>Specifies whether to check the audio bitrate. You can specify only one of the IsCheckAudioBitrate and IsCheckAudioBitrateFail parameters. The priority of the IsCheckAudioBitrateFail parameter is higher. Valid values:</p>
         * <ul>
         * <li>true: checks the video resolution. If the bitrate of the input audio is less than that of the output audio, the bitrate of the input audio is used for transcoding.</li>
         * <li>false: does not check the video resolution.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>If this parameter is not specified and the codec of the output audio is different from that of the input audio, the default value is false.</li>
         * <li>If this parameter is not specified and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>Specifies whether to check the audio bitrate. You can specify only one of the IsCheckAudioBitrate and IsCheckAudioBitrateFail parameters. The priority of the IsCheckAudioBitrateFail parameter is higher. Valid values:</p>
         * <ul>
         * <li>true: checks the video resolution. If the bitrate of the input audio is less than that of the output audio, the transcoding job fails.</li>
         * <li>false: does not check the video resolution.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Specifies whether to check the video resolution. You can specify only one of the IsCheckReso and IsCheckResoFail parameters. The priority of the IsCheckResoFail parameter is higher. Valid values:</p>
         * <ul>
         * <li>true: checks the video resolution. If the width or height of the input video is less than that of the output video, the resolution of the input video is used for transcoding.</li>
         * <li>false: does not check the video resolution.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Specifies whether to check the video resolution. You can specify only one of the IsCheckReso and IsCheckResoFail parameters. The priority of the IsCheckResoFail parameter is higher. Valid values:</p>
         * <ul>
         * <li>true: checks the video resolution. If the width or height of the input video is less than that of the output video, the transcoding job fails.</li>
         * <li>false: does not check the video resolution.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Specifies whether to check the video bitrate. You can specify only one of the IsCheckVideoBitrate and IsCheckVideoBitrateFail parameters. The priority of the IsCheckVideoBitrateFail parameter is higher. Valid values:</p>
         * <ul>
         * <li>true: checks the video resolution. If the bitrate of the input video is less than that of the output video, the bitrate of the input video is used for transcoding.</li>
         * <li>false: does not check the video resolution.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <p>Specifies whether to check the video bitrate. You can specify only one of the IsCheckVideoBitrate and IsCheckVideoBitrateFail parameters. The priority of the IsCheckVideoBitrateFail parameter is higher. Valid values:</p>
         * <ul>
         * <li>true: checks the video resolution. If the bitrate of the input video is less than that of the output video, the transcoding job fails.</li>
         * <li>false: does not check the video resolution.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The video transcoding mode. Valid values:</p>
         * <ul>
         * <li>onepass: You can set this parameter to onepass if the Bitrate parameter is set to ABR. The encoding speed of this mode is faster than that of the twopass mode.</li>
         * <li>twopass: You can set this parameter to twopass if the Bitrate parameter is set to VBR. The encoding speed of this mode is slower than that of the onepass mode.</li>
         * <li>CBR: the constant bitrate mode.</li>
         * </ul>
         * <p>Default value: onepass.</p>
         * 
         * <strong>example:</strong>
         * <p>onepass</p>
         */
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
         * <p>The maximum adaptive bitrate (ABR). This parameter takes effect only for Narrowband HD 1.0. Valid values: [10,50000]. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("AbrMax")
        public String abrMax;

        /**
         * <p>The average video bitrate. Valid values: [10,50000]. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The buffer size. Valid values: [1000,128000]. Default value: 6000. Unit: KB.</p>
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
         * <p>The constant rate factor (CRF). Valid values: [0,51]. Default value: 23 if the encoding format is H.264, or 26 if the encoding format is H.265.</p>
         * <blockquote>
         * <p> If this parameter is specified, the setting of the bitrate becomes invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The method of video cropping. Valid values:</p>
         * <ul>
         * <li>border: automatically detects and removes black bars.</li>
         * <li>A value in the width:height:left:top format: crops the videos based on the custom settings. Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The frame rate. Valid values:(0,60]. Default value: the frame rate of the input file.</p>
         * <blockquote>
         * <p> The value is 60 if the frame rate of the input file exceeds 60.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum number of frames between keyframes. Valid values: [1,1080000]. Default value: 250.</p>
         * 
         * <strong>example:</strong>
         * <p>250</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the video. Valid values: [128,4096]. Unit: pixels. Default value: the original height of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>Specifies whether to enable the auto-rotate screen feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LongShortMode")
        public String longShortMode;

        /**
         * <p>The maximum bitrate of the video. Valid values: [10,50000]. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The black bars added to the video. Format: width:height:left:top. Example: 1280:800:0:140.</p>
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
         * <p>The preset video algorithm. This parameter takes effect only if the encoding format is H.264. Valid values: veryfast, fast, medium, slow, and slower. Default value: medium.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The encoding profile. Valid values: baseline, main, and high.</p>
         * <ul>
         * <li>baseline: applicable to mobile devices.</li>
         * <li>main: applicable to standard-definition devices.</li>
         * <li>high: applicable to high-definition devices.</li>
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
         * <p>The width of the video. Valid values: [128,4096]. Unit: pixels. Default value: the original width of the video.</p>
         * 
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
        /**
         * <p>The audio settings.</p>
         */
        @NameInMap("Audio")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsAudio audio;

        /**
         * <p>The encapsulation format settings.</p>
         */
        @NameInMap("Container")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsContainer container;

        /**
         * <p>The encapsulation settings.</p>
         */
        @NameInMap("MuxConfig")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsMuxConfig muxConfig;

        /**
         * <p>The conditional transcoding configurations.</p>
         */
        @NameInMap("TransConfig")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParamsTransConfig transConfig;

        /**
         * <p>The video settings.</p>
         */
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
        /**
         * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
         */
        @NameInMap("OverwriteParams")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigTranscodeOverwriteParams overwriteParams;

        /**
         * <p>The template ID.</p>
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
        /**
         * <p>The multi-input stream merge configuration.</p>
         */
        @NameInMap("CombineConfigs")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigCombineConfigs> combineConfigs;

        /**
         * <p>The encryption settings.</p>
         */
        @NameInMap("Encryption")
        public SubmitTranscodeJobRequestOutputGroupProcessConfigEncryption encryption;

        /**
         * <p>The watermark configuration of an image.</p>
         */
        @NameInMap("ImageWatermarks")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigImageWatermarks> imageWatermarks;

        /**
         * <p>The subtitle configuration.</p>
         */
        @NameInMap("Subtitles")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigSubtitles> subtitles;

        /**
         * <p>The configurations of the text watermark.</p>
         */
        @NameInMap("TextWatermarks")
        public java.util.List<SubmitTranscodeJobRequestOutputGroupProcessConfigTextWatermarks> textWatermarks;

        /**
         * <p>The transcoding configuration.</p>
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
         * <p>The output file configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Output")
        public SubmitTranscodeJobRequestOutputGroupOutput output;

        /**
         * <p>The job processing configuration.</p>
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
         * <p>The ID of the MPS queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>e37ebee5d98b4781897f6086e89f9c56</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. Valid values: 1 to 10. The greater the value, the higher the priority.</p>
         * 
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
