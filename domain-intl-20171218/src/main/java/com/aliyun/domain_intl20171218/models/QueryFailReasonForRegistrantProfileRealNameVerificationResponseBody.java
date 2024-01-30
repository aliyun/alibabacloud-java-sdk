// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody self = new QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody setData(java.util.List<QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData> getData() {
        return this.data;
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("FailReason")
        public String failReason;

        public static QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData self = new QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

    }

}
