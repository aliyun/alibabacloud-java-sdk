// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditRangeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAuditRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditRangeResponseBody self = new UpdateAuditRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuditRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
