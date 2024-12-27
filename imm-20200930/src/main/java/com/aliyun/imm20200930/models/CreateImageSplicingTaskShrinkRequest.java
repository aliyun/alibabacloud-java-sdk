// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskShrinkRequest extends TeaModel {
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
     * <p>The authorization chain. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

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
     * <p>The notification settings. For more information, click Notification. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification format</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

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
    public String sourcesShrink;

    /**
     * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

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
