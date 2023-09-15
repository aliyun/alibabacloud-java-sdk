// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponseBody extends TeaModel {
    @NameInMap("Data")
    public ResetAccountPasswordResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponseBody self = new ResetAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponseBody setData(ResetAccountPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetAccountPasswordResponseBodyData getData() {
        return this.data;
    }

    public ResetAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetAccountPasswordResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static ResetAccountPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetAccountPasswordResponseBodyData self = new ResetAccountPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetAccountPasswordResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ResetAccountPasswordResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
