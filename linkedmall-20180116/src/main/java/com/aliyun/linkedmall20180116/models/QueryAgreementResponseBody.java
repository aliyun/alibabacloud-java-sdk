// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAgreementResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("QueryAgreementResponse")
    public QueryAgreementResponseBodyQueryAgreementResponse queryAgreementResponse;

    /**
     * <strong>example:</strong>
     * <p>DAAA6391-3339-5333-9E4D-C71CD26A231F</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>20******8006</p>
         */
        @NameInMap("AgreementNo")
        public String agreementNo;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ExternalAgreementNo")
        public String externalAgreementNo;

        /**
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("InvalidTime")
        public String invalidTime;

        /**
         * <strong>example:</strong>
         * <p>2021-08-01 00:00:00</p>
         */
        @NameInMap("SignTime")
        public String signTime;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2021-08-01 00:00:00</p>
         */
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
