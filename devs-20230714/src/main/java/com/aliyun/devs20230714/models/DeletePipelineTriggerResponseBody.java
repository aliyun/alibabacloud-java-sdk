// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeletePipelineTriggerResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeletePipelineTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineTriggerResponseBody self = new DeletePipelineTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePipelineTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
