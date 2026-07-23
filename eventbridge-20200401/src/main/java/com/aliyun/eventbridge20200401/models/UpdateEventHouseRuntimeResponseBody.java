// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventHouseRuntimeResponseBody extends TeaModel {
    /**
     * <p>The response code. Success indicates that the operation is successful.</p>
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
     * <p>Indicates whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateEventHouseRuntimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventHouseRuntimeResponseBody self = new UpdateEventHouseRuntimeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEventHouseRuntimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateEventHouseRuntimeResponseBody setData(EventHouseRuntime data) {
        this.data = data;
        return this;
    }
    public EventHouseRuntime getData() {
        return this.data;
    }

    public UpdateEventHouseRuntimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateEventHouseRuntimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEventHouseRuntimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
