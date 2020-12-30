// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListAlbumPhotosRequest extends TeaModel {
    @NameInMap("AlbumId")
    public Long albumId;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Cursor")
    public String cursor;

    @NameInMap("State")
    public String state;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static ListAlbumPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumPhotosRequest self = new ListAlbumPhotosRequest();
        return TeaModel.build(map, self);
    }

    public ListAlbumPhotosRequest setAlbumId(Long albumId) {
        this.albumId = albumId;
        return this;
    }
    public Long getAlbumId() {
        return this.albumId;
    }

    public ListAlbumPhotosRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListAlbumPhotosRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAlbumPhotosRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListAlbumPhotosRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListAlbumPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ListAlbumPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
