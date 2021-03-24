// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateTenantStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 是否更新成功
    @NameInMap("result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTenantStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantStatusResponseBody self = new UpdateTenantStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTenantStatusResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public UpdateTenantStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateTenantStatusResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateTenantStatusResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateTenantStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
