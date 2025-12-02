// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMvRecommendTasksResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeMvRecommendTasksResponseBodyData data;

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
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeMvRecommendTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMvRecommendTasksResponseBody self = new DescribeMvRecommendTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMvRecommendTasksResponseBody setData(DescribeMvRecommendTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMvRecommendTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeMvRecommendTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMvRecommendTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeMvRecommendTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMvRecommendTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMvRecommendTasksResponseBodyData extends TeaModel {
        /**
         * <p>The list of recommended tasks for materialized views.</p>
         */
        @NameInMap("MvRecommendTaskModels")
        public java.util.List<OpenStructMvRecommendTaskModel> mvRecommendTaskModels;

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
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeMvRecommendTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMvRecommendTasksResponseBodyData self = new DescribeMvRecommendTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMvRecommendTasksResponseBodyData setMvRecommendTaskModels(java.util.List<OpenStructMvRecommendTaskModel> mvRecommendTaskModels) {
            this.mvRecommendTaskModels = mvRecommendTaskModels;
            return this;
        }
        public java.util.List<OpenStructMvRecommendTaskModel> getMvRecommendTaskModels() {
            return this.mvRecommendTaskModels;
        }

        public DescribeMvRecommendTasksResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeMvRecommendTasksResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeMvRecommendTasksResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
