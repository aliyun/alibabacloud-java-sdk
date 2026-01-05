// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDatasetVersionsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>E25887B7-579C-54A5-9C4F-83A0DE367XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDatasetVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetVersionsResponseBody self = new ListDatasetVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetVersionsResponseBody setPagingInfo(ListDatasetVersionsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDatasetVersionsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDatasetVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDatasetVersionsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The dataset version list.</p>
         */
        @NameInMap("DatasetVersions")
        public java.util.List<DatasetVersion> datasetVersions;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDatasetVersionsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetVersionsResponseBodyPagingInfo self = new ListDatasetVersionsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDatasetVersionsResponseBodyPagingInfo setDatasetVersions(java.util.List<DatasetVersion> datasetVersions) {
            this.datasetVersions = datasetVersions;
            return this;
        }
        public java.util.List<DatasetVersion> getDatasetVersions() {
            return this.datasetVersions;
        }

        public ListDatasetVersionsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDatasetVersionsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDatasetVersionsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
