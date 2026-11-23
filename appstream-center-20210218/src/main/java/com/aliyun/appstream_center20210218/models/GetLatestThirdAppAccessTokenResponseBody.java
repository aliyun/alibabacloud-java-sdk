// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetLatestThirdAppAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The current valid static access token for the specified user and single cloud desktop. The original saved token is returned, and the query does not renew the token. This is a sensitive credential. Do not log or expose the full value.</p>
     * 
     * <strong>example:</strong>
     * <p>taatv1.v2****</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The absolute expiration time of the token, represented as a Unix timestamp in milliseconds. This parameter is not empty when the call is successful. GetLatestThirdAppAccessToken returns the original expiration time and does not renew the token.</p>
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

    public static GetLatestThirdAppAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLatestThirdAppAccessTokenResponseBody self = new GetLatestThirdAppAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLatestThirdAppAccessTokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetLatestThirdAppAccessTokenResponseBody setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public GetLatestThirdAppAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
