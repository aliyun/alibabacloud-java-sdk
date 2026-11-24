// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmEmbedTaskRequest extends TeaModel {
    /**
     * <p>The audio control parameters.</p>
     */
    @NameInMap("AudioControl")
    public CreateWmEmbedTaskRequestAudioControl audioControl;

    /**
     * <p>The CSV watermark embedding control parameters.</p>
     */
    @NameInMap("CsvControl")
    public CreateWmEmbedTaskRequestCsvControl csvControl;

    /**
     * <p>The document watermark control parameters.</p>
     */
    @NameInMap("DocumentControl")
    public CreateWmEmbedTaskRequestDocumentControl documentControl;

    /**
     * <p>The active URL for downloading the file to be embedded. The URL must support public network access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/abc****.pdf">https://example.com/abc****.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The file name of the file to be embedded. The backend determines and verifies the file type based on the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc****.pdf</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>The image watermark control parameters.</p>
     */
    @NameInMap("ImageControl")
    public CreateWmEmbedTaskRequestImageControl imageControl;

    /**
     * <p>The image watermark parameter that specifies the expected JPEG compression quality factor of the output image. Default value: 95. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("ImageEmbedJpegQuality")
    public Long imageEmbedJpegQuality;

    /**
     * <p>The image watermark parameter that specifies the embedding level. A larger value indicates higher robustness but lower visual quality. Default value: 2. Valid values: 0 to 4.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ImageEmbedLevel")
    public Long imageEmbedLevel;

    /**
     * <p>Specifies whether to enable invisible watermark embedding. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     */
    @NameInMap("InvisibleEnable")
    public Boolean invisibleEnable;

    /**
     * <p>The short video watermark parameter that specifies the video bitrate. By default, the system automatically obtains the video bitrate. You can use this parameter to force the bitrate used during extraction. Typically, you do not need to set this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>3000k</p>
     */
    @NameInMap("VideoBitrate")
    public String videoBitrate;

    /**
     * <p>The video control parameters.</p>
     */
    @NameInMap("VideoControl")
    public CreateWmEmbedTaskRequestVideoControl videoControl;

    /**
     * <p>The video watermark parameter that specifies whether to use the long video watermark SDK. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VideoIsLong")
    public Boolean videoIsLong;

    /**
     * <p>The watermark information in Base64-encoded string format. If you set this parameter, you cannot set WmInfoUint.</p>
     * 
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <p>The capacity bit width of the watermark information. Default value: 32. This parameter must be consistent during embedding and extraction. For example, if a 40-bit SDK is used for embedding, you must also set this value to 40 for extraction.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>The watermark information in decimal numeric format. If you set this parameter, you cannot set WmInfoBytesB64.</p>
     * <p>The valid value range depends on the WmInfoSize parameter:</p>
     * <ul>
     * <li><p>When WmInfoSize is 32, the valid values are 1 to 4294967295.</p>
     * </li>
     * <li><p>When WmInfoSize is 40, the valid values are 1 to 1099511627775.</p>
     * </li>
     * <li><p>When WmInfoSize is 64, the valid values are 1 to 18446744073709551615.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>The watermark type. Valid values:</p>
     * <ul>
     * <li><strong>PureDocument</strong>: Document watermark.</li>
     * <li><strong>PureImage</strong>: Image watermark.</li>
     * <li><strong>PureAudio</strong>: Audio watermark.</li>
     * <li><strong>PureVideo</strong>: Video watermark.</li>
     * <li><strong>AigcDocument</strong>: AIGC document watermark.</li>
     * <li><strong>AigcImage</strong>: AIGC image watermark.</li>
     * <li><strong>AigcAudio</strong>: AIGC audio watermark.</li>
     * <li><strong>AigcVideo</strong>: AIGC video watermark.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureDocument</p>
     */
    @NameInMap("WmType")
    public String wmType;

    public static CreateWmEmbedTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmEmbedTaskRequest self = new CreateWmEmbedTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmEmbedTaskRequest setAudioControl(CreateWmEmbedTaskRequestAudioControl audioControl) {
        this.audioControl = audioControl;
        return this;
    }
    public CreateWmEmbedTaskRequestAudioControl getAudioControl() {
        return this.audioControl;
    }

    public CreateWmEmbedTaskRequest setCsvControl(CreateWmEmbedTaskRequestCsvControl csvControl) {
        this.csvControl = csvControl;
        return this;
    }
    public CreateWmEmbedTaskRequestCsvControl getCsvControl() {
        return this.csvControl;
    }

    public CreateWmEmbedTaskRequest setDocumentControl(CreateWmEmbedTaskRequestDocumentControl documentControl) {
        this.documentControl = documentControl;
        return this;
    }
    public CreateWmEmbedTaskRequestDocumentControl getDocumentControl() {
        return this.documentControl;
    }

    public CreateWmEmbedTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateWmEmbedTaskRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public CreateWmEmbedTaskRequest setImageControl(CreateWmEmbedTaskRequestImageControl imageControl) {
        this.imageControl = imageControl;
        return this;
    }
    public CreateWmEmbedTaskRequestImageControl getImageControl() {
        return this.imageControl;
    }

    public CreateWmEmbedTaskRequest setImageEmbedJpegQuality(Long imageEmbedJpegQuality) {
        this.imageEmbedJpegQuality = imageEmbedJpegQuality;
        return this;
    }
    public Long getImageEmbedJpegQuality() {
        return this.imageEmbedJpegQuality;
    }

    public CreateWmEmbedTaskRequest setImageEmbedLevel(Long imageEmbedLevel) {
        this.imageEmbedLevel = imageEmbedLevel;
        return this;
    }
    public Long getImageEmbedLevel() {
        return this.imageEmbedLevel;
    }

    public CreateWmEmbedTaskRequest setInvisibleEnable(Boolean invisibleEnable) {
        this.invisibleEnable = invisibleEnable;
        return this;
    }
    public Boolean getInvisibleEnable() {
        return this.invisibleEnable;
    }

    public CreateWmEmbedTaskRequest setVideoBitrate(String videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public String getVideoBitrate() {
        return this.videoBitrate;
    }

    public CreateWmEmbedTaskRequest setVideoControl(CreateWmEmbedTaskRequestVideoControl videoControl) {
        this.videoControl = videoControl;
        return this;
    }
    public CreateWmEmbedTaskRequestVideoControl getVideoControl() {
        return this.videoControl;
    }

    public CreateWmEmbedTaskRequest setVideoIsLong(Boolean videoIsLong) {
        this.videoIsLong = videoIsLong;
        return this;
    }
    public Boolean getVideoIsLong() {
        return this.videoIsLong;
    }

    public CreateWmEmbedTaskRequest setWmInfoBytesB64(String wmInfoBytesB64) {
        this.wmInfoBytesB64 = wmInfoBytesB64;
        return this;
    }
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    public CreateWmEmbedTaskRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public CreateWmEmbedTaskRequest setWmInfoUint(String wmInfoUint) {
        this.wmInfoUint = wmInfoUint;
        return this;
    }
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    public CreateWmEmbedTaskRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

    public static class CreateWmEmbedTaskRequestAudioControlMetadataControl extends TeaModel {
        /**
         * <p>Specifies whether to enable the metadata. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Disabled.</li>
         * <li><strong>true</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The Base64-encoded metadata. You must encode a string in the format of AIGC={&quot;Label&quot;:&quot;1&quot;,&quot;ContentProducer&quot;:&quot;AXXXX&quot;,&quot;ProduceID&quot;:&quot;BXXXX&quot;,&quot;ReservedCode1&quot;:&quot;CXXX&quot;,&quot;ContentPropagator&quot;:&quot;DXXX&quot;,&quot;PropagateID&quot;:&quot;EXXX&quot;,&quot;ReservedCode2&quot;:&quot;FXXXX&quot;} into a Base64 string. Note: 1. The &quot;AIGC=&quot; prefix is required. Otherwise, the metadata cannot be added. Note that the prefix is different from that of image metadata. 2. The Base64 string must be in the standard format and include padding.</p>
         * 
         * <strong>example:</strong>
         * <p>QUlHQz17IkxhYmVsIjoiMSIsIkNvbnRlbnRQcm9kdWNlciI6IkFYWFhYIiwiUHJvZHVjZUlEIjoiQlhYWFgsIlJlc2VydmVkQ29kZTEiOiJDWFhYIiwiQ29udGVudFByb3BhZ2F0b3IiOiJEWFhYIiwiUHJvcGFnYXRlSUQiOiJFWFhYIiwiUmVzZXJ2ZWRDb2RlMiI6IkZYWFhYIn0=</p>
         */
        @NameInMap("XmpKvBase64")
        public String xmpKvBase64;

        public static CreateWmEmbedTaskRequestAudioControlMetadataControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestAudioControlMetadataControl self = new CreateWmEmbedTaskRequestAudioControlMetadataControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestAudioControlMetadataControl setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateWmEmbedTaskRequestAudioControlMetadataControl setXmpKvBase64(String xmpKvBase64) {
            this.xmpKvBase64 = xmpKvBase64;
            return this;
        }
        public String getXmpKvBase64() {
            return this.xmpKvBase64;
        }

    }

    public static class CreateWmEmbedTaskRequestAudioControl extends TeaModel {
        /**
         * <p>The audio metadata control parameters.</p>
         */
        @NameInMap("MetadataControl")
        public CreateWmEmbedTaskRequestAudioControlMetadataControl metadataControl;

        public static CreateWmEmbedTaskRequestAudioControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestAudioControl self = new CreateWmEmbedTaskRequestAudioControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestAudioControl setMetadataControl(CreateWmEmbedTaskRequestAudioControlMetadataControl metadataControl) {
            this.metadataControl = metadataControl;
            return this;
        }
        public CreateWmEmbedTaskRequestAudioControlMetadataControl getMetadataControl() {
            return this.metadataControl;
        }

    }

    public static class CreateWmEmbedTaskRequestCsvControl extends TeaModel {
        /**
         * <p>The bit width of the timestamp watermark information, which specifies how much information a single timestamp can hold. A larger value theoretically requires fewer rows to extract the information, but the time modification magnitude increases. The magnitude range is the nth power of 2, where n is the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EmbedBitsNumberInEachTime")
        public Long embedBitsNumberInEachTime;

        /**
         * <p>The specified embedding column. We recommend that you use a string content column. The count starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmbedColumn")
        public Long embedColumn;

        /**
         * <p>The zero-width character watermark parameter that specifies the embedding density. The value is a floating-point number between 0 and 1. A value of 0 indicates that only the first row is embedded. A value of 1 indicates that all rows are embedded.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmbedDensity")
        public String embedDensity;

        /**
         * <p>The modification precision, which indicates the modification magnitude as the nth power of 10. For example, 0 indicates a modification precision of 10^0, which is the ones place. -1 indicates the first decimal place. 1 indicates the tens place. If the float data does not have this precision part, it is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("EmbedPrecision")
        public Long embedPrecision;

        /**
         * <p>The timestamp watermark parameter that specifies the watermark embedding position. Valid values: Min (minute), Sec (second), and MilSec (millisecond). You can specify only one of them. The algorithm modifies the data at the specified position.</p>
         * 
         * <strong>example:</strong>
         * <p>Sec</p>
         */
        @NameInMap("EmbedTimePosition")
        public String embedTimePosition;

        /**
         * <p>The watermark embedding method. Valid values:</p>
         * <ul>
         * <li><strong>lossless_row_shift_embed</strong>: Lossless data method.</li>
         * <li><strong>lossy_number_embed</strong>: Lossy data method.</li>
         * <li><strong>lossy_time_stamp_embed</strong>: Timestamp method.</li>
         * <li><strong>lossy_zero_width_embed</strong>: Zero-width character method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lossy_zero_width_embed</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The timestamp watermark parameter that specifies the format string for parsing timestamps in the CSV file. For example, if the timestamp in the CSV file is similar to &quot;2023-10-15 13:20:59:342&quot;, the corresponding format string is &quot;Year-Mon-Day Hour:Min:Sec.MilSec&quot;. You must enter &quot;Year-Mon-Day Hour:Min:Sec.MilSec&quot; here. After the watermark is embedded, the output still follows this format. If you enter it incorrectly, this method cannot be used. The year, month, day, hour, minute, second, and millisecond in the format string must be written as described above. The connector must be a single non-character English connector, which can generally be &quot;:&quot;, &quot;/&quot;, &quot;-&quot;, or &quot; &quot; (space). &quot;T&quot; and &quot;Z&quot; are also supported as connectors. Other time formats are not supported for parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>Hour:Min:Sec</p>
         */
        @NameInMap("TimeFormat")
        public String timeFormat;

        public static CreateWmEmbedTaskRequestCsvControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestCsvControl self = new CreateWmEmbedTaskRequestCsvControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedBitsNumberInEachTime(Long embedBitsNumberInEachTime) {
            this.embedBitsNumberInEachTime = embedBitsNumberInEachTime;
            return this;
        }
        public Long getEmbedBitsNumberInEachTime() {
            return this.embedBitsNumberInEachTime;
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedColumn(Long embedColumn) {
            this.embedColumn = embedColumn;
            return this;
        }
        public Long getEmbedColumn() {
            return this.embedColumn;
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedDensity(String embedDensity) {
            this.embedDensity = embedDensity;
            return this;
        }
        public String getEmbedDensity() {
            return this.embedDensity;
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedPrecision(Long embedPrecision) {
            this.embedPrecision = embedPrecision;
            return this;
        }
        public Long getEmbedPrecision() {
            return this.embedPrecision;
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedTimePosition(String embedTimePosition) {
            this.embedTimePosition = embedTimePosition;
            return this;
        }
        public String getEmbedTimePosition() {
            return this.embedTimePosition;
        }

        public CreateWmEmbedTaskRequestCsvControl setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateWmEmbedTaskRequestCsvControl setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }
        public String getTimeFormat() {
            return this.timeFormat;
        }

    }

    public static class CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl extends TeaModel {
        /**
         * <p>The opacity parameter of the invisible background watermark. Valid values: 1 to 13. A larger value indicates lower transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Opacity")
        public Long opacity;

        public static CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl self = new CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl setOpacity(Long opacity) {
            this.opacity = opacity;
            return this;
        }
        public Long getOpacity() {
            return this.opacity;
        }

    }

    public static class CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl extends TeaModel {
        /**
         * <p>The counterclockwise rotation angle of the visible watermark text. Valid values: 1 to 360.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <p>The color of the visible watermark text. The format is 0xFFFFFF RGB color format. For example, 0x000000 indicates black.</p>
         * 
         * <strong>example:</strong>
         * <p>0x000000</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font size of the visible watermark text. A larger value indicates a larger font size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Long fontSize;

        /**
         * <p>This parameter takes effect when Mode is set to repeat. The number of times the visible watermark repeats horizontally.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HorizontalNumber")
        public Long horizontalNumber;

        /**
         * <p>The visible background watermark mode. Valid values:</p>
         * <ul>
         * <li><strong>pos</strong>: Embeds a single visible watermark text at a specific position in the background.</li>
         * <li><strong>repeat</strong>: Tiles and embeds multiple visible watermark texts in the document background.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pos</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The opacity parameter of the visible watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Opacity")
        public Long opacity;

        /**
         * <p>This parameter takes effect when Mode is set to pos. The parameter that controls the horizontal position of the visible watermark, with the lower-left corner as the origin. When the value is between 0 and 1, it controls the position by proportion. When the value is greater than 1, it controls the exact pixel position.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("PosX")
        public String posX;

        /**
         * <p>This parameter takes effect when Mode is set to pos. The parameter that controls the vertical position of the visible watermark, with the lower-left corner as the origin. When the value is between 0 and 1, it controls the position by proportion. When the value is greater than 1, it controls the exact pixel position.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("PosY")
        public String posY;

        /**
         * <p>This parameter takes effect when Mode is set to repeat. The number of times the visible watermark repeats vertically.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("VerticalNumber")
        public Long verticalNumber;

        /**
         * <p>The text of the visible background watermark. The format is a UTF-8 string.</p>
         * 
         * <strong>example:</strong>
         * <p>hello ****</p>
         */
        @NameInMap("VisibleText")
        public String visibleText;

        public static CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl self = new CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setFontSize(Long fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Long getFontSize() {
            return this.fontSize;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setHorizontalNumber(Long horizontalNumber) {
            this.horizontalNumber = horizontalNumber;
            return this;
        }
        public Long getHorizontalNumber() {
            return this.horizontalNumber;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setOpacity(Long opacity) {
            this.opacity = opacity;
            return this;
        }
        public Long getOpacity() {
            return this.opacity;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setPosX(String posX) {
            this.posX = posX;
            return this;
        }
        public String getPosX() {
            return this.posX;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setPosY(String posY) {
            this.posY = posY;
            return this;
        }
        public String getPosY() {
            return this.posY;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setVerticalNumber(Long verticalNumber) {
            this.verticalNumber = verticalNumber;
            return this;
        }
        public Long getVerticalNumber() {
            return this.verticalNumber;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setVisibleText(String visibleText) {
            this.visibleText = visibleText;
            return this;
        }
        public String getVisibleText() {
            return this.visibleText;
        }

    }

    public static class CreateWmEmbedTaskRequestDocumentControlBackgroundControl extends TeaModel {
        /**
         * <p>Specifies whether to add an invisible background watermark. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BgAddInvisible")
        public Boolean bgAddInvisible;

        /**
         * <p>Specifies whether to enable visible background watermarks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BgAddVisible")
        public Boolean bgAddVisible;

        /**
         * <p>The invisible background watermark control parameters.</p>
         */
        @NameInMap("BgInvisibleControl")
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl bgInvisibleControl;

        /**
         * <p>The visible background watermark control parameters.</p>
         */
        @NameInMap("BgVisibleControl")
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl bgVisibleControl;

        public static CreateWmEmbedTaskRequestDocumentControlBackgroundControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestDocumentControlBackgroundControl self = new CreateWmEmbedTaskRequestDocumentControlBackgroundControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl setBgAddInvisible(Boolean bgAddInvisible) {
            this.bgAddInvisible = bgAddInvisible;
            return this;
        }
        public Boolean getBgAddInvisible() {
            return this.bgAddInvisible;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl setBgAddVisible(Boolean bgAddVisible) {
            this.bgAddVisible = bgAddVisible;
            return this;
        }
        public Boolean getBgAddVisible() {
            return this.bgAddVisible;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl setBgInvisibleControl(CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl bgInvisibleControl) {
            this.bgInvisibleControl = bgInvisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl getBgInvisibleControl() {
            return this.bgInvisibleControl;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl setBgVisibleControl(CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl bgVisibleControl) {
            this.bgVisibleControl = bgVisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl getBgVisibleControl() {
            return this.bgVisibleControl;
        }

    }

    public static class CreateWmEmbedTaskRequestDocumentControl extends TeaModel {
        /**
         * <p>The background watermark control parameters.</p>
         */
        @NameInMap("BackgroundControl")
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl backgroundControl;

        /**
         * <p>Specifies whether to enable component invisible watermarks. Component invisible watermarks can resist document addition, deletion, modification, saving as another format (without changing the format), and selecting all and copying to a new docx document. They cannot resist format conversion attacks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InvisibleAntiAllCopy")
        public Boolean invisibleAntiAllCopy;

        /**
         * <p>Specifies whether to enable zero-width character invisible watermarks. Zero-width character invisible watermarks can resist document addition, deletion, modification, saving as another format (without changing the format), partial text copy and paste, and CopytoTxt attacks. They cannot resist format conversion to PDF attacks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InvisibleAntiTextCopy")
        public Boolean invisibleAntiTextCopy;

        public static CreateWmEmbedTaskRequestDocumentControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestDocumentControl self = new CreateWmEmbedTaskRequestDocumentControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestDocumentControl setBackgroundControl(CreateWmEmbedTaskRequestDocumentControlBackgroundControl backgroundControl) {
            this.backgroundControl = backgroundControl;
            return this;
        }
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl getBackgroundControl() {
            return this.backgroundControl;
        }

        public CreateWmEmbedTaskRequestDocumentControl setInvisibleAntiAllCopy(Boolean invisibleAntiAllCopy) {
            this.invisibleAntiAllCopy = invisibleAntiAllCopy;
            return this;
        }
        public Boolean getInvisibleAntiAllCopy() {
            return this.invisibleAntiAllCopy;
        }

        public CreateWmEmbedTaskRequestDocumentControl setInvisibleAntiTextCopy(Boolean invisibleAntiTextCopy) {
            this.invisibleAntiTextCopy = invisibleAntiTextCopy;
            return this;
        }
        public Boolean getInvisibleAntiTextCopy() {
            return this.invisibleAntiTextCopy;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin extends TeaModel {
        /**
         * <p>The bottom margin. This parameter takes effect only when Mode is set to bottom-left or bottom-right.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bottom")
        public Float bottom;

        /**
         * <p>The left margin. This parameter takes effect only when Mode is set to top-left or bottom-left.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Left")
        public Float left;

        /**
         * <p>The right margin. This parameter takes effect only when Mode is set to top-right or bottom-right.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Right")
        public Float right;

        /**
         * <p>The top margin. This parameter takes effect only when Mode is set to top-left or top-right.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Top")
        public Float top;

        public static CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin self = new CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlLogoVisibleControl extends TeaModel {
        /**
         * <p>The clockwise rotation angle of the logo watermark. Valid values: 1 to 360.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <p>Specifies whether to enable the enhanced visible watermark. After this feature is enabled, the logo is processed, and the embedded information in the logo can be extracted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enhance")
        public Boolean enhance;

        /**
         * <p>The Base64-encoded logo watermark. The logo file must be a PNG image encoded in Base64 format.</p>
         * 
         * <strong>example:</strong>
         * <p>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</p>
         */
        @NameInMap("LogoBase64")
        public String logoBase64;

        /**
         * <p>The margin of the text watermark. This parameter takes effect only when Mode is set to top-left, top-right, bottom-left, or bottom-right.</p>
         */
        @NameInMap("Margin")
        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin margin;

        /**
         * <p>The display mode of the logo watermark. Valid values:</p>
         * <ul>
         * <li><strong>pos</strong>: Fixed position mode.</li>
         * <li><strong>repeat</strong>: Tiled mode.</li>
         * <li><strong>top-left</strong>: Top-left mode.</li>
         * <li><strong>top-right</strong>: Top-right mode.</li>
         * <li><strong>bottom-left</strong>: Bottom-left mode.</li>
         * <li><strong>bottom-right</strong>: Bottom-right mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pos</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The opacity of the logo watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Opacity")
        public Integer opacity;

        /**
         * <p>The horizontal anchor point of the logo watermark. Valid values: 0 to 1. If PosAx and PosAy are both set to 0, the top-left corner of the logo is used as the anchor point. If the value is 0.5, the center of the logo is used as the anchor point. If PosAx and PosAy are both set to 1, the bottom-right corner of the logo is used as the anchor point.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAx")
        public Float posAx;

        /**
         * <p>The vertical anchor point of the logo watermark. Valid values: 0 to 1. If PosAx and PosAy are both set to 0, the top-left corner of the logo is used as the anchor point. If the value is 0.5, the center of the logo is used as the anchor point. If PosAx and PosAy are both set to 1, the bottom-right corner of the logo is used as the anchor point.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAy")
        public Float posAy;

        /**
         * <p>The horizontal position of the visible watermark. This parameter takes effect only when Mode is set to pos. The value is the pixel position with the top-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosX")
        public Long posX;

        /**
         * <p>The vertical position of the visible watermark. This parameter takes effect only when Mode is set to pos. The value is the pixel position with the top-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosY")
        public Long posY;

        /**
         * <p>The horizontal spacing of the tiled visible watermark. This parameter takes effect only when Mode is set to repeat.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceX")
        public Long spaceX;

        /**
         * <p>The vertical spacing of the tiled visible watermark. This parameter takes effect only when Mode is set to repeat.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceY")
        public Long spaceY;

        /**
         * <p>Specifies whether the logo watermark is visible. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Visible.</li>
         * <li><strong>false</strong>: Invisible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Visible")
        public Boolean visible;

        public static CreateWmEmbedTaskRequestImageControlLogoVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlLogoVisibleControl self = new CreateWmEmbedTaskRequestImageControlLogoVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setEnhance(Boolean enhance) {
            this.enhance = enhance;
            return this;
        }
        public Boolean getEnhance() {
            return this.enhance;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setLogoBase64(String logoBase64) {
            this.logoBase64 = logoBase64;
            return this;
        }
        public String getLogoBase64() {
            return this.logoBase64;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setMargin(CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin margin) {
            this.margin = margin;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin getMargin() {
            return this.margin;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setOpacity(Integer opacity) {
            this.opacity = opacity;
            return this;
        }
        public Integer getOpacity() {
            return this.opacity;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setPosAx(Float posAx) {
            this.posAx = posAx;
            return this;
        }
        public Float getPosAx() {
            return this.posAx;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setPosAy(Float posAy) {
            this.posAy = posAy;
            return this;
        }
        public Float getPosAy() {
            return this.posAy;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setPosX(Long posX) {
            this.posX = posX;
            return this;
        }
        public Long getPosX() {
            return this.posX;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setPosY(Long posY) {
            this.posY = posY;
            return this;
        }
        public Long getPosY() {
            return this.posY;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setSpaceX(Long spaceX) {
            this.spaceX = spaceX;
            return this;
        }
        public Long getSpaceX() {
            return this.spaceX;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setSpaceY(Long spaceY) {
            this.spaceY = spaceY;
            return this;
        }
        public Long getSpaceY() {
            return this.spaceY;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlMetadataControl extends TeaModel {
        /**
         * <p>Specifies whether to enable the metadata. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The Base64-encoded metadata. You must encode a string in the format of AIGC:{&quot;Label&quot;:&quot;1&quot;,&quot;ContentProducer&quot;:&quot;AXXXX&quot;,&quot;ProduceID&quot;:&quot;BXXXX&quot;,&quot;ReservedCode1&quot;:&quot;CXXX&quot;,&quot;ContentPropagator&quot;:&quot;DXXX&quot;,&quot;PropagateID&quot;:&quot;EXXX&quot;,&quot;ReservedCode2&quot;:&quot;FXXXX&quot;} into a Base64 string. Note: 1. The &quot;AIGC:&quot; prefix is required. Otherwise, the metadata cannot be added. Note that the format is different from that of audio and video. 2. The Base64 string must be in the standard format and include padding.</p>
         * 
         * <strong>example:</strong>
         * <p>QUlHQzp7IkxhYmVsIjoiMSIsIkNvbnRlbnRQcm9kdWNlciI6IkFYWFhYIiwiUHJvZHVjZUlEIjoiQlhYWFgsIlJlc2VydmVkQ29kZTEiOiJDWFhYIiwiQ29udGVudFByb3BhZ2F0b3IiOiJEWFhYIiwiUHJvcGFnYXRlSUQiOiJFWFhYIiwiUmVzZXJ2ZWRDb2RlMiI6IkZYWFhYIn0=</p>
         */
        @NameInMap("XmpKvBase64")
        public String xmpKvBase64;

        public static CreateWmEmbedTaskRequestImageControlMetadataControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlMetadataControl self = new CreateWmEmbedTaskRequestImageControlMetadataControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlMetadataControl setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateWmEmbedTaskRequestImageControlMetadataControl setXmpKvBase64(String xmpKvBase64) {
            this.xmpKvBase64 = xmpKvBase64;
            return this;
        }
        public String getXmpKvBase64() {
            return this.xmpKvBase64;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin extends TeaModel {
        /**
         * <p>The bottom margin. This parameter takes effect only when Mode is set to bottom-left or bottom-right.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bottom")
        public Float bottom;

        /**
         * <p>The left margin. This parameter takes effect only when Mode is set to top-left or bottom-left.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Left")
        public Float left;

        /**
         * <p>The right margin. This parameter takes effect only when Mode is set to top-right or bottom-right.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Right")
        public Float right;

        /**
         * <p>The top margin. This parameter takes effect only when Mode is set to top-left or top-right.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Top")
        public Float top;

        public static CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin self = new CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlTextVisibleControl extends TeaModel {
        /**
         * <p>The clockwise rotation angle of the text watermark. Valid values: 0 to 360.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <p>The font color of the text watermark. The value must be in the 0xFFFFFF or #FFFFFF RGB color format. For example, 0x000000 or #000000 indicates black.</p>
         * 
         * <strong>example:</strong>
         * <p>#FF0000</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font size of the text watermark. A larger value indicates a larger font size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Long fontSize;

        /**
         * <p>The margin of the text watermark. This parameter takes effect only when Mode is set to top-left, top-right, bottom-left, or bottom-right.</p>
         */
        @NameInMap("Margin")
        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin margin;

        /**
         * <p>The display mode of the text watermark. Valid values:</p>
         * <ul>
         * <li><strong>pos</strong>: Fixed position mode.</li>
         * <li><strong>repeat</strong>: Tiled mode.</li>
         * <li><strong>top-left</strong>: Top-left mode.</li>
         * <li><strong>top-right</strong>: Top-right mode.</li>
         * <li><strong>bottom-left</strong>: Bottom-left mode.</li>
         * <li><strong>bottom-right</strong>: Bottom-right mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pos</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The opacity of the text watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Opacity")
        public Integer opacity;

        /**
         * <p>The horizontal anchor point of the text watermark. Valid values: 0 to 1. If PosAx and PosAy are both set to 0, the top-left corner of the text is used as the anchor point. If the value is 0.5, the center of the text is used as the anchor point. If PosAx and PosAy are both set to 1, the bottom-right corner of the text is used as the anchor point.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAx")
        public Float posAx;

        /**
         * <p>The vertical anchor point of the text watermark. Valid values: 0 to 1. If PosAx and PosAy are both set to 0, the top-left corner of the text is used as the anchor point. If the value is 0.5, the center of the text is used as the anchor point. If PosAx and PosAy are both set to 1, the bottom-right corner of the text is used as the anchor point.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAy")
        public Float posAy;

        /**
         * <p>The horizontal position of the text watermark. This parameter takes effect only when Mode is set to pos. The value is the pixel position with the top-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosX")
        public Long posX;

        /**
         * <p>The vertical position of the text watermark. This parameter takes effect only when Mode is set to pos. The value is the pixel position with the top-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosY")
        public Long posY;

        /**
         * <p>The horizontal spacing of the tiled text watermark. This parameter takes effect only when Mode is set to repeat.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceX")
        public Long spaceX;

        /**
         * <p>The vertical spacing of the tiled text watermark. This parameter takes effect only when Mode is set to repeat.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpaceY")
        public Long spaceY;

        /**
         * <p>Specifies whether the text watermark is visible. Valid values:</p>
         * <ul>
         * <li>true: Visible.</li>
         * <li>false: Invisible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Visible")
        public Boolean visible;

        /**
         * <p>The text watermark content. The value must be a UTF-8 string.</p>
         * 
         * <strong>example:</strong>
         * <p>Watermark text</p>
         */
        @NameInMap("VisibleText")
        public String visibleText;

        public static CreateWmEmbedTaskRequestImageControlTextVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlTextVisibleControl self = new CreateWmEmbedTaskRequestImageControlTextVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setFontSize(Long fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Long getFontSize() {
            return this.fontSize;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setMargin(CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin margin) {
            this.margin = margin;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin getMargin() {
            return this.margin;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setOpacity(Integer opacity) {
            this.opacity = opacity;
            return this;
        }
        public Integer getOpacity() {
            return this.opacity;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setPosAx(Float posAx) {
            this.posAx = posAx;
            return this;
        }
        public Float getPosAx() {
            return this.posAx;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setPosAy(Float posAy) {
            this.posAy = posAy;
            return this;
        }
        public Float getPosAy() {
            return this.posAy;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setPosX(Long posX) {
            this.posX = posX;
            return this;
        }
        public Long getPosX() {
            return this.posX;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setPosY(Long posY) {
            this.posY = posY;
            return this;
        }
        public Long getPosY() {
            return this.posY;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setSpaceX(Long spaceX) {
            this.spaceX = spaceX;
            return this;
        }
        public Long getSpaceX() {
            return this.spaceX;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setSpaceY(Long spaceY) {
            this.spaceY = spaceY;
            return this;
        }
        public Long getSpaceY() {
            return this.spaceY;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setVisibleText(String visibleText) {
            this.visibleText = visibleText;
            return this;
        }
        public String getVisibleText() {
            return this.visibleText;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControl extends TeaModel {
        /**
         * <p>The logo watermark control parameters.</p>
         */
        @NameInMap("LogoVisibleControl")
        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl logoVisibleControl;

        /**
         * <p>The metadata control parameters. This parameter takes effect only when WmType is set to PureImage or AigcImage.</p>
         */
        @NameInMap("MetadataControl")
        public CreateWmEmbedTaskRequestImageControlMetadataControl metadataControl;

        /**
         * <p>The text watermark control parameters for images.</p>
         */
        @NameInMap("TextVisibleControl")
        public CreateWmEmbedTaskRequestImageControlTextVisibleControl textVisibleControl;

        public static CreateWmEmbedTaskRequestImageControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControl self = new CreateWmEmbedTaskRequestImageControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControl setLogoVisibleControl(CreateWmEmbedTaskRequestImageControlLogoVisibleControl logoVisibleControl) {
            this.logoVisibleControl = logoVisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl getLogoVisibleControl() {
            return this.logoVisibleControl;
        }

        public CreateWmEmbedTaskRequestImageControl setMetadataControl(CreateWmEmbedTaskRequestImageControlMetadataControl metadataControl) {
            this.metadataControl = metadataControl;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlMetadataControl getMetadataControl() {
            return this.metadataControl;
        }

        public CreateWmEmbedTaskRequestImageControl setTextVisibleControl(CreateWmEmbedTaskRequestImageControlTextVisibleControl textVisibleControl) {
            this.textVisibleControl = textVisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlTextVisibleControl getTextVisibleControl() {
            return this.textVisibleControl;
        }

    }

    public static class CreateWmEmbedTaskRequestVideoControlMetadataControl extends TeaModel {
        /**
         * <p>Specifies whether to enable the metadata. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Disabled.</li>
         * <li><strong>true</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The Base64-encoded metadata. You must encode a string in the format of AIGC={&quot;Label&quot;:&quot;1&quot;,&quot;ContentProducer&quot;:&quot;AXXXX&quot;,&quot;ProduceID&quot;:&quot;BXXXX&quot;,&quot;ReservedCode1&quot;:&quot;CXXX&quot;,&quot;ContentPropagator&quot;:&quot;DXXX&quot;,&quot;PropagateID&quot;:&quot;EXXX&quot;,&quot;ReservedCode2&quot;:&quot;FXXXX&quot;} into a Base64 string. Note: 1. The &quot;AIGC=&quot; prefix is required. Otherwise, the metadata cannot be added. Note that the prefix is different from that of image metadata. 2. The Base64 string must be in the standard format and include padding.</p>
         * 
         * <strong>example:</strong>
         * <p>QUlHQz17IkxhYmVsIjoiMSIsIkNvbnRlbnRQcm9kdWNlciI6IkFYWFhYIiwiUHJvZHVjZUlEIjoiQlhYWFgsIlJlc2VydmVkQ29kZTEiOiJDWFhYIiwiQ29udGVudFByb3BhZ2F0b3IiOiJEWFhYIiwiUHJvcGFnYXRlSUQiOiJFWFhYIiwiUmVzZXJ2ZWRDb2RlMiI6IkZYWFhYIn0=</p>
         */
        @NameInMap("XmpKvBase64")
        public String xmpKvBase64;

        public static CreateWmEmbedTaskRequestVideoControlMetadataControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestVideoControlMetadataControl self = new CreateWmEmbedTaskRequestVideoControlMetadataControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestVideoControlMetadataControl setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateWmEmbedTaskRequestVideoControlMetadataControl setXmpKvBase64(String xmpKvBase64) {
            this.xmpKvBase64 = xmpKvBase64;
            return this;
        }
        public String getXmpKvBase64() {
            return this.xmpKvBase64;
        }

    }

    public static class CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin extends TeaModel {
        /**
         * <p>The bottom margin. This parameter takes effect only when Mode is set to bottom-left or bottom-right.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bottom")
        public Integer bottom;

        /**
         * <p>The right margin. This parameter takes effect only when Mode is set to top-right or bottom-right.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Right")
        public Integer right;

        public static CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin self = new CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin setBottom(Integer bottom) {
            this.bottom = bottom;
            return this;
        }
        public Integer getBottom() {
            return this.bottom;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin setRight(Integer right) {
            this.right = right;
            return this;
        }
        public Integer getRight() {
            return this.right;
        }

    }

    public static class CreateWmEmbedTaskRequestVideoControlTextVisibleControl extends TeaModel {
        /**
         * <p>The font color of the text watermark. The value must be in the 0xFFFFFF or #FFFFFF RGB color format.</p>
         * 
         * <strong>example:</strong>
         * <p>#FF0000</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font size. Valid values: <strong>0</strong> to <strong>72</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The margin of the text watermark. This parameter takes effect only when Mode is set to top-left, top-right, bottom-left, or bottom-right.</p>
         */
        @NameInMap("Margin")
        public CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin margin;

        /**
         * <p>The display mode of the text watermark. Valid values:</p>
         * <ul>
         * <li><strong>pos</strong>: Fixed position mode, with the top-left corner as the origin.</li>
         * <li><strong>bottom-right</strong>: Bottom-right mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bottom-right</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The opacity of the text watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Opacity")
        public Integer opacity;

        /**
         * <p>The horizontal position of the visible watermark. This parameter takes effect only when Mode is set to pos. The value is the pixel position with the top-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PosX")
        public Integer posX;

        /**
         * <p>The vertical position of the visible watermark. This parameter takes effect only when Mode is set to pos. The value is the pixel position with the top-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PosY")
        public Integer posY;

        /**
         * <p>Specifies whether the text watermark is visible. Valid values:</p>
         * <ul>
         * <li>true: Visible.</li>
         * <li>false: Invisible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Visible")
        public Boolean visible;

        /**
         * <p>The text watermark content. The value must be a UTF-8 string.</p>
         * 
         * <strong>example:</strong>
         * <p>Watermark test</p>
         */
        @NameInMap("VisibleText")
        public String visibleText;

        public static CreateWmEmbedTaskRequestVideoControlTextVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestVideoControlTextVisibleControl self = new CreateWmEmbedTaskRequestVideoControlTextVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setMargin(CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin margin) {
            this.margin = margin;
            return this;
        }
        public CreateWmEmbedTaskRequestVideoControlTextVisibleControlMargin getMargin() {
            return this.margin;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setOpacity(Integer opacity) {
            this.opacity = opacity;
            return this;
        }
        public Integer getOpacity() {
            return this.opacity;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setPosX(Integer posX) {
            this.posX = posX;
            return this;
        }
        public Integer getPosX() {
            return this.posX;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setPosY(Integer posY) {
            this.posY = posY;
            return this;
        }
        public Integer getPosY() {
            return this.posY;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl setVisibleText(String visibleText) {
            this.visibleText = visibleText;
            return this;
        }
        public String getVisibleText() {
            return this.visibleText;
        }

    }

    public static class CreateWmEmbedTaskRequestVideoControl extends TeaModel {
        /**
         * <p>The metadata control parameters.</p>
         */
        @NameInMap("MetadataControl")
        public CreateWmEmbedTaskRequestVideoControlMetadataControl metadataControl;

        /**
         * <p>The text watermark control parameters for videos.</p>
         */
        @NameInMap("TextVisibleControl")
        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl textVisibleControl;

        public static CreateWmEmbedTaskRequestVideoControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestVideoControl self = new CreateWmEmbedTaskRequestVideoControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestVideoControl setMetadataControl(CreateWmEmbedTaskRequestVideoControlMetadataControl metadataControl) {
            this.metadataControl = metadataControl;
            return this;
        }
        public CreateWmEmbedTaskRequestVideoControlMetadataControl getMetadataControl() {
            return this.metadataControl;
        }

        public CreateWmEmbedTaskRequestVideoControl setTextVisibleControl(CreateWmEmbedTaskRequestVideoControlTextVisibleControl textVisibleControl) {
            this.textVisibleControl = textVisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestVideoControlTextVisibleControl getTextVisibleControl() {
            return this.textVisibleControl;
        }

    }

}
