// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StartRestoreTaskResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>60AF7C5D-EF4D-4D48-8FD5-C0823FDF28AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the restore task.</p>
     * 
     * <strong>example:</strong>
     * <p>s102h7rfXXXX</p>
     */
    @NameInMap("RestoreTaskId")
    public String restoreTaskId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StartRestoreTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRestoreTaskResponseBody self = new StartRestoreTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRestoreTaskResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public StartRestoreTaskResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public StartRestoreTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartRestoreTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartRestoreTaskResponseBody setRestoreTaskId(String restoreTaskId) {
        this.restoreTaskId = restoreTaskId;
        return this;
    }
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    public StartRestoreTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
