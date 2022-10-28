// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryAuditResultResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Records")
    public java.util.List<QueryAuditResultResponseBodyRecords> records;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Total")
    public Integer total;

    public static QueryAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuditResultResponseBody self = new QueryAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuditResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAuditResultResponseBody setRecords(java.util.List<QueryAuditResultResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<QueryAuditResultResponseBodyRecords> getRecords() {
        return this.records;
    }

    public QueryAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuditResultResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryAuditResultResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryAuditResultResponseBodyRecords extends TeaModel {
        @NameInMap("Crid")
        public String crid;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("State")
        public Integer state;

        public static QueryAuditResultResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryAuditResultResponseBodyRecords self = new QueryAuditResultResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public QueryAuditResultResponseBodyRecords setCrid(String crid) {
            this.crid = crid;
            return this;
        }
        public String getCrid() {
            return this.crid;
        }

        public QueryAuditResultResponseBodyRecords setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryAuditResultResponseBodyRecords setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

    }

}
