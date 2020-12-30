// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MoveAlbumPhotosRequest extends TeaModel {
    @NameInMap("SourceAlbumId")
    public Long sourceAlbumId;

    @NameInMap("TargetAlbumId")
    public Long targetAlbumId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static MoveAlbumPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveAlbumPhotosRequest self = new MoveAlbumPhotosRequest();
        return TeaModel.build(map, self);
    }

    public MoveAlbumPhotosRequest setSourceAlbumId(Long sourceAlbumId) {
        this.sourceAlbumId = sourceAlbumId;
        return this;
    }
    public Long getSourceAlbumId() {
        return this.sourceAlbumId;
    }

    public MoveAlbumPhotosRequest setTargetAlbumId(Long targetAlbumId) {
        this.targetAlbumId = targetAlbumId;
        return this;
    }
    public Long getTargetAlbumId() {
        return this.targetAlbumId;
    }

    public MoveAlbumPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public MoveAlbumPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public MoveAlbumPhotosRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
