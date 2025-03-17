// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class StartDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public StartDBInstanceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDBInstanceResponseBody self = new StartDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDBInstanceResponseBody setData(StartDBInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartDBInstanceResponseBodyData getData() {
        return this.data;
    }

    public StartDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartDBInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceID")
        public Long DBInstanceID;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100000837</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static StartDBInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartDBInstanceResponseBodyData self = new StartDBInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartDBInstanceResponseBodyData setDBInstanceID(Long DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Long getDBInstanceID() {
            return this.DBInstanceID;
        }

        public StartDBInstanceResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public StartDBInstanceResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
