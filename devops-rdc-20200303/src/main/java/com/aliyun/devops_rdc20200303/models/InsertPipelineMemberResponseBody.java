// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class InsertPipelineMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Object")
    public Boolean object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static InsertPipelineMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertPipelineMemberResponseBody self = new InsertPipelineMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertPipelineMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertPipelineMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InsertPipelineMemberResponseBody setObject(Boolean object) {
        this.object = object;
        return this;
    }
    public Boolean getObject() {
        return this.object;
    }

    public InsertPipelineMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public InsertPipelineMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
