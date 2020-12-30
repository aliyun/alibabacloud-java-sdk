// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class LikePhotoRequest extends TeaModel {
    @NameInMap("PhotoId")
    public Long photoId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static LikePhotoRequest build(java.util.Map<String, ?> map) throws Exception {
        LikePhotoRequest self = new LikePhotoRequest();
        return TeaModel.build(map, self);
    }

    public LikePhotoRequest setPhotoId(Long photoId) {
        this.photoId = photoId;
        return this;
    }
    public Long getPhotoId() {
        return this.photoId;
    }

    public LikePhotoRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public LikePhotoRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
