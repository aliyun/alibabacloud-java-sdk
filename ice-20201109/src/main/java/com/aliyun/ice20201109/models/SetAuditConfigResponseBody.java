// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetAuditConfigResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static SetAuditConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAuditConfigResponseBody self = new SetAuditConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAuditConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
