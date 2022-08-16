// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetWebofficeURLRequest extends TeaModel {
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

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Password")
    public String password;

    @NameInMap("Permission")
    public WebofficePermission permission;

    @NameInMap("PreviewPages")
    public Long previewPages;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Referer")
    public String referer;

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("User")
    public WebofficeUser user;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Watermark")
    public WebofficeWatermark watermark;

    public static GetWebofficeURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeURLRequest self = new GetWebofficeURLRequest();
        return TeaModel.build(map, self);
    }

    public GetWebofficeURLRequest setCachePreview(Boolean cachePreview) {
        this.cachePreview = cachePreview;
        return this;
    }
    public Boolean getCachePreview() {
        return this.cachePreview;
    }

    public GetWebofficeURLRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public GetWebofficeURLRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GetWebofficeURLRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GetWebofficeURLRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GetWebofficeURLRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GetWebofficeURLRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetWebofficeURLRequest setPermission(WebofficePermission permission) {
        this.permission = permission;
        return this;
    }
    public WebofficePermission getPermission() {
        return this.permission;
    }

    public GetWebofficeURLRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GetWebofficeURLRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetWebofficeURLRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public GetWebofficeURLRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GetWebofficeURLRequest setUser(WebofficeUser user) {
        this.user = user;
        return this;
    }
    public WebofficeUser getUser() {
        return this.user;
    }

    public GetWebofficeURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GetWebofficeURLRequest setWatermark(WebofficeWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public WebofficeWatermark getWatermark() {
        return this.watermark;
    }

}
