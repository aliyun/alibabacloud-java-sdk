// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RollbackSuspEventQuaraFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileResponse self = new RollbackSuspEventQuaraFileResponse();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
