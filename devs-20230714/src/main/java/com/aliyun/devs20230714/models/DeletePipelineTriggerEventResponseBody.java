// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeletePipelineTriggerEventResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeletePipelineTriggerEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineTriggerEventResponseBody self = new DeletePipelineTriggerEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePipelineTriggerEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
