// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetAuthorizationUrlResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   If OK is returned, the request is successful.</p>
     * <p>*   For more information about other error codes, see [API response codes](~~85198~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetAuthorizationUrlResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthorizationUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationUrlResponseBody self = new GetAuthorizationUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuthorizationUrlResponseBody setData(GetAuthorizationUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAuthorizationUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAuthorizationUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuthorizationUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuthorizationUrlResponseBodyData extends TeaModel {
        /**
         * <p>The authorization URL.</p>
         */
        @NameInMap("AuthorizationUrl")
        public String authorizationUrl;

        public static GetAuthorizationUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorizationUrlResponseBodyData self = new GetAuthorizationUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAuthorizationUrlResponseBodyData setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

    }

}
