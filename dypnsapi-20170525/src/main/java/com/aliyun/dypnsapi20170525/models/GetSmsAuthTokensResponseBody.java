// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsAuthTokensResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetSmsAuthTokensResponseBodyData data;

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

    public GetSmsAuthTokensResponseBody setData(GetSmsAuthTokensResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSmsAuthTokensResponseBodyData getData() {
        return this.data;
    }

    public static class GetSmsAuthTokensResponseBodyData extends TeaModel {
        @NameInMap("BizToken")
        public String bizToken;

        @NameInMap("StsAccessKeySecret")
        public String stsAccessKeySecret;

        @NameInMap("StsAccessKeyId")
        public String stsAccessKeyId;

        @NameInMap("ExpireTime")
        public Long expireTime;

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

        public GetSmsAuthTokensResponseBodyData setStsAccessKeySecret(String stsAccessKeySecret) {
            this.stsAccessKeySecret = stsAccessKeySecret;
            return this;
        }
        public String getStsAccessKeySecret() {
            return this.stsAccessKeySecret;
        }

        public GetSmsAuthTokensResponseBodyData setStsAccessKeyId(String stsAccessKeyId) {
            this.stsAccessKeyId = stsAccessKeyId;
            return this;
        }
        public String getStsAccessKeyId() {
            return this.stsAccessKeyId;
        }

        public GetSmsAuthTokensResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
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
