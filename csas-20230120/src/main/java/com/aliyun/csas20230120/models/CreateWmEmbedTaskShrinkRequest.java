// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmEmbedTaskShrinkRequest extends TeaModel {
    /**
     * <p>The audio control parameters.</p>
     */
    @NameInMap("AudioControl")
    public String audioControlShrink;

    /**
     * <p>The CSV watermark embedding control parameters.</p>
     */
    @NameInMap("CsvControl")
    public String csvControlShrink;

    /**
     * <p>The document watermark control parameters.</p>
     */
    @NameInMap("DocumentControl")
    public String documentControlShrink;

    /**
     * <p>The URL for downloading the file to be embedded. The URL must be active for public network access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/abc****.pdf">https://example.com/abc****.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The name of the file to be embedded. The backend validates the file type based on the file name extension.</p>
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
    public String imageControlShrink;

    /**
     * <p>The image watermark parameter that specifies the expected JPEG compression quality factor of the output image. Default value: 95. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("ImageEmbedJpegQuality")
    public Long imageEmbedJpegQuality;

    /**
     * <p>The image watermark parameter. A larger value indicates higher robustness but lower visual quality. Default value: 2. Valid values: 0 to 4.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ImageEmbedLevel")
    public Long imageEmbedLevel;

    /**
     * <p>Specifies whether to enable invisible watermark embedding. Default value: true.</p>
     */
    @NameInMap("InvisibleEnable")
    public Boolean invisibleEnable;

    /**
     * <p>The short video watermark parameter that specifies the video bitrate. By default, the video bitrate is automatically obtained. You can use this parameter to forcibly specify the bitrate used during extraction. Typically, you do not need to set this parameter.</p>
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
    public String videoControlShrink;

    /**
     * <p>Video watermark parameter. Specifies whether to use the long video watermark SDK. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The long video watermark SDK is used.</li>
     * <li><strong>false</strong>: The long video watermark SDK is not used.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VideoIsLong")
    public Boolean videoIsLong;

    /**
     * <p>The watermark information in Base64-encoded string format. If this parameter is set, WmInfoUint cannot be set.</p>
     * 
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <p>The bit width of the watermark information capacity. Default value: 32. This parameter must be consistent between embedding and extraction. For example, if the 40-bit SDK is used for embedding, set this parameter to 40 during extraction as well.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>The watermark information in decimal number format. If this parameter is set, WmInfoBytesB64 cannot be set.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>The watermark type. Valid values:</p>
     * <ul>
     * <li><strong>PureDocument</strong>: document watermark.</li>
     * <li><strong>PureImage</strong>: image watermark.</li>
     * <li><strong>PureAudio</strong>: audio watermark.</li>
     * <li><strong>PureVideo</strong>: video watermark.</li>
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

    public static CreateWmEmbedTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmEmbedTaskShrinkRequest self = new CreateWmEmbedTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmEmbedTaskShrinkRequest setAudioControlShrink(String audioControlShrink) {
        this.audioControlShrink = audioControlShrink;
        return this;
    }
    public String getAudioControlShrink() {
        return this.audioControlShrink;
    }

    public CreateWmEmbedTaskShrinkRequest setCsvControlShrink(String csvControlShrink) {
        this.csvControlShrink = csvControlShrink;
        return this;
    }
    public String getCsvControlShrink() {
        return this.csvControlShrink;
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

    public CreateWmEmbedTaskShrinkRequest setImageControlShrink(String imageControlShrink) {
        this.imageControlShrink = imageControlShrink;
        return this;
    }
    public String getImageControlShrink() {
        return this.imageControlShrink;
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

    public CreateWmEmbedTaskShrinkRequest setInvisibleEnable(Boolean invisibleEnable) {
        this.invisibleEnable = invisibleEnable;
        return this;
    }
    public Boolean getInvisibleEnable() {
        return this.invisibleEnable;
    }

    public CreateWmEmbedTaskShrinkRequest setVideoBitrate(String videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public String getVideoBitrate() {
        return this.videoBitrate;
    }

    public CreateWmEmbedTaskShrinkRequest setVideoControlShrink(String videoControlShrink) {
        this.videoControlShrink = videoControlShrink;
        return this;
    }
    public String getVideoControlShrink() {
        return this.videoControlShrink;
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
