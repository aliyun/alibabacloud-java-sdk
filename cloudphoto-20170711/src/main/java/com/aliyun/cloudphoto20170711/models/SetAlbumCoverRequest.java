// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SetAlbumCoverRequest extends TeaModel {
    @NameInMap("AlbumId")
    public Long albumId;

    @NameInMap("PhotoId")
    public Long photoId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static SetAlbumCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAlbumCoverRequest self = new SetAlbumCoverRequest();
        return TeaModel.build(map, self);
    }

    public SetAlbumCoverRequest setAlbumId(Long albumId) {
        this.albumId = albumId;
        return this;
    }
    public Long getAlbumId() {
        return this.albumId;
    }

    public SetAlbumCoverRequest setPhotoId(Long photoId) {
        this.photoId = photoId;
        return this;
    }
    public Long getPhotoId() {
        return this.photoId;
    }

    public SetAlbumCoverRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public SetAlbumCoverRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
