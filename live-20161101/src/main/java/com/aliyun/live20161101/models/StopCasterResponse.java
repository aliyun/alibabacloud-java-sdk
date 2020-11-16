// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCasterResponse self = new StopCasterResponse();
        return TeaModel.build(map, self);
    }

    public StopCasterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
