// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateWebofficeTokenRequest extends TeaModel {
    @NameInMap("CachePreview")
    public Boolean cachePreview;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("ExternalUploaded")
    public Boolean externalUploaded;

    @NameInMap("Filename")
    public String filename;

    @NameInMap("Hidecmb")
    public Boolean hidecmb;

    /**
     * <p>消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Password")
    public String password;

    @NameInMap("Permission")
    public WebofficePermission permission;

    @NameInMap("PreviewPages")
    public Long previewPages;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Referer")
    public String referer;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("User")
    public WebofficeUser user;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Watermark")
    public WebofficeWatermark watermark;

    public static GenerateWebofficeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebofficeTokenRequest self = new GenerateWebofficeTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateWebofficeTokenRequest setCachePreview(Boolean cachePreview) {
        this.cachePreview = cachePreview;
        return this;
    }
    public Boolean getCachePreview() {
        return this.cachePreview;
    }

    public GenerateWebofficeTokenRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public GenerateWebofficeTokenRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GenerateWebofficeTokenRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GenerateWebofficeTokenRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GenerateWebofficeTokenRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public GenerateWebofficeTokenRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GenerateWebofficeTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GenerateWebofficeTokenRequest setPermission(WebofficePermission permission) {
        this.permission = permission;
        return this;
    }
    public WebofficePermission getPermission() {
        return this.permission;
    }

    public GenerateWebofficeTokenRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GenerateWebofficeTokenRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GenerateWebofficeTokenRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public GenerateWebofficeTokenRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GenerateWebofficeTokenRequest setUser(WebofficeUser user) {
        this.user = user;
        return this;
    }
    public WebofficeUser getUser() {
        return this.user;
    }

    public GenerateWebofficeTokenRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GenerateWebofficeTokenRequest setWatermark(WebofficeWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public WebofficeWatermark getWatermark() {
        return this.watermark;
    }

}
