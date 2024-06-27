// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class HandleActiveSQLRecordResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The processing result of the active query.</p>
     */
    @NameInMap("Results")
    public java.util.List<HandleActiveSQLRecordResponseBodyResults> results;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The process ID, which is a unique identifier of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>3003925</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>Indicates whether the processing was successful. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
