// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteBindingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindingResponseBody self = new DeleteBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
