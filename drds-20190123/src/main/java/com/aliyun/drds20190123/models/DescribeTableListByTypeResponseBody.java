// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableListByTypeResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("List")
    public java.util.List<DescribeTableListByTypeResponseBodyList> list;

    public static DescribeTableListByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableListByTypeResponseBody self = new DescribeTableListByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableListByTypeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTableListByTypeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTableListByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableListByTypeResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeTableListByTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTableListByTypeResponseBody setList(java.util.List<DescribeTableListByTypeResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeTableListByTypeResponseBodyList> getList() {
        return this.list;
    }

    public static class DescribeTableListByTypeResponseBodyList extends TeaModel {
        @NameInMap("Property")
        public String property;

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
