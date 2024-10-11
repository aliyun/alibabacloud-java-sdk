// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyAccountAuthorityResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountAuthorityResponseBody self = new ModifyAccountAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountAuthorityResponseBody setData(ModifyAccountAuthorityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyAccountAuthorityResponseBodyData getData() {
        return this.data;
    }

    public ModifyAccountAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyAccountAuthorityResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static ModifyAccountAuthorityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyAccountAuthorityResponseBodyData self = new ModifyAccountAuthorityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyAccountAuthorityResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ModifyAccountAuthorityResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
