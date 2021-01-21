// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVoiceIntercomResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryVoiceIntercomResponseData data;

    public static QueryVoiceIntercomResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceIntercomResponse self = new QueryVoiceIntercomResponse();
        return TeaModel.build(map, self);
    }

    public QueryVoiceIntercomResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVoiceIntercomResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryVoiceIntercomResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryVoiceIntercomResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVoiceIntercomResponse setData(QueryVoiceIntercomResponseData data) {
        this.data = data;
        return this;
    }
    public QueryVoiceIntercomResponseData getData() {
        return this.data;
    }

    public static class QueryVoiceIntercomResponseDataCryptoKey extends TeaModel {
        @NameInMap("Iv")
        @Validation(required = true)
        public String iv;

        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        public static QueryVoiceIntercomResponseDataCryptoKey build(java.util.Map<String, ?> map) throws Exception {
            QueryVoiceIntercomResponseDataCryptoKey self = new QueryVoiceIntercomResponseDataCryptoKey();
            return TeaModel.build(map, self);
        }

        public QueryVoiceIntercomResponseDataCryptoKey setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

        public QueryVoiceIntercomResponseDataCryptoKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class QueryVoiceIntercomResponseData extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("CryptoKey")
        @Validation(required = true)
        public QueryVoiceIntercomResponseDataCryptoKey cryptoKey;

        public static QueryVoiceIntercomResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryVoiceIntercomResponseData self = new QueryVoiceIntercomResponseData();
            return TeaModel.build(map, self);
        }

        public QueryVoiceIntercomResponseData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryVoiceIntercomResponseData setCryptoKey(QueryVoiceIntercomResponseDataCryptoKey cryptoKey) {
            this.cryptoKey = cryptoKey;
            return this;
        }
        public QueryVoiceIntercomResponseDataCryptoKey getCryptoKey() {
            return this.cryptoKey;
        }

    }

}
