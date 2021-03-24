// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class InitTenantResponseBody extends TeaModel {
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 是否初始化成功
    @NameInMap("result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static InitTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitTenantResponseBody self = new InitTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public InitTenantResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public InitTenantResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public InitTenantResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public InitTenantResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public InitTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
