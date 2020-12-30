// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsDbFailedRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public Boolean result;

    public static RemoveDrdsDbFailedRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsDbFailedRecordResponseBody self = new RemoveDrdsDbFailedRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsDbFailedRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDrdsDbFailedRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveDrdsDbFailedRecordResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
