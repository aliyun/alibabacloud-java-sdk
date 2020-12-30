// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchAlbumTagPhotosRequest extends TeaModel {
    @NameInMap("AlbumId")
    public Long albumId;

    @NameInMap("TagId")
    public Long tagId;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static FetchAlbumTagPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchAlbumTagPhotosRequest self = new FetchAlbumTagPhotosRequest();
        return TeaModel.build(map, self);
    }

    public FetchAlbumTagPhotosRequest setAlbumId(Long albumId) {
        this.albumId = albumId;
        return this;
    }
    public Long getAlbumId() {
        return this.albumId;
    }

    public FetchAlbumTagPhotosRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

    public FetchAlbumTagPhotosRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public FetchAlbumTagPhotosRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public FetchAlbumTagPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public FetchAlbumTagPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
