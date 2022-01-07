// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindDriverFromEdgeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UnbindDriverFromEdgeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindDriverFromEdgeInstanceResponseBody self = new UnbindDriverFromEdgeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindDriverFromEdgeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindDriverFromEdgeInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnbindDriverFromEdgeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindDriverFromEdgeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
