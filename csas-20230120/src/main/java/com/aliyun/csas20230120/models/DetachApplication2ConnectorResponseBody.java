// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DetachApplication2ConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachApplication2ConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachApplication2ConnectorResponseBody self = new DetachApplication2ConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachApplication2ConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
