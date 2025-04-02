// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class SubmitSymbolicResponseBody extends TeaModel {
    /**
     * <p>args</p>
     */
    @NameInMap("Args")
    public java.util.Map<String, ?> args;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B3AD0FE4-36EF-1641-90B1-77618166F2ff</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitSymbolicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSymbolicResponseBody self = new SubmitSymbolicResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSymbolicResponseBody setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public SubmitSymbolicResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public SubmitSymbolicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitSymbolicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSymbolicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
