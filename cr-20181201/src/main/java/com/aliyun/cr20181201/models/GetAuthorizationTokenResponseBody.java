// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenResponseBody extends TeaModel {
    /**
     * <p>The password that you use to log on to the registry.</p>
     * 
     * <strong>example:</strong>
     * <p>shaunadadakks:uuczxnjcyeyhdjadkkajsjdjadhyucb</p>
     */
    @NameInMap("AuthorizationToken")
    public String authorizationToken;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The timestamp when the temporary token expired. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1571242083000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID</p>
     * 
     * <strong>example:</strong>
     * <p>E069EB86-E6AD-4A98-ADDE-0E993390239A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The username that you use to log on to the registry.</p>
     * 
     * <strong>example:</strong>
     * <p>temp_user_cr</p>
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
