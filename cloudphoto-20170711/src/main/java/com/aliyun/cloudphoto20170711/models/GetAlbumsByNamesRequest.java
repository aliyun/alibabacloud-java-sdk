// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetAlbumsByNamesRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("Name")
    public java.util.List<String> name;

    public static GetAlbumsByNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumsByNamesRequest self = new GetAlbumsByNamesRequest();
        return TeaModel.build(map, self);
    }

    public GetAlbumsByNamesRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetAlbumsByNamesRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetAlbumsByNamesRequest setName(java.util.List<String> name) {
        this.name = name;
        return this;
    }
    public java.util.List<String> getName() {
        return this.name;
    }

}
