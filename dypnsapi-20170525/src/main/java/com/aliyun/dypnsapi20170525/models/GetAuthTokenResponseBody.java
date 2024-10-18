// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetAuthTokenResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8906582E-6722</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("TokenInfo")
    public GetAuthTokenResponseBodyTokenInfo tokenInfo;

    public static GetAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenResponseBody self = new GetAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuthTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthTokenResponseBody setTokenInfo(GetAuthTokenResponseBodyTokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
        return this;
    }
    public GetAuthTokenResponseBodyTokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public static class GetAuthTokenResponseBodyTokenInfo extends TeaModel {
        /**
         * <p>The business authentication token.</p>
         * <blockquote>
         * <p> AccessToken is valid for 10 minutes and can be used repeatedly within its validity period.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>agag****</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>The API authentication token.</p>
         * <blockquote>
         * <p> JwtToken is valid for 1 hour and can be used repeatedly within its validity period.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aweghd****</p>
         */
        @NameInMap("JwtToken")
        public String jwtToken;

        public static GetAuthTokenResponseBodyTokenInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAuthTokenResponseBodyTokenInfo self = new GetAuthTokenResponseBodyTokenInfo();
            return TeaModel.build(map, self);
        }

        public GetAuthTokenResponseBodyTokenInfo setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GetAuthTokenResponseBodyTokenInfo setJwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }
        public String getJwtToken() {
            return this.jwtToken;
        }

    }

}
