// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RemoveFacePhotosRequest extends TeaModel {
    @NameInMap("FaceId")
    public Long faceId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static RemoveFacePhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveFacePhotosRequest self = new RemoveFacePhotosRequest();
        return TeaModel.build(map, self);
    }

    public RemoveFacePhotosRequest setFaceId(Long faceId) {
        this.faceId = faceId;
        return this;
    }
    public Long getFaceId() {
        return this.faceId;
    }

    public RemoveFacePhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public RemoveFacePhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public RemoveFacePhotosRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
