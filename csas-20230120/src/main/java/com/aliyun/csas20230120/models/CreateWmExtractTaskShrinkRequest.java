// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmExtractTaskShrinkRequest extends TeaModel {
    @NameInMap("CsvControl")
    public String csvControlShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DocumentIsCapture")
    public Boolean documentIsCapture;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/test-****.pdf">https://example.com/test-****.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-****.pdf</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VideoIsLong")
    public Boolean videoIsLong;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VideoSpeed")
    public String videoSpeed;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
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
