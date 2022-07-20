// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UploadMediaByURLRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    @NameInMap("PostProcessConfig")
    public String postProcessConfig;

    @NameInMap("UploadTargetConfig")
    public String uploadTargetConfig;

    @NameInMap("UploadURLs")
    public String uploadURLs;

    @NameInMap("UserData")
    public String userData;

    public static UploadMediaByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLRequest self = new UploadMediaByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadMediaByURLRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadMediaByURLRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public UploadMediaByURLRequest setMediaMetaData(String mediaMetaData) {
        this.mediaMetaData = mediaMetaData;
        return this;
    }
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    public UploadMediaByURLRequest setPostProcessConfig(String postProcessConfig) {
        this.postProcessConfig = postProcessConfig;
        return this;
    }
    public String getPostProcessConfig() {
        return this.postProcessConfig;
    }

    public UploadMediaByURLRequest setUploadTargetConfig(String uploadTargetConfig) {
        this.uploadTargetConfig = uploadTargetConfig;
        return this;
    }
    public String getUploadTargetConfig() {
        return this.uploadTargetConfig;
    }

    public UploadMediaByURLRequest setUploadURLs(String uploadURLs) {
        this.uploadURLs = uploadURLs;
        return this;
    }
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    public UploadMediaByURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
