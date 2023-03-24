// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupResponseBody self = new UpdateUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
