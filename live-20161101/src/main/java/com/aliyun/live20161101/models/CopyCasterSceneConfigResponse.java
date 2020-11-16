// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterSceneConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CopyCasterSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterSceneConfigResponse self = new CopyCasterSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public CopyCasterSceneConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
