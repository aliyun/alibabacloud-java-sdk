// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RenameFaceRequest extends TeaModel {
    @NameInMap("FaceId")
    public Long faceId;

    @NameInMap("FaceName")
    public String faceName;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static RenameFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameFaceRequest self = new RenameFaceRequest();
        return TeaModel.build(map, self);
    }

    public RenameFaceRequest setFaceId(Long faceId) {
        this.faceId = faceId;
        return this;
    }
    public Long getFaceId() {
        return this.faceId;
    }

    public RenameFaceRequest setFaceName(String faceName) {
        this.faceName = faceName;
        return this;
    }
    public String getFaceName() {
        return this.faceName;
    }

    public RenameFaceRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public RenameFaceRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
