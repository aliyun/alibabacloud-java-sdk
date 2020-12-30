// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeDrdsDBResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBResponseBody self = new DescribeDrdsDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBResponseBody setData(DescribeDrdsDBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsDBResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsDBResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("DbInstType")
        public String dbInstType;

        @NameInMap("InstRole")
        public String instRole;

        public static DescribeDrdsDBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBResponseBodyData self = new DescribeDrdsDBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsDBResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsDBResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeDrdsDBResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsDBResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDrdsDBResponseBodyData setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDBResponseBodyData setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

    }

}
