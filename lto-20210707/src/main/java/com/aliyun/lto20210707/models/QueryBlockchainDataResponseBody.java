// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class QueryBlockchainDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryBlockchainDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBlockchainDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainDataResponseBody self = new QueryBlockchainDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBlockchainDataResponseBody setData(QueryBlockchainDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBlockchainDataResponseBodyData getData() {
        return this.data;
    }

    public QueryBlockchainDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBlockchainDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBlockchainDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBlockchainDataResponseBodyData extends TeaModel {
        @NameInMap("PlainData")
        public String plainData;

        @NameInMap("PrivacyData")
        public String privacyData;

        @NameInMap("PrivacyRuleId")
        public String privacyRuleId;

        public static QueryBlockchainDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockchainDataResponseBodyData self = new QueryBlockchainDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBlockchainDataResponseBodyData setPlainData(String plainData) {
            this.plainData = plainData;
            return this;
        }
        public String getPlainData() {
            return this.plainData;
        }

        public QueryBlockchainDataResponseBodyData setPrivacyData(String privacyData) {
            this.privacyData = privacyData;
            return this;
        }
        public String getPrivacyData() {
            return this.privacyData;
        }

        public QueryBlockchainDataResponseBodyData setPrivacyRuleId(String privacyRuleId) {
            this.privacyRuleId = privacyRuleId;
            return this;
        }
        public String getPrivacyRuleId() {
            return this.privacyRuleId;
        }

    }

}
