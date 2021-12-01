// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class InitDtsRdsInstanceResponseBody extends TeaModel {
    @NameInMap("AdminAccount")
    public String adminAccount;

    @NameInMap("AdminPassword")
    public String adminPassword;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static InitDtsRdsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitDtsRdsInstanceResponseBody self = new InitDtsRdsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public InitDtsRdsInstanceResponseBody setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
        return this;
    }
    public String getAdminAccount() {
        return this.adminAccount;
    }

    public InitDtsRdsInstanceResponseBody setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }
    public String getAdminPassword() {
        return this.adminPassword;
    }

    public InitDtsRdsInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public InitDtsRdsInstanceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public InitDtsRdsInstanceResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InitDtsRdsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitDtsRdsInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
