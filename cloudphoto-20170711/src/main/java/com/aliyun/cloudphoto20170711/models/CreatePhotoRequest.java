// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreatePhotoRequest extends TeaModel {
    @NameInMap("FileId")
    public String fileId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("UploadType")
    public String uploadType;

    @NameInMap("PhotoTitle")
    public String photoTitle;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("Staging")
    public String staging;

    @NameInMap("ShareExpireTime")
    public Long shareExpireTime;

    @NameInMap("TakenAt")
    public Long takenAt;

    public static CreatePhotoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhotoRequest self = new CreatePhotoRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhotoRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreatePhotoRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreatePhotoRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public CreatePhotoRequest setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle;
        return this;
    }
    public String getPhotoTitle() {
        return this.photoTitle;
    }

    public CreatePhotoRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public CreatePhotoRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePhotoRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public CreatePhotoRequest setStaging(String staging) {
        this.staging = staging;
        return this;
    }
    public String getStaging() {
        return this.staging;
    }

    public CreatePhotoRequest setShareExpireTime(Long shareExpireTime) {
        this.shareExpireTime = shareExpireTime;
        return this;
    }
    public Long getShareExpireTime() {
        return this.shareExpireTime;
    }

    public CreatePhotoRequest setTakenAt(Long takenAt) {
        this.takenAt = takenAt;
        return this;
    }
    public Long getTakenAt() {
        return this.takenAt;
    }

}
