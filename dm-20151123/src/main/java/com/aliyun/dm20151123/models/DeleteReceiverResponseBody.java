// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteReceiverResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteReceiverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReceiverResponseBody self = new DeleteReceiverResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReceiverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
