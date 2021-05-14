// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupDbsResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DbNames")
    public DescribeBackupDbsResponseBodyDbNames dbNames;

    public static DescribeBackupDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDbsResponseBody self = new DescribeBackupDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDbsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupDbsResponseBody setDbNames(DescribeBackupDbsResponseBodyDbNames dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public DescribeBackupDbsResponseBodyDbNames getDbNames() {
        return this.dbNames;
    }

    public static class DescribeBackupDbsResponseBodyDbNames extends TeaModel {
        @NameInMap("dbName")
        public java.util.List<String> dbName;

        public static DescribeBackupDbsResponseBodyDbNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDbsResponseBodyDbNames self = new DescribeBackupDbsResponseBodyDbNames();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDbsResponseBodyDbNames setDbName(java.util.List<String> dbName) {
            this.dbName = dbName;
            return this;
        }
        public java.util.List<String> getDbName() {
            return this.dbName;
        }

    }

}
