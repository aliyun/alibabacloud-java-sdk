// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCatalogsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListCatalogsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>317CD7D0-AB36-XXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsResponseBody self = new ListCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCatalogsResponseBody setPagingInfo(ListCatalogsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCatalogsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCatalogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCatalogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCatalogsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Catalogs")
        public java.util.List<Catalog> catalogs;

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

        public static ListCatalogsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCatalogsResponseBodyPagingInfo self = new ListCatalogsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCatalogsResponseBodyPagingInfo setCatalogs(java.util.List<Catalog> catalogs) {
            this.catalogs = catalogs;
            return this;
        }
        public java.util.List<Catalog> getCatalogs() {
            return this.catalogs;
        }

        public ListCatalogsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCatalogsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCatalogsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
