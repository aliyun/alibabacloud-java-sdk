// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingModelResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateThingModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingModelResponseBody self = new UpdateThingModelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateThingModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateThingModelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateThingModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateThingModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
