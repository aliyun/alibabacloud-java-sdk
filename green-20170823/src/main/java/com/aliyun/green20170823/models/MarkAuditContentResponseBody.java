// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkAuditContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MarkAuditContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MarkAuditContentResponseBody self = new MarkAuditContentResponseBody();
        return TeaModel.build(map, self);
    }

    public MarkAuditContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
