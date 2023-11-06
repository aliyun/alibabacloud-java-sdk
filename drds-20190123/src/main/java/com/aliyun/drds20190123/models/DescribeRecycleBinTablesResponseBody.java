// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRecycleBinTablesResponseBody extends TeaModel {
    /**
     * <p>The data object returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeRecycleBinTablesResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRecycleBinTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecycleBinTablesResponseBody self = new DescribeRecycleBinTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecycleBinTablesResponseBody setData(java.util.List<DescribeRecycleBinTablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRecycleBinTablesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeRecycleBinTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecycleBinTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRecycleBinTablesResponseBodyData extends TeaModel {
        /**
         * <p>The time when the table was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The original name of the table.</p>
         */
        @NameInMap("OriginalTableName")
        public String originalTableName;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeRecycleBinTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecycleBinTablesResponseBodyData self = new DescribeRecycleBinTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRecycleBinTablesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRecycleBinTablesResponseBodyData setOriginalTableName(String originalTableName) {
            this.originalTableName = originalTableName;
            return this;
        }
        public String getOriginalTableName() {
            return this.originalTableName;
        }

        public DescribeRecycleBinTablesResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
