// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountChangeLoginPasswordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Pass")
    public Boolean pass;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseAccountChangeLoginPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountChangeLoginPasswordResponseBody self = new EnterpriseAccountChangeLoginPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountChangeLoginPasswordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseAccountChangeLoginPasswordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseAccountChangeLoginPasswordResponseBody setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }
    public Boolean getPass() {
        return this.pass;
    }

    public EnterpriseAccountChangeLoginPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountChangeLoginPasswordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
