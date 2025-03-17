// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateDBResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateDBResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94F92113-FF63-5E57-8401-6FE123AD11DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResponseBody self = new CreateDBResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBResponseBody setData(CreateDBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDBResponseBodyData getData() {
        return this.data;
    }

    public CreateDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDBResponseBodyData extends TeaModel {
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

        public static CreateDBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDBResponseBodyData self = new CreateDBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDBResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public CreateDBResponseBodyData setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

    }

}
