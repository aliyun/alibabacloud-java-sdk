// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SetMeRequest extends TeaModel {
    @NameInMap("FaceId")
    public Long faceId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static SetMeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMeRequest self = new SetMeRequest();
        return TeaModel.build(map, self);
    }

    public SetMeRequest setFaceId(Long faceId) {
        this.faceId = faceId;
        return this;
    }
    public Long getFaceId() {
        return this.faceId;
    }

    public SetMeRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public SetMeRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
