// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsDBsResponseBodyData data;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DbInstType")
        public String dbInstType;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Schema")
        public String schema;

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
