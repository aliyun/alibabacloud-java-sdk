// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class BatchQueryAgAccountResponseBody extends TeaModel {
    @NameInMap("AgAccounts")
    public java.util.List<BatchQueryAgAccountResponseBodyAgAccounts> agAccounts;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchQueryAgAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryAgAccountResponseBody self = new BatchQueryAgAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryAgAccountResponseBody setAgAccounts(java.util.List<BatchQueryAgAccountResponseBodyAgAccounts> agAccounts) {
        this.agAccounts = agAccounts;
        return this;
    }
    public java.util.List<BatchQueryAgAccountResponseBodyAgAccounts> getAgAccounts() {
        return this.agAccounts;
    }

    public BatchQueryAgAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryAgAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchQueryAgAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryAgAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchQueryAgAccountResponseBodyAgAccounts extends TeaModel {
        @NameInMap("LoginEmail")
        public String loginEmail;

        @NameInMap("Pk")
        public String pk;

        public static BatchQueryAgAccountResponseBodyAgAccounts build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryAgAccountResponseBodyAgAccounts self = new BatchQueryAgAccountResponseBodyAgAccounts();
            return TeaModel.build(map, self);
        }

        public BatchQueryAgAccountResponseBodyAgAccounts setLoginEmail(String loginEmail) {
            this.loginEmail = loginEmail;
            return this;
        }
        public String getLoginEmail() {
            return this.loginEmail;
        }

        public BatchQueryAgAccountResponseBodyAgAccounts setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
