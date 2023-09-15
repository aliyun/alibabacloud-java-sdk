// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteDBResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDBResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBResponseBody self = new DeleteDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBResponseBody setData(DeleteDBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDBResponseBodyData getData() {
        return this.data;
    }

    public DeleteDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDBResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBName")
        public String DBName;

        public static DeleteDBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDBResponseBodyData self = new DeleteDBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDBResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DeleteDBResponseBodyData setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

    }

}
