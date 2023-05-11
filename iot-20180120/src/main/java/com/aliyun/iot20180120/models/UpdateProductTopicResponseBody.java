// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTopicResponseBody extends TeaModel {
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

    public static UpdateProductTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTopicResponseBody self = new UpdateProductTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProductTopicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateProductTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProductTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
