// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeReadOnlyAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeReadOnlyAccountResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeReadOnlyAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadOnlyAccountResponseBody self = new DescribeReadOnlyAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReadOnlyAccountResponseBody setData(DescribeReadOnlyAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeReadOnlyAccountResponseBodyData getData() {
        return this.data;
    }

    public DescribeReadOnlyAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReadOnlyAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeReadOnlyAccountResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DrdsInstanceId")
        public String drdsInstanceId;

        public static DescribeReadOnlyAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadOnlyAccountResponseBodyData self = new DescribeReadOnlyAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeReadOnlyAccountResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeReadOnlyAccountResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeReadOnlyAccountResponseBodyData setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

    }

}
