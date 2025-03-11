// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstanceDbsResponseBody extends TeaModel {
    /**
     * <p>Indicates the information about the storage-layer databases.</p>
     */
    @NameInMap("Databases")
    public DescribeDbInstanceDbsResponseBodyDatabases databases;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E9F3D991-08DE-4B74-BE0E-06B809******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates the total number of storage-layer databases.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeDbInstanceDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstanceDbsResponseBody self = new DescribeDbInstanceDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstanceDbsResponseBody setDatabases(DescribeDbInstanceDbsResponseBodyDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeDbInstanceDbsResponseBodyDatabases getDatabases() {
        return this.databases;
    }

    public DescribeDbInstanceDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbInstanceDbsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDbInstanceDbsResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeDbInstanceDbsResponseBodyDatabasesDatabase extends TeaModel {
        /**
         * <p>Indicates the name of a storage-layer database.</p>
         * 
         * <strong>example:</strong>
         * <p>db_test</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Indicates the description of the storage-layer database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates the state of the storage-layer database. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The database is being created.</li>
         * <li><strong>1</strong>: The database is available.</li>
         * <li><strong>3</strong>: The database is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeDbInstanceDbsResponseBodyDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstanceDbsResponseBodyDatabasesDatabase self = new DescribeDbInstanceDbsResponseBodyDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstanceDbsResponseBodyDatabasesDatabase setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDbInstanceDbsResponseBodyDatabasesDatabase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDbInstanceDbsResponseBodyDatabasesDatabase setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeDbInstanceDbsResponseBodyDatabases extends TeaModel {
        @NameInMap("Database")
        public java.util.List<DescribeDbInstanceDbsResponseBodyDatabasesDatabase> database;

        public static DescribeDbInstanceDbsResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstanceDbsResponseBodyDatabases self = new DescribeDbInstanceDbsResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstanceDbsResponseBodyDatabases setDatabase(java.util.List<DescribeDbInstanceDbsResponseBodyDatabasesDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DescribeDbInstanceDbsResponseBodyDatabasesDatabase> getDatabase() {
            return this.database;
        }

    }

}
