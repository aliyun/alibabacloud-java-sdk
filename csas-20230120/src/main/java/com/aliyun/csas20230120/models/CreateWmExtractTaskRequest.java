// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmExtractTaskRequest extends TeaModel {
    /**
     * <p>The CSV watermark control parameter. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
     */
    @NameInMap("CsvControl")
    public CreateWmExtractTaskRequestCsvControl csvControl;

    /**
     * <p>The document watermark parameter that specifies whether the file to be extracted is a screenshot of a document with a background watermark added. The system determines whether to use the extraction logic for document background watermarks based on whether the file to be extracted is an image file. By default, you do not need to configure this parameter. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DocumentIsCapture")
    public Boolean documentIsCapture;

    /**
     * <p>The URL used to download the file to be extracted. The URL must be accessible over the Internet.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/test-****.pdf">https://example.com/test-****.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The name of the file to be extracted. The system needs to check the file type based on the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-****.pdf</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>Image extraction parameters</p>
     */
    @NameInMap("ImageExtractParamsOpenApi")
    public CreateWmExtractTaskRequestImageExtractParamsOpenApi imageExtractParamsOpenApi;

    /**
     * <p>Audio watermark parameter: specifies whether the watermark was embedded by the client SDK. Default value: false. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Yes  </li>
     * <li><strong>false</strong>: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsClientEmbed")
    public Boolean isClientEmbed;

    /**
     * <p>The watermark parameter for videos that specifies whether to use the long video watermark SDK. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VideoIsLong")
    public Boolean videoIsLong;

    /**
     * <p>The watermark parameter for long videos that specifies the video speed factor. The value can be a floating-point number or a string. Default value: 1. This parameter indicates the speed at which a watermark is added or the time-stretching rate for videos after a watermark is added.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VideoSpeed")
    public String videoSpeed;

    /**
     * <p>The watermark information size. Default value: 32. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. For example, if a 40-bit watermark is used for watermark embedding, you must set this parameter to 40 for watermark extraction.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>The watermark type. Valid values:</p>
     * <ul>
     * <li><strong>PureWebappInvisible</strong>: web page watermark</li>
     * <li><strong>PureAppInvisible</strong>: app watermark</li>
     * <li><strong>PureScreenInvisible</strong>: screen watermark</li>
     * <li><strong>PureDocument</strong>: document watermark</li>
     * <li><strong>PureImage</strong>: image watermark</li>
     * <li><strong>PureAudio</strong>: audio watermark</li>
     * <li><strong>PureVideo</strong>: video watermark</li>
     * <li><strong>AigcWebappInvisible</strong>: artificial intelligence generated content (AIGC)-based webpage watermark</li>
     * <li><strong>AigcAppInvisible</strong>: AIGC-based app watermark</li>
     * <li><strong>AigcScreenInvisible</strong>: AIGC-based screen watermark</li>
     * <li><strong>AigcDocument</strong>: AIGC-based document watermark</li>
     * <li><strong>AigcImage</strong>: AIGC-based image watermark</li>
     * <li><strong>AigcAudio</strong>: AIGC-based audio watermark</li>
     * <li><strong>AigcVideo</strong>: AIGC-based video watermark</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureDocument</p>
     */
    @NameInMap("WmType")
    public String wmType;

    public static CreateWmExtractTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmExtractTaskRequest self = new CreateWmExtractTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmExtractTaskRequest setCsvControl(CreateWmExtractTaskRequestCsvControl csvControl) {
        this.csvControl = csvControl;
        return this;
    }
    public CreateWmExtractTaskRequestCsvControl getCsvControl() {
        return this.csvControl;
    }

    public CreateWmExtractTaskRequest setDocumentIsCapture(Boolean documentIsCapture) {
        this.documentIsCapture = documentIsCapture;
        return this;
    }
    public Boolean getDocumentIsCapture() {
        return this.documentIsCapture;
    }

    public CreateWmExtractTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateWmExtractTaskRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public CreateWmExtractTaskRequest setImageExtractParamsOpenApi(CreateWmExtractTaskRequestImageExtractParamsOpenApi imageExtractParamsOpenApi) {
        this.imageExtractParamsOpenApi = imageExtractParamsOpenApi;
        return this;
    }
    public CreateWmExtractTaskRequestImageExtractParamsOpenApi getImageExtractParamsOpenApi() {
        return this.imageExtractParamsOpenApi;
    }

    public CreateWmExtractTaskRequest setIsClientEmbed(Boolean isClientEmbed) {
        this.isClientEmbed = isClientEmbed;
        return this;
    }
    public Boolean getIsClientEmbed() {
        return this.isClientEmbed;
    }

    public CreateWmExtractTaskRequest setVideoIsLong(Boolean videoIsLong) {
        this.videoIsLong = videoIsLong;
        return this;
    }
    public Boolean getVideoIsLong() {
        return this.videoIsLong;
    }

    public CreateWmExtractTaskRequest setVideoSpeed(String videoSpeed) {
        this.videoSpeed = videoSpeed;
        return this;
    }
    public String getVideoSpeed() {
        return this.videoSpeed;
    }

    public CreateWmExtractTaskRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public CreateWmExtractTaskRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

    public static class CreateWmExtractTaskRequestCsvControl extends TeaModel {
        /**
         * <p>The timestamp watermark parameter that specifies how much information a single timestamp holds. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmbedBitsNumberInEachTime")
        public Long embedBitsNumberInEachTime;

        /**
         * <p>The lossy embedding control parameter that specifies columns to be modified You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmbedColumn")
        public Long embedColumn;

        /**
         * <p>The lossy embedding control parameter that specifies the modification precision. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EmbedPrecision")
        public Long embedPrecision;

        /**
         * <p>The timestamp watermark parameter that specifies the embedding position of the timestamp watermarks. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Min</p>
         */
        @NameInMap("EmbedTimePosition")
        public String embedTimePosition;

        /**
         * <p>The CSV watermark embedding method. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
         * 
         * <strong>example:</strong>
         * <p>lossless_row_shift_embed</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The timestamp watermark parameter that specifies the timestamp format. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Year-Mon-Day Hour:Min:Sec.MilSec</p>
         */
        @NameInMap("TimeFormat")
        public String timeFormat;

        public static CreateWmExtractTaskRequestCsvControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmExtractTaskRequestCsvControl self = new CreateWmExtractTaskRequestCsvControl();
            return TeaModel.build(map, self);
        }

        public CreateWmExtractTaskRequestCsvControl setEmbedBitsNumberInEachTime(Long embedBitsNumberInEachTime) {
            this.embedBitsNumberInEachTime = embedBitsNumberInEachTime;
            return this;
        }
        public Long getEmbedBitsNumberInEachTime() {
            return this.embedBitsNumberInEachTime;
        }

        public CreateWmExtractTaskRequestCsvControl setEmbedColumn(Long embedColumn) {
            this.embedColumn = embedColumn;
            return this;
        }
        public Long getEmbedColumn() {
            return this.embedColumn;
        }

        public CreateWmExtractTaskRequestCsvControl setEmbedPrecision(Long embedPrecision) {
            this.embedPrecision = embedPrecision;
            return this;
        }
        public Long getEmbedPrecision() {
            return this.embedPrecision;
        }

        public CreateWmExtractTaskRequestCsvControl setEmbedTimePosition(String embedTimePosition) {
            this.embedTimePosition = embedTimePosition;
            return this;
        }
        public String getEmbedTimePosition() {
            return this.embedTimePosition;
        }

        public CreateWmExtractTaskRequestCsvControl setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateWmExtractTaskRequestCsvControl setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }
        public String getTimeFormat() {
            return this.timeFormat;
        }

    }

    public static class CreateWmExtractTaskRequestImageExtractParamsOpenApi extends TeaModel {
        /**
         * <p>Enhanced visible watermark logo in base64 format. Used to extract the enhanced visible watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>iVBORw0KGgoAAAANSUhEUgAAAGQAAAAWCAYAAAA2CDmeAAAACXBIWXMAAAsTAAALEwEAmpwYAAAE7mlUWHRYTUw6Y29tLmFkb2JlLnhtcAAAAAAAPD94cGFja2V0IGJlZ2luPSLvu78iIGlkPSJXNU0wTXBDZWhpSHpyZVN6TlRjemtjOWQiPz4gPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0az0iQWRvYmUgWE1QIENvcmUgOS4wLWMwMDAgNzkuMTcxYzI3ZiwgMjAyMi8wOC8xNi0xODowMjo0MyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczpkYz0iaHR0cDovL3B1cmwub3JnL2RjL2VsZW1lbnRzLzEuMS8iIHhtbG5zOnBob3Rvc2hvcD0iaHR0cDovL25zLmFkb2JlLmNvbS9waG90b3Nob3AvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0RXZ0PSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VFdmVudCMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIDI0LjAgKFdpbmRvd3MpIiB4bXA6Q3JlYXRlRGF0ZT0iMjAyNS0wNS0yN1QyMjo1MToyMyswODowMCIgeG1wOk1vZGlmeURhdGU9IjIwMjUtMDUtMjdUMjM6NDQ6MzcrMDg6MDAiIHhtcDpNZXRhZGF0YURhdGU9IjIwMjUtMDUtMjdUMjM6NDQ6MzcrMDg6MDAiIGRjOmZvcm1hdD0iaW1hZ2UvcG5nIiBwaG90b3Nob3A6Q29sb3JNb2RlPSIzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOmRiYTA3MjM3LWJmNWUtNTc0ZS04ZDhlLTAyNDlmNDFlNWE2ZCIgeG1wTU06RG9jdW1lbnRJRD0i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</p>
         */
        @NameInMap("SrcLogoBase64")
        public String srcLogoBase64;

        public static CreateWmExtractTaskRequestImageExtractParamsOpenApi build(java.util.Map<String, ?> map) throws Exception {
            CreateWmExtractTaskRequestImageExtractParamsOpenApi self = new CreateWmExtractTaskRequestImageExtractParamsOpenApi();
            return TeaModel.build(map, self);
        }

        public CreateWmExtractTaskRequestImageExtractParamsOpenApi setSrcLogoBase64(String srcLogoBase64) {
            this.srcLogoBase64 = srcLogoBase64;
            return this;
        }
        public String getSrcLogoBase64() {
            return this.srcLogoBase64;
        }

    }

}
