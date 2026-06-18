// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSlrRoleForRealtimeLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSlrRoleForRealtimeLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleForRealtimeLogResponseBody self = new CreateSlrRoleForRealtimeLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleForRealtimeLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
