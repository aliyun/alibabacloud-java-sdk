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

}
