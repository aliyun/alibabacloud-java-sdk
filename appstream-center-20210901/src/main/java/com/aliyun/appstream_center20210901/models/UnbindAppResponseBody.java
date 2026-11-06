// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UnbindAppResponseBody extends TeaModel {
    /**
     * <p>The error code. This field is returned when the request fails and may not be included in a successful response.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error or result message. This field describes the cause of a failed request and may not be included in a successful response.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can provide this value for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. To check whether an asynchronous task is completed, query the task status separately.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UnbindAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAppResponseBody self = new UnbindAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
