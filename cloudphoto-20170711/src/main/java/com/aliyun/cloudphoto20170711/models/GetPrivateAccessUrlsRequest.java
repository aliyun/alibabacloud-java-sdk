// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPrivateAccessUrlsRequest extends TeaModel {
    @NameInMap("ZoomType")
    public String zoomType;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static GetPrivateAccessUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessUrlsRequest self = new GetPrivateAccessUrlsRequest();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessUrlsRequest setZoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }
    public String getZoomType() {
        return this.zoomType;
    }

    public GetPrivateAccessUrlsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetPrivateAccessUrlsRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetPrivateAccessUrlsRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
