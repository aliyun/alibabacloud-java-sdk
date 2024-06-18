// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DetachApplication2ConnectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4D169859-A4F2-5EC8-853B-8447787C0D8A</p>
     */
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
