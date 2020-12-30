// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotoTagsRequest extends TeaModel {
    @NameInMap("PhotoId")
    public Long photoId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("Lang")
    public String lang;

    public static ListPhotoTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhotoTagsRequest self = new ListPhotoTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListPhotoTagsRequest setPhotoId(Long photoId) {
        this.photoId = photoId;
        return this;
    }
    public Long getPhotoId() {
        return this.photoId;
    }

    public ListPhotoTagsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ListPhotoTagsRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public ListPhotoTagsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
