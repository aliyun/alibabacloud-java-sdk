// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class DeleteFaceImageRequest extends TeaModel {
    @NameInMap("FaceGroupId")
    public Long faceGroupId;

    @NameInMap("FacePersonId")
    public Long facePersonId;

    @NameInMap("FaceImageId")
    public Long faceImageId;

    public static DeleteFaceImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceImageRequest self = new DeleteFaceImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceImageRequest setFaceGroupId(Long faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public Long getFaceGroupId() {
        return this.faceGroupId;
    }

    public DeleteFaceImageRequest setFacePersonId(Long facePersonId) {
        this.facePersonId = facePersonId;
        return this;
    }
    public Long getFacePersonId() {
        return this.facePersonId;
    }

    public DeleteFaceImageRequest setFaceImageId(Long faceImageId) {
        this.faceImageId = faceImageId;
        return this;
    }
    public Long getFaceImageId() {
        return this.faceImageId;
    }

}
