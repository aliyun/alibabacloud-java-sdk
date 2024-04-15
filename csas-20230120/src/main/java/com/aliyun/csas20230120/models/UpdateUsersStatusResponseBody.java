// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUsersStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUsersStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUsersStatusResponseBody self = new UpdateUsersStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUsersStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
