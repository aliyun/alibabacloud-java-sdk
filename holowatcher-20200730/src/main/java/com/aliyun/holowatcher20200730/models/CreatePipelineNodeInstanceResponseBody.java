// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreatePipelineNodeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public java.util.Map<String, ?> resultObj;

    @NameInMap("Success")
    public Boolean success;

    public static CreatePipelineNodeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineNodeInstanceResponseBody self = new CreatePipelineNodeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelineNodeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePipelineNodeInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreatePipelineNodeInstanceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreatePipelineNodeInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePipelineNodeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePipelineNodeInstanceResponseBody setResultObj(java.util.Map<String, ?> resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public java.util.Map<String, ?> getResultObj() {
        return this.resultObj;
    }

    public CreatePipelineNodeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
