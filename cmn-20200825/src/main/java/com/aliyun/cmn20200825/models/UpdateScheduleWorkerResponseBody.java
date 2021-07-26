// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleWorkerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateScheduleWorkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleWorkerResponseBody self = new UpdateScheduleWorkerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleWorkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
