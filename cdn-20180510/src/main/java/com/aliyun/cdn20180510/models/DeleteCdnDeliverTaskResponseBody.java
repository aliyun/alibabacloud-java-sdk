// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnDeliverTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCdnDeliverTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnDeliverTaskResponseBody self = new DeleteCdnDeliverTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCdnDeliverTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
