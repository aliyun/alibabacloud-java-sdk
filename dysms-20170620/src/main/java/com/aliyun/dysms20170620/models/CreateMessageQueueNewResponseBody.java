// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateMessageQueueNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static CreateMessageQueueNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageQueueNewResponseBody self = new CreateMessageQueueNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMessageQueueNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMessageQueueNewResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
