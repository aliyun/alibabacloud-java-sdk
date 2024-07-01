// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableObjectsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetTableObjectsResponseBodyData data;

    /**
     * <p>The number of the returned page. The value is an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page. Default value: 30. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
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
     * <p>The ID of the request.</p>
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
        /**
         * <p>The number of the returned page. The value is an integer that is greater than 0. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned per page. Default value: 30. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
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
         * <p>Details of the tables.</p>
         */
        @NameInMap("TableSummaryModels")
        public java.util.List<TableSummaryModel> tableSummaryModels;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
