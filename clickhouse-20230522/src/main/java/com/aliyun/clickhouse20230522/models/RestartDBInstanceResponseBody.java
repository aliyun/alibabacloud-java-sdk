// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class RestartDBInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RestartDBInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RestartDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceResponseBody self = new RestartDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceResponseBody setData(RestartDBInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartDBInstanceResponseBodyData getData() {
        return this.data;
    }

    public RestartDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RestartDBInstanceResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceID")
        public Long DBInstanceID;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("TaskId")
        public Long taskId;

        public static RestartDBInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestartDBInstanceResponseBodyData self = new RestartDBInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestartDBInstanceResponseBodyData setDBInstanceID(Long DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Long getDBInstanceID() {
            return this.DBInstanceID;
        }

        public RestartDBInstanceResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public RestartDBInstanceResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
