// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVoiceIntercomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryVoiceIntercomResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryVoiceIntercomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceIntercomResponseBody self = new QueryVoiceIntercomResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVoiceIntercomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVoiceIntercomResponseBody setData(QueryVoiceIntercomResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryVoiceIntercomResponseBodyData getData() {
        return this.data;
    }

    public QueryVoiceIntercomResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryVoiceIntercomResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVoiceIntercomResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryVoiceIntercomResponseBodyDataCryptoKey extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Iv")
        public String iv;

        public static QueryVoiceIntercomResponseBodyDataCryptoKey build(java.util.Map<String, ?> map) throws Exception {
            QueryVoiceIntercomResponseBodyDataCryptoKey self = new QueryVoiceIntercomResponseBodyDataCryptoKey();
            return TeaModel.build(map, self);
        }

        public QueryVoiceIntercomResponseBodyDataCryptoKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryVoiceIntercomResponseBodyDataCryptoKey setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class QueryVoiceIntercomResponseBodyData extends TeaModel {
        @NameInMap("CryptoKey")
        public QueryVoiceIntercomResponseBodyDataCryptoKey cryptoKey;

        @NameInMap("Url")
        public String url;

        public static QueryVoiceIntercomResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryVoiceIntercomResponseBodyData self = new QueryVoiceIntercomResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryVoiceIntercomResponseBodyData setCryptoKey(QueryVoiceIntercomResponseBodyDataCryptoKey cryptoKey) {
            this.cryptoKey = cryptoKey;
            return this;
        }
        public QueryVoiceIntercomResponseBodyDataCryptoKey getCryptoKey() {
            return this.cryptoKey;
        }

        public QueryVoiceIntercomResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
