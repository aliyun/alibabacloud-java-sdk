// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupDbsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DbNames")
    @Validation(required = true)
    public DescribeBackupDbsResponseDbNames dbNames;

    public static DescribeBackupDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDbsResponse self = new DescribeBackupDbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDbsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupDbsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupDbsResponse setDbNames(DescribeBackupDbsResponseDbNames dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public DescribeBackupDbsResponseDbNames getDbNames() {
        return this.dbNames;
    }

    public static class DescribeBackupDbsResponseDbNames extends TeaModel {
        @NameInMap("dbName")
        @Validation(required = true)
        public java.util.List<String> dbName;

        public static DescribeBackupDbsResponseDbNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDbsResponseDbNames self = new DescribeBackupDbsResponseDbNames();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDbsResponseDbNames setDbName(java.util.List<String> dbName) {
            this.dbName = dbName;
            return this;
        }
        public java.util.List<String> getDbName() {
            return this.dbName;
        }

    }

}
