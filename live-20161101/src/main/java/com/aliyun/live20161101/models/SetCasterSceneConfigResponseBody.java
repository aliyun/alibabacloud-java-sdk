// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSceneConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetCasterSceneConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCasterSceneConfigResponseBody self = new SetCasterSceneConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCasterSceneConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
