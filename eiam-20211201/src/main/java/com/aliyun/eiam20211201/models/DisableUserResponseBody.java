// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableUserResponseBody self = new DisableUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
