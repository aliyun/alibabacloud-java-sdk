// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeTableResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableResponseBody self = new DescribeTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableResponseBody setData(DescribeTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTableResponseBodyData getData() {
        return this.data;
    }

    public DescribeTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTableResponseBodyDataList extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("IsAllowNull")
        public String isAllowNull;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPk")
        public String isPk;

        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("Extra")
        public String extra;

        public static DescribeTableResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableResponseBodyDataList self = new DescribeTableResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeTableResponseBodyDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public DescribeTableResponseBodyDataList setIsAllowNull(String isAllowNull) {
            this.isAllowNull = isAllowNull;
            return this;
        }
        public String getIsAllowNull() {
            return this.isAllowNull;
        }

        public DescribeTableResponseBodyDataList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeTableResponseBodyDataList setIsPk(String isPk) {
            this.isPk = isPk;
            return this;
        }
        public String getIsPk() {
            return this.isPk;
        }

        public DescribeTableResponseBodyDataList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public DescribeTableResponseBodyDataList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

    }

    public static class DescribeTableResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<DescribeTableResponseBodyDataList> list;

        public static DescribeTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableResponseBodyData self = new DescribeTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTableResponseBodyData setList(java.util.List<DescribeTableResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeTableResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
