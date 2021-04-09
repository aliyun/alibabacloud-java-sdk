// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateFaceConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateFaceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceConfigResponse self = new CreateFaceConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaceConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
