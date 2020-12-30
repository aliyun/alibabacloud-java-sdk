// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RemoveAlbumPhotosRequest extends TeaModel {
    @NameInMap("AlbumId")
    public Long albumId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static RemoveAlbumPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAlbumPhotosRequest self = new RemoveAlbumPhotosRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAlbumPhotosRequest setAlbumId(Long albumId) {
        this.albumId = albumId;
        return this;
    }
    public Long getAlbumId() {
        return this.albumId;
    }

    public RemoveAlbumPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public RemoveAlbumPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public RemoveAlbumPhotosRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
