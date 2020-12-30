// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class DeleteFaceGroupRequest extends TeaModel {
    @NameInMap("FaceGroupId")
    public Long faceGroupId;

    public static DeleteFaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceGroupRequest self = new DeleteFaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceGroupRequest setFaceGroupId(Long faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public Long getFaceGroupId() {
        return this.faceGroupId;
    }

}
