// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetVideoCoverRequest extends TeaModel {
    @NameInMap("PhotoId")
    public Long photoId;

    @NameInMap("ZoomType")
    public String zoomType;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static GetVideoCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCoverRequest self = new GetVideoCoverRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoCoverRequest setPhotoId(Long photoId) {
        this.photoId = photoId;
        return this;
    }
    public Long getPhotoId() {
        return this.photoId;
    }

    public GetVideoCoverRequest setZoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }
    public String getZoomType() {
        return this.zoomType;
    }

    public GetVideoCoverRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetVideoCoverRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
