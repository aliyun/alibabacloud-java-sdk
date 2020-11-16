// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSceneConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetCasterSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasterSceneConfigResponse self = new SetCasterSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetCasterSceneConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
