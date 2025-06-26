// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDBInstanceConfigResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8C***********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConfigResponseBody self = new ModifyDBInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConfigResponseBody setData(ModifyDBInstanceConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDBInstanceConfigResponseBodyData getData() {
        return this.data;
    }

    public ModifyDBInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBInstanceConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cc-uf6lkzf*****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static ModifyDBInstanceConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceConfigResponseBodyData self = new ModifyDBInstanceConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceConfigResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
