// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAuditSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditSettingResponseBody self = new UpdateAuditSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuditSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
