// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeleteFacesRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("FaceId")
    public java.util.List<Integer> faceId;

    public static DeleteFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFacesRequest self = new DeleteFacesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFacesRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public DeleteFacesRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public DeleteFacesRequest setFaceId(java.util.List<Integer> faceId) {
        this.faceId = faceId;
        return this;
    }
    public java.util.List<Integer> getFaceId() {
        return this.faceId;
    }

}
