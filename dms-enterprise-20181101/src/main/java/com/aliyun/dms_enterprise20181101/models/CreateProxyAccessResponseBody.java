// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyAccessResponseBody extends TeaModel {
    // The error code returned to the query task.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message that is returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the security protection authorization. After the security protection agent authorizes the target user, the system automatically generates a security protection authorization ID. The ID is globally unique.
    @NameInMap("ProxyAccessId")
    public Long proxyAccessId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the call was successful.
    @NameInMap("Success")
    public Boolean success;

    public static CreateProxyAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyAccessResponseBody self = new CreateProxyAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProxyAccessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateProxyAccessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProxyAccessResponseBody setProxyAccessId(Long proxyAccessId) {
        this.proxyAccessId = proxyAccessId;
        return this;
    }
    public Long getProxyAccessId() {
        return this.proxyAccessId;
    }

    public CreateProxyAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProxyAccessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
