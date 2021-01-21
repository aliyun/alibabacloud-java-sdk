// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("FacePicUrl")
    @Validation(required = true)
    public String facePicUrl;

    @NameInMap("CustomUserId")
    @Validation(required = true)
    public String customUserId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Params")
    public String params;

    public static AddFaceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserRequest self = new AddFaceUserRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public AddFaceUserRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public AddFaceUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddFaceUserRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
