// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class HandleActiveSQLRecordResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<HandleActiveSQLRecordResponseBodyResults> results;

    @NameInMap("Status")
    public String status;

    public static HandleActiveSQLRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleActiveSQLRecordResponseBody self = new HandleActiveSQLRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleActiveSQLRecordResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public HandleActiveSQLRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HandleActiveSQLRecordResponseBody setResults(java.util.List<HandleActiveSQLRecordResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<HandleActiveSQLRecordResponseBodyResults> getResults() {
        return this.results;
    }

    public HandleActiveSQLRecordResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class HandleActiveSQLRecordResponseBodyResults extends TeaModel {
        @NameInMap("Pid")
        public String pid;

        @NameInMap("Status")
        public String status;

        public static HandleActiveSQLRecordResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            HandleActiveSQLRecordResponseBodyResults self = new HandleActiveSQLRecordResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public HandleActiveSQLRecordResponseBodyResults setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public HandleActiveSQLRecordResponseBodyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
