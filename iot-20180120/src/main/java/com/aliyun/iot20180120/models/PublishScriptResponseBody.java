// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishScriptResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SyntaxErrorMsg")
    public String syntaxErrorMsg;

    public static PublishScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishScriptResponseBody self = new PublishScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PublishScriptResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PublishScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PublishScriptResponseBody setSyntaxErrorMsg(String syntaxErrorMsg) {
        this.syntaxErrorMsg = syntaxErrorMsg;
        return this;
    }
    public String getSyntaxErrorMsg() {
        return this.syntaxErrorMsg;
    }

}
