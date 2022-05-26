// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAgSecurityMobileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityMobile")
    public String securityMobile;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAgSecurityMobileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAgSecurityMobileResponseBody self = new QueryAgSecurityMobileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAgSecurityMobileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAgSecurityMobileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAgSecurityMobileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAgSecurityMobileResponseBody setSecurityMobile(String securityMobile) {
        this.securityMobile = securityMobile;
        return this;
    }
    public String getSecurityMobile() {
        return this.securityMobile;
    }

    public QueryAgSecurityMobileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
