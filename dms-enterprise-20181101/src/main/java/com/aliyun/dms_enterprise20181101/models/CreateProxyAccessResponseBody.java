// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyAccessResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ProxyAccessId")
    public Long proxyAccessId;

    public static CreateProxyAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyAccessResponseBody self = new CreateProxyAccessResponseBody();
        return TeaModel.build(map, self);
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

    public CreateProxyAccessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProxyAccessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateProxyAccessResponseBody setProxyAccessId(Long proxyAccessId) {
        this.proxyAccessId = proxyAccessId;
        return this;
    }
    public Long getProxyAccessId() {
        return this.proxyAccessId;
    }

}
