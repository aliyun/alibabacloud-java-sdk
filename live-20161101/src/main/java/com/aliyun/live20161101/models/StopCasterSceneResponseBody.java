// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopCasterSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopCasterSceneResponseBody self = new StopCasterSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public StopCasterSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
