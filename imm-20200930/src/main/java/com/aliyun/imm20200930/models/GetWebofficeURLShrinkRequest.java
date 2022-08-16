// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetWebofficeURLShrinkRequest extends TeaModel {
    @NameInMap("CachePreview")
    public Boolean cachePreview;

    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("ExternalUploaded")
    public Boolean externalUploaded;

    @NameInMap("Filename")
    public String filename;

    @NameInMap("Hidecmb")
    public Boolean hidecmb;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Password")
    public String password;

    @NameInMap("Permission")
    public String permissionShrink;

    @NameInMap("PreviewPages")
    public Long previewPages;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Referer")
    public String referer;

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("User")
    public String userShrink;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Watermark")
    public String watermarkShrink;

    public static GetWebofficeURLShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeURLShrinkRequest self = new GetWebofficeURLShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetWebofficeURLShrinkRequest setCachePreview(Boolean cachePreview) {
        this.cachePreview = cachePreview;
        return this;
    }
    public Boolean getCachePreview() {
        return this.cachePreview;
    }

    public GetWebofficeURLShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public GetWebofficeURLShrinkRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GetWebofficeURLShrinkRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GetWebofficeURLShrinkRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GetWebofficeURLShrinkRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GetWebofficeURLShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetWebofficeURLShrinkRequest setPermissionShrink(String permissionShrink) {
        this.permissionShrink = permissionShrink;
        return this;
    }
    public String getPermissionShrink() {
        return this.permissionShrink;
    }

    public GetWebofficeURLShrinkRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GetWebofficeURLShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetWebofficeURLShrinkRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public GetWebofficeURLShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GetWebofficeURLShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

    public GetWebofficeURLShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GetWebofficeURLShrinkRequest setWatermarkShrink(String watermarkShrink) {
        this.watermarkShrink = watermarkShrink;
        return this;
    }
    public String getWatermarkShrink() {
        return this.watermarkShrink;
    }

}
