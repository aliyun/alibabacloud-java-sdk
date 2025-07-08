// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteCardMessageQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeleteCardMessageQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCardMessageQueueResponseBody self = new DeleteCardMessageQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCardMessageQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCardMessageQueueResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
