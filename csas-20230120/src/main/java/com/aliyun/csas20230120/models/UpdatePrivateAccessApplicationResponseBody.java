// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePrivateAccessApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationResponseBody self = new UpdatePrivateAccessApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
