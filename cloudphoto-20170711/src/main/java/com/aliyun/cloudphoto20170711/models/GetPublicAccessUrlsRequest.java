// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPublicAccessUrlsRequest extends TeaModel {
    @NameInMap("ZoomType")
    public String zoomType;

    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static GetPublicAccessUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicAccessUrlsRequest self = new GetPublicAccessUrlsRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicAccessUrlsRequest setZoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }
    public String getZoomType() {
        return this.zoomType;
    }

    public GetPublicAccessUrlsRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public GetPublicAccessUrlsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetPublicAccessUrlsRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetPublicAccessUrlsRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
