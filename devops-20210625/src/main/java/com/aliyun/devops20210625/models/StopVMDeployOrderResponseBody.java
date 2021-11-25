// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StopVMDeployOrderResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    public static StopVMDeployOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopVMDeployOrderResponseBody self = new StopVMDeployOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public StopVMDeployOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StopVMDeployOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StopVMDeployOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopVMDeployOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
