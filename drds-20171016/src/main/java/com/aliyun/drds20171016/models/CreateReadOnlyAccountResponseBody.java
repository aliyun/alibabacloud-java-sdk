// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class CreateReadOnlyAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateReadOnlyAccountResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateReadOnlyAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReadOnlyAccountResponseBody self = new CreateReadOnlyAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReadOnlyAccountResponseBody setData(CreateReadOnlyAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateReadOnlyAccountResponseBodyData getData() {
        return this.data;
    }

    public CreateReadOnlyAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateReadOnlyAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateReadOnlyAccountResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DrdsInstanceId")
        public String drdsInstanceId;

        public static CreateReadOnlyAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateReadOnlyAccountResponseBodyData self = new CreateReadOnlyAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateReadOnlyAccountResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateReadOnlyAccountResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public CreateReadOnlyAccountResponseBodyData setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

    }

}
