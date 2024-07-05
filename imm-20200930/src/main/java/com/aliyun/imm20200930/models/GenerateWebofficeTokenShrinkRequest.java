// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateWebofficeTokenShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CachePreview")
    public Boolean cachePreview;

    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExternalUploaded")
    public Boolean externalUploaded;

    /**
     * <strong>example:</strong>
     * <p>test.pptx</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Hidecmb")
    public Boolean hidecmb;

    /**
     * <p>消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <strong>example:</strong>
     * <p>topic1</p>
     */
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("Permission")
    public String permissionShrink;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PreviewPages")
    public Long previewPages;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Referer")
    public String referer;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/test.pptx</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("User")
    public String userShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;file_id&quot;: &quot;abc&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    @NameInMap("Watermark")
    public String watermarkShrink;

    public static GenerateWebofficeTokenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebofficeTokenShrinkRequest self = new GenerateWebofficeTokenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateWebofficeTokenShrinkRequest setCachePreview(Boolean cachePreview) {
        this.cachePreview = cachePreview;
        return this;
    }
    public Boolean getCachePreview() {
        return this.cachePreview;
    }

    public GenerateWebofficeTokenShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public GenerateWebofficeTokenShrinkRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GenerateWebofficeTokenShrinkRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GenerateWebofficeTokenShrinkRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GenerateWebofficeTokenShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public GenerateWebofficeTokenShrinkRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GenerateWebofficeTokenShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GenerateWebofficeTokenShrinkRequest setPermissionShrink(String permissionShrink) {
        this.permissionShrink = permissionShrink;
        return this;
    }
    public String getPermissionShrink() {
        return this.permissionShrink;
    }

    public GenerateWebofficeTokenShrinkRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GenerateWebofficeTokenShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GenerateWebofficeTokenShrinkRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public GenerateWebofficeTokenShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GenerateWebofficeTokenShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

    public GenerateWebofficeTokenShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GenerateWebofficeTokenShrinkRequest setWatermarkShrink(String watermarkShrink) {
        this.watermarkShrink = watermarkShrink;
        return this;
    }
    public String getWatermarkShrink() {
        return this.watermarkShrink;
    }

}
