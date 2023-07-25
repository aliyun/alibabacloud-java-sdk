// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnDeliverTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnDeliverTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnDeliverTaskResponseBody self = new DeleteDcdnDeliverTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnDeliverTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
