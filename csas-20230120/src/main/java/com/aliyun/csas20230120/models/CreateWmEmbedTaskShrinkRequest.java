// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmEmbedTaskShrinkRequest extends TeaModel {
    @NameInMap("DocumentControl")
    public String documentControlShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/abc****.pdf">https://example.com/abc****.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc****.pdf</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("ImageEmbedJpegQuality")
    public Long imageEmbedJpegQuality;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ImageEmbedLevel")
    public Long imageEmbedLevel;

    /**
     * <strong>example:</strong>
     * <p>3000k</p>
     */
    @NameInMap("VideoBitrate")
    public String videoBitrate;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VideoIsLong")
    public Boolean videoIsLong;

    /**
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureDocument</p>
     */
    @NameInMap("WmType")
    public String wmType;

    public static CreateWmEmbedTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmEmbedTaskShrinkRequest self = new CreateWmEmbedTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmEmbedTaskShrinkRequest setDocumentControlShrink(String documentControlShrink) {
        this.documentControlShrink = documentControlShrink;
        return this;
    }
    public String getDocumentControlShrink() {
        return this.documentControlShrink;
    }

    public CreateWmEmbedTaskShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateWmEmbedTaskShrinkRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public CreateWmEmbedTaskShrinkRequest setImageEmbedJpegQuality(Long imageEmbedJpegQuality) {
        this.imageEmbedJpegQuality = imageEmbedJpegQuality;
        return this;
    }
    public Long getImageEmbedJpegQuality() {
        return this.imageEmbedJpegQuality;
    }

    public CreateWmEmbedTaskShrinkRequest setImageEmbedLevel(Long imageEmbedLevel) {
        this.imageEmbedLevel = imageEmbedLevel;
        return this;
    }
    public Long getImageEmbedLevel() {
        return this.imageEmbedLevel;
    }

    public CreateWmEmbedTaskShrinkRequest setVideoBitrate(String videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public String getVideoBitrate() {
        return this.videoBitrate;
    }

    public CreateWmEmbedTaskShrinkRequest setVideoIsLong(Boolean videoIsLong) {
        this.videoIsLong = videoIsLong;
        return this;
    }
    public Boolean getVideoIsLong() {
        return this.videoIsLong;
    }

    public CreateWmEmbedTaskShrinkRequest setWmInfoBytesB64(String wmInfoBytesB64) {
        this.wmInfoBytesB64 = wmInfoBytesB64;
        return this;
    }
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    public CreateWmEmbedTaskShrinkRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public CreateWmEmbedTaskShrinkRequest setWmInfoUint(String wmInfoUint) {
        this.wmInfoUint = wmInfoUint;
        return this;
    }
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    public CreateWmEmbedTaskShrinkRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

}
