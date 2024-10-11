// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class StopDBInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public StopDBInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDBInstanceResponseBody self = new StopDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDBInstanceResponseBody setData(StopDBInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopDBInstanceResponseBodyData getData() {
        return this.data;
    }

    public StopDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopDBInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceID")
        public Long DBInstanceID;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>100000785</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static StopDBInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopDBInstanceResponseBodyData self = new StopDBInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopDBInstanceResponseBodyData setDBInstanceID(Long DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Long getDBInstanceID() {
            return this.DBInstanceID;
        }

        public StopDBInstanceResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public StopDBInstanceResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
