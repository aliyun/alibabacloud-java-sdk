// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskRequest extends TeaModel {
    /**
     * <p>The width or height with which the input images must align. Valid values: 1 to 4096. Unit: px.</p>
     * <ul>
     * <li>If you set <strong>Direction</strong> to <code>vertical</code>, this parameter specifies the width with which the input images must align.</li>
     * <li>If you set <strong>Direction</strong> to <code>horizontal</code>, this parameter specifies the height with which the input images must align.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the width or height of the first input image is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192</p>
     */
    @NameInMap("Align")
    public Long align;

    /**
     * <p>The padding color of the spaces specified by <code>Padding</code> and <code>Margin</code>. Colors encoded in the <code>#FFFFFF</code> format and colors that are related to preset keywords such as <code>red</code> and <code>alpha</code> are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>red</p>
     */
    @NameInMap("BackgroundColor")
    public String backgroundColor;

    /**
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The splicing method. Valid values:</p>
     * <ul>
     * <li>vertical (default): All input images are vertically aligned and have the same width.</li>
     * <li>horizontal: All input images are horizontally aligned and have the same height.</li>
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
     * <li>jpg (default)</li>
     * <li>png</li>
     * <li>webp</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ImageFormat")
    public String imageFormat;

    /**
     * <p>The empty space or border around the edges of the output image. Default value: 0. Unit: px.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Margin")
    public Long margin;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The space between component images in the output image. Default value: 0. Unit: px.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Padding")
    public Long padding;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The compression quality of the output image. This parameter takes effect only for JPG and WebP images. Valid values: 0 to 100. Default value: 80.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Quality")
    public Long quality;

    /**
     * <p>The scaling mode of the input images that are vertically or horizontally aligned. Valid values:</p>
     * <ul>
     * <li>fit (default): Input images are scaled proportionally, and black edges are not retained.</li>
     * <li>stretch: Input images are stretched to fill the space.</li>
     * <li>horizon: Input images are horizontally stretched.</li>
     * <li>vertical: Input images are vertically stretched.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>stretch</p>
     */
    @NameInMap("ScaleType")
    public String scaleType;

    /**
     * <p>The input images. The images are sliced in the order of the input image URIs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateImageSplicingTaskRequestSources> sources;

    /**
     * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The OSS bucket in which you want to store the output image.</p>
     * <p>Specify the value in the oss://${bucketname}/${objectname} format. ${bucketname} specifies the name of the OSS bucket that resides in the same region as the current project. ${objectname} specifies the path to the output image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/outputImage.jpg</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The user data, which is returned as asynchronous notifications to help manage notifications within your system. The maximum length of the user data is 2,048 bytes.</p>
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
         * <p>The rotation angle. Valid values:</p>
         * <ul>
         * <li>0 (default)</li>
         * <li>90</li>
         * <li>180</li>
         * <li>270</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public Long rotate;

        /**
         * <p>The Object Storage Service (OSS) bucket in which you store the input images.</p>
         * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the input images that have an extension.</p>
         * <p>The following image formats are supported: jpg and png.</p>
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
