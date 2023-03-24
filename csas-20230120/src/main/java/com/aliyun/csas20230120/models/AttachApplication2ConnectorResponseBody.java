// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AttachApplication2ConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachApplication2ConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachApplication2ConnectorResponseBody self = new AttachApplication2ConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachApplication2ConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
