// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateClientUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserPasswordResponseBody self = new UpdateClientUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
