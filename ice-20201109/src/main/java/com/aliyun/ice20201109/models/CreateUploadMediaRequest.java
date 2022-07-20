// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadMediaRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("FileInfo")
    public String fileInfo;

    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    @NameInMap("PostProcessConfig")
    public String postProcessConfig;

    @NameInMap("UploadTargetConfig")
    public String uploadTargetConfig;

    @NameInMap("UserData")
    public String userData;

    public static CreateUploadMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMediaRequest self = new CreateUploadMediaRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadMediaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateUploadMediaRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateUploadMediaRequest setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public String getFileInfo() {
        return this.fileInfo;
    }

    public CreateUploadMediaRequest setMediaMetaData(String mediaMetaData) {
        this.mediaMetaData = mediaMetaData;
        return this;
    }
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    public CreateUploadMediaRequest setPostProcessConfig(String postProcessConfig) {
        this.postProcessConfig = postProcessConfig;
        return this;
    }
    public String getPostProcessConfig() {
        return this.postProcessConfig;
    }

    public CreateUploadMediaRequest setUploadTargetConfig(String uploadTargetConfig) {
        this.uploadTargetConfig = uploadTargetConfig;
        return this;
    }
    public String getUploadTargetConfig() {
        return this.uploadTargetConfig;
    }

    public CreateUploadMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
