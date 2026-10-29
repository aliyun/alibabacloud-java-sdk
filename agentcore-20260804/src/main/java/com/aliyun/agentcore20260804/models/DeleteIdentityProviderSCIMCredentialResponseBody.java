// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderSCIMCredentialResponseBody extends TeaModel {
    /**
     * <p>The result code. Handle failures based on the HTTP status code and message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code of the request. This does not indicate the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned for the request. For asynchronous tasks, query the task result by calling the corresponding API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. You can use this ID to troubleshoot issues. Keep the ID if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of true indicates that the request was successful. For asynchronous write operations, you must still query the task result.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteIdentityProviderSCIMCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdentityProviderSCIMCredentialResponseBody self = new DeleteIdentityProviderSCIMCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
