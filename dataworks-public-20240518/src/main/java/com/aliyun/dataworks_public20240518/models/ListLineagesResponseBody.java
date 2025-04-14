// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListLineagesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListLineagesResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLineagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLineagesResponseBody self = new ListLineagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLineagesResponseBody setPagingInfo(ListLineagesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListLineagesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListLineagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLineagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLineagesResponseBodyPagingInfoLineages extends TeaModel {
        @NameInMap("DstEntity")
        public LineageEntity dstEntity;

        @NameInMap("Relationships")
        public java.util.List<LineageRelationship> relationships;

        @NameInMap("SrcEntity")
        public LineageEntity srcEntity;

        public static ListLineagesResponseBodyPagingInfoLineages build(java.util.Map<String, ?> map) throws Exception {
            ListLineagesResponseBodyPagingInfoLineages self = new ListLineagesResponseBodyPagingInfoLineages();
            return TeaModel.build(map, self);
        }

        public ListLineagesResponseBodyPagingInfoLineages setDstEntity(LineageEntity dstEntity) {
            this.dstEntity = dstEntity;
            return this;
        }
        public LineageEntity getDstEntity() {
            return this.dstEntity;
        }

        public ListLineagesResponseBodyPagingInfoLineages setRelationships(java.util.List<LineageRelationship> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<LineageRelationship> getRelationships() {
            return this.relationships;
        }

        public ListLineagesResponseBodyPagingInfoLineages setSrcEntity(LineageEntity srcEntity) {
            this.srcEntity = srcEntity;
            return this;
        }
        public LineageEntity getSrcEntity() {
            return this.srcEntity;
        }

    }

    public static class ListLineagesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Lineages")
        public java.util.List<ListLineagesResponseBodyPagingInfoLineages> lineages;

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
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListLineagesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLineagesResponseBodyPagingInfo self = new ListLineagesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListLineagesResponseBodyPagingInfo setLineages(java.util.List<ListLineagesResponseBodyPagingInfoLineages> lineages) {
            this.lineages = lineages;
            return this;
        }
        public java.util.List<ListLineagesResponseBodyPagingInfoLineages> getLineages() {
            return this.lineages;
        }

        public ListLineagesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListLineagesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListLineagesResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
