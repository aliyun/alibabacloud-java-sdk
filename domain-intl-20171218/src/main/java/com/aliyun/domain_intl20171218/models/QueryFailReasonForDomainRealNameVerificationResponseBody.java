// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryFailReasonForDomainRealNameVerificationResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryFailReasonForDomainRealNameVerificationResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryFailReasonForDomainRealNameVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForDomainRealNameVerificationResponseBody self = new QueryFailReasonForDomainRealNameVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForDomainRealNameVerificationResponseBody setData(java.util.List<QueryFailReasonForDomainRealNameVerificationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFailReasonForDomainRealNameVerificationResponseBodyData> getData() {
        return this.data;
    }

    public QueryFailReasonForDomainRealNameVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFailReasonForDomainRealNameVerificationResponseBodyData extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("FailReason")
        public String failReason;

        public static QueryFailReasonForDomainRealNameVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFailReasonForDomainRealNameVerificationResponseBodyData self = new QueryFailReasonForDomainRealNameVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFailReasonForDomainRealNameVerificationResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryFailReasonForDomainRealNameVerificationResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

    }

}
