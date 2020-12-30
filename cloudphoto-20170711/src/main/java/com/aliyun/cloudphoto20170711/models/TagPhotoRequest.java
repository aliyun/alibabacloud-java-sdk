// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class TagPhotoRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("PhotoId")
    public Long photoId;

    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    @NameInMap("Confidence")
    public java.util.List<Integer> confidence;

    public static TagPhotoRequest build(java.util.Map<String, ?> map) throws Exception {
        TagPhotoRequest self = new TagPhotoRequest();
        return TeaModel.build(map, self);
    }

    public TagPhotoRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public TagPhotoRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public TagPhotoRequest setPhotoId(Long photoId) {
        this.photoId = photoId;
        return this;
    }
    public Long getPhotoId() {
        return this.photoId;
    }

    public TagPhotoRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    public TagPhotoRequest setConfidence(java.util.List<Integer> confidence) {
        this.confidence = confidence;
        return this;
    }
    public java.util.List<Integer> getConfidence() {
        return this.confidence;
    }

}
