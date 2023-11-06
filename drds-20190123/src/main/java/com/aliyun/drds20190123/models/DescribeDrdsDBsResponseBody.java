// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBsResponseBody extends TeaModel {
    /**
     * <p>The list of returned databases.</p>
     */
    @NameInMap("Data")
    public DescribeDrdsDBsResponseBodyData data;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of databases returned on each page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of returned databases.</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeDrdsDBsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBsResponseBody self = new DescribeDrdsDBsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBsResponseBody setData(DescribeDrdsDBsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsDBsResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsDBsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsDBsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsDBsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDBsResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeDrdsDBsResponseBodyDataDb extends TeaModel {
        /**
         * <p>The time when the database is created. The value of this parameter is a UNIX timestamp. Unit: ms.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The type of the database. Valid values: **RDS** and **POLARDB**.</p>
         */
        @NameInMap("DbInstType")
        public String dbInstType;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The partitioning mode of the database. Valid values:</p>
         * <br>
         * <p>*   **HORIZONTAL**: The database is horizontally partitioned.</p>
         * <p>*   **VERTICAL**: The database is vertically partitioned.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The schema ID that is assigned to the partitioned database.</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The state of the database.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDrdsDBsResponseBodyDataDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBsResponseBodyDataDb self = new DescribeDrdsDBsResponseBodyDataDb();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBsResponseBodyDataDb setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsDBsResponseBodyDataDb setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDBsResponseBodyDataDb setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsDBsResponseBodyDataDb setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDrdsDBsResponseBodyDataDb setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeDrdsDBsResponseBodyDataDb setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDrdsDBsResponseBodyData extends TeaModel {
        @NameInMap("Db")
        public java.util.List<DescribeDrdsDBsResponseBodyDataDb> db;

        public static DescribeDrdsDBsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBsResponseBodyData self = new DescribeDrdsDBsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBsResponseBodyData setDb(java.util.List<DescribeDrdsDBsResponseBodyDataDb> db) {
            this.db = db;
            return this;
        }
        public java.util.List<DescribeDrdsDBsResponseBodyDataDb> getDb() {
            return this.db;
        }

    }

}
