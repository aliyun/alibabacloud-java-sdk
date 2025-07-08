// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsDetectTaskNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static CreateSmsDetectTaskNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsDetectTaskNewResponseBody self = new CreateSmsDetectTaskNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsDetectTaskNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmsDetectTaskNewResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
