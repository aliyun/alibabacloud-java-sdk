// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteBindingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>021788F6-E50C-4BD6-9F80-66B0A19A6***</p>
     */
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
