// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateCasterSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterSceneConfigResponse self = new UpdateCasterSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCasterSceneConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
