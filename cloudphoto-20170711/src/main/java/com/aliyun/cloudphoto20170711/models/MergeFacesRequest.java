// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MergeFacesRequest extends TeaModel {
    @NameInMap("TargetFaceId")
    public Long targetFaceId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("FaceId")
    public java.util.List<Integer> faceId;

    public static MergeFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeFacesRequest self = new MergeFacesRequest();
        return TeaModel.build(map, self);
    }

    public MergeFacesRequest setTargetFaceId(Long targetFaceId) {
        this.targetFaceId = targetFaceId;
        return this;
    }
    public Long getTargetFaceId() {
        return this.targetFaceId;
    }

    public MergeFacesRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public MergeFacesRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public MergeFacesRequest setFaceId(java.util.List<Integer> faceId) {
        this.faceId = faceId;
        return this;
    }
    public java.util.List<Integer> getFaceId() {
        return this.faceId;
    }

}
