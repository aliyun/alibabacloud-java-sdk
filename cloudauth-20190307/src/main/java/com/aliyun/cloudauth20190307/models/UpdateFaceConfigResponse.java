// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateFaceConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateFaceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceConfigResponse self = new UpdateFaceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
