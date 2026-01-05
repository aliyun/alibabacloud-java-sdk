// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDatasetsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
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

    public static ListDatasetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponseBody self = new ListDatasetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponseBody setPagingInfo(ListDatasetsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDatasetsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDatasetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDatasetsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The dataset list.</p>
         */
        @NameInMap("Datasets")
        public java.util.List<Dataset> datasets;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries on this page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDatasetsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPagingInfo self = new ListDatasetsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPagingInfo setDatasets(java.util.List<Dataset> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<Dataset> getDatasets() {
            return this.datasets;
        }

        public ListDatasetsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDatasetsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDatasetsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
