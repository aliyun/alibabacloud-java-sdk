// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterSceneConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CopyCasterSceneConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterSceneConfigResponseBody self = new CopyCasterSceneConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyCasterSceneConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
