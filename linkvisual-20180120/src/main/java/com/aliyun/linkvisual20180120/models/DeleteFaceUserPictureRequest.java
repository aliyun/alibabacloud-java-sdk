// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserPictureRequest extends TeaModel {
    @NameInMap("FacePicMd5")
    public String facePicMd5;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteFaceUserPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserPictureRequest self = new DeleteFaceUserPictureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserPictureRequest setFacePicMd5(String facePicMd5) {
        this.facePicMd5 = facePicMd5;
        return this;
    }
    public String getFacePicMd5() {
        return this.facePicMd5;
    }

    public DeleteFaceUserPictureRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public DeleteFaceUserPictureRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
