// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDatabaseObjectsResponseBodyData data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetDatabaseObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsResponseBody self = new GetDatabaseObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsResponseBody setData(GetDatabaseObjectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDatabaseObjectsResponseBodyData getData() {
        return this.data;
    }

    public GetDatabaseObjectsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetDatabaseObjectsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetDatabaseObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseObjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetDatabaseObjectsResponseBodyData extends TeaModel {
        @NameInMap("DatabaseSummaryModels")
        public java.util.List<DatabaseSummaryModel> databaseSummaryModels;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetDatabaseObjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseObjectsResponseBodyData self = new GetDatabaseObjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDatabaseObjectsResponseBodyData setDatabaseSummaryModels(java.util.List<DatabaseSummaryModel> databaseSummaryModels) {
            this.databaseSummaryModels = databaseSummaryModels;
            return this;
        }
        public java.util.List<DatabaseSummaryModel> getDatabaseSummaryModels() {
            return this.databaseSummaryModels;
        }

        public GetDatabaseObjectsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetDatabaseObjectsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetDatabaseObjectsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
