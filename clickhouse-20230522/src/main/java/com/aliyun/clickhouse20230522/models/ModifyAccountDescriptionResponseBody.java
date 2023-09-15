// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyAccountDescriptionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponseBody self = new ModifyAccountDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionResponseBody setData(ModifyAccountDescriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyAccountDescriptionResponseBodyData getData() {
        return this.data;
    }

    public ModifyAccountDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyAccountDescriptionResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static ModifyAccountDescriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyAccountDescriptionResponseBodyData self = new ModifyAccountDescriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyAccountDescriptionResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ModifyAccountDescriptionResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
