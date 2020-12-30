// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeleteAlbumsRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("AlbumId")
    public java.util.List<Integer> albumId;

    public static DeleteAlbumsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlbumsRequest self = new DeleteAlbumsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlbumsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public DeleteAlbumsRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public DeleteAlbumsRequest setAlbumId(java.util.List<Integer> albumId) {
        this.albumId = albumId;
        return this;
    }
    public java.util.List<Integer> getAlbumId() {
        return this.albumId;
    }

}
