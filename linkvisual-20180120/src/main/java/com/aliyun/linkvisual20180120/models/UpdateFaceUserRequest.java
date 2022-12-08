// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserRequest extends TeaModel {
    @NameInMap("CustomUserId")
    public String customUserId;

    @NameInMap("FacePicUrl")
    public String facePicUrl;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Params")
    public String params;

    @NameInMap("UserId")
    public String userId;

    public static UpdateFaceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserRequest self = new UpdateFaceUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public UpdateFaceUserRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public UpdateFaceUserRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public UpdateFaceUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFaceUserRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public UpdateFaceUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
