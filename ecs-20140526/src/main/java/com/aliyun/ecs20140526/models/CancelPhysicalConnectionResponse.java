// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelPhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPhysicalConnectionResponse self = new CancelPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CancelPhysicalConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
