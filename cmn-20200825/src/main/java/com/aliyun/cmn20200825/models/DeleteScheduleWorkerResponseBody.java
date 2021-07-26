// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleWorkerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScheduleWorkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleWorkerResponseBody self = new DeleteScheduleWorkerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleWorkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
