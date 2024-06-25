// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PauseEventStreamingResponseBody extends TeaModel {
    /**
     * <p>The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For more information about error codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The event streaming [xxxx] not existed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72ce027c-546a-4231-9cf6-ec58766027f9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PauseEventStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseEventStreamingResponseBody self = new PauseEventStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public PauseEventStreamingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PauseEventStreamingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PauseEventStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PauseEventStreamingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
