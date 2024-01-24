// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateBindingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
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
