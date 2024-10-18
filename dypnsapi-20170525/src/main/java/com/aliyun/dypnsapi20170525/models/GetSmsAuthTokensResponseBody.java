// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsAuthTokensResponseBody extends TeaModel {
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
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetSmsAuthTokensResponseBodyData data;

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

    public static GetSmsAuthTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsAuthTokensResponseBody self = new GetSmsAuthTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsAuthTokensResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsAuthTokensResponseBody setData(GetSmsAuthTokensResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSmsAuthTokensResponseBodyData getData() {
        return this.data;
    }

    public GetSmsAuthTokensResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsAuthTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSmsAuthTokensResponseBodyData extends TeaModel {
        /**
         * <p>The business token.</p>
         * 
         * <strong>example:</strong>
         * <p>FZSMeRbLCiapIBo65NXNHvGbkGDmhs23XWTZDOtZN0g5n/kqSc2FU27Gc9YhGb6dNn9/L9ZXSYiIB6C6LMLQJjyXjRzt5v6pzZXqnjO4cSuPWYUxJvdc8l8OpucEYe8Mx17HxsHDzj0VC4D5+atcrTpJE6jQ7e2QVNjZIPMwsfxELjQS7c****</p>
         */
        @NameInMap("BizToken")
        public String bizToken;

        /**
         * <p>The time when the token expired. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1631526326000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NSqC****</p>
         */
        @NameInMap("StsAccessKeyId")
        public String stsAccessKeyId;

        /**
         * <p>The AccessKey secret.</p>
         * 
         * <strong>example:</strong>
         * <p>VboZ4xbZ****</p>
         */
        @NameInMap("StsAccessKeySecret")
        public String stsAccessKeySecret;

        /**
         * <p>The security token.</p>
         * 
         * <strong>example:</strong>
         * <p>CAISiQJ1q6Ft5B2yfSjIr5DEDP/BurtW9PemMEfBrEpsOr5K17XjuDz2IHtLfXFsBusYt/U2nWpX5v4clrxIToR7SFbFY9pb6ZhazBisebDGv8HtR3TcFEjiSwapEBfe8JL4QYeQFaHwGJqEb1TDiVUAo9/TfimjWFqIKICAjYUdAP0cQgi/a0gtZr4UXHwAzvUXLnzML/2gHwf3i27LdipStxF7lHl05NbUoKTeyGKH3AGqlLVF9tite8f9NpczBvolDYfpht4RX7HazStd5yJN8KpLl6Fe8V/FxIrGXAAJv0rdbbOFq4Q1c18hOLJHAKtfsvXmlPNpsevfmpnsx****</p>
         */
        @NameInMap("StsToken")
        public String stsToken;

        public static GetSmsAuthTokensResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSmsAuthTokensResponseBodyData self = new GetSmsAuthTokensResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSmsAuthTokensResponseBodyData setBizToken(String bizToken) {
            this.bizToken = bizToken;
            return this;
        }
        public String getBizToken() {
            return this.bizToken;
        }

        public GetSmsAuthTokensResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetSmsAuthTokensResponseBodyData setStsAccessKeyId(String stsAccessKeyId) {
            this.stsAccessKeyId = stsAccessKeyId;
            return this;
        }
        public String getStsAccessKeyId() {
            return this.stsAccessKeyId;
        }

        public GetSmsAuthTokensResponseBodyData setStsAccessKeySecret(String stsAccessKeySecret) {
            this.stsAccessKeySecret = stsAccessKeySecret;
            return this;
        }
        public String getStsAccessKeySecret() {
            return this.stsAccessKeySecret;
        }

        public GetSmsAuthTokensResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
