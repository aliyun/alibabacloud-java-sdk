// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListInstanceDatabasesResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The queried databases.</p>
     */
    @NameInMap("Databases")
    public java.util.List<ListInstanceDatabasesResponseBodyDatabases> databases;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListInstanceDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceDatabasesResponseBody self = new ListInstanceDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceDatabasesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListInstanceDatabasesResponseBody setDatabases(java.util.List<ListInstanceDatabasesResponseBodyDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<ListInstanceDatabasesResponseBodyDatabases> getDatabases() {
        return this.databases;
    }

    public ListInstanceDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceDatabasesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceDatabasesResponseBodyDatabases extends TeaModel {
        /**
         * <p>The database name.</p>
         * <ul>
         * <li>Only contain letters, digits, and underscores (_).</li>
         * <li>Must start with a letter.</li>
         * <li>Up to 63 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testdatabase</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("Description")
        public String description;

        public static ListInstanceDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceDatabasesResponseBodyDatabases self = new ListInstanceDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public ListInstanceDatabasesResponseBodyDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListInstanceDatabasesResponseBodyDatabases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
