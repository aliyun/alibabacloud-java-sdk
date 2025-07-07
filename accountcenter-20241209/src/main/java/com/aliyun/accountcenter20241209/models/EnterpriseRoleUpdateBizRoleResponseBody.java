// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleUpdateBizRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseRoleUpdateBizRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleUpdateBizRoleResponseBody self = new EnterpriseRoleUpdateBizRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleUpdateBizRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseRoleUpdateBizRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseRoleUpdateBizRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseRoleUpdateBizRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
