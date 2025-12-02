// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeViewJobsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeViewJobsResponseBodyData data;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2A318054-6815-528A-AA94-8AC921******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>44</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeViewJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeViewJobsResponseBody self = new DescribeViewJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeViewJobsResponseBody setData(DescribeViewJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeViewJobsResponseBodyData getData() {
        return this.data;
    }

    public DescribeViewJobsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeViewJobsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeViewJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeViewJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeViewJobsResponseBodyData extends TeaModel {
        /**
         * <p>The refresh tasks.</p>
         */
        @NameInMap("MvRefreshJobModels")
        public java.util.List<OpenStructRefreshJobModel> mvRefreshJobModels;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeViewJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewJobsResponseBodyData self = new DescribeViewJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeViewJobsResponseBodyData setMvRefreshJobModels(java.util.List<OpenStructRefreshJobModel> mvRefreshJobModels) {
            this.mvRefreshJobModels = mvRefreshJobModels;
            return this;
        }
        public java.util.List<OpenStructRefreshJobModel> getMvRefreshJobModels() {
            return this.mvRefreshJobModels;
        }

        public DescribeViewJobsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeViewJobsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeViewJobsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
