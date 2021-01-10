// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterSceneConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCasterSceneConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterSceneConfigResponseBody self = new DeleteCasterSceneConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCasterSceneConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
