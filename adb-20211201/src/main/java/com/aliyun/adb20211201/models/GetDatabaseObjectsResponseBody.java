// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsResponseBody extends TeaModel {
    /**
     * <p>The queried databases.</p>
     */
    @NameInMap("Data")
    public GetDatabaseObjectsResponseBodyData data;

    /**
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>863D51B7-5321-41D8-A0B6-A088B0******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The queried database.</p>
         */
        @NameInMap("DatabaseSummaryModels")
        public java.util.List<DatabaseSummaryModel> databaseSummaryModels;

        /**
         * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li>30</li>
         * <li>50</li>
         * <li>100</li>
         * </ul>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
