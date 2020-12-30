// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreateAlbumRequest extends TeaModel {
    @NameInMap("AlbumName")
    public String albumName;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("LibraryId")
    public String libraryId;

    public static CreateAlbumRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlbumRequest self = new CreateAlbumRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlbumRequest setAlbumName(String albumName) {
        this.albumName = albumName;
        return this;
    }
    public String getAlbumName() {
        return this.albumName;
    }

    public CreateAlbumRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public CreateAlbumRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateAlbumRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
