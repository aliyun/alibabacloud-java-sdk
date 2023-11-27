// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateMsgRecallIntervalResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>httpStatusCode</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>desc</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>result</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateMsgRecallIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsgRecallIntervalResponseBody self = new UpdateMsgRecallIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMsgRecallIntervalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMsgRecallIntervalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public UpdateMsgRecallIntervalResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public UpdateMsgRecallIntervalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
