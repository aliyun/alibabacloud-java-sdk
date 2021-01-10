// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCasterSceneConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterSceneConfigResponseBody self = new UpdateCasterSceneConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCasterSceneConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
