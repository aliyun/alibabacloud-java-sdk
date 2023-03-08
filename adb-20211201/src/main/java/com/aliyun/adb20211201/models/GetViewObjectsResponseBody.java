// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetViewObjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetViewObjectsResponseBodyData data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetViewObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetViewObjectsResponseBody self = new GetViewObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetViewObjectsResponseBody setData(GetViewObjectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetViewObjectsResponseBodyData getData() {
        return this.data;
    }

    public GetViewObjectsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetViewObjectsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetViewObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetViewObjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetViewObjectsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TableSummaryModels")
        public java.util.List<TableSummaryModel> tableSummaryModels;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetViewObjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetViewObjectsResponseBodyData self = new GetViewObjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetViewObjectsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetViewObjectsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetViewObjectsResponseBodyData setTableSummaryModels(java.util.List<TableSummaryModel> tableSummaryModels) {
            this.tableSummaryModels = tableSummaryModels;
            return this;
        }
        public java.util.List<TableSummaryModel> getTableSummaryModels() {
            return this.tableSummaryModels;
        }

        public GetViewObjectsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
