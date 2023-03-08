// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableObjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTableObjectsResponseBodyData data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetTableObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsResponseBody self = new GetTableObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsResponseBody setData(GetTableObjectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTableObjectsResponseBodyData getData() {
        return this.data;
    }

    public GetTableObjectsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetTableObjectsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetTableObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableObjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetTableObjectsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TableSummaryModels")
        public java.util.List<TableSummaryModel> tableSummaryModels;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetTableObjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsResponseBodyData self = new GetTableObjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetTableObjectsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetTableObjectsResponseBodyData setTableSummaryModels(java.util.List<TableSummaryModel> tableSummaryModels) {
            this.tableSummaryModels = tableSummaryModels;
            return this;
        }
        public java.util.List<TableSummaryModel> getTableSummaryModels() {
            return this.tableSummaryModels;
        }

        public GetTableObjectsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
