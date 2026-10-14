// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateWatermarkEmbedTaskRequest extends TeaModel {
    /**
     * <p>A reserved idempotency field. This field is not supported. Passing a value does not cause an error, but it does not produce an idempotency effect.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The file type. Valid values:</p>
     * <ul>
     * <li>image: image.</li>
     * <li>video: video.</li>
     * </ul>
     * <p>The value must match the actual file type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The URL of the file to be processed. Images and videos are supported. Only the HTTP and HTTPS protocols are supported. Videos must be no longer than 10 minutes and no larger than 100 MB.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/demo.mp4">https://example.com/demo.mp4</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The embedding strength. Valid values: 0 to 5. A higher strength provides better robustness but lower visual quality.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2&quot;</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>A reserved field. No valid values are available. Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Reserved")
    public String reserved;

    /**
     * <p>The watermark content. The embedded content can be restored to the original text by calling the extraction operation.</p>
     * 
     * <strong>example:</strong>
     * <p>wm-e2e-85970647</p>
     */
    @NameInMap("WatermarkContent")
    public String watermarkContent;

    public static CreateWatermarkEmbedTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWatermarkEmbedTaskRequest self = new CreateWatermarkEmbedTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateWatermarkEmbedTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWatermarkEmbedTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateWatermarkEmbedTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateWatermarkEmbedTaskRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateWatermarkEmbedTaskRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public CreateWatermarkEmbedTaskRequest setWatermarkContent(String watermarkContent) {
        this.watermarkContent = watermarkContent;
        return this;
    }
    public String getWatermarkContent() {
        return this.watermarkContent;
    }

}
