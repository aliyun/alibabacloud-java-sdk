// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DisableLayer7CCResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DisableLayer7CCResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLayer7CCResponse self = new DisableLayer7CCResponse();
        return TeaModel.build(map, self);
    }

    public DisableLayer7CCResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
