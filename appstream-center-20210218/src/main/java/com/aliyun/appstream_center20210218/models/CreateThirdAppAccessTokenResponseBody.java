// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class CreateThirdAppAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The time-limited static access token created for the specified user and single cloud desktop. This is a sensitive credential. Do not log or expose the full value.</p>
     * 
     * <strong>example:</strong>
     * <p>taatv1.v2****</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The absolute expiration time of the token, in UNIX milliseconds. This parameter is not empty when the call is successful. GetLatestThirdAppAccessToken returns the original expiration time without extending it.</p>
     * 
     * <strong>example:</strong>
     * <p>1795450500000</p>
     */
    @NameInMap("ExpiresAt")
    public Long expiresAt;

    /**
     * <p>The unique identifier of the request, which can be used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6DAB2D15-7345-4C33-9D77-48A1A756B9E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateThirdAppAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateThirdAppAccessTokenResponseBody self = new CreateThirdAppAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateThirdAppAccessTokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateThirdAppAccessTokenResponseBody setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public CreateThirdAppAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
