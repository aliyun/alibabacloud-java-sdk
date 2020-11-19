// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableShardingInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeTableShardingInfoResponseData data;

    public static DescribeTableShardingInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableShardingInfoResponse self = new DescribeTableShardingInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableShardingInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableShardingInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTableShardingInfoResponse setData(DescribeTableShardingInfoResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeTableShardingInfoResponseData getData() {
        return this.data;
    }

    public static class DescribeTableShardingInfoResponseDataColumnList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeTableShardingInfoResponseDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableShardingInfoResponseDataColumnList self = new DescribeTableShardingInfoResponseDataColumnList();
            return TeaModel.build(map, self);
        }

        public DescribeTableShardingInfoResponseDataColumnList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTableShardingInfoResponseDataColumnList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTableShardingInfoResponseData extends TeaModel {
        @NameInMap("DbShardingFunction")
        @Validation(required = true)
        public String dbShardingFunction;

        @NameInMap("DbRightShiftOffset")
        @Validation(required = true)
        public Integer dbRightShiftOffset;

        @NameInMap("TbShardingFunction")
        @Validation(required = true)
        public String tbShardingFunction;

        @NameInMap("TbRightShiftOffset")
        @Validation(required = true)
        public Integer tbRightShiftOffset;

        @NameInMap("TbPartitions")
        @Validation(required = true)
        public Integer tbPartitions;

        @NameInMap("IsShard")
        @Validation(required = true)
        public Boolean isShard;

        @NameInMap("TbComputeLength")
        @Validation(required = true)
        public Integer tbComputeLength;

        @NameInMap("DbComputeLength")
        @Validation(required = true)
        public Integer dbComputeLength;

        @NameInMap("ColumnList")
        @Validation(required = true)
        public java.util.List<DescribeTableShardingInfoResponseDataColumnList> columnList;

        @NameInMap("DbShardingColumnList")
        @Validation(required = true)
        public java.util.List<String> dbShardingColumnList;

        @NameInMap("TbShardingColumnList")
        @Validation(required = true)
        public java.util.List<String> tbShardingColumnList;

        public static DescribeTableShardingInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableShardingInfoResponseData self = new DescribeTableShardingInfoResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeTableShardingInfoResponseData setDbShardingFunction(String dbShardingFunction) {
            this.dbShardingFunction = dbShardingFunction;
            return this;
        }
        public String getDbShardingFunction() {
            return this.dbShardingFunction;
        }

        public DescribeTableShardingInfoResponseData setDbRightShiftOffset(Integer dbRightShiftOffset) {
            this.dbRightShiftOffset = dbRightShiftOffset;
            return this;
        }
        public Integer getDbRightShiftOffset() {
            return this.dbRightShiftOffset;
        }

        public DescribeTableShardingInfoResponseData setTbShardingFunction(String tbShardingFunction) {
            this.tbShardingFunction = tbShardingFunction;
            return this;
        }
        public String getTbShardingFunction() {
            return this.tbShardingFunction;
        }

        public DescribeTableShardingInfoResponseData setTbRightShiftOffset(Integer tbRightShiftOffset) {
            this.tbRightShiftOffset = tbRightShiftOffset;
            return this;
        }
        public Integer getTbRightShiftOffset() {
            return this.tbRightShiftOffset;
        }

        public DescribeTableShardingInfoResponseData setTbPartitions(Integer tbPartitions) {
            this.tbPartitions = tbPartitions;
            return this;
        }
        public Integer getTbPartitions() {
            return this.tbPartitions;
        }

        public DescribeTableShardingInfoResponseData setIsShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }
        public Boolean getIsShard() {
            return this.isShard;
        }

        public DescribeTableShardingInfoResponseData setTbComputeLength(Integer tbComputeLength) {
            this.tbComputeLength = tbComputeLength;
            return this;
        }
        public Integer getTbComputeLength() {
            return this.tbComputeLength;
        }

        public DescribeTableShardingInfoResponseData setDbComputeLength(Integer dbComputeLength) {
            this.dbComputeLength = dbComputeLength;
            return this;
        }
        public Integer getDbComputeLength() {
            return this.dbComputeLength;
        }

        public DescribeTableShardingInfoResponseData setColumnList(java.util.List<DescribeTableShardingInfoResponseDataColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<DescribeTableShardingInfoResponseDataColumnList> getColumnList() {
            return this.columnList;
        }

        public DescribeTableShardingInfoResponseData setDbShardingColumnList(java.util.List<String> dbShardingColumnList) {
            this.dbShardingColumnList = dbShardingColumnList;
            return this;
        }
        public java.util.List<String> getDbShardingColumnList() {
            return this.dbShardingColumnList;
        }

        public DescribeTableShardingInfoResponseData setTbShardingColumnList(java.util.List<String> tbShardingColumnList) {
            this.tbShardingColumnList = tbShardingColumnList;
            return this;
        }
        public java.util.List<String> getTbShardingColumnList() {
            return this.tbShardingColumnList;
        }

    }

}
