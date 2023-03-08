// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableColumnsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTableColumnsResponseBodyData data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetTableColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnsResponseBody self = new GetTableColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableColumnsResponseBody setData(GetTableColumnsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTableColumnsResponseBodyData getData() {
        return this.data;
    }

    public GetTableColumnsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetTableColumnsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetTableColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableColumnsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetTableColumnsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Table")
        public TableDetailModel table;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetTableColumnsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableColumnsResponseBodyData self = new GetTableColumnsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableColumnsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetTableColumnsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetTableColumnsResponseBodyData setTable(TableDetailModel table) {
            this.table = table;
            return this;
        }
        public TableDetailModel getTable() {
            return this.table;
        }

        public GetTableColumnsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
