// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationResponseBody self = new RollbackApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
