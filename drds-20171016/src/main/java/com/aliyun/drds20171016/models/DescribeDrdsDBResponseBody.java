// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsDBResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBResponseBody self = new DescribeDrdsDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBResponseBody setData(DescribeDrdsDBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsDBResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsDBResponseBodyData extends TeaModel {
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

        public static DescribeDrdsDBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBResponseBodyData self = new DescribeDrdsDBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsDBResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsDBResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDrdsDBResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeDrdsDBResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
