// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteAccountResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountResponseBody self = new DeleteAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccountResponseBody setData(DeleteAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAccountResponseBodyData getData() {
        return this.data;
    }

    public DeleteAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAccountResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DeleteAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAccountResponseBodyData self = new DeleteAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAccountResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DeleteAccountResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
