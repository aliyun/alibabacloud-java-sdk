// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TempUsername")
    public String tempUsername;

    @NameInMap("AuthorizationToken")
    public String authorizationToken;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("Code")
    public String code;

    public static GetAuthorizationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationTokenResponseBody self = new GetAuthorizationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationTokenResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetAuthorizationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthorizationTokenResponseBody setTempUsername(String tempUsername) {
        this.tempUsername = tempUsername;
        return this;
    }
    public String getTempUsername() {
        return this.tempUsername;
    }

    public GetAuthorizationTokenResponseBody setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }
    public String getAuthorizationToken() {
        return this.authorizationToken;
    }

    public GetAuthorizationTokenResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public GetAuthorizationTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
