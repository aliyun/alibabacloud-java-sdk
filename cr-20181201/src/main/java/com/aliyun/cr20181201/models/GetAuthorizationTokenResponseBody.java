// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenResponseBody extends TeaModel {
    /**
     * <p>The temporary password returned after you call this API operation is a Security Token Service (STS) token whose validity period is 1 hour. Take note of the following items when you log on to Container Registry instances by using an STS token:</p>
     * <br>
     * <p>*   If the STS token belongs to an Alibaba Cloud account, you can use the STS token to log on to all Container Registry instances that belong to the Alibaba Cloud account.</p>
     * <p>*   If the STS token belongs to a Resource Access Management (RAM) user, you can use the STS token to log on to all Container Registry instances that belong to the RAM user.</p>
     * <p>*   You can use an STS token to access only Container Registry instances to which the STS token is scoped.</p>
     */
    @NameInMap("AuthorizationToken")
    public String authorizationToken;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * <br>
     * <p>*   `true`: successful</p>
     * <p>*   `false`: failed</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return value.</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The username that is used to log on to the Container Registry instance.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The timestamp when the temporary password expires. Unit: milliseconds.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The password that is used to log on to the Container Registry instance.</p>
     */
    @NameInMap("TempUsername")
    public String tempUsername;

    public static GetAuthorizationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationTokenResponseBody self = new GetAuthorizationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationTokenResponseBody setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }
    public String getAuthorizationToken() {
        return this.authorizationToken;
    }

    public GetAuthorizationTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuthorizationTokenResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
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

}
