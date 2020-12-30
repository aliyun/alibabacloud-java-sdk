// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailReasonForDomainRealNameVerificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<QueryFailReasonForDomainRealNameVerificationResponseBodyData> data;

    public static QueryFailReasonForDomainRealNameVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForDomainRealNameVerificationResponseBody self = new QueryFailReasonForDomainRealNameVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForDomainRealNameVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFailReasonForDomainRealNameVerificationResponseBody setData(java.util.List<QueryFailReasonForDomainRealNameVerificationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFailReasonForDomainRealNameVerificationResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryFailReasonForDomainRealNameVerificationResponseBodyData extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("DomainNameVerificationStatus")
        public String domainNameVerificationStatus;

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

        public QueryFailReasonForDomainRealNameVerificationResponseBodyData setDomainNameVerificationStatus(String domainNameVerificationStatus) {
            this.domainNameVerificationStatus = domainNameVerificationStatus;
            return this;
        }
        public String getDomainNameVerificationStatus() {
            return this.domainNameVerificationStatus;
        }

    }

}
