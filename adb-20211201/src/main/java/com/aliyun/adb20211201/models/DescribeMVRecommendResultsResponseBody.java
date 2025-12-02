// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMVRecommendResultsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeMVRecommendResultsResponseBodyData data;

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
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeMVRecommendResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMVRecommendResultsResponseBody self = new DescribeMVRecommendResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMVRecommendResultsResponseBody setData(DescribeMVRecommendResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMVRecommendResultsResponseBodyData getData() {
        return this.data;
    }

    public DescribeMVRecommendResultsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMVRecommendResultsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeMVRecommendResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMVRecommendResultsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMVRecommendResultsResponseBodyData extends TeaModel {
        @NameInMap("MvRecommendResultModels")
        public java.util.List<OpenStructMVRecommendResultModel> mvRecommendResultModels;

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default).</li>
         * <li><strong>50</strong>.</li>
         * <li><strong>100</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeMVRecommendResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMVRecommendResultsResponseBodyData self = new DescribeMVRecommendResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMVRecommendResultsResponseBodyData setMvRecommendResultModels(java.util.List<OpenStructMVRecommendResultModel> mvRecommendResultModels) {
            this.mvRecommendResultModels = mvRecommendResultModels;
            return this;
        }
        public java.util.List<OpenStructMVRecommendResultModel> getMvRecommendResultModels() {
            return this.mvRecommendResultModels;
        }

        public DescribeMVRecommendResultsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeMVRecommendResultsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeMVRecommendResultsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
