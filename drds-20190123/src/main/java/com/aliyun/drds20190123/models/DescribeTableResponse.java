// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeTableResponseData data;

    public static DescribeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableResponse self = new DescribeTableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTableResponse setData(DescribeTableResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeTableResponseData getData() {
        return this.data;
    }

    public static class DescribeTableResponseDataList extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ColumnType")
        @Validation(required = true)
        public String columnType;

        @NameInMap("Extra")
        @Validation(required = true)
        public String extra;

        @NameInMap("Index")
        @Validation(required = true)
        public String index;

        @NameInMap("IsAllowNull")
        @Validation(required = true)
        public String isAllowNull;

        @NameInMap("IsPk")
        @Validation(required = true)
        public String isPk;

        public static DescribeTableResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableResponseDataList self = new DescribeTableResponseDataList();
            return TeaModel.build(map, self);
        }

        public DescribeTableResponseDataList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeTableResponseDataList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public DescribeTableResponseDataList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeTableResponseDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public DescribeTableResponseDataList setIsAllowNull(String isAllowNull) {
            this.isAllowNull = isAllowNull;
            return this;
        }
        public String getIsAllowNull() {
            return this.isAllowNull;
        }

        public DescribeTableResponseDataList setIsPk(String isPk) {
            this.isPk = isPk;
            return this;
        }
        public String getIsPk() {
            return this.isPk;
        }

    }

    public static class DescribeTableResponseData extends TeaModel {
        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<DescribeTableResponseDataList> list;

        public static DescribeTableResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableResponseData self = new DescribeTableResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeTableResponseData setList(java.util.List<DescribeTableResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeTableResponseDataList> getList() {
            return this.list;
        }

    }

}
