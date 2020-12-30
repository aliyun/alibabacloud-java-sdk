// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SetFaceCoverRequest extends TeaModel {
    @NameInMap("FaceId")
    public Long faceId;

    @NameInMap("PhotoId")
    public Long photoId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static SetFaceCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFaceCoverRequest self = new SetFaceCoverRequest();
        return TeaModel.build(map, self);
    }

    public SetFaceCoverRequest setFaceId(Long faceId) {
        this.faceId = faceId;
        return this;
    }
    public Long getFaceId() {
        return this.faceId;
    }

    public SetFaceCoverRequest setPhotoId(Long photoId) {
        this.photoId = photoId;
        return this;
    }
    public Long getPhotoId() {
        return this.photoId;
    }

    public SetFaceCoverRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public SetFaceCoverRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
