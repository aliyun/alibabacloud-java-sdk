// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMvRecommendSubTasksResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeMvRecommendSubTasksResponseBodyData data;

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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeMvRecommendSubTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMvRecommendSubTasksResponseBody self = new DescribeMvRecommendSubTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMvRecommendSubTasksResponseBody setData(DescribeMvRecommendSubTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMvRecommendSubTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeMvRecommendSubTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMvRecommendSubTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeMvRecommendSubTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMvRecommendSubTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMvRecommendSubTasksResponseBodyData extends TeaModel {
        /**
         * <p>The list of recommended tasks to be executed.</p>
         */
        @NameInMap("MvRecommendSubTaskModels")
        public java.util.List<OpenStructMvRecommendSubTaskModel> mvRecommendSubTaskModels;

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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeMvRecommendSubTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMvRecommendSubTasksResponseBodyData self = new DescribeMvRecommendSubTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMvRecommendSubTasksResponseBodyData setMvRecommendSubTaskModels(java.util.List<OpenStructMvRecommendSubTaskModel> mvRecommendSubTaskModels) {
            this.mvRecommendSubTaskModels = mvRecommendSubTaskModels;
            return this;
        }
        public java.util.List<OpenStructMvRecommendSubTaskModel> getMvRecommendSubTaskModels() {
            return this.mvRecommendSubTaskModels;
        }

        public DescribeMvRecommendSubTasksResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeMvRecommendSubTasksResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeMvRecommendSubTasksResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
