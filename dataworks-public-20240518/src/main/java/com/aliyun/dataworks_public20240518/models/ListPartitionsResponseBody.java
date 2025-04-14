// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPartitionsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListPartitionsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>D1E2E5BC-xxxx-xxxx-xxxx-xxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsResponseBody self = new ListPartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPartitionsResponseBody setPagingInfo(ListPartitionsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListPartitionsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListPartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPartitionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPartitionsResponseBodyPagingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PartitionList")
        public java.util.List<Partition> partitionList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListPartitionsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPartitionsResponseBodyPagingInfo self = new ListPartitionsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListPartitionsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPartitionsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPartitionsResponseBodyPagingInfo setPartitionList(java.util.List<Partition> partitionList) {
            this.partitionList = partitionList;
            return this;
        }
        public java.util.List<Partition> getPartitionList() {
            return this.partitionList;
        }

        public ListPartitionsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
