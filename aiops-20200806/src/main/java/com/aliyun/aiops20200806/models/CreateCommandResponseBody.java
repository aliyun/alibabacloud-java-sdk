// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandResponseBody self = new CreateCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
