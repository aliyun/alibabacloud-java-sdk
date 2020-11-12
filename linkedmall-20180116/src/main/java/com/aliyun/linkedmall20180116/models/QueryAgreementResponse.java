// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAgreementResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("QueryAgreementResponse")
    @Validation(required = true)
    public QueryAgreementResponseQueryAgreementResponse queryAgreementResponse;

    public static QueryAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgreementResponse self = new QueryAgreementResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgreementResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAgreementResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAgreementResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAgreementResponse setQueryAgreementResponse(QueryAgreementResponseQueryAgreementResponse queryAgreementResponse) {
        this.queryAgreementResponse = queryAgreementResponse;
        return this;
    }
    public QueryAgreementResponseQueryAgreementResponse getQueryAgreementResponse() {
        return this.queryAgreementResponse;
    }

    public static class QueryAgreementResponseQueryAgreementResponse extends TeaModel {
        @NameInMap("ValidTime")
        @Validation(required = true)
        public String validTime;

        @NameInMap("InvalidTime")
        @Validation(required = true)
        public String invalidTime;

        @NameInMap("AgreementNo")
        @Validation(required = true)
        public String agreementNo;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("SignTime")
        @Validation(required = true)
        public String signTime;

        @NameInMap("ExternalAgreementNo")
        @Validation(required = true)
        public String externalAgreementNo;

        public static QueryAgreementResponseQueryAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryAgreementResponseQueryAgreementResponse self = new QueryAgreementResponseQueryAgreementResponse();
            return TeaModel.build(map, self);
        }

        public QueryAgreementResponseQueryAgreementResponse setValidTime(String validTime) {
            this.validTime = validTime;
            return this;
        }
        public String getValidTime() {
            return this.validTime;
        }

        public QueryAgreementResponseQueryAgreementResponse setInvalidTime(String invalidTime) {
            this.invalidTime = invalidTime;
            return this;
        }
        public String getInvalidTime() {
            return this.invalidTime;
        }

        public QueryAgreementResponseQueryAgreementResponse setAgreementNo(String agreementNo) {
            this.agreementNo = agreementNo;
            return this;
        }
        public String getAgreementNo() {
            return this.agreementNo;
        }

        public QueryAgreementResponseQueryAgreementResponse setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAgreementResponseQueryAgreementResponse setSignTime(String signTime) {
            this.signTime = signTime;
            return this;
        }
        public String getSignTime() {
            return this.signTime;
        }

        public QueryAgreementResponseQueryAgreementResponse setExternalAgreementNo(String externalAgreementNo) {
            this.externalAgreementNo = externalAgreementNo;
            return this;
        }
        public String getExternalAgreementNo() {
            return this.externalAgreementNo;
        }

    }

}
