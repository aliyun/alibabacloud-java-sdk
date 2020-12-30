// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class DeleteFacePersonRequest extends TeaModel {
    @NameInMap("FaceGroupId")
    public Long faceGroupId;

    @NameInMap("FacePersonId")
    public Long facePersonId;

    public static DeleteFacePersonRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFacePersonRequest self = new DeleteFacePersonRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFacePersonRequest setFaceGroupId(Long faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public Long getFaceGroupId() {
        return this.faceGroupId;
    }

    public DeleteFacePersonRequest setFacePersonId(Long facePersonId) {
        this.facePersonId = facePersonId;
        return this;
    }
    public Long getFacePersonId() {
        return this.facePersonId;
    }

}
