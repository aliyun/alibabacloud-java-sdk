// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ApplyAgOneKeyOnlyCheckerTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ApplyAgOneKeyOnlyCheckerTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAgOneKeyOnlyCheckerTaskResponseBody self = new ApplyAgOneKeyOnlyCheckerTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAgOneKeyOnlyCheckerTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyAgOneKeyOnlyCheckerTaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ApplyAgOneKeyOnlyCheckerTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyAgOneKeyOnlyCheckerTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyAgOneKeyOnlyCheckerTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
