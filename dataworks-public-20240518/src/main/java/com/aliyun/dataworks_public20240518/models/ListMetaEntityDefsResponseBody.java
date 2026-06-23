// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntityDefsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListMetaEntityDefsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADFASDFASDFA-ADFASDF-ASDFADSDF-AFFADS</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListMetaEntityDefsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaEntityDefsResponseBody self = new ListMetaEntityDefsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaEntityDefsResponseBody setPagingInfo(ListMetaEntityDefsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListMetaEntityDefsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListMetaEntityDefsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaEntityDefsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMetaEntityDefsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>A list of custom entity definitions.</p>
         */
        @NameInMap("MetaEntityDefs")
        public java.util.List<MetaEntityDef> metaEntityDefs;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListMetaEntityDefsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMetaEntityDefsResponseBodyPagingInfo self = new ListMetaEntityDefsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListMetaEntityDefsResponseBodyPagingInfo setMetaEntityDefs(java.util.List<MetaEntityDef> metaEntityDefs) {
            this.metaEntityDefs = metaEntityDefs;
            return this;
        }
        public java.util.List<MetaEntityDef> getMetaEntityDefs() {
            return this.metaEntityDefs;
        }

        public ListMetaEntityDefsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMetaEntityDefsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMetaEntityDefsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
