// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDBInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceResponseBody self = new DeleteDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceResponseBody setData(DeleteDBInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDBInstanceResponseBodyData getData() {
        return this.data;
    }

    public DeleteDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDBInstanceResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DeleteDBInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDBInstanceResponseBodyData self = new DeleteDBInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDBInstanceResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
