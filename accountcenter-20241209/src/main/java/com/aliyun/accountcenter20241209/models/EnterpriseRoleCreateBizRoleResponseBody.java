// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleCreateBizRoleResponseBody extends TeaModel {
    @NameInMap("BizRoleCode")
    public String bizRoleCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseRoleCreateBizRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleCreateBizRoleResponseBody self = new EnterpriseRoleCreateBizRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleCreateBizRoleResponseBody setBizRoleCode(String bizRoleCode) {
        this.bizRoleCode = bizRoleCode;
        return this;
    }
    public String getBizRoleCode() {
        return this.bizRoleCode;
    }

    public EnterpriseRoleCreateBizRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseRoleCreateBizRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseRoleCreateBizRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseRoleCreateBizRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
