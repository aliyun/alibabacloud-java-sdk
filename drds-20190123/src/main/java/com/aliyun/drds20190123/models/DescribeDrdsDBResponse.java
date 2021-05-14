// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeDrdsDBResponseData data;

    public static DescribeDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBResponse self = new DescribeDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDBResponse setData(DescribeDrdsDBResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsDBResponseData getData() {
        return this.data;
    }

    public static class DescribeDrdsDBResponseData extends TeaModel {
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

        @NameInMap("InstRole")
        @Validation(required = true)
        public String instRole;

        public static DescribeDrdsDBResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBResponseData self = new DescribeDrdsDBResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBResponseData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsDBResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsDBResponseData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsDBResponseData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDrdsDBResponseData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeDrdsDBResponseData setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDBResponseData setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

    }

}
