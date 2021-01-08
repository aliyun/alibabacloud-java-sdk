// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateTaskDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public Boolean object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static UpdateTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskDetailResponseBody self = new UpdateTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTaskDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateTaskDetailResponseBody setObject(Boolean object) {
        this.object = object;
        return this;
    }
    public Boolean getObject() {
        return this.object;
    }

    public UpdateTaskDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateTaskDetailResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

}
