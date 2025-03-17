// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteDBResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DeleteDBResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06798FEE-BEF2-5FAF-A30D-728973BBE97C</p>
     */
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
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb001</p>
         */
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
