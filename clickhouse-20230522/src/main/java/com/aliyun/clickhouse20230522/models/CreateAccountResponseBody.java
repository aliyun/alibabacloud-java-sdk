// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateAccountResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountResponseBody self = new CreateAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccountResponseBody setData(CreateAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAccountResponseBodyData getData() {
        return this.data;
    }

    public CreateAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAccountResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static CreateAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAccountResponseBodyData self = new CreateAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAccountResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateAccountResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
