// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRecycleBinTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<DescribeRecycleBinTablesResponseData> data;

    public static DescribeRecycleBinTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecycleBinTablesResponse self = new DescribeRecycleBinTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecycleBinTablesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecycleBinTablesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRecycleBinTablesResponse setData(java.util.List<DescribeRecycleBinTablesResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRecycleBinTablesResponseData> getData() {
        return this.data;
    }

    public static class DescribeRecycleBinTablesResponseData extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("OriginalTableName")
        @Validation(required = true)
        public String originalTableName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeRecycleBinTablesResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecycleBinTablesResponseData self = new DescribeRecycleBinTablesResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeRecycleBinTablesResponseData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeRecycleBinTablesResponseData setOriginalTableName(String originalTableName) {
            this.originalTableName = originalTableName;
            return this;
        }
        public String getOriginalTableName() {
            return this.originalTableName;
        }

        public DescribeRecycleBinTablesResponseData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
