// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateCustomizedFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomizedFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomizedFilterResponseBody self = new UpdateCustomizedFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomizedFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
