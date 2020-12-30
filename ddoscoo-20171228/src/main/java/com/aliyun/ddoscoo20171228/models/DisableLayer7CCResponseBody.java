// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DisableLayer7CCResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableLayer7CCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableLayer7CCResponseBody self = new DisableLayer7CCResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableLayer7CCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
