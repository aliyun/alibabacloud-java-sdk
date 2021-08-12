// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class InspectProxyAccessSecretResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("AccessSecret")
    public String accessSecret;

    public static InspectProxyAccessSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InspectProxyAccessSecretResponseBody self = new InspectProxyAccessSecretResponseBody();
        return TeaModel.build(map, self);
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

    public InspectProxyAccessSecretResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InspectProxyAccessSecretResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public InspectProxyAccessSecretResponseBody setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

}
