// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPhotosByMd5sRequest extends TeaModel {
    @NameInMap("State")
    public String state;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("Md5")
    public java.util.List<String> md5;

    public static GetPhotosByMd5sRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhotosByMd5sRequest self = new GetPhotosByMd5sRequest();
        return TeaModel.build(map, self);
    }

    public GetPhotosByMd5sRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetPhotosByMd5sRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetPhotosByMd5sRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetPhotosByMd5sRequest setMd5(java.util.List<String> md5) {
        this.md5 = md5;
        return this;
    }
    public java.util.List<String> getMd5() {
        return this.md5;
    }

}
