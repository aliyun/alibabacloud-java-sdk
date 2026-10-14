// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateWatermarkExtractTaskRequest extends TeaModel {
    /**
     * <p>A reserved idempotency field. Idempotency is not supported. Passing in a value does not cause an error, but it does not produce an idempotency effect.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The file type. Valid values: <code>image</code> and <code>video</code>. The value must be the same as the <code>FileType</code> used when the watermark was embedded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The URL of the file from which the watermark is to be extracted. Images and videos are supported. Only the <code>http/https</code> protocol is supported. Videos must be no longer than 10 minutes and no larger than 100 MB.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/demo.mp4">https://example.com/demo.mp4</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>A reserved field. No valid values are available. Do not pass in this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Reserved")
    public String reserved;

    public static CreateWatermarkExtractTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWatermarkExtractTaskRequest self = new CreateWatermarkExtractTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateWatermarkExtractTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWatermarkExtractTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateWatermarkExtractTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateWatermarkExtractTaskRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

}
