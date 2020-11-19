// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstanceDbsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("Databases")
    @Validation(required = true)
    public DescribeDbInstanceDbsResponseDatabases databases;

    public static DescribeDbInstanceDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstanceDbsResponse self = new DescribeDbInstanceDbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstanceDbsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbInstanceDbsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDbInstanceDbsResponse setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeDbInstanceDbsResponse setDatabases(DescribeDbInstanceDbsResponseDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeDbInstanceDbsResponseDatabases getDatabases() {
        return this.databases;
    }

    public static class DescribeDbInstanceDbsResponseDatabasesDatabase extends TeaModel {
        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeDbInstanceDbsResponseDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstanceDbsResponseDatabasesDatabase self = new DescribeDbInstanceDbsResponseDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstanceDbsResponseDatabasesDatabase setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDbInstanceDbsResponseDatabasesDatabase setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDbInstanceDbsResponseDatabasesDatabase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeDbInstanceDbsResponseDatabases extends TeaModel {
        @NameInMap("Database")
        @Validation(required = true)
        public java.util.List<DescribeDbInstanceDbsResponseDatabasesDatabase> database;

        public static DescribeDbInstanceDbsResponseDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstanceDbsResponseDatabases self = new DescribeDbInstanceDbsResponseDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstanceDbsResponseDatabases setDatabase(java.util.List<DescribeDbInstanceDbsResponseDatabasesDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DescribeDbInstanceDbsResponseDatabasesDatabase> getDatabase() {
            return this.database;
        }

    }

}
