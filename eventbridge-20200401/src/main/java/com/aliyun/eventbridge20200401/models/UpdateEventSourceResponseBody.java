// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventSourceResponseBody extends TeaModel {
    /**
     * <p>The returned response code. Valid values:</p>
     * <br>
     * <p>*   Success: The request is successful.</p>
     * <p>*   Other codes: The request failed. For more information about error codes, see Error codes.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. The value true indicates that the operation is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateEventSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSourceResponseBody self = new UpdateEventSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEventSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateEventSourceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateEventSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateEventSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEventSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
