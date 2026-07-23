// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventHouseRuntimeResponseBody extends TeaModel {
    /**
     * <p>The response code. Success indicates that the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The Runtime information.</p>
     */
    @NameInMap("Data")
    public EventHouseRuntime data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteEventHouseRuntimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventHouseRuntimeResponseBody self = new DeleteEventHouseRuntimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventHouseRuntimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteEventHouseRuntimeResponseBody setData(EventHouseRuntime data) {
        this.data = data;
        return this;
    }
    public EventHouseRuntime getData() {
        return this.data;
    }

    public DeleteEventHouseRuntimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEventHouseRuntimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEventHouseRuntimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
