// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeExpandLogicTableInfoListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeExpandLogicTableInfoListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeExpandLogicTableInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpandLogicTableInfoListResponseBody self = new DescribeExpandLogicTableInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpandLogicTableInfoListResponseBody setData(DescribeExpandLogicTableInfoListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeExpandLogicTableInfoListResponseBodyData getData() {
        return this.data;
    }

    public DescribeExpandLogicTableInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpandLogicTableInfoListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeExpandLogicTableInfoListResponseBodyDataData extends TeaModel {
        @NameInMap("ShardDbKey")
        public String shardDbKey;

        @NameInMap("ShardTbKey")
        public String shardTbKey;

        @NameInMap("TableName")
        public String tableName;

        public static DescribeExpandLogicTableInfoListResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpandLogicTableInfoListResponseBodyDataData self = new DescribeExpandLogicTableInfoListResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public DescribeExpandLogicTableInfoListResponseBodyDataData setShardDbKey(String shardDbKey) {
            this.shardDbKey = shardDbKey;
            return this;
        }
        public String getShardDbKey() {
            return this.shardDbKey;
        }

        public DescribeExpandLogicTableInfoListResponseBodyDataData setShardTbKey(String shardTbKey) {
            this.shardTbKey = shardTbKey;
            return this;
        }
        public String getShardTbKey() {
            return this.shardTbKey;
        }

        public DescribeExpandLogicTableInfoListResponseBodyDataData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeExpandLogicTableInfoListResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeExpandLogicTableInfoListResponseBodyDataData> data;

        public static DescribeExpandLogicTableInfoListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpandLogicTableInfoListResponseBodyData self = new DescribeExpandLogicTableInfoListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeExpandLogicTableInfoListResponseBodyData setData(java.util.List<DescribeExpandLogicTableInfoListResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeExpandLogicTableInfoListResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
