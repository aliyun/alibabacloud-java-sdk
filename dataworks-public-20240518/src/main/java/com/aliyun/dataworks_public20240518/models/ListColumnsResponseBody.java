// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListColumnsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListColumnsResponseBodyPagingInfo pagingInfo;

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

    public static ListColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListColumnsResponseBody self = new ListColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListColumnsResponseBody setPagingInfo(ListColumnsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListColumnsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListColumnsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListColumnsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<Column> columns;

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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListColumnsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListColumnsResponseBodyPagingInfo self = new ListColumnsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListColumnsResponseBodyPagingInfo setColumns(java.util.List<Column> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<Column> getColumns() {
            return this.columns;
        }

        public ListColumnsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListColumnsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListColumnsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
