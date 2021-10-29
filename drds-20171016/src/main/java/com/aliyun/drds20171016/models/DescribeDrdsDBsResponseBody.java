// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsDBsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public static class DescribeDrdsDBsResponseBodyDataDb extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Status")
        public Integer status;

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

        public DescribeDrdsDBsResponseBodyDataDb setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeDrdsDBsResponseBodyDataDb setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
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
