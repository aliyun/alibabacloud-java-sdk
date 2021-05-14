// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeExpandLogicTableInfoListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeExpandLogicTableInfoListResponseData data;

    public static DescribeExpandLogicTableInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpandLogicTableInfoListResponse self = new DescribeExpandLogicTableInfoListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpandLogicTableInfoListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpandLogicTableInfoListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeExpandLogicTableInfoListResponse setData(DescribeExpandLogicTableInfoListResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeExpandLogicTableInfoListResponseData getData() {
        return this.data;
    }

    public static class DescribeExpandLogicTableInfoListResponseDataData extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("ShardDbKey")
        @Validation(required = true)
        public String shardDbKey;

        @NameInMap("ShardTbKey")
        @Validation(required = true)
        public String shardTbKey;

        public static DescribeExpandLogicTableInfoListResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpandLogicTableInfoListResponseDataData self = new DescribeExpandLogicTableInfoListResponseDataData();
            return TeaModel.build(map, self);
        }

        public DescribeExpandLogicTableInfoListResponseDataData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeExpandLogicTableInfoListResponseDataData setShardDbKey(String shardDbKey) {
            this.shardDbKey = shardDbKey;
            return this;
        }
        public String getShardDbKey() {
            return this.shardDbKey;
        }

        public DescribeExpandLogicTableInfoListResponseDataData setShardTbKey(String shardTbKey) {
            this.shardTbKey = shardTbKey;
            return this;
        }
        public String getShardTbKey() {
            return this.shardTbKey;
        }

    }

    public static class DescribeExpandLogicTableInfoListResponseData extends TeaModel {
        @NameInMap("data")
        @Validation(required = true)
        public java.util.List<DescribeExpandLogicTableInfoListResponseDataData> data;

        public static DescribeExpandLogicTableInfoListResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpandLogicTableInfoListResponseData self = new DescribeExpandLogicTableInfoListResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeExpandLogicTableInfoListResponseData setData(java.util.List<DescribeExpandLogicTableInfoListResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeExpandLogicTableInfoListResponseDataData> getData() {
            return this.data;
        }

    }

}
