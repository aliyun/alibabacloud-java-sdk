// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmExtractTaskShrinkRequest extends TeaModel {
    /**
     * <p>CSV watermark control parameters. These parameters must be consistent with those used during embedding. Otherwise, the extraction fails.</p>
     */
    @NameInMap("CsvControl")
    public String csvControlShrink;

    /**
     * <p>Document watermark parameter. Specifies whether the file from which the watermark is to be extracted is a screenshot of a document with a background watermark. The service determines whether to use the document background watermark extraction logic based on whether the file is an image file. Therefore, you do not need to set this parameter by default. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DocumentIsCapture")
    public Boolean documentIsCapture;

    /**
     * <p>The URL used to download the file to be fetched. The URL must support public network access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/test-****.pdf">https://example.com/test-****.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The name of the file from which the watermark is to be extracted. The backend determines and verifies the file type based on the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-****.pdf</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>Image extraction parameters.</p>
     */
    @NameInMap("ImageExtractParamsOpenApi")
    public String imageExtractParamsOpenApiShrink;

    /**
     * <p>Audio watermark parameter. Specifies whether the watermark is embedded by using the client SDK. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsClientEmbed")
    public Boolean isClientEmbed;

    /**
     * <p>Video watermark parameter. Specifies whether to use the long video watermark SDK. Default value: false. Valid values:</p>
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
     * <p>Long video watermark parameter. The video playback speed, represented as a floating-point string. Default value: 1. This value represents the playback speed used when adding the watermark, or the timeline stretching speed after the watermark is added.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VideoSpeed")
    public String videoSpeed;

    /**
     * <p>The bit width of the watermark information capacity. Default value: 32. This parameter must be consistent during embedding and extraction. For example, if a 40-bit SDK is used for embedding, you must also set this value to 40 for extraction.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>The watermark type. Valid values:</p>
     * <ul>
     * <li><strong>PureWebappInvisible</strong>: Web page watermark.</li>
     * <li><strong>PureAppInvisible</strong>: App watermark.</li>
     * <li><strong>PureScreenInvisible</strong>: Screen watermark.</li>
     * <li><strong>PureDocument</strong>: Document watermark.</li>
     * <li><strong>PureImage</strong>: Image watermark.</li>
     * <li><strong>PureAudio</strong>: Audio watermark.</li>
     * <li><strong>PureVideo</strong>: Video watermark.</li>
     * <li><strong>AigcWebappInvisible</strong>: AIGC web page watermark.</li>
     * <li><strong>AigcAppInvisible</strong>: AIGC app watermark.</li>
     * <li><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</li>
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

    public static CreateWmExtractTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmExtractTaskShrinkRequest self = new CreateWmExtractTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmExtractTaskShrinkRequest setCsvControlShrink(String csvControlShrink) {
        this.csvControlShrink = csvControlShrink;
        return this;
    }
    public String getCsvControlShrink() {
        return this.csvControlShrink;
    }

    public CreateWmExtractTaskShrinkRequest setDocumentIsCapture(Boolean documentIsCapture) {
        this.documentIsCapture = documentIsCapture;
        return this;
    }
    public Boolean getDocumentIsCapture() {
        return this.documentIsCapture;
    }

    public CreateWmExtractTaskShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateWmExtractTaskShrinkRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public CreateWmExtractTaskShrinkRequest setImageExtractParamsOpenApiShrink(String imageExtractParamsOpenApiShrink) {
        this.imageExtractParamsOpenApiShrink = imageExtractParamsOpenApiShrink;
        return this;
    }
    public String getImageExtractParamsOpenApiShrink() {
        return this.imageExtractParamsOpenApiShrink;
    }

    public CreateWmExtractTaskShrinkRequest setIsClientEmbed(Boolean isClientEmbed) {
        this.isClientEmbed = isClientEmbed;
        return this;
    }
    public Boolean getIsClientEmbed() {
        return this.isClientEmbed;
    }

    public CreateWmExtractTaskShrinkRequest setVideoIsLong(Boolean videoIsLong) {
        this.videoIsLong = videoIsLong;
        return this;
    }
    public Boolean getVideoIsLong() {
        return this.videoIsLong;
    }

    public CreateWmExtractTaskShrinkRequest setVideoSpeed(String videoSpeed) {
        this.videoSpeed = videoSpeed;
        return this;
    }
    public String getVideoSpeed() {
        return this.videoSpeed;
    }

    public CreateWmExtractTaskShrinkRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public CreateWmExtractTaskShrinkRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

}
