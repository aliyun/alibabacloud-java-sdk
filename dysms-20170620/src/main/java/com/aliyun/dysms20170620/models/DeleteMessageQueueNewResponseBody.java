// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteMessageQueueNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeleteMessageQueueNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageQueueNewResponseBody self = new DeleteMessageQueueNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMessageQueueNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMessageQueueNewResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
