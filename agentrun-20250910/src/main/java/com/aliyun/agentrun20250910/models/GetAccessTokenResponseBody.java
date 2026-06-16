// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The status code of the response. A value of <code>SUCCESS</code> indicates that the request was successful. For failures, this parameter returns an error code, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetAccessTokenResponseBodyData data;

    /**
     * <p>The unique request ID. This ID is used for troubleshooting purposes.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessTokenResponseBody self = new GetAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccessTokenResponseBody setData(GetAccessTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccessTokenResponseBodyData getData() {
        return this.data;
    }

    public GetAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessTokenResponseBodyData extends TeaModel {
        /**
         * <p>The personal access token. You can use this token to authenticate subsequent API calls. This authentication method is an alternative to using an Alibaba Cloud AccessKey pair or temporary credentials provided by the Security Token Service (STS).</p>
         * 
         * <strong>example:</strong>
         * <p>accessToken</p>
         */
        @NameInMap("accessToken")
        public String accessToken;

        public static GetAccessTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccessTokenResponseBodyData self = new GetAccessTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccessTokenResponseBodyData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

    }

}
