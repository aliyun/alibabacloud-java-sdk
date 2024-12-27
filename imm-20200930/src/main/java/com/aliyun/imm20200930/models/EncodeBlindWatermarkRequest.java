// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class EncodeBlindWatermarkRequest extends TeaModel {
    /**
     * <p>The text content of watermarks. It can be up to 256 characters in length.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter takes effect only if the input image format is JPG.</p>
     * <p>The storage quality of the output image that carries the watermarks. Default value: 90. Valid values: 70 to 100. The higher the quality, the larger the image size and the higher the watermark resolution quality.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ImageQuality")
    public Integer imageQuality;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The Object Storage Service (OSS) URI of the image.</p>
     * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region with the current project. <code>${Object}</code> specifies the path of the object with the extension included.</p>
     * <p>Supported image formats: JPG, PNG, BMP, TIFF, and WebP.</p>
     * <p>Image size limit: 10,000 px maximum and 80 px x 80 px minimum.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.jpg</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The watermark strength level. The higher the strength, the more resistant the watermarked image is to attacks, but the more the image is distorted. Default value: low. Valid values: [low, medium, high].</p>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("StrengthLevel")
    public String strengthLevel;

    /**
     * <p>The URI of the output image in OSS.</p>
     * <p>Specify the URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The format of the output image is the same as that of the input image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/target-object.jpg</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    public static EncodeBlindWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        EncodeBlindWatermarkRequest self = new EncodeBlindWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public EncodeBlindWatermarkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public EncodeBlindWatermarkRequest setImageQuality(Integer imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public Integer getImageQuality() {
        return this.imageQuality;
    }

    public EncodeBlindWatermarkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public EncodeBlindWatermarkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public EncodeBlindWatermarkRequest setStrengthLevel(String strengthLevel) {
        this.strengthLevel = strengthLevel;
        return this;
    }
    public String getStrengthLevel() {
        return this.strengthLevel;
    }

    public EncodeBlindWatermarkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

}
