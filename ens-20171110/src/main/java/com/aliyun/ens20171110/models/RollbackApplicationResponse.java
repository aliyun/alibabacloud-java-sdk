// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RollbackApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationResponse self = new RollbackApplicationResponse();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
