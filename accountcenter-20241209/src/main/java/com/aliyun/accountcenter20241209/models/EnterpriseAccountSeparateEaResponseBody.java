// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountSeparateEaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseAccountSeparateEaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountSeparateEaResponseBody self = new EnterpriseAccountSeparateEaResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountSeparateEaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseAccountSeparateEaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseAccountSeparateEaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountSeparateEaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
