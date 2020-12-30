// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateFacePersonRequest extends TeaModel {
    @NameInMap("FaceGroupId")
    public Long faceGroupId;

    @NameInMap("FacePersonName")
    public String facePersonName;

    @NameInMap("ImageUrls")
    public String imageUrls;

    public static CreateFacePersonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFacePersonRequest self = new CreateFacePersonRequest();
        return TeaModel.build(map, self);
    }

    public CreateFacePersonRequest setFaceGroupId(Long faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public Long getFaceGroupId() {
        return this.faceGroupId;
    }

    public CreateFacePersonRequest setFacePersonName(String facePersonName) {
        this.facePersonName = facePersonName;
        return this;
    }
    public String getFacePersonName() {
        return this.facePersonName;
    }

    public CreateFacePersonRequest setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public String getImageUrls() {
        return this.imageUrls;
    }

}
