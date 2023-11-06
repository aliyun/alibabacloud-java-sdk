// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableResponseBody extends TeaModel {
    /**
     * <p>Indicates the returned data.</p>
     */
    @NameInMap("Data")
    public DescribeTableResponseBodyData data;

    /**
     * <p>Indicates the unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableResponseBody self = new DescribeTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableResponseBody setData(DescribeTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTableResponseBodyData getData() {
        return this.data;
    }

    public DescribeTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTableResponseBodyDataList extends TeaModel {
        /**
         * <p>Indicates the name of a column.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>Indicates the type of the column.</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>Extra</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>Indicates the primary key of the table.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>Indicates whether the column can be empty.</p>
         */
        @NameInMap("IsAllowNull")
        public String isAllowNull;

        /**
         * <p>Indicates whether the column is the primary key column of the table.</p>
         */
        @NameInMap("IsPk")
        public String isPk;

        public static DescribeTableResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableResponseBodyDataList self = new DescribeTableResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeTableResponseBodyDataList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
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

        public DescribeTableResponseBodyDataList setIsPk(String isPk) {
            this.isPk = isPk;
            return this;
        }
        public String getIsPk() {
            return this.isPk;
        }

    }

    public static class DescribeTableResponseBodyData extends TeaModel {
        /**
         * <p>Indicates the details about the table schema.</p>
         */
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
