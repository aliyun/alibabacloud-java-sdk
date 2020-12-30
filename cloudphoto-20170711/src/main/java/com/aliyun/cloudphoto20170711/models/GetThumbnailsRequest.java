// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetThumbnailsRequest extends TeaModel {
    @NameInMap("ZoomType")
    public String zoomType;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static GetThumbnailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThumbnailsRequest self = new GetThumbnailsRequest();
        return TeaModel.build(map, self);
    }

    public GetThumbnailsRequest setZoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }
    public String getZoomType() {
        return this.zoomType;
    }

    public GetThumbnailsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetThumbnailsRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetThumbnailsRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
