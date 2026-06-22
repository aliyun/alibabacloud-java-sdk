// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskRequest extends TeaModel {
    /**
     * <p>The alignment value, in pixels, for the width or height of the images to be stitched. The value can range from 1 to 4096.</p>
     * <ul>
     * <li><p>If you set <strong>Direction</strong> to <code>vertical</code>, this parameter specifies the width alignment.</p>
     * </li>
     * <li><p>If you set <strong>Direction</strong> to <code>horizontal</code>, this parameter specifies the height alignment.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the width or height of the first image is used for alignment by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192</p>
     */
    @NameInMap("Align")
    public Long align;

    /**
     * <p>The fill color for the areas specified by <code>Padding</code> and <code>Margin</code>. The value can be in the <code>#FFFFFF</code> format or a keyword such as <code>red</code> or <code>alpha</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>red</p>
     */
    @NameInMap("BackgroundColor")
    public String backgroundColor;

    /**
     * <p>The chained authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The image stitching method. Valid values:</p>
     * <ul>
     * <li><p>vertical (default): Stitches images vertically. The widths of all images must be the same.</p>
     * </li>
     * <li><p>horizontal: Stitches images horizontally. The heights of all images must be the same.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vertical</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The compression format of the output image. Valid values:</p>
     * <ul>
     * <li><p>jpg (default)</p>
     * </li>
     * <li><p>png</p>
     * </li>
     * <li><p>webp</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ImageFormat")
    public String imageFormat;

    /**
     * <p>The blank margin, in pixels, of the stitched image. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Margin")
    public Long margin;

    /**
     * <p>The message notification configuration. For information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The space, in pixels, between sub-images in the stitched image. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Padding")
    public Long padding;

    /**
     * <p>The project name. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The compression quality of the output image. This parameter is valid only for JPG and WebP images. The value range is 0 to 100. The default value is 80.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Quality")
    public Long quality;

    /**
     * <p>The scaling method used when the width or height of an image is aligned. Valid values:</p>
     * <ul>
     * <li><p>fit (default): Scales the image without adding black bars. Only proportional scaling is supported.</p>
     * </li>
     * <li><p>stretch: Stretches the image to fill the space.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>stretch</p>
     */
    @NameInMap("ScaleType")
    public String scaleType;

    /**
     * <p>The list of input images. The images are stitched in the order of their URIs in the list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateImageSplicingTaskRequestSources> sources;

    /**
     * <p>Custom tags used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The OSS URI where the output image is stored.</p>
     * <p>The URI must be in the oss\://${bucketname}/${objectname} format. ${bucketname} is the name of the OSS bucket that is in the same region as the project. ${objectname} is the path of the file, including the file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/outputImage.jpg</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The custom information. This information is returned in the asynchronous notification message. Use this information to associate the notification message with your system. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateImageSplicingTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageSplicingTaskRequest self = new CreateImageSplicingTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageSplicingTaskRequest setAlign(Long align) {
        this.align = align;
        return this;
    }
    public Long getAlign() {
        return this.align;
    }

    public CreateImageSplicingTaskRequest setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public CreateImageSplicingTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateImageSplicingTaskRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateImageSplicingTaskRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public CreateImageSplicingTaskRequest setMargin(Long margin) {
        this.margin = margin;
        return this;
    }
    public Long getMargin() {
        return this.margin;
    }

    public CreateImageSplicingTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateImageSplicingTaskRequest setPadding(Long padding) {
        this.padding = padding;
        return this;
    }
    public Long getPadding() {
        return this.padding;
    }

    public CreateImageSplicingTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageSplicingTaskRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateImageSplicingTaskRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public CreateImageSplicingTaskRequest setSources(java.util.List<CreateImageSplicingTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateImageSplicingTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateImageSplicingTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateImageSplicingTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateImageSplicingTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateImageSplicingTaskRequestSources extends TeaModel {
        /**
         * <p>The rotation angle of the image. Valid values:</p>
         * <ul>
         * <li><p>0 (default)</p>
         * </li>
         * <li><p>90</p>
         * </li>
         * <li><p>180</p>
         * </li>
         * <li><p>270</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public Long rotate;

        /**
         * <p>The OSS URI of the source image.</p>
         * <p>The URI must be in the oss\://${Bucket}/${Object} format. <code>${Bucket}</code> is the name of the OSS bucket that is in the same region as the project. <code>${Object}</code> is the full path of the file, including the file name extension.</p>
         * <p>Supported image formats: JPG and PNG.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/sampleobject.jpg</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateImageSplicingTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateImageSplicingTaskRequestSources self = new CreateImageSplicingTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateImageSplicingTaskRequestSources setRotate(Long rotate) {
            this.rotate = rotate;
            return this;
        }
        public Long getRotate() {
            return this.rotate;
        }

        public CreateImageSplicingTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
