// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPhotosRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static GetPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhotosRequest self = new GetPhotosRequest();
        return TeaModel.build(map, self);
    }

    public GetPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetPhotosRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
