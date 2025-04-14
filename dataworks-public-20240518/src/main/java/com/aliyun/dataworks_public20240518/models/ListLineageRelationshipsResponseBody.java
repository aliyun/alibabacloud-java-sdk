// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListLineageRelationshipsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListLineageRelationshipsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>SDFSDFSDF-SDFSDF-SDFDSF-SDFSDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLineageRelationshipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLineageRelationshipsResponseBody self = new ListLineageRelationshipsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLineageRelationshipsResponseBody setPagingInfo(ListLineageRelationshipsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListLineageRelationshipsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListLineageRelationshipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLineageRelationshipsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLineageRelationshipsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("LineageRelationships")
        public java.util.List<LineageRelationship> lineageRelationships;

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
         * <p>123</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListLineageRelationshipsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLineageRelationshipsResponseBodyPagingInfo self = new ListLineageRelationshipsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListLineageRelationshipsResponseBodyPagingInfo setLineageRelationships(java.util.List<LineageRelationship> lineageRelationships) {
            this.lineageRelationships = lineageRelationships;
            return this;
        }
        public java.util.List<LineageRelationship> getLineageRelationships() {
            return this.lineageRelationships;
        }

        public ListLineageRelationshipsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListLineageRelationshipsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListLineageRelationshipsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
