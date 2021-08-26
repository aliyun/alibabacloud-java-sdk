// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBindingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingResponseBody self = new CreateBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
