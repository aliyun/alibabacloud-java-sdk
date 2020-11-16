// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterSceneConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCasterSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterSceneConfigResponse self = new DeleteCasterSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterSceneConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
