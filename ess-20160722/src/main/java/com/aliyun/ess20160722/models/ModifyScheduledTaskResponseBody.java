// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskResponseBody self = new ModifyScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
