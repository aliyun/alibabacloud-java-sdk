// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class EditPhotosRequest extends TeaModel {
    @NameInMap("ShareExpireTime")
    public Long shareExpireTime;

    @NameInMap("TakenAt")
    public Long takenAt;

    @NameInMap("Title")
    public String title;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static EditPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        EditPhotosRequest self = new EditPhotosRequest();
        return TeaModel.build(map, self);
    }

    public EditPhotosRequest setShareExpireTime(Long shareExpireTime) {
        this.shareExpireTime = shareExpireTime;
        return this;
    }
    public Long getShareExpireTime() {
        return this.shareExpireTime;
    }

    public EditPhotosRequest setTakenAt(Long takenAt) {
        this.takenAt = takenAt;
        return this;
    }
    public Long getTakenAt() {
        return this.takenAt;
    }

    public EditPhotosRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public EditPhotosRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public EditPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public EditPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public EditPhotosRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
