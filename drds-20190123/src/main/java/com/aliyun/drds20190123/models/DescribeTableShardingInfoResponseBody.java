// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableShardingInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeTableShardingInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTableShardingInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableShardingInfoResponseBody self = new DescribeTableShardingInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableShardingInfoResponseBody setData(DescribeTableShardingInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTableShardingInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeTableShardingInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableShardingInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTableShardingInfoResponseBodyDataColumnList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static DescribeTableShardingInfoResponseBodyDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableShardingInfoResponseBodyDataColumnList self = new DescribeTableShardingInfoResponseBodyDataColumnList();
            return TeaModel.build(map, self);
        }

        public DescribeTableShardingInfoResponseBodyDataColumnList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTableShardingInfoResponseBodyDataColumnList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTableShardingInfoResponseBodyData extends TeaModel {
        @NameInMap("ColumnList")
        public java.util.List<DescribeTableShardingInfoResponseBodyDataColumnList> columnList;

        @NameInMap("DbComputeLength")
        public Integer dbComputeLength;

        @NameInMap("DbRightShiftOffset")
        public Integer dbRightShiftOffset;

        @NameInMap("DbShardingColumnList")
        public java.util.List<String> dbShardingColumnList;

        @NameInMap("DbShardingFunction")
        public String dbShardingFunction;

        @NameInMap("IsShard")
        public Boolean isShard;

        @NameInMap("TbComputeLength")
        public Integer tbComputeLength;

        @NameInMap("TbPartitions")
        public Integer tbPartitions;

        @NameInMap("TbRightShiftOffset")
        public Integer tbRightShiftOffset;

        @NameInMap("TbShardingColumnList")
        public java.util.List<String> tbShardingColumnList;

        @NameInMap("TbShardingFunction")
        public String tbShardingFunction;

        public static DescribeTableShardingInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableShardingInfoResponseBodyData self = new DescribeTableShardingInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTableShardingInfoResponseBodyData setColumnList(java.util.List<DescribeTableShardingInfoResponseBodyDataColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<DescribeTableShardingInfoResponseBodyDataColumnList> getColumnList() {
            return this.columnList;
        }

        public DescribeTableShardingInfoResponseBodyData setDbComputeLength(Integer dbComputeLength) {
            this.dbComputeLength = dbComputeLength;
            return this;
        }
        public Integer getDbComputeLength() {
            return this.dbComputeLength;
        }

        public DescribeTableShardingInfoResponseBodyData setDbRightShiftOffset(Integer dbRightShiftOffset) {
            this.dbRightShiftOffset = dbRightShiftOffset;
            return this;
        }
        public Integer getDbRightShiftOffset() {
            return this.dbRightShiftOffset;
        }

        public DescribeTableShardingInfoResponseBodyData setDbShardingColumnList(java.util.List<String> dbShardingColumnList) {
            this.dbShardingColumnList = dbShardingColumnList;
            return this;
        }
        public java.util.List<String> getDbShardingColumnList() {
            return this.dbShardingColumnList;
        }

        public DescribeTableShardingInfoResponseBodyData setDbShardingFunction(String dbShardingFunction) {
            this.dbShardingFunction = dbShardingFunction;
            return this;
        }
        public String getDbShardingFunction() {
            return this.dbShardingFunction;
        }

        public DescribeTableShardingInfoResponseBodyData setIsShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }
        public Boolean getIsShard() {
            return this.isShard;
        }

        public DescribeTableShardingInfoResponseBodyData setTbComputeLength(Integer tbComputeLength) {
            this.tbComputeLength = tbComputeLength;
            return this;
        }
        public Integer getTbComputeLength() {
            return this.tbComputeLength;
        }

        public DescribeTableShardingInfoResponseBodyData setTbPartitions(Integer tbPartitions) {
            this.tbPartitions = tbPartitions;
            return this;
        }
        public Integer getTbPartitions() {
            return this.tbPartitions;
        }

        public DescribeTableShardingInfoResponseBodyData setTbRightShiftOffset(Integer tbRightShiftOffset) {
            this.tbRightShiftOffset = tbRightShiftOffset;
            return this;
        }
        public Integer getTbRightShiftOffset() {
            return this.tbRightShiftOffset;
        }

        public DescribeTableShardingInfoResponseBodyData setTbShardingColumnList(java.util.List<String> tbShardingColumnList) {
            this.tbShardingColumnList = tbShardingColumnList;
            return this;
        }
        public java.util.List<String> getTbShardingColumnList() {
            return this.tbShardingColumnList;
        }

        public DescribeTableShardingInfoResponseBodyData setTbShardingFunction(String tbShardingFunction) {
            this.tbShardingFunction = tbShardingFunction;
            return this;
        }
        public String getTbShardingFunction() {
            return this.tbShardingFunction;
        }

    }

}
