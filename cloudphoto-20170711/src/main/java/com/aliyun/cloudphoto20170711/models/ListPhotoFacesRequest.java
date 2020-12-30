// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotoFacesRequest extends TeaModel {
    @NameInMap("PhotoId")
    public Long photoId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static ListPhotoFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhotoFacesRequest self = new ListPhotoFacesRequest();
        return TeaModel.build(map, self);
    }

    public ListPhotoFacesRequest setPhotoId(Long photoId) {
        this.photoId = photoId;
        return this;
    }
    public Long getPhotoId() {
        return this.photoId;
    }

    public ListPhotoFacesRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ListPhotoFacesRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
