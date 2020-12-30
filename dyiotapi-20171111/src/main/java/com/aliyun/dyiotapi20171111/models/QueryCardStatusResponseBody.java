// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CardStatus")
    public QueryCardStatusResponseBodyCardStatus cardStatus;

    @NameInMap("Code")
    public String code;

    public static QueryCardStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardStatusResponseBody self = new QueryCardStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCardStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardStatusResponseBody setCardStatus(QueryCardStatusResponseBodyCardStatus cardStatus) {
        this.cardStatus = cardStatus;
        return this;
    }
    public QueryCardStatusResponseBodyCardStatus getCardStatus() {
        return this.cardStatus;
    }

    public QueryCardStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryCardStatusResponseBodyCardStatus extends TeaModel {
        @NameInMap("Msisdn")
        public String msisdn;

        @NameInMap("UserStatus")
        public String userStatus;

        @NameInMap("Iccid")
        public String iccid;

        public static QueryCardStatusResponseBodyCardStatus build(java.util.Map<String, ?> map) throws Exception {
            QueryCardStatusResponseBodyCardStatus self = new QueryCardStatusResponseBodyCardStatus();
            return TeaModel.build(map, self);
        }

        public QueryCardStatusResponseBodyCardStatus setMsisdn(String msisdn) {
            this.msisdn = msisdn;
            return this;
        }
        public String getMsisdn() {
            return this.msisdn;
        }

        public QueryCardStatusResponseBodyCardStatus setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

        public QueryCardStatusResponseBodyCardStatus setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

    }

}
