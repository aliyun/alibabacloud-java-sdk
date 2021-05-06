// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachCenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachCenResponse self = new DetachCenResponse();
        return TeaModel.build(map, self);
    }

    public DetachCenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
