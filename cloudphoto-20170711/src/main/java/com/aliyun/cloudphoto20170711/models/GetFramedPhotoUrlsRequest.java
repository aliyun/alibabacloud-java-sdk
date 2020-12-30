// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetFramedPhotoUrlsRequest extends TeaModel {
    @NameInMap("FrameId")
    public String frameId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public java.util.List<Integer> photoId;

    public static GetFramedPhotoUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFramedPhotoUrlsRequest self = new GetFramedPhotoUrlsRequest();
        return TeaModel.build(map, self);
    }

    public GetFramedPhotoUrlsRequest setFrameId(String frameId) {
        this.frameId = frameId;
        return this;
    }
    public String getFrameId() {
        return this.frameId;
    }

    public GetFramedPhotoUrlsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetFramedPhotoUrlsRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetFramedPhotoUrlsRequest setPhotoId(java.util.List<Integer> photoId) {
        this.photoId = photoId;
        return this;
    }
    public java.util.List<Integer> getPhotoId() {
        return this.photoId;
    }

}
