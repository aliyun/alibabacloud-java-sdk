// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class RegisterFaceImageRequest extends TeaModel {
    @NameInMap("FaceGroupId")
    public Long faceGroupId;

    @NameInMap("FacePersonId")
    public Long facePersonId;

    @NameInMap("ImageUrl")
    public String imageUrl;

    public static RegisterFaceImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterFaceImageRequest self = new RegisterFaceImageRequest();
        return TeaModel.build(map, self);
    }

    public RegisterFaceImageRequest setFaceGroupId(Long faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public Long getFaceGroupId() {
        return this.faceGroupId;
    }

    public RegisterFaceImageRequest setFacePersonId(Long facePersonId) {
        this.facePersonId = facePersonId;
        return this;
    }
    public Long getFacePersonId() {
        return this.facePersonId;
    }

    public RegisterFaceImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
