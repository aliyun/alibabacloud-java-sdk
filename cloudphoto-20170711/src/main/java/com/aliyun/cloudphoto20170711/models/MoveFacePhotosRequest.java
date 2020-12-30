// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MoveFacePhotosRequest extends TeaModel {
    @NameInMap("SourceFaceId")
    public Long sourceFaceId;

    @NameInMap("TargetFaceId")
    public Long targetFaceId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static MoveFacePhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveFacePhotosRequest self = new MoveFacePhotosRequest();
        return TeaModel.build(map, self);
    }

    public MoveFacePhotosRequest setSourceFaceId(Long sourceFaceId) {
        this.sourceFaceId = sourceFaceId;
        return this;
    }
    public Long getSourceFaceId() {
        return this.sourceFaceId;
    }

    public MoveFacePhotosRequest setTargetFaceId(Long targetFaceId) {
        this.targetFaceId = targetFaceId;
        return this;
    }
    public Long getTargetFaceId() {
        return this.targetFaceId;
    }

    public MoveFacePhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public MoveFacePhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public MoveFacePhotosRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
