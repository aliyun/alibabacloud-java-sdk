// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RenameAlbumRequest extends TeaModel {
    @NameInMap("AlbumId")
    public Long albumId;

    @NameInMap("AlbumName")
    public String albumName;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static RenameAlbumRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameAlbumRequest self = new RenameAlbumRequest();
        return TeaModel.build(map, self);
    }

    public RenameAlbumRequest setAlbumId(Long albumId) {
        this.albumId = albumId;
        return this;
    }
    public Long getAlbumId() {
        return this.albumId;
    }

    public RenameAlbumRequest setAlbumName(String albumName) {
        this.albumName = albumName;
        return this;
    }
    public String getAlbumName() {
        return this.albumName;
    }

    public RenameAlbumRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public RenameAlbumRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
