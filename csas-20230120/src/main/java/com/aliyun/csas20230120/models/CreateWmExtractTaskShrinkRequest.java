// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmExtractTaskShrinkRequest extends TeaModel {
    /**
     * <p>The CSV watermark control parameters. These must be consistent with the parameters used during embedding. Otherwise, extraction fails.</p>
     */
    @NameInMap("CsvControl")
    public String csvControlShrink;

    /**
     * <p>The document watermark parameter that specifies whether the file to be extracted is a screenshot of a document with a background watermark. The service determines whether to use the document background watermark extraction logic based on whether the file is an image file. Therefore, this parameter does not need to be set by default. Valid values:</p>
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
     * <p>The URL used to download the file from which the watermark is to be fetched. The URL must be accessible over the public network access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/test-****.pdf">https://example.com/test-****.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The name of the file from which the watermark is to be extracted. The backend determines and validates the file type based on the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-****.pdf</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>The image extraction parameters.</p>
     */
    @NameInMap("ImageExtractParamsOpenApi")
    public String imageExtractParamsOpenApiShrink;

    /**
     * <p>The audio watermark parameter that specifies whether the watermark was embedded by the client SDK. Default value: false. Valid values:</p>
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
     * <p>The long video watermark parameter that specifies the video playback speed as a floating-point string. Default value: 1, which indicates the playback speed used when the watermark was added, or the speed at which the video timeline was stretched after the watermark was added.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VideoSpeed")
    public String videoSpeed;

    /**
     * <p>The bit width of the watermark information capacity. Default value: 32. This parameter must be consistent between embedding and extraction. For example, if the 40-bit SDK was used for embedding, set this value to 40 for extraction.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>The watermark type. Valid values:</p>
     * <ul>
     * <li><strong>PureWebappInvisible</strong>: web page watermark.</li>
     * <li><strong>PureAppInvisible</strong>: app watermark.</li>
     * <li><strong>PureScreenInvisible</strong>: screen watermark.</li>
     * <li><strong>PureDocument</strong>: document watermark.</li>
     * <li><strong>PureImage</strong>: image watermark.</li>
     * <li><strong>PureAudio</strong>: audio watermark.</li>
     * <li><strong>PureVideo</strong>: video watermark.</li>
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
