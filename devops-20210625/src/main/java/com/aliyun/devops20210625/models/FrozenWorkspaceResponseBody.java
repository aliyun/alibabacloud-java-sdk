// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class FrozenWorkspaceResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    public static FrozenWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FrozenWorkspaceResponseBody self = new FrozenWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public FrozenWorkspaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FrozenWorkspaceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public FrozenWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FrozenWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
