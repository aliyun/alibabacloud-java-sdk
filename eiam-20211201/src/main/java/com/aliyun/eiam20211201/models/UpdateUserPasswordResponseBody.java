// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPasswordResponseBody self = new UpdateUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
