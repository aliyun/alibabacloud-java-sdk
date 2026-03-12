// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryFailReasonListResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryFailReasonListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryFailReasonListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonListResponseBody self = new QueryFailReasonListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonListResponseBody setData(QueryFailReasonListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFailReasonListResponseBodyData getData() {
        return this.data;
    }

    public QueryFailReasonListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFailReasonListResponseBodyDataFailRecord extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("FailReason")
        public String failReason;

        public static QueryFailReasonListResponseBodyDataFailRecord build(java.util.Map<String, ?> map) throws Exception {
            QueryFailReasonListResponseBodyDataFailRecord self = new QueryFailReasonListResponseBodyDataFailRecord();
            return TeaModel.build(map, self);
        }

        public QueryFailReasonListResponseBodyDataFailRecord setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryFailReasonListResponseBodyDataFailRecord setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

    }

    public static class QueryFailReasonListResponseBodyData extends TeaModel {
        @NameInMap("FailRecord")
        public java.util.List<QueryFailReasonListResponseBodyDataFailRecord> failRecord;

        public static QueryFailReasonListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFailReasonListResponseBodyData self = new QueryFailReasonListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFailReasonListResponseBodyData setFailRecord(java.util.List<QueryFailReasonListResponseBodyDataFailRecord> failRecord) {
            this.failRecord = failRecord;
            return this;
        }
        public java.util.List<QueryFailReasonListResponseBodyDataFailRecord> getFailRecord() {
            return this.failRecord;
        }

    }

}
