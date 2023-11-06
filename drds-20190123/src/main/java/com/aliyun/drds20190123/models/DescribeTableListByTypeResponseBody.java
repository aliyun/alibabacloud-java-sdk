// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableListByTypeResponseBody extends TeaModel {
    /**
     * <p>Indicates the information about tables.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeTableListByTypeResponseBodyList> list;

    /**
     * <p>Indicates the page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Indicates the number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    /**
     * <p>Indicates the total number of returned tables.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeTableListByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableListByTypeResponseBody self = new DescribeTableListByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableListByTypeResponseBody setList(java.util.List<DescribeTableListByTypeResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeTableListByTypeResponseBodyList> getList() {
        return this.list;
    }

    public DescribeTableListByTypeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTableListByTypeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTableListByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableListByTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTableListByTypeResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeTableListByTypeResponseBodyList extends TeaModel {
        /**
         * <p>Indicates the property of a table.</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <p>Indicates the name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeTableListByTypeResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableListByTypeResponseBodyList self = new DescribeTableListByTypeResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeTableListByTypeResponseBodyList setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public DescribeTableListByTypeResponseBodyList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
