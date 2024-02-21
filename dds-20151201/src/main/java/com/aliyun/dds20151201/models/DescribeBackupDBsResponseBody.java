// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupDBsResponseBody extends TeaModel {
    /**
     * <p>The details of the databases.</p>
     */
    @NameInMap("Databases")
    public DescribeBackupDBsResponseBodyDatabases databases;

    /**
     * <p>The page number of the page returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned databases.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBackupDBsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDBsResponseBody self = new DescribeBackupDBsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDBsResponseBody setDatabases(DescribeBackupDBsResponseBodyDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeBackupDBsResponseBodyDatabases getDatabases() {
        return this.databases;
    }

    public DescribeBackupDBsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupDBsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupDBsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupDBsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupDBsResponseBodyDatabasesDatabase extends TeaModel {
        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        public static DescribeBackupDBsResponseBodyDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDBsResponseBodyDatabasesDatabase self = new DescribeBackupDBsResponseBodyDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDBsResponseBodyDatabasesDatabase setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

    }

    public static class DescribeBackupDBsResponseBodyDatabases extends TeaModel {
        @NameInMap("Database")
        public java.util.List<DescribeBackupDBsResponseBodyDatabasesDatabase> database;

        public static DescribeBackupDBsResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDBsResponseBodyDatabases self = new DescribeBackupDBsResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDBsResponseBodyDatabases setDatabase(java.util.List<DescribeBackupDBsResponseBodyDatabasesDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DescribeBackupDBsResponseBodyDatabasesDatabase> getDatabase() {
            return this.database;
        }

    }

}
