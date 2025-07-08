// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateCardMessageQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static CreateCardMessageQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCardMessageQueueResponseBody self = new CreateCardMessageQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCardMessageQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCardMessageQueueResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
