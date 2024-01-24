// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteVirtualHostResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVirtualHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualHostResponseBody self = new DeleteVirtualHostResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
