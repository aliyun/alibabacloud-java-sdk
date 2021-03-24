// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateMsgRecallIntervalResponseBody extends TeaModel {
    // desc
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    // result
    @NameInMap("Result")
    public String result;

    public static UpdateMsgRecallIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsgRecallIntervalResponseBody self = new UpdateMsgRecallIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMsgRecallIntervalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMsgRecallIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMsgRecallIntervalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateMsgRecallIntervalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMsgRecallIntervalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateMsgRecallIntervalResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
