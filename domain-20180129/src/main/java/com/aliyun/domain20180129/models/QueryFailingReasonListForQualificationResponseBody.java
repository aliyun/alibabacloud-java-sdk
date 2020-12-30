// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailingReasonListForQualificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<QueryFailingReasonListForQualificationResponseBodyData> data;

    public static QueryFailingReasonListForQualificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFailingReasonListForQualificationResponseBody self = new QueryFailingReasonListForQualificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFailingReasonListForQualificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFailingReasonListForQualificationResponseBody setData(java.util.List<QueryFailingReasonListForQualificationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFailingReasonListForQualificationResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryFailingReasonListForQualificationResponseBodyData extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("FailReason")
        public String failReason;

        public static QueryFailingReasonListForQualificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFailingReasonListForQualificationResponseBodyData self = new QueryFailingReasonListForQualificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFailingReasonListForQualificationResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryFailingReasonListForQualificationResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

    }

}
