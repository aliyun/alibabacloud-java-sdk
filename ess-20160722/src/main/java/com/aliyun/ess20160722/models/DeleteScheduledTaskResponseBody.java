// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DeleteScheduledTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledTaskResponseBody self = new DeleteScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
