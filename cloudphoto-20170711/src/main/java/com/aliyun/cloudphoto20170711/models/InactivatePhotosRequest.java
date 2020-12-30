// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class InactivatePhotosRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("InactiveTime")
    public Long inactiveTime;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static InactivatePhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        InactivatePhotosRequest self = new InactivatePhotosRequest();
        return TeaModel.build(map, self);
    }

    public InactivatePhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public InactivatePhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public InactivatePhotosRequest setInactiveTime(Long inactiveTime) {
        this.inactiveTime = inactiveTime;
        return this;
    }
    public Long getInactiveTime() {
        return this.inactiveTime;
    }

    public InactivatePhotosRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
