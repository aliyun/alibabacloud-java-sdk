// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkAuditContentItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MarkAuditContentItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MarkAuditContentItemResponseBody self = new MarkAuditContentItemResponseBody();
        return TeaModel.build(map, self);
    }

    public MarkAuditContentItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
