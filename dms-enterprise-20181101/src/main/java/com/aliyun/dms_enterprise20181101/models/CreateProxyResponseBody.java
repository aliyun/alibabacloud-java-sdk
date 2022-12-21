// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the secure access proxy.
    @NameInMap("ProxyId")
    public Long proxyId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static CreateProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyResponseBody self = new CreateProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProxyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateProxyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProxyResponseBody setProxyId(Long proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public Long getProxyId() {
        return this.proxyId;
    }

    public CreateProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProxyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
