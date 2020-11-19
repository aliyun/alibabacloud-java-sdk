// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartRestoreResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static StartRestoreResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRestoreResponse self = new StartRestoreResponse();
        return TeaModel.build(map, self);
    }

    public StartRestoreResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartRestoreResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public StartRestoreResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
