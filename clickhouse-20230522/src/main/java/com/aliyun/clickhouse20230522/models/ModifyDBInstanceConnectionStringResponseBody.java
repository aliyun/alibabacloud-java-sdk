// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDBInstanceConnectionStringResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceConnectionStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringResponseBody self = new ModifyDBInstanceConnectionStringResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringResponseBody setData(ModifyDBInstanceConnectionStringResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDBInstanceConnectionStringResponseBodyData getData() {
        return this.data;
    }

    public ModifyDBInstanceConnectionStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBInstanceConnectionStringResponseBodyData extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static ModifyDBInstanceConnectionStringResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceConnectionStringResponseBodyData self = new ModifyDBInstanceConnectionStringResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceConnectionStringResponseBodyData setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public ModifyDBInstanceConnectionStringResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public ModifyDBInstanceConnectionStringResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
