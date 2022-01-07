// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshDeviceTunnelSharePasswordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Password")
    public String password;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RefreshDeviceTunnelSharePasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDeviceTunnelSharePasswordResponseBody self = new RefreshDeviceTunnelSharePasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDeviceTunnelSharePasswordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshDeviceTunnelSharePasswordResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RefreshDeviceTunnelSharePasswordResponseBody setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RefreshDeviceTunnelSharePasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshDeviceTunnelSharePasswordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
