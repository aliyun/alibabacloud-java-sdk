// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class InitDtsRdsInstanceResponseBody extends TeaModel {
    /**
     * <p>The built-in account that is used by DTS to connect to the node.</p>
     * 
     * <strong>example:</strong>
     * <p>rdsdt_dtsacct</p>
     */
    @NameInMap("AdminAccount")
    public String adminAccount;

    /**
     * <p>The password of the built-in account.</p>
     * 
     * <strong>example:</strong>
     * <p>1jecpqrtc****</p>
     */
    @NameInMap("AdminPassword")
    public String adminPassword;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7796ECE0-9C17-5E4D-9CE6-B7EC825A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
