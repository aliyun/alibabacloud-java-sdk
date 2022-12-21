// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class InspectProxyAccessSecretResponseBody extends TeaModel {
    // The authorization password of the security protection agent.
    @NameInMap("AccessSecret")
    public String accessSecret;

    // The error code returned to the query task.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message that is returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the call was successful.
    @NameInMap("Success")
    public Boolean success;

    public static InspectProxyAccessSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InspectProxyAccessSecretResponseBody self = new InspectProxyAccessSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public InspectProxyAccessSecretResponseBody setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public InspectProxyAccessSecretResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public InspectProxyAccessSecretResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InspectProxyAccessSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InspectProxyAccessSecretResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
