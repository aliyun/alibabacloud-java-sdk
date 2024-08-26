// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailReasonForDomainRealNameVerificationResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryFailReasonForDomainRealNameVerificationResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1F1BA893-AD33-4248-8CB8-1657E3733052</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2017-03-17 11:08:02</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        @NameInMap("DomainNameVerificationStatus")
        public String domainNameVerificationStatus;

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

        public QueryFailReasonForDomainRealNameVerificationResponseBodyData setDomainNameVerificationStatus(String domainNameVerificationStatus) {
            this.domainNameVerificationStatus = domainNameVerificationStatus;
            return this;
        }
        public String getDomainNameVerificationStatus() {
            return this.domainNameVerificationStatus;
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
