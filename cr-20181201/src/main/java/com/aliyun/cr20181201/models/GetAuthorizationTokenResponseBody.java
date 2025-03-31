// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenResponseBody extends TeaModel {
    /**
     * <p>The temporary password returned after you call this API operation is a Security Token Service (STS) token whose validity period is 1 hour. Take note of the following items when you log on to Container Registry instances by using an STS token:</p>
     * <ul>
     * <li>If the STS token belongs to an Alibaba Cloud account, you can use the STS token to log on to all Container Registry instances that belong to the Alibaba Cloud account.</li>
     * <li>If the STS token belongs to a Resource Access Management (RAM) user, you can use the STS token to log on to all Container Registry instances that belong to the RAM user.</li>
     * <li>You can use an STS token to access only Container Registry instances to which the STS token is scoped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shaunadadakks:uuczxnjcyeyhdjadkkajsjdjadhyucb</p>
     */
    @NameInMap("AuthorizationToken")
    public String authorizationToken;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * <ul>
     * <li><code>true</code>: successful</li>
     * <li><code>false</code>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>1571242083000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The username that is used to log on to the Container Registry instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The timestamp when the temporary password expires. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>E069EB86-E6AD-4A98-ADDE-0E993390239A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The password that is used to log on to the Container Registry instance.</p>
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
