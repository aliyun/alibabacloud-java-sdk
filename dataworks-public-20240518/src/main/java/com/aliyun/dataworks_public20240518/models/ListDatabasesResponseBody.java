// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDatabasesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDatabasesResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>9DD08926-38B9-XXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponseBody self = new ListDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponseBody setPagingInfo(ListDatabasesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDatabasesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDatabasesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<Database> databases;

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

        public static ListDatabasesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyPagingInfo self = new ListDatabasesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyPagingInfo setDatabases(java.util.List<Database> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<Database> getDatabases() {
            return this.databases;
        }

        public ListDatabasesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDatabasesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDatabasesResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
