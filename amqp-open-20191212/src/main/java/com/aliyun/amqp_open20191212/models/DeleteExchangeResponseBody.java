// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteExchangeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6961FFB8-6358-4EDC-9E3C-4A0C56CE6***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExchangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExchangeResponseBody self = new DeleteExchangeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExchangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
