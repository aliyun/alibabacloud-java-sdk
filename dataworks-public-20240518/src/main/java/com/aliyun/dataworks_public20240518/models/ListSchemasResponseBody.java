// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSchemasResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListSchemasResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>235BBA5E-3428-XXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchemasResponseBody self = new ListSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchemasResponseBody setPagingInfo(ListSchemasResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListSchemasResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchemasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSchemasResponseBodyPagingInfo extends TeaModel {
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

        @NameInMap("Schemas")
        public java.util.List<Schema> schemas;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListSchemasResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSchemasResponseBodyPagingInfo self = new ListSchemasResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListSchemasResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSchemasResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSchemasResponseBodyPagingInfo setSchemas(java.util.List<Schema> schemas) {
            this.schemas = schemas;
            return this;
        }
        public java.util.List<Schema> getSchemas() {
            return this.schemas;
        }

        public ListSchemasResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
