// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetDownloadUrlsRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static GetDownloadUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadUrlsRequest self = new GetDownloadUrlsRequest();
        return TeaModel.build(map, self);
    }

    public GetDownloadUrlsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetDownloadUrlsRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetDownloadUrlsRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
