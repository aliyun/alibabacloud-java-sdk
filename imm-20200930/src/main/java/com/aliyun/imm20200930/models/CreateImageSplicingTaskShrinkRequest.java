// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskShrinkRequest extends TeaModel {
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
    public String credentialConfigShrink;

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
    public String notificationShrink;

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
    public String sourcesShrink;

    /**
     * <p>Custom tags used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

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

    public static CreateImageSplicingTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageSplicingTaskShrinkRequest self = new CreateImageSplicingTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageSplicingTaskShrinkRequest setAlign(Long align) {
        this.align = align;
        return this;
    }
    public Long getAlign() {
        return this.align;
    }

    public CreateImageSplicingTaskShrinkRequest setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public CreateImageSplicingTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateImageSplicingTaskShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateImageSplicingTaskShrinkRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public CreateImageSplicingTaskShrinkRequest setMargin(Long margin) {
        this.margin = margin;
        return this;
    }
    public Long getMargin() {
        return this.margin;
    }

    public CreateImageSplicingTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateImageSplicingTaskShrinkRequest setPadding(Long padding) {
        this.padding = padding;
        return this;
    }
    public Long getPadding() {
        return this.padding;
    }

    public CreateImageSplicingTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageSplicingTaskShrinkRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateImageSplicingTaskShrinkRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public CreateImageSplicingTaskShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreateImageSplicingTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateImageSplicingTaskShrinkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateImageSplicingTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
