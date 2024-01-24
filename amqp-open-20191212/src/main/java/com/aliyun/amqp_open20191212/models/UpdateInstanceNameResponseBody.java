// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class UpdateInstanceNameResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message that is returned when an error occurs during the update of the instance name.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned message that indicates the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateInstanceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNameResponseBody self = new UpdateInstanceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNameResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateInstanceNameResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateInstanceNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateInstanceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
