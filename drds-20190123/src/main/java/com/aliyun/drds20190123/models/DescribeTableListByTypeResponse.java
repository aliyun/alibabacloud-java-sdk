// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableListByTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("List")
    @Validation(required = true)
    public java.util.List<DescribeTableListByTypeResponseList> list;

    public static DescribeTableListByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableListByTypeResponse self = new DescribeTableListByTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableListByTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableListByTypeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTableListByTypeResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTableListByTypeResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTableListByTypeResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeTableListByTypeResponse setList(java.util.List<DescribeTableListByTypeResponseList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeTableListByTypeResponseList> getList() {
        return this.list;
    }

    public static class DescribeTableListByTypeResponseList extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("Property")
        @Validation(required = true)
        public String property;

        public static DescribeTableListByTypeResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableListByTypeResponseList self = new DescribeTableListByTypeResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeTableListByTypeResponseList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeTableListByTypeResponseList setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

    }

}
