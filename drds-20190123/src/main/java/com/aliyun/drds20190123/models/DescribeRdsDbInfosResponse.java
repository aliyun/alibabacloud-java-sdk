// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsDbInfosResponse extends TeaModel {
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
    public DescribeRdsDbInfosResponseDatabases databases;

    public static DescribeRdsDbInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsDbInfosResponse self = new DescribeRdsDbInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsDbInfosResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsDbInfosResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRdsDbInfosResponse setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeRdsDbInfosResponse setDatabases(DescribeRdsDbInfosResponseDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeRdsDbInfosResponseDatabases getDatabases() {
        return this.databases;
    }

    public static class DescribeRdsDbInfosResponseDatabasesDatabase extends TeaModel {
        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeRdsDbInfosResponseDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsDbInfosResponseDatabasesDatabase self = new DescribeRdsDbInfosResponseDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeRdsDbInfosResponseDatabasesDatabase setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeRdsDbInfosResponseDatabasesDatabase setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeRdsDbInfosResponseDatabasesDatabase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeRdsDbInfosResponseDatabases extends TeaModel {
        @NameInMap("Database")
        @Validation(required = true)
        public java.util.List<DescribeRdsDbInfosResponseDatabasesDatabase> database;

        public static DescribeRdsDbInfosResponseDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsDbInfosResponseDatabases self = new DescribeRdsDbInfosResponseDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeRdsDbInfosResponseDatabases setDatabase(java.util.List<DescribeRdsDbInfosResponseDatabasesDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DescribeRdsDbInfosResponseDatabasesDatabase> getDatabase() {
            return this.database;
        }

    }

}
