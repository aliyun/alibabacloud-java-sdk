// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsDbFailedRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static RemoveDrdsDbFailedRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsDbFailedRecordResponse self = new RemoveDrdsDbFailedRecordResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsDbFailedRecordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDrdsDbFailedRecordResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveDrdsDbFailedRecordResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
