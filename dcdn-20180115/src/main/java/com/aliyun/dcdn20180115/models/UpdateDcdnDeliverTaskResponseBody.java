// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDeliverTaskResponseBody extends TeaModel {
    /**
     * <p>Updates a tracking task by task ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDcdnDeliverTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnDeliverTaskResponseBody self = new UpdateDcdnDeliverTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnDeliverTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
