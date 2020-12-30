// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetThumbnailRequest extends TeaModel {
    @NameInMap("PhotoId")
    public Long photoId;

    @NameInMap("ZoomType")
    public String zoomType;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static GetThumbnailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThumbnailRequest self = new GetThumbnailRequest();
        return TeaModel.build(map, self);
    }

    public GetThumbnailRequest setPhotoId(Long photoId) {
        this.photoId = photoId;
        return this;
    }
    public Long getPhotoId() {
        return this.photoId;
    }

    public GetThumbnailRequest setZoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }
    public String getZoomType() {
        return this.zoomType;
    }

    public GetThumbnailRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetThumbnailRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
