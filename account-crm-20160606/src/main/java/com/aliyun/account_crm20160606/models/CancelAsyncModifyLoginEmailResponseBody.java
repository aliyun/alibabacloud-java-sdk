// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CancelAsyncModifyLoginEmailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static CancelAsyncModifyLoginEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAsyncModifyLoginEmailResponseBody self = new CancelAsyncModifyLoginEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAsyncModifyLoginEmailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelAsyncModifyLoginEmailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelAsyncModifyLoginEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelAsyncModifyLoginEmailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
