// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventStreamingResponseBody extends TeaModel {
    /**
     * <p>The return code. \<code>Success\\</code> is returned if the request is successful. Otherwise, an error code is returned. For more information about error codes, see Error codes.</p>
     * <p>Success: The request is successful.</p>
     * <p>Other codes indicate that the request failed. For more information about error codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
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
     * <p>499A9ACF-70CD-5D43-87F3-1B60529EE446</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns true if the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteEventStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventStreamingResponseBody self = new DeleteEventStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventStreamingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteEventStreamingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEventStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEventStreamingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
