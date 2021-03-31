// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class CreateByAccountResponseBody extends TeaModel {
    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // data
    @NameInMap("Data")
    public Boolean data;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // success
    @NameInMap("Success")
    public Boolean success;

    // exception
    @NameInMap("Exception")
    public java.util.Map<String, ?> exception;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateByAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateByAccountResponseBody self = new CreateByAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateByAccountResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateByAccountResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateByAccountResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateByAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateByAccountResponseBody setException(java.util.Map<String, ?> exception) {
        this.exception = exception;
        return this;
    }
    public java.util.Map<String, ?> getException() {
        return this.exception;
    }

    public CreateByAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
