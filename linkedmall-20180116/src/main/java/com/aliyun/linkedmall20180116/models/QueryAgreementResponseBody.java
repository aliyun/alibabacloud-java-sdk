// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAgreementResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("QueryAgreementResponse")
    public QueryAgreementResponseBodyQueryAgreementResponse queryAgreementResponse;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAgreementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAgreementResponseBody self = new QueryAgreementResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAgreementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAgreementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAgreementResponseBody setQueryAgreementResponse(QueryAgreementResponseBodyQueryAgreementResponse queryAgreementResponse) {
        this.queryAgreementResponse = queryAgreementResponse;
        return this;
    }
    public QueryAgreementResponseBodyQueryAgreementResponse getQueryAgreementResponse() {
        return this.queryAgreementResponse;
    }

    public QueryAgreementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAgreementResponseBodyQueryAgreementResponse extends TeaModel {
        @NameInMap("AgreementNo")
        public String agreementNo;

        @NameInMap("ExternalAgreementNo")
        public String externalAgreementNo;

        @NameInMap("InvalidTime")
        public String invalidTime;

        @NameInMap("SignTime")
        public String signTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ValidTime")
        public String validTime;

        public static QueryAgreementResponseBodyQueryAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryAgreementResponseBodyQueryAgreementResponse self = new QueryAgreementResponseBodyQueryAgreementResponse();
            return TeaModel.build(map, self);
        }

        public QueryAgreementResponseBodyQueryAgreementResponse setAgreementNo(String agreementNo) {
            this.agreementNo = agreementNo;
            return this;
        }
        public String getAgreementNo() {
            return this.agreementNo;
        }

        public QueryAgreementResponseBodyQueryAgreementResponse setExternalAgreementNo(String externalAgreementNo) {
            this.externalAgreementNo = externalAgreementNo;
            return this;
        }
        public String getExternalAgreementNo() {
            return this.externalAgreementNo;
        }

        public QueryAgreementResponseBodyQueryAgreementResponse setInvalidTime(String invalidTime) {
            this.invalidTime = invalidTime;
            return this;
        }
        public String getInvalidTime() {
            return this.invalidTime;
        }

        public QueryAgreementResponseBodyQueryAgreementResponse setSignTime(String signTime) {
            this.signTime = signTime;
            return this;
        }
        public String getSignTime() {
            return this.signTime;
        }

        public QueryAgreementResponseBodyQueryAgreementResponse setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAgreementResponseBodyQueryAgreementResponse setValidTime(String validTime) {
            this.validTime = validTime;
            return this;
        }
        public String getValidTime() {
            return this.validTime;
        }

    }

}
