// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody extends TeaModel {
    /**
     * <p>The List of reasons why identity verification failed the Review.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryFailReasonForRegistrantProfileRealNameVerificationResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>548C407F-AEA2-4B5D-90DF-EC11EBB1D76F</p>
     */
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
        /**
         * <p>The Review Date.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-03-17 11:08:02</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The reason why identity verification failed the Review.</p>
         * <p>For Solutions after identity verification fails the Review, see <a href="https://help.aliyun.com/document_detail/35885.html">Reasons for identity verification failure and Solutions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>证件电子信息核验不合格</p>
         */
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
