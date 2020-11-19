// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeDrdsDBsResponseData data;

    public static DescribeDrdsDBsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBsResponse self = new DescribeDrdsDBsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDBsResponse setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsDBsResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsDBsResponse setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeDrdsDBsResponse setData(DescribeDrdsDBsResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsDBsResponseData getData() {
        return this.data;
    }

    public static class DescribeDrdsDBsResponseDataDb extends TeaModel {
        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("Schema")
        @Validation(required = true)
        public String schema;

        @NameInMap("DbInstType")
        @Validation(required = true)
        public String dbInstType;

        public static DescribeDrdsDBsResponseDataDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBsResponseDataDb self = new DescribeDrdsDBsResponseDataDb();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBsResponseDataDb setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsDBsResponseDataDb setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsDBsResponseDataDb setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsDBsResponseDataDb setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDrdsDBsResponseDataDb setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeDrdsDBsResponseDataDb setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

    }

    public static class DescribeDrdsDBsResponseData extends TeaModel {
        @NameInMap("Db")
        @Validation(required = true)
        public java.util.List<DescribeDrdsDBsResponseDataDb> db;

        public static DescribeDrdsDBsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBsResponseData self = new DescribeDrdsDBsResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBsResponseData setDb(java.util.List<DescribeDrdsDBsResponseDataDb> db) {
            this.db = db;
            return this;
        }
        public java.util.List<DescribeDrdsDBsResponseDataDb> getDb() {
            return this.db;
        }

    }

}
