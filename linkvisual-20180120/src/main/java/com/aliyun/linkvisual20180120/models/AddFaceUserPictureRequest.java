// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserPictureRequest extends TeaModel {
    @NameInMap("FacePicUrl")
    public String facePicUrl;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("UserId")
    public String userId;

    public static AddFaceUserPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserPictureRequest self = new AddFaceUserPictureRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserPictureRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public AddFaceUserPictureRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserPictureRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
